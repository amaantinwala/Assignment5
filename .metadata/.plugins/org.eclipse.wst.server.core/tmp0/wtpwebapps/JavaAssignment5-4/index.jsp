<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<%
		Cookie[] c = request.getCookies();
		if(c != null){
		for(int i=0;i<c.length;i++){
			if(c[i].getName() == "username"){
				response.sendRedirect("assign5.html");
			}
		}
		}
	%>
    <h1>Login Page</h1>
    <form method="post" action="login">
        <div>
            <label>Enter Username :</label>
            <input type="text" name="username">
        </div>

        <div>
            <label>Enter Password :</label>
            <input type="password" name="password">
        </div>
        
        <button type="submit">Login</button>
    </form>
</body>
</html>