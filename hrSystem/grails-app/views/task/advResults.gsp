<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <asset:stylesheet src="home.css"/>
    <title>Kurdistan Supermarket - Search for Tasks</title>
</head>
<body>
   <div class="row">
         <h1> Kurdistan Supermarket </h1>
     <h3> Search Results</h3>
 <p> Searched for Tasks matching <em>${term}</em>.
   Found <strong> ${tasks.size()}</strong> <Tasks.
</p>
<ul>
   <g:each var="task" in="${tasks}">
     <li><g:link controller="task" action="show" id="${task.id}">${task.taskName}</g:link></li>
   </g:each>
</ul>
<g:link action='advSearch'> Search Again</g:link>
 </div>
</body>
</html>

