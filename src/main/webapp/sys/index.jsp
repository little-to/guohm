﻿<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>无线点餐后台管理</title>
</head>
	<frameset rows="100px,*,19px" framespacing="0" border="0" frameborder="0">
		<frame src="${pageContext.request.contextPath }/sys/public/top.jsp" scrolling="no" noresize />
		<frameset cols="178px,*">
			<frame noresize src="${pageContext.request.contextPath }/sys/public/left.jsp" scrolling="yes" />
			<frame noresize name="right" src="${pageContext.request.contextPath }/sys/public/right.jsp" scrolling="yes" />
		</frameset>
		<frame noresize name="status_bar" scrolling="no" src="${pageContext.request.contextPath }/sys/public/bottom.jsp" />
	</frameset>
</html>