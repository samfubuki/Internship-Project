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
				<td>Complaints</td>
				<td>History of Present Illness</td>
				<td>History of Past Illness</td>
				<td>Family History</td>
				</tr>
		     </thead>
		     <tbody>
		        <c:forEach var="data" items="${allPatientHistoryData}">
		        <tr>
		        <td>${data.complaints}</td>
				<td>${data.hopresentillness}</td>
				<td>${data.hopastillness}</td>
				<td>${data.familyhistory}
				<td><a href="javascript:void(0)"
							onclick="updateUserp('${data.sno}')">Update</a> <a
							href="javascript:void(0)" onclick="deleteUserp('${data.sno}')">Delete</a></td>
			    </tr>
			    </c:forEach>
		     </tbody>
		 </table>
		 <select>
			<c:forEach var="data" items="${allPatientHistoryData}">
				<option value="${data.sno }">${data.complaints}</option>
			</c:forEach>
		</select> 
</div>
</body>
<script>
function deleteUserp(sno) {
	$.ajax({
		url : "deleteUserp",
		type : "DELETE",
		data : {
			sno : sno,
			"key" : "value",
			"key" : "kjashd"
		},
		beforeSend : function() {
			alert("Are you sure you want to delete this patient history entry?");
		},
		success : function(html) {
			if (html.trim() === "deleted") {
				alert("You have successfully deleted the patienr history entry data");
				location.reload(true);
			}
		}

	});
}
function updateUserp(sno) {
	$.ajax({
		url : "updateUserp",
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