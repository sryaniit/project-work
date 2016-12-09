<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Data Handling</title>
</head>
<body>
<h2>Customer Information</h2>to Map Values With the Servlet
<!-- Implementing Spring Forms to Map Values With the Servlet-->
<!-- Add customer details to the given method -->
<form:form method="post" action="/dispatch/addCustomer">
<table>
<tr>
<td><form:label path="name">Name</form:label></td>
<td><form:input path="name"/></td></tr>
<tr>
<td><form:label path="email">Email</form:label></td>
<td><form:input path="email"/></td></tr>
<tr>
<td><form:label path="details">Details</form:label></td>
<td><form:input path="details"/></td></tr>
<tr>
<td><form:label path="id">id</form:label></td>
<td><form:input path="id"/></td>
</tr>
<tr>
<td colspan="1">
<!-- Submit values -->
<input type="submit" value="submit">
</table>

</form:form>
</body>
</html>