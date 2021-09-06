<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:remove var="id" scope="session" />
<script type="text/javascript">
	alert('로그아웃 되었습니다.');
	location.href='main.do';
</script>