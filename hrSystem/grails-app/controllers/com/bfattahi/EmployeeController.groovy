package com.bfattahi

import grails.converters.* 

class EmployeeController {

    def scaffold=Employee


   static allowedMethods = [index:"GET", show:"GET", delete:"DELETE"]

     //  def index(Employee employee){
     //  render Employee.list() as JSON
     // } 
     def show(Employee employee){
      if(params.id && Employee.exists(params.id)){
        render Employee.findById(params.id) as JSON
      }
     else{ 
        render Employee.list() as JSON
    }
  } 


/* Search for employee by Full name, employee ID and tax code.*/   

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


 /* ABALITY TO DELETE EMPLOYEE BY MANAGERS*/

/*  private def SendNotFoundResponse(){
      response.status=404
      render contentType:"application/json",{
      error{
       message{"Employee not found with id:"+params.id)
    }
   }
  }
  def delete(){
    Employee employee=Employee.get(params.id)
   if(!employee){
     SendNotFoundResponse()
   }
  employee.delete();
  response.status =204
  render ""
  } */
   
def deleteEmp(){
 }
/* def resultDelete(){
  def employeeProps =Employee.metaClass.properties*.name
   def employees = Employee.withCriteria {
    "${params.queryType}"{
      params.each { field, value -> 
      if (employeeProps.grep(field) && value){
       ilike(field,value)
      
      }

   }
  }
 } */
     def resultDelete(){
      if(params.id && Employee.exists(params.id)){
        render Employee.findById(params.id) as XML
      }
 //return [employees:employees]
   delete()
  //response.status =404
}
}
