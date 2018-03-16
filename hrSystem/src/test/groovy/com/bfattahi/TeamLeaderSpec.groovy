package com.bfattahi

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TeamLeaderSpec extends Specification implements DomainUnitTest<TeamLeader> {

    def setup() {
    }

    def cleanup() {
    }

    void mergeData() {
       when: "A TeamLeader has FullName, employeeID and sectionName"

        def teamleader4=new TeamLeader(fullName:'Sarah Taylor',employeeID:'TL1114',sectionName:'Butcher')

        then:"the toString method will merge them."
       teamleader4.toString()=='Sarah Taylor,TL1114,Butcher'
    }
}




























