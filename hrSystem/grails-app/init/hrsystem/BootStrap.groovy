package hrsystem

class BootStrap {

    def init = { servletContext ->
def team1=new Team(
    teamName: 'Team Loading',
    numberOfEmployees:10,
    sectionName:'Bakery',
    description:'Loading and unloading deliveries').save()

    }
    def destroy = {
    }
}

