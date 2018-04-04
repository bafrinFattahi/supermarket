package com.bfattahi

class ManagerController {

    def scaffold=Manager
   
    def login(){
    }
    def validate(){
    def user=Manager.findByUserName(params.username)
   
    if(user&&user.password ==params.password){
        session.user = user
        render view:'home'
     }
     else{ 
          flash.message="Invalid username and password."
          render view:'login'
     }
 
   }
  /* def validateemail(){
    def user=Manager.findByManagerEmail(params.username)
       if(user&&user.password ==params.password){
          session.user = user
          render view:'home'
      }
       else{ 
          flash.message="Invalid email and password."
          render view:'login'
      }
   } */
   
   def logout={
      session.user=null
      redirect(uri:'/')
   }
}
