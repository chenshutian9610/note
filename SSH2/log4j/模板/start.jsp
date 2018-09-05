<%@page contentType="text/html;charset=utf-8"%>
<%@page import="org.apache.log4j.*"%>
<html>
<head>
    <title></title>
</head>
<body>
    <% Logger one=Logger.getLogger("one");
        one.debug("start");  %>
    <form action="test" method="post">
        User:<input type="text" name="user.name" value="">
        <% one.info("writing");  %>
        <input type="submit" name="" value="submit">
        <% one.warn("submitted");  %>
    </form>
    <% one.error("over");  %>
</body>
</html>