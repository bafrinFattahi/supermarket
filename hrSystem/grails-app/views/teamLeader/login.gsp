<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Kurdistan Supermarket Team Leader Login</title>
</head>
<body>
<g:if test="${flash.message}">
     <div class="message">${flash.message}</div>
   </g:if>
   <g:form action="validate">
     <input type="hidden" name="dName" value="${dName}">
     <input type="hidden" name="eName" value="${eName}">
     <table>
        <tr class="prop">
          <td class="name">
            <label for="username">Your Email:</label>
          </td>
          <td class="value">
            <input type="text" id="username" name="username" value="">
          </td></tr>
        <tr class="prop">
          <td class="name">
            <label for="password">Password:</label>
          </td>
          <td class="value">
            <input type="password" id="password" name="password" value="">
          </td></tr>
        <tr><td></td>
          <td>
            <input type="submit" value="login"/>
          </td></tr>
      </table>
    </g:form>
  </body>
</html>
