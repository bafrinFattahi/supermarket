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
       <formset>
            <legend> Search for Employees </legend>
         <table> 
             <g:form action="advResultsEmp">
             <tr>
               <td> Full Name:</td>
               <td><g:textField name="fullName"/></td>
             </tr>
            <tr>
               <td> Employee ID:</td>
               <td><g:textField name="employeeID"/></td>
            </tr>
             <tr>
               <td> Employee Tax Code:</td>
               <td><g:textField name="taxCode"/></td>
            </tr>
            <tr>
            <td>Query Type:</td>
            <td><g:radioGroup name="queryType" lables="['And','Or']" values="['and','or']" value ="and">
             ${it.radio}${it.lable}
              </g:radioGroup>
            </td>
           </tr> 
          <tr>       
            <td>
               <g:submitButton name="search" value="Search"/> </td>
          </tr>
         </g:form>
       </formset>
      
      </div>
</body>
</html>
                       
               
