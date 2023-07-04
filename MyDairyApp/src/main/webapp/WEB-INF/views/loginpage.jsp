<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="header">

<div class="first">

<img src="<c:url value="/images/img.png"/>" width="40" height="30">
</div>
<div class="second">
MyDairy App
</div>
</div>
<br/>
<hr/>
<br/><br/>

<div class="bodypart">
<div class="bodypart1"> 
<br/><br/>
<br/><br/>
<br/><br/>
<!-- <img src="/images/img.png" > -->
<img src="<c:url value="/images/img.png"/>">

</div>
<div class="bodypart2"> 
<br/><br/>
<br/><br/>
<br/><br/>
<br/><br/>
<br/><br/>
<h1>LOGIN HERE</h1><br>
<form action="">
<label>Username </label><input type="text"  name="username" class="formcontrol" /><br><br>
<label>Password </label><input type="password" name="password" class="formcontrol" /><br><br>

<button type="submit" >LOGIN</button>

</form>

<br/><br/>
New User? <a href="./register">Register</a> here

</div>
</div>


</body>
</html>