package com.bfattahi

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TeamSpec extends Specification implements DomainUnitTest<Team> {

    def setup() {
    }

    def cleanup() {
    }

    void ValidatingTeam() {
        when:"A Team is created with teamName and NumberOfEmployees"
           def team6= new Team(teamName:'Team Picking,numberOfEmployees:10')
        then: 'Validation should fail'
         team6.validate()
    }
}
