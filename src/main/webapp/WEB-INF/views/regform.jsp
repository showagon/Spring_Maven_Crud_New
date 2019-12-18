<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>

<head>
<title>Save Customer</title>


</head>

<body>


	<h3>Save Customer</h3>

	<form:form action="saveStudent" modelAttribute="student"
		method="POST">

		<!-- this customer id is for update and delete-->
		<form:hidden path="id" />

		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="Name" /></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><form:input path="Address" /></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><form:input path="mobile" /></td>
			</tr>
			
			<tr>
				<td>Course</td>
				<td><form:input path="Course" /></td>
			</tr>
			
			<tr>
				<td>Gender</td>
				<td><form:input path="Gender" /></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>



	</form:form>

	<div style=""></div>


	<p>
		<a href="${pageContext.request.contextPath}/home">Back to List</a>
	</p>