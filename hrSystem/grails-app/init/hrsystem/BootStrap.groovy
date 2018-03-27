package com.bfattahi

class BootStrap {

    def init = { servletContext ->

/* Manager objects go here */

def manager1=new Manager(
   fullName:'Steve Crossbar',
   userName:'scross',
   password:'Secret2018',
   managerEmail:'scross@gmail.com',
   office:'B1-900',
   department:'Grocery').save()

def manager2=new Manager(
   fullName:'Andrew Jerard',
   userName:'ajerard',
   password:'Secret2020',
   managerEmail:'ajerard@gmail.com',
   office:'B1-901',
   department:'Electronics').save()

def manager3=new Manager(
   fullName:'Tom Taylor',
   userName:'ttaylo',
   password:'Secret2000',
   managerEmail:'ttaylor@gmail.com',
   office:'B1-903',
   department:'Clothing').save()




/* Team Leader objects go here  */

def teamleader1=new TeamLeader(
   fullName: 'Sarah Macdonald',
   department: 'Grocery',
   employeeID:'Tl1111',
   sectionName: 'Bakery',
   officePhone:011443254312,
   leaderEmail:'smac@gmail.com',
   password:'secret2017',
   userName:'smacdon',
   manager:manager2).save() 

def teamleader2=new TeamLeader(
   fullName: 'John Smith',
   department: 'Grocery',
   employeeID:'Tl1112',
   sectionName: 'Butcher',
   officePhone:011443254323,
   leaderEmail:'jsmith@gmail.com',
   password:'secret2020',
   userName:'jsmit',
   manager:manager1).save() 

def teamleader3=new TeamLeader(
   fullName: 'John Rivers',
   department: 'Electronics',
   employeeID:'TL1113',
   sectionName: 'Butcher',
   officePhone:011443254322,
   leaderEmail:'jriver@gmail.com',
   password:'secret2030',
   userName:'jriver',
   manager:manager1).save() 



/*Team objects go here.*/

def team1=new Team(
    teamName: 'Team Loading',
    numberOfEmployees:15,
    sectionName:'Bakery',
    description:'Loading and unloading deliveries',
    teamleader: teamleader3).save()

def team2=new Team(
    teamName: 'Team Packing',
    numberOfEmployees:20,
    sectionName:'Butcher',
    description:'Packing butcher products',
    teamleader: teamleader2).save()

def team3=new Team(
    teamName: 'Team Picking',
    numberOfEmployees:10,
    sectionName:'Bakery',
    description:'Picking bakery products',
    teamleader: teamleader3).save()


/*Shift objects go here.*/

def shift1=new Shift(
    shiftTitle:'Shift A',
    timeOfDay:'Morning', 
    dayOfWeek:'Monday,Wednesday,Friday',
    numberOfHours:6,
    startingTime:'6:00am').save()

def shift2=new Shift(
    shiftTitle:'Shift B',
    timeOfDay:'Evening', 
    dayOfWeek:'Tuesday,Thursday',
    numberOfHours:8,
    startingTime:'12:00am').save()


/*Task objects go here.*/

def task1=new Task(
  taskName:'Replenishing',
  numberOfPeople:2,
  sectionName:'Bakery',
  department:'Clothing',
  timeRequired:'1hour',
  description:'Replenshing shelves',
  taskCompleted:'Yes').save()

def task2=new Task(
  taskName:'Butchering',
  numberOfPeople:4,
  sectionName:'Butcher',
  department:'Grocery',
  timeRequired:'3hours',
  description:'Butchering the lambs',
  taskCompleted:'No').save()


/*Employee objects go here.*/

def employee1=new Employee(
    fullName:'Tom Rivers',
    dateOfBirth:new Date('07/07/1999'),
    residence:'Sheffield',
    horlyRate:7.50,
    employeeID:'E25555',
    dateEmployed:new Date('07/07/2017'),
    taxCode:'TAX345',
    contract:'Full-Time',
    manager:manager2,
    teamleader:teamleader3,
    shift:shift1).save()


def employee2=new Employee(
  fullName:'Sarah Dawson',
  dateOfBirth:new Date('07/07/1998'),
  residence:'Barnsley',
  horlyRate:7.50,
  employeeID:'E25556',
  dateEmployed:new Date('07/07/2016'),
  taxCode:'TAX345',
  contract:'Full-Time',
  manager:manager2,
  teamleader:teamleader1,
   shift:shift1).save()


def employee3=new Employee(
  fullName:'Andrew Beckam',
  dateOfBirth:new Date('07/07/1988'),
  residence:'Doncaster',
  horlyRate:7.50,
  employeeID:'E25522',
  dateEmployed:new Date('07/07/2017'),
  taxCode:'TAX345',
  contract:'Full-Time',
  manager:manager3,
  teamleader:teamleader1,
   shift:shift2).save()





manager2.addToEmployees(employee1)
manager2.addToEmployees(employee2)
manager3.addToEmployees(employee3) 


manager3.addToTeamLeaders(teamleader2)
manager1.addToTeamLeaders(teamleader3)
manager1.addToTeamLeaders(teamleader2)
manager2.addToTeamLeaders(teamleader1)


shift1.addToEmployees(employee1)
shift1.addToEmployees(employee2) 
shift2.addToEmployees(employee3)


task1.addToShifts(shift1)
task2.addToShifts(shift2)


team1.addToShifts(shift1)
team3.addToShifts(shift1)
team2.addToShifts(shift2)



employee1.addToTasks(task1)
employee2.addToTasks(task1)
employee3.addToTasks(task2)


team3.addToTasks(task1)
team2.addToTasks(task2)


team1.addToEmployees(employee1)
team1.addToEmployees(employee2)
team2.addToEmployees(employee3)

    }
    def destroy = {
    }
}

