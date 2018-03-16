package com.bfattahi

class Employee {

String fullName
Date dateOfBirth
String residence
double horlyRate
String employeeID
Date dateEmployed
String taxCode
String contract  
Manager manager
TeamLeader teamleader
Shift shift

String toString(){
return fullName
}


double calculateRate(){
36*horlyRate
}


static hasMany=[tasks:Task,teams:Team]

static belongsTo=[Team]

    static constraints = {

fullName blank:true, nullable:true
dateOfBirth blank:false, nullable:false
residence blank:false, nullable:false
horlyRate blank:false, nullable:false, scale:2
employeeID blank:false, nullable:false, size:1..10
dateEmployed blank:false, nullable:false
taxCode blank:false, nullable:false , size:1..10
contract blank:false, nullable:false, size:1..15
manager blank:false, nullable:false
teamleader blank:false, nullable:false
shift blank:false, nullable:false
    }
}
