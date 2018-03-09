package com.bfattahi

class Team {

String teamName
int numberOfEmployees
String sectionName
String description  
    static constraints = {

teamName blank:false, nullable:false
numberOfEmployees blank:false, nullable:false, min:2, max:100
sectionName blank:false, nullable:false
description blank:false, nullable:false, maxSize:5000, widget:'textarea'
    }
}
