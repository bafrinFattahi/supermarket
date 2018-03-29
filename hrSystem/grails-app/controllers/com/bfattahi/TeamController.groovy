package com.bfattahi


import grails.converters.*

class TeamController {

    def scaffold=Team

  static allowedMethods = [index:"GET", show:"GET"]

      def index(Team team){
       render Team.list()as XML
      }
   

     def show(Team team){
      if(params.id && Team.exists(params.id)){
        render Team.findById(params.id) as JSON
      }
     else{ 
        render Team.list() as JSON
    }
  }
}
