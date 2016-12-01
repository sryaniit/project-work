<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login validation</title>
</head>
 <% /*validating the given username */%>
<body>
<%
if(request.getParameter("Username")=="")
{
%>
<jsp:forward page="Error.jsp"/>
<%
}
 /*validating the given username */
else if(request.getParameter("Username")!=null)
{
%>
/*directing to welcome page*/
<jsp:forward page="Welcome.jsp"/>
<%
}
else
{
%>
<%/*implementing input form */ %>
<form method="get" action="start.jsp">
<strong>Username</strong><input type="text" maxlength="50" placeholder="Username"> <br/>
<strong>Password</strong><input type="password" maxlength="25" placeholder="password"><br/>
<input type="submit" value="login">
</form>
<%
}
%>
</body>
</html>