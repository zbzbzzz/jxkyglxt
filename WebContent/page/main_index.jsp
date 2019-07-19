<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title><s:property value="#session.loginuser.userName" /> -
	本科数据管理系统</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" href="<%=basePath%>css/com.css" />
	<!-- 导出模态框css -->
	<link rel="stylesheet" href="<%=basePath%>css/export_modal.css" />

	<link rel="stylesheet" href="<%=basePath%>css/bootstrap-select.css" />
	<script src="<%=basePath%>js/tools.js"></script>
</head>
<body>
<s:action name="page_nav" namespace="/Page" executeResult="true" />


<%@ include file ="/modal/addInfo/userSetting.jsp" %>

<%@ include file ="/modal/exportInfo/info_modal.jsp" %>
<%@ include file ="/modal/exportInfo/award_modal.jsp" %>
<%@ include file ="/modal/exportInfo/paper_modal.jsp" %>
<%@ include file ="/modal/exportInfo/patent_modal.jsp" %>
<%@ include file ="/modal/exportInfo/project_modal.jsp" %>
<%@ include file ="/modal/exportInfo/works_modal.jsp" %>



<%@ include file ="/modal/student/export_award_modal.jsp" %>
<%@ include file ="/modal/student/export_info_modal.jsp" %>
<%@ include file ="/modal/student/export_paper_modal.jsp" %>
<%@ include file ="/modal/student/export_patent_modal.jsp" %>
<%@ include file ="/modal/student/export_project_modal.jsp" %>

<script type="text/javascript"
		src="<%=basePath%>js/teacher/main_index.js"></script>
<script type="text/javascript"
		src="<%=basePath%>js/bootstrap-select.js"></script>
</body>
</html>
