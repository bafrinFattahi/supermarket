<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <asset:stylesheet src="home.css"/>
    <title>Kurdistan Supermarket - Search for Employees</title>
</head>
<body>
   <div class="row">
         <h1> Kurdistan Supermarket </h1>
     <h3> Search Results</h3>
 <p> Searched for Employees matching <em>${term}</em>.
   Found <strong> ${employees.size()}</strong> <Employees.
</p>
<ul>
   <g:each var="employee" in="${employees}">
     <li><g:link controller="employee" action="show" id="${employee.id}">${employee.fullName}</g:link></li>
   </g:each>
</ul>
<g:link action='advSearch'> Search Again</g:link>
 </div>
</body>
</html>

