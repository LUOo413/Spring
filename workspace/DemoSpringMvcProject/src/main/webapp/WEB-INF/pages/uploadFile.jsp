<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UploadFile</title>
</head>
<body>
	<form action="upload.controller" method="post"
		enctype="multipart/form-data">
		Please Select a File to upload:<br /> <input type="file"
			name="myFiles" />
		<button type="submit">upload</button>
	</form>
</body>
</html>