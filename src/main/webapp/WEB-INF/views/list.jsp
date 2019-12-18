<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.action {
color:brown;
font-weight:bold;
}
</style>

</head>
<body>
<h1>Customer Details</h1>

<table border="1">
  <tr>
    <th>Name</th>
    <th>Address</th> 
    <th>Mobile</th>
    <th>Courses</th>
    <th>Gender</th>
    <th>Action</th>
    
  </tr>
 
   <c:forEach var="tempcust" items="${student}">
   
   <c:url var="updatelink" value="/updateForm">
   <c:param name="studentId" value="${tempcust.id}"/>
   </c:url>
   
   <c:url var="deletelink" value="/deleteStudent">
   <c:param name="studentId" value="${tempcust.id}"/>
   </c:url>
   
    <tr>
    <td>${tempcust.name}</td>
    <td>${tempcust.address}</td> 
    <td>${tempcust.mobile}</td>
    <td>${tempcust.course}</td>
    <td>${tempcust.gender}</td>
    <td><a href="${updatelink}" >Update</a><span class="action">|</span><a href="${deletelink}" onclick="if(!(confirm('Are you sure you want to delete the customer?'))) return false">Delete</a></td>
    
   </tr>
   
   </c:forEach>
 

 
</table>
<br>
<input type="button" value="Add Customer" onclick="window.location.href='showform'; return false;"/>


</body>
</html>