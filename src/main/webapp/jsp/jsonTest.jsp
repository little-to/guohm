<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: guohongming
  Date: 2019/12/28
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<head>
    <title>JSON数据传输测试</title>
</head>
<script src="../js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="../js/json2.js"></script>
<%@include file="commons.jsp"%>
<body>
   <script type="text/javascript">
       function testJson1() {
           console.log("${pageContext.request.contextPath}/");
           AjaxRequestByPost("json1",{id: 2},null,function (data) {
               console.log(data);
               console.log("test");
           });
       }
       function testJson2() {
           AjaxRequestByPost("json2",1,null,function (data) {
               console.log("test");
               console.log(data);
           });
       }
   </script>
   <input type="button" value="JSON测试" onclick="testJson1()"> <br>
   <input type="button" value="JSON2测试" onclick="testJson2()"> <br>
</body>
</html>
