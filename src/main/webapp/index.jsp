<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="./Style/main.css">
</head>
<body>
<h1 class="header">Thanks for joining our email list</h1>
<p class="desc">Here is the information that you entered</p>
<div>
    <label>Email: </label>
    <label>${requestScope.User.email}</label>
</div>
<div>
    <label>First Name: </label>
    <label>${requestScope.User.firstname}</label>
</div>
<div>
    <label>Last Name: </label>
    <label>${requestScope.User.lastname}</label>
</div>
<div>
    <p>To enter another email address, click on the Back button your browser or the Return button shown below</p>
    <br>
    <form action="hello-servlet" method="POST">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>
</div>
</body>
</html>