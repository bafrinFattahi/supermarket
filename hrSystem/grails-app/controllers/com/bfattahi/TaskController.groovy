package com.bfattahi

import grails.converters.*

class TaskController {

    def scaffold=Task
    
    static allowedMethods = [index:"GET", show:"GET"]

    def index(Task task){
    if (task == null){
      flash.message="There are currently no tasks in the database."
     }
    else{
    render Task.list()as JSON
    }
    }
   

 def show(Task task){
    if(params.id && Task.exists(params.id)){
    render Task.findById(params.id) as JSON
      }
   else{ 
     render Task.list() as JSON
   }
  }


 def advSearch(){
  }
  def advResults(){
   def taskProps =Task.metaClass.properties*.name

   def tasks = Task.withCriteria {
   "${params.queryType}"{
     params.each { field, value -> 
     if (taskProps.grep(field) && value){
       ilike(field,value)
      }
   }
  }
 }
 return [tasks:tasks]
}

}
