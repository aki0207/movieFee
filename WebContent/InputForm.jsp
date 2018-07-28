<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta  charset=UTF-8">
<title>映画料金計算</title>
</head>
<body>
<h1>映画料金を計算しゃす！</h1>
<form action = "/movieFee/servlet/Result" method = "Post">
性別:<br>
男<input type = "radio" name = "gender" value = "0" required>
女<input type = "radio" name = "gender" value = "1"><br>
年齢:<br>
<input type = "number" name = "age" required><br>
タイプ:<br>
3D<input type = "radio" name = "type" value = "0" required>
2D<input type = "radio" name = "type" value "1">
<input type = "submit" value = "計算へ">
</body>
</html>