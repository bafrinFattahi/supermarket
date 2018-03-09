package com.bfattahi

class Shift {

enum timeOfDay {Morning, Afternoon, Evening}
enum dayOfWeek {Sunday, Monday,Tuesday,Wednsday, Thursday, Frdiday, Saturday}
int numberOfHours
enum startingTime {6:00am, 12:00am, 6:00pm} 

    static constraints = {

timeOfDay blank:false, nullable:false
dayOfWeek blank:false, nullable:false
numberOfHours blank:false, nullable:false, size:1..10
startingTime blank:false, nullable:false

    }
}
