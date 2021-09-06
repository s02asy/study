<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- <script>
	var contextPath = window.location.pathname.substring(0, window.location.pathname.indexOf("/",2));
	//contextPath ==> WebContent 로 이동한다. 
	location.href=contextPath+"/main.do";	
</script> -->
<c:redirect url="main.do" ></c:redirect>