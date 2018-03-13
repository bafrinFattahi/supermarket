package com.bfattahi

class Team {

String teamName
int numberOfEmployees
String sectionName
String description  
TeamLeader teamleader

String toString(){
return teamName
}

static hasMany=[shifts:Shift,tasks:Task,employees:Employee]


    static constraints = {

teamName blank:false, nullable:false, size:1..15
numberOfEmployees blank:false, nullable:false, min:2, max:100
sectionName blank:false, nullable:false
description blank:false, nullable:false, maxSize:5000, widget:'textarea'
teamleader blank: false, nullable: false


    }
}
