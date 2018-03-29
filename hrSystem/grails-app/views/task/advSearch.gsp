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
       <formset>
            <legend> Searh for Task </legend>
         <table> 
             <g:form action="advResults">
             <tr>
               <td>Task Name:</td>
               <td><g:textField name="taskName"/></td>
             </tr>
            <tr>
               <td> section Name:</td>
               <td><g:textField name="sectionName"/></td>
            </tr>
             <tr>
               <td> Number Of People Required:</td>
               <td><g:textField name="numberOfPeople"/></td>
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
                       
               
