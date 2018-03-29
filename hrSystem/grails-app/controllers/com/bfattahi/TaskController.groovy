package com.bfattahi

import grails.converters.*

class TaskController {

    def scaffold=Task
    
    static allowedMethods = [index:"GET", show:"GET"]

    def index(Task task){
    render Task.list()as JSON
    }
   

 def show(Task task){
    if(params.id && Task.exists(params.id)){
    render Task.findById(params.id) as JSON
      }
   else{ 
     render Task.list() as JSON
   }
  }
}
