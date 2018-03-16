package com.bfattahi

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification


class ShiftSpec extends Specification implements DomainUnitTest<Shift> {

    def setup() {
    }

    def cleanup() {
    }

    void "Test that dayOfWeek must begin with a upper case letter"() {

    when: 'the dayOfWeek begins with a lower letter'
     def shift1= new Shift(dayOfWeek:'monday')
    then: 'validation should fail'
     !shift1.validate()
    
    when: 'the dayOfWeek begins with a upper case letter'
      shift1=new Shift(dayOfWeek:'Monday')
     then:'validation should pass'
      shift1.validate()
       
    }
}
