<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/register.css" />
</head>
<body>
	<div class="register-form">
		<h2>Registration Form</h2>
		<form action="#">
			<div class="container">
				<div class="row">
					<div class="col">
						<label for="firstName">First Name:</label> <input type="text"
							id="firstName" name="firstName" required>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<label for="LastName">Last Name:</label> <input type="text"
							id="lastName" name="lastName" required>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<label for="username">Username:</label> <input type="text"
							id="username" required>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<label for="birthday">Birthday:</label> <input type="date"
							id="birthday" name="birthday" required>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<label for="gender">Gender:</label> <input type="text" id="gender"
							name="gender" required>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<label for="Email">Email:</label> <input type="email" id="Email"
							name="Email" required>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<label for="phoneNumber">Phone Number:</label> <input
							type="number" id="phoneNumber" required>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<label for="subject">Subject:</label> <input type="text"
							id="subject" name="subject" required>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<label for="password">Password:</label> <input type="password"
							id="password" required>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<label for="retypePassword">Retype Password:</label> <input
							type="password" id="retypePassword" name="retypePassword"
							required>
					</div>
				</div>

			</div>
			<button type="submit" class="register-button">Submit</button>
		</form>
	</div>


</body>
</html>