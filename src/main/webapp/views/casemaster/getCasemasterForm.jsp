<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Casemaster Form</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<div id="updateForm">
		<table border="1">
			<thead>
				<tr>
				<td>Case Name</td>
				<td>Department Name</td>
				<td>OB</td>
				</tr>
		     </thead>
		     <tbody>
		        <c:forEach var="data" items="${allCasemasterData}">
		        <tr>
		        <td>${data.casename }</td>
				<td>${data.depname }</td>
				<td>${data.ob}</td>
				<td><a href="javascript:void(0)"
							onclick="updateUserc('${data.sno}')">Update</a> <a
							href="javascript:void(0)" onclick="deleteUserc('${data.sno}')">Delete</a></td>
			    </tr>
			    </c:forEach>
		     </tbody>
		 </table>
		 <select>
			<c:forEach var="data" items="${allCasemasterData}">
				<option value="${data.sno }">${data.casename }</option>
			</c:forEach>
		</select> 
</div>
</body>
<script>
function deleteUserc(sno) {
	$.ajax({
		url : "deleteUserc",
		type : "DELETE",
		data : {
			sno : sno,
			"key" : "value",
			"key" : "kjashd"
		},
		beforeSend : function() {
			alert("Are you sure you want to delete this case data?");
		},
		success : function(html) {
			if (html.trim() === "deleted") {
				alert("You have successfully deleted the case data");
				location.reload(true);
			}
		}

	});
}
function updateUserc(sno) {
	$.ajax({
		url : "updateUserc",
		data : {
			sno : sno
		},
		success : function(html) {
			$("#updateForm").empty();
			$("#updateForm").append(html);
		}
	});
}

</script>	
</html>	   		