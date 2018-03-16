package com.bfattahi

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ManagerSpec extends Specification implements DomainUnitTest<Manager> {

    def setup() {
    }

    def cleanup() {
    }

    void ValidatingManager() {
       when:"A Manager is created with fullName and managerEmail"
           def manager5= new Manager(fullName:'John Cindery,managerEmail: JohnCindery.com')
        then: 'Validation should fail'
         manager5.validate()
       
    }
}
