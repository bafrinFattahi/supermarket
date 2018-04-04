<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <asset:stylesheet src="home.css"/>
    <title>Kurdistan Supermarket Home Page</title>
</head>
<body>



    <div id="content" role="main">
    <div class="row">
   <table style="width:100%">
     <tr><td> <div class="first">
           <h3> Searching For Employee </h3>
        <p> </p>
        <button type="button" class="btn btn-success">
                    <g:link controller = "employee" action = "advSearch"> Search For Employee</g:link><br>
                  </button>
      </div>
      </td>
      <td> <div class="sixth">
           <h3> Delete Employee from table</h3>
        <p> </p>
        <button type="button" class="btn btn-success">
                    <g:link controller = "employee" action = "deleteEmp"> Delete Employee</g:link><br>
                  </button>
      </div>
      </td>
     </tr>
     <tr>
      <td> <div class="first">
           <h3> Team Leader Management</h3>
        <p> </p>
        <button type="button" class="btn btn-success">
                    <g:link controller = "teamLeader" action = "create"> Add Team Leader </g:link><br>
                  </button>
      </div>
      </td>
      <td>
     <div class="second">
           <h3> Team Management</h3>
        <p> </p>
        <button type="button" class="btn btn-success">
                    <g:link controller = "team" action = "create"> Create Teams</g:link><br>
                  </button>
      </div>
      </td>
    </tr>
  <tr>
    <td> <div class="first">
           <h3> Employees Management</h3>
        <p> </p>
        <button type="button" class="btn btn-success">
                    <g:link controller = "employee" action = "create"> Register Employee </g:link><br>
                  </button>
      </div>
      </td>
      <td>
     <div class="second">
           <h3> Shift Management</h3>
        <p> </p>
        <button type="button" class="btn btn-success">
                    <g:link controller = "shift" action = "create"> Add Shift </g:link><br>
                  </button>
      </div>
      </td>

   </tr>
   <tr>
        <td> <div class="first">
           <h3> Assign Employee to Team</h3>
        <p> </p>
        <button type="button" class="btn btn-success">
                    <g:link controller = "employee" action = "index"> Assign Employee to Team </g:link><br>
                  </button>
      </div>
      </td>
   </tr>
 </table>
</div>
</div>
</body>
</html>

