<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
  <head>
    <title>Spring MVC exception handling example.</title>
  </head>
  
  <body>
<form:form method="POST" action="/SpringMVCExample6/addStudent">
   <table>
    <tr>
        <td><form:label path="name">Name</form:label></td>
        <td><form:input path="name" /></td>
    </tr>
    <tr>
        <td><form:label path="className">Class</form:label></td>
        <td><form:input path="className" /></td>
    </tr>
    <tr>
        <td><form:label path="rollNo">RollNo</form:label></td>
        <td><form:input path="rollNo" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>
