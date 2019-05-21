<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/5/21
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>练习</title>
</head>
<body>
<c:forEach items="${list}" var="name">
    <table>
        <td>
            <tr> ${list}</tr>
        </td>
    </table>
</c:forEach>
</body>
</html>
