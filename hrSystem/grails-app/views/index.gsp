<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Kurdistan Supermarket</title>
</head>
<body>



    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1>Welcome to Best Supermarket in the World</h1>
             <div id="controllers" role="navigation">
                 <h2>Available Controllers:</h2>
                    <g:link controller = "employee" action = "create">Employee</g:link><br>
                    <g:link controller = "manager" action = "create">Manager</g:link><br>
                    <g:link controller = "task" action = "create">Task</g:link><br>
                    <g:link controller = "team" action = "create">Team</g:link><br>
                    <g:link controller = "teamLeader" action = "create">Team Leader</g:link><br>
                    <g:link controller = "shift" action = "create">Shift</g:link><br>
              </div>
            <div class="row">
               <asset:image src="Main1.jpg"/>
            </div>
             
        </section>
    </div>

</body>
</html>
