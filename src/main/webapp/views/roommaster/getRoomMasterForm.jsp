<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<div id="updateForm">
		<table border="1">
			<thead>
				<tr>
				<td>Room Master Room Number</td>
				<td>Room Master Room Description</td>
				<td>Room Master Room Charge</td>
				<td>Room Master Room Type</td>
				<td>Room Master Active</td>
				</tr>
		     </thead>
		     <tbody>
		        <c:forEach var="data" items="${allRoomMasterData}">
		        <tr>
		        <td>${data.roomno}</td>
				<td>${data.roomdescrip}</td>
				<td>${data.roomcharge}</td>
				<td>${data.type}</td>
				<td>${data.active}</td>
				<td><a href="javascript:void(0)"
							onclick="updateUserrmno('${data.sno}')">Update</a> <a
							href="javascript:void(0)" onclick="deleteUserrmno('${data.sno}')">Delete</a></td>
			    </tr>
			    </c:forEach>
		     </tbody>
		 </table>
		 <select>
			<c:forEach var="data" items="${allRoomMasterData}">
				<option value="${data.sno}">${data.roomno}</option>
			</c:forEach>
		</select> 
</div>
</body>
<script>
function deleteUserrmno(sno) {
	$.ajax({
		url : "deleteUserrmno",
		type : "DELETE",
		data : {
			sno : sno,
			"key" : "value",
			"key" : "kjashd"
		},
		beforeSend : function() {
			alert("Are you sure you want to delete this Room  master?");
		},
		success : function(html) {
			if (html.trim() === "deleted") {
				alert("You have successfully deleted the bill charge master data");
				location.reload(true);
			}
		}

	});
}
function updateUserrmno(sno) {
	$.ajax({
		url : "updateUserrmno",
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