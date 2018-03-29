package com.bfattahi

import grails.converters.* 

class EmployeeController {

    def scaffold=Employee


   static allowedMethods = [index:"GET", show:"GET"]

       def index(Employee employee){
       render Employee.list() as JSON
      } 
   

     def show(Employee employee){
      if(params.id && Employee.exists(params.id)){
        render Employee.findById(params.id) as JSON
      }
     else{ 
        render Employee.list() as JSON
    }
  } 
   
  def advSearch(){
  }
  def advResultsEmp(){
   def employeeProps =Employee.metaClass.properties*.name
   def employees = Employee.withCriteria {
   "${params.queryType}"{
     params.each { field, value -> 
     if (employeeProps.grep(field) && value){
       ilike(field,value)
      }
   }
  }
 }
 return [employees:employees]
}

}
