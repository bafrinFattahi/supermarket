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

    static constraints = {

fullName blank:false, nullable:false
dateOfBirth blank:false, nullable:false
residence blank:false, nullable:false
horlyRate blank:false, nullable:false, scale:2
employeeID blank:false, nullable:false, size:1..10
dateEmployed blank:false, nullable:false
taxCode blank:false, nullable:false , size:1..10
contract blank:false, nullable:false, size:1..15


    }
}
