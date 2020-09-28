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
				<td>Room Category Master Room Category</td>
				<td>Room Category Master Room Number</td>
				</tr>
		     </thead>
		     <tbody>
		        <c:forEach var="data" items="${allRoomCategoryMasterData}">
		        <tr>
		        <td>${data.rct}</td>
				<td>${data.roomno}</td>
				<td><a href="javascript:void(0)"
							onclick="updateUserrcmno('${data.sno}')">Update</a> <a
							href="javascript:void(0)" onclick="deleteUserrcmno('${data.sno}')">Delete</a></td>
			    </tr>
			    </c:forEach>
		     </tbody>
		 </table>
		 <select>
			<c:forEach var="data" items="${allRoomCategoryMasterData}">
				<option value="${data.sno}">${data.rct }</option>
			</c:forEach>
		</select> 
</div>
</body>
<script>
function deleteUserrcmno(sno) {
	$.ajax({
		url : "deleteUserrcm",
		type : "DELETE",
		data : {
			sno : sno,
			"key" : "value",
			"key" : "kjashd"
		},
		beforeSend : function() {
			alert("Are you sure you want to delete this Room Category master?");
		},
		success : function(html) {
			if (html.trim() === "deleted") {
				alert("You have successfully deleted the bill charge master data");
				location.reload(true);
			}
		}

	});
}
function updateUserrcmno(sno) {
	$.ajax({
		url : "updateUserrcm",
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