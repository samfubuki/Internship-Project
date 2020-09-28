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
				<td>Bill Charge Group Name</td>
				<td>Bill Charge Sr No</td>
				</tr>
		     </thead>
		     <tbody>
		        <c:forEach var="data" items="${allBillGroupData}">
		        <tr>
		        <td>${data.billchargegroupname}</td>
				<td>${data.srno}</td>
				<td><a href="javascript:void(0)"
							onclick="updateUserb('${data.sno}')">Update</a> <a
							href="javascript:void(0)" onclick="deleteUserb('${data.sno}')">Delete</a></td>
			    </tr>
			    </c:forEach>
		     </tbody>
		 </table>
		 <select>
			<c:forEach var="data" items="${allBillGroupData}">
				<option value="${data.sno }">${data.billchargegroupname }</option>
			</c:forEach>
		</select> 
</div>
</body>
<script>
function deleteUserb(sno) {
	$.ajax({
		url : "deleteUserb",
		type : "DELETE",
		data : {
			sno : sno,
			"key" : "value",
			"key" : "kjashd"
		},
		beforeSend : function() {
			alert("Are you sure you want to delete this bill charge group master?");
		},
		success : function(html) {
			if (html.trim() === "deleted") {
				alert("You have successfully deleted the bill charge group master data");
				location.reload(true);
			}
		}

	});
}
function updateUserb(sno) {
	$.ajax({
		url : "updateUserb",
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