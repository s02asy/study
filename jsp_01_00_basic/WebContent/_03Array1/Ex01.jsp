<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int[] arr = new int[5];
	%>
<hr/>
	<pre>
 문제1) 10부터 50까지 arr 배열에 저장
 정답1) 10 20 30 40 50
</pre>

	<%
		for (int i = 0; i < 5; i++) {
			arr[i] = 10 * (i + 1);
			out.print(arr[i] + " ");
		}
	%>
	
	<pre>
	<hr/>
문제2) 4의 배수만 출력
 정답2) 20 40
</pre>

	<%
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				out.print(arr[i] + " ");
			}
		}
	%>
	<pre>
	<hr/>
문제3) 4의 배수의 합 출력
 정답3) 60
</pre>

	<%
		int tot = 0;
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				tot = tot + arr[i];
			}
		}
		out.print("tot = " + tot);
	%>
	<hr/>
	<pre>
	
문제4) 4의 배수의 개수 출력
 정답4) 2
</pre>

	<%
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				cnt = cnt + 1;
			}
		}
		out.print("cnt = " + cnt);
	%>
	<hr/>
	<pre>
	
문제5) 짝수의 개수 출력
 정답5) 5
</pre>
	<%
		cnt = 0;
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 2 == 0) {
				cnt += 1;
			}
		}
		out.print("cnt = " + cnt);
	%>
</body>
</html>