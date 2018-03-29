package com.bfattahi

class Task {

String taskName
String numberOfPeople
String sectionName
String department
String timeRequired
String description
boolean taskCompleted


String toString(){
return taskName
}

static hasMany=[shifts:Shift,employees:Employee,teams:Team]
static belongsTo=[Employee,Team]

    static constraints = {

taskName blank:false, nullable:false
numberOfPeople blank:false, nullable:false
sectionName blank:false, nullable:false
department blank:false, nullable:false
timeRequired blank:false, nullable:false, size:1..15
description blank:false, nullable:false, maxSize:5000, widget:'textarea'
taskCompleted blank:false, nullable:false

    }
}
