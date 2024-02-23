<!--A Design by W3layouts 
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!doctype html>
<html>
<head>
<title>Official Signup Form Flat Responsive widget Template :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Official Signup Form Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />

<!-- fonts -->
<link href="//fonts.googleapis.com/css?family=Raleway:100,200,300,400,500,600,700,800,900" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Monoton" rel="stylesheet">
<!-- /fonts -->
<!-- css -->
<link href="style/font.css" rel="stylesheet" type="text/css" media="all" />
<link href="style/login.css" rel='stylesheet' type='text/css' media="all" />
<!-- /css -->
</head>
<body>
<h1 class="w3ls">Official Signup Form</h1>
<div class="content-w3ls">
	<div class="content-agile1">
		<h2 class="agileits1">Official</h2>
		<p class="agileits2">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
	</div>
	<div class="content-agile2">
		<form action="login" method="post">
                    <h3 style="color: red; display:none" id="error"   >${requestScope.error}</h3>
			<div class="form-control w3layouts"> 
				<input type="text" id="firstname" name="user" placeholder="First Name" title="Please enter your First Name" required="">
			</div>

			

			<div class="form-control agileinfo">	
				<input type="password" class="lock" name="pass" placeholder="Password" id="password1" required="">
			</div>	

					
                        <a href="home">
			<input type="submit" class="register" value="Login" id="loginb">
                        </a>
		</form>
                 <script>
        
        const passwordInput = document.getElementById("password1");
        const usernameInput = document.getElementById("firstname");
      
        const errorText = document.getElementById("error");

       
                errorText.style.display = "block";


       
        usernameInput.addEventListener("click", function () {
            errorText.style.display = "none";
        });
         passwordInput.addEventListener("click", function () {
            errorText.style.display = "none";
        });
    </script>
		
		
		<ul class="social-agileinfo wthree2">
			<li><a href="#"><i class="fa fa-facebook"></i></a></li>
			<li><a href="#"><i class="fa fa-youtube"></i></a></li>
			<li><a href="#"><i class="fa fa-twitter"></i></a></li>
			<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
		</ul>
	</div>
	<div class="clear"></div>
</div>

</body>
</html>