<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2><a href = '/board/register'> 게시물 등록</a></h2>
	<table border = '1'>
		<tr>
			<td>BNO</td>
			<td>TITLE</td>
			<td>CONTENT</td>
			<td>WRITER</td>
			<td>REGDATE</td>

		</tr>
		<c:forEach items="${list}" var="vo">
			<tr>

				<td><c:out value="${vo.bno}" /></td>
				<td><c:out value="${vo.title}" /></td>
				<td><c:out value="${vo.content}" /></td>
				<td><c:out value="${vo.writer}" /></td>
				<td><c:out value="${vo.regdate}" /></td>


			</tr>
		</c:forEach>
	</table>

	<script>
		var flag = '${result}';
		if(flag === 'SUCCESS'){alert("작업이 성공");}
	</script>

</body>
</html>