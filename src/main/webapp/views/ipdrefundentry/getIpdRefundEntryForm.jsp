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
				<td>Ipd Refund Entry Amount</td>
				<td>Ipd Refund Entry Remark</td>
				</tr>
		     </thead>
		     <tbody>
		        <c:forEach var="data" items="${allIpdRefundEntryData}">
		        <tr>
		        <td>${data.amount}</td>
				<td>${data.remark}</td>
				<td><a href="javascript:void(0)"
							onclick="updateUserip('${data.sno}')">Update</a> <a
							href="javascript:void(0)" onclick="deleteUserip('${data.sno}')">Delete</a></td>
			    </tr>
			    </c:forEach>
		     </tbody>
		 </table>
		 <select>
			<c:forEach var="data" items="${allIpdRefundEntryData}">
				<option value="${data.sno }">${data.remark}</option>
			</c:forEach>
		</select> 
</div>
</body>
<script>
function deleteUserip(sno) {
	$.ajax({
		url : "deleteUserip",
		type : "DELETE",
		data : {
			sno : sno,
			"key" : "value",
			"key" : "kjashd"
		},
		beforeSend : function() {
			alert("Are you sure you want to delete this Ipd Refund Entry?");
		},
		success : function(html) {
			if (html.trim() === "deleted") {
				alert("You have successfully deleted the ipd refund entry data");
				location.reload(true);
			}
		}

	});
}
function updateUserip(sno) {
	$.ajax({
		url : "updateUserip",
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