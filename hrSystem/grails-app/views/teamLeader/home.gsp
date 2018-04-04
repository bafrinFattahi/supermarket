<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <asset:stylesheet src="home.css"/>
    <title>Kurdistan Supermarket | Home Page</title>
</head>
<body>
    <div id="content" role="main">
    <div class="row">
   <table style="width:100%">
     <tr>
      <td> 
      <div class="third">
           <h3> Search for Task </h3>
        <p>  </p>
        <button type="button" class="btn btn-success">
                    <g:link controller = "task" action = "advSearch"> Search For Tasks </g:link><br>
 
                  </button>
      </div>
     </td>
      <td>
      <div class="third">
           <h3> Tasks Management</h3>
        <p> </p>
        <button type="button" class="btn btn-success">
                    <g:link controller = "task" action = "create"> Create Tasks </g:link><br>
                  </button>
      </div>
      </td>
      <td>
        <div class="third">
           <h3>  List Employees</h3>
        <p> </p>
        <button type="button" class="btn btn-success">
                    <g:link controller = "employee" action = "show"> Display Employees </g:link><br>
                  </button>
        </div>
      </td>
    </tr>
    <tr>
      <td>
       <div class="fourth">
           <h3>  List Teams</h3>
        <p> </p>
        <button type="button" class="btn btn-success">
                    <g:link controller = "team" action = "show"> Display Teams </g:link><br>
                  </button>
      </div>
      </td>
      <td>
        <div class="fourth">
           <h3>  List Tasks using Index Action </h3>
        <p> </p>
        <button type="button" class="btn btn-success">
                    <g:link controller = "task" action = "index"> Display Tasks(index) Action </g:link><br>
                  </button>
      </div>
      </td>
      <td>
       <div class="fourth">
           <h3>  Disply Tasks using show Action and Accept task ID </h3>
        <p> </p>
        <button type="button" class="btn btn-success">
                    <g:link controller = "task" action = "show"> Display Tasks(show) Action with ID </g:link><br>
                    <g:if test="${flash.message}">
                      <div class="message">${flash.message}</div>
                    </g:if>
                  </button>
      </td>
   </tr>
 </table>
      </div>
</div>
</div>
</body>
</html>
