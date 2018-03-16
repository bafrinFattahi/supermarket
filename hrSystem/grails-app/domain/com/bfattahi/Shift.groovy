package com.bfattahi

class Shift {
String shiftTitle
String timeOfDay  /*{Morning, Afternoon, Evening}*/
String dayOfWeek  //{Sunday, Monday,Tuesday,Wednsday, Thursday, Frdiday, Saturday}
int numberOfHours
String startingTime 

String toString(){
return shiftTitle
}


static hasMany=[employees:Employee,teams:Team,tasks:Task]

static belongsTo=[Team,Task]

    static constraints = {
shiftTitle blank:true, nullable:true
timeOfDay blank:false, nullable:false
dayOfWeek blabk:false, nullable:false, matches:/[A-Z].*/
numberOfHours blank:false, nullable:false, size:1..10, min:4, max:10
startingTime blank:false, nullable:false


    }
}
