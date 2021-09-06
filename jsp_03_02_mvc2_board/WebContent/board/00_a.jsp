<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
	var contextPath = window.location.pathname.substring(0, window.location.pathname.indexOf("/",2));
	//WebContent 가 시작경로인데 지금 00_a.jsp 파일이 board 폴더 안에 있다.
	// 이렇게되면 제대로 된경로를 못찾게 된다. 위의 수식으로 WebContent 위치를 찾는것이다.
	// 폴더가 없으면 안써도되지만 , 지금은 편의상 폴더를안만들수도있지만 실제론 폴더를 무조건만들기때문에
	// 반드시 알고있어야한다. 
	//contextPath ==> WebContent 로 이동한다. 
	location.href=contextPath+"/00_main.do";	
</script>
	
