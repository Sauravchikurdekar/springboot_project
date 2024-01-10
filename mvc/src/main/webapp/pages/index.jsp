<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="product" modelAttribute="product" method="POST">
<table>
<tr>

<td>product Id</td>
<td><form:input path="pID"/></td>
</tr>

<td>product name</td>
<td><form:input path="productName"/></td>
</tr>

<td>product price</td>
<td><form:input path="productprize"/></td>
</tr>
<tr>
<input type="submit"  value="submit"></tr>
</table>


</form:form>

</body>
</html>