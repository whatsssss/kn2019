<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Sample 6 Page</h1>


<script>

var result = '${param.result}'
var result1 = '${param.result}'
if(result === "SUCCESS"){
	alert("AAA");
}

if(result1 === "SUCCESS"){
	alert("AAA");
}
</script>

</body>
</html>