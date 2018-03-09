package com.bfattahi

class TeamLeader {
String fullName
String department
String employeeID
String sectionName
int officePhone 
String leaderEmail
String password


    static constraints = {

fullName blank:false, nullable:false
department blank:false, nullable:false
employeeID blank:false, nullable:false, size:1..10
sectionName blank:false, nullable:false, size:1..30
officePhone blank:false, nullable:false, size:1..8
leaderEmail email blank:false, nullable:false, email:true
password email blank:false, nullable:false

    }
}
