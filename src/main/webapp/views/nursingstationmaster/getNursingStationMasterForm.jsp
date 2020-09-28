<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Nursing Station Master</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<div id="updateForm">
		<table border="1">
			<thead>
				<tr>
				<td>Nursing Station</td>
				<td>Nursing Station Number</td>
				</tr>
		     </thead>
		     <tbody>
		        <c:forEach var="data" items="${allNursingStationMasterData}">
		        <tr>
		        <td>${data.nursingstation}</td>
				<td>${data.number}</td>
				<td><a href="javascript:void(0)"
							onclick="updateUsernsm('${data.sno}')">Update</a> <a
							href="javascript:void(0)" onclick="deleteUsernsm('${data.sno}')">Delete</a></td>
			    </tr>
			    </c:forEach>
		     </tbody>
		 </table>
		 <select>
			<c:forEach var="data" items="${allNursingStationMasterData}">
				<option value="${data.sno}">${data.nursingstation }</option>
			</c:forEach>
		</select> 
</div>
</body>
<script>
function deleteUsernsm(sno) {
	$.ajax({
		url : "deleteUsernsm",
		type : "DELETE",
		data : {
			sno : sno,
			"key" : "value",
			"key" : "kjashd"
		},
		beforeSend : function() {
			alert("Are you sure you want to delete this Nursing Station master?");
		},
		success : function(html) {
			if (html.trim() === "deleted") {
				alert("You have successfully deleted the Nursing Station master data");
				location.reload(true);
			}
		}

	});
}
function updateUsernsm(sno) {
	$.ajax({
		url : "updateUsernsm",
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