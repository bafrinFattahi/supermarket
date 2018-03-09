package com.bfattahi

class Shift {

String timeOfDay  /*{Morning, Afternoon, Evening}*/
String dayOfWeek  /*{Sunday, Monday,Tuesday,Wednsday, Thursday, Frdiday, Saturday}*/
int numberOfHours
String startingTime 

    static constraints = {

timeOfDay blank:false, nullable:false
dayOfWeek blabk:false, nullable:false
numberOfHours blank:false, nullable:false, size:1..10
startingTime blank:false, nullable:false

    }
}
