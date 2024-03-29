<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Project Manager</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" />
  <link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css" />
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <script></script>
</head>
<body>
  <jsp:include page="../views/fragments/header.jsp"></jsp:include>
  <div class="container">
      <h2>Current Project</h2>
      <ul class="list-group">
      	<li class="list-group-item"><label>Project Name: </label><span>${currentProject.name }</span></li>
      	<li class="list-group-item"><label>Sponsor: </label><span>${currentProject.sponsor }</span></li>
      	<li class="list-group-item"><label>Description: </label><br><span>${currentProject.description }</span></li>
      </ul>
  </div>
</body>
</html>
