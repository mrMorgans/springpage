<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Registration</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

	<form:form method="post" action="add" commandName="user">

		<table>
			<tr>
				<td><form:label path="login">
						<spring:message code="label.login" />
					</form:label></td>
				<td><form:input path="login" /></td>
			</tr>
			
			<tr>
				<td><form:label path="pass">
						<spring:message code="label.pass" />
					</form:label></td>
				<td><form:input path="pass" /></td>
			</tr>
			
			<tr>
				<td><form:label path="email">
						<spring:message code="label.email" />
					</form:label></td>
				<td><form:input path="email" /></td>
			</tr>
			
			<tr>
				<td colspan="2"><input type="submit"
					value="<spring:message code="label.addUser"/>" /></td>
			</tr>
		</table>
	</form:form>


</body>
</html>
