package com.bfattahi

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class EmployeeSpec extends Specification implements DomainUnitTest<Employee> {

    def setup() {
    }

    def cleanup() {
    }

    void totalRates() {
     when:"A Employee has Full-time contract"

     def employee1=new Employee(fullName:'Tom Rivers',
      horlyRate:7.50)

    then:"The calculateRate method will total rates"

    employee1.calculateRate()==270
    }
}
