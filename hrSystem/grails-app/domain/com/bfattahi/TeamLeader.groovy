package com.bfattahi

class TeamLeader {
String fullName
String department
String employeeID
String sectionName
int officePhone 
String leaderEmail
String password
String userName
Manager manager

String toString(){
return fullName
}


static hasMany=[employees:Employee]

    static constraints = {

fullName blank:false, nullable:false, size:1..20
department blank:false, nullable:false, size:1..15
employeeID blank:false, nullable:false, size:1..10
sectionName blank:false, nullable:false, size:1..15
officePhone blank:false, nullable:false, size:1..10
leaderEmail blank:false, nullable:false, email:true
password blank:false, nullable:false, password:true
userName blank:false, nullable:false, unique: true
manager blank:false, nullable:false

    }
}
