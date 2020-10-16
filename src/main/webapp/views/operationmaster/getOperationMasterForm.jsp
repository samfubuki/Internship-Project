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
		<td>Operation Name</td>
		<td>Operation Charge</td>
		<td>Print Sr No</td>
		<td>Rate Editable</td>
		<td>Discount Allow</td>
		<td>Tax</td>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="data" items="${allOperationMasterData}">
		<tr>
		<td>${data.opname}</td>
		<td>${data.opcharge}</td>
		<td>${data.srno}</td>
		<td>${data.rateeditable}</td>
		<td>${data.discountallow}</td>
		<td>${data.tax}</td>
		<td><a href="javascript:void(0)"
							onclick="updateUsero('${data.sno}')">Update</a> <a
							href="javascript:void(0)" onclick="deleteUsero('${data.sno}')">Delete</a></td>
	    </tr>
	     </c:forEach>
	    </tbody>
	   </table>
	    <select>
			<c:forEach var="data" items="${allOperationMasterData}">
				<option value="${data.sno }">${data.opname}</option>
			</c:forEach>
		</select>   
		</tbody>
</div>
</body>
<script>
function deleteUsero(sno) {
	$.ajax({
		url : "deleteUsero",
		type : "DELETE",
		data : {
			sno : sno,
			"key" : "value",
			"key" : "kjashd"
		},
		beforeSend : function() {
			alert("Are you sure you want to delete this operation master?");
		},
		success : function(html) {
			if (html.trim() === "deleted") {
				alert("You have successfully deleted the operation master data");
				location.reload(true);
			}
		}

	});
}
function updateUsero(sno) {
	$.ajax({
		url : "updateUsero",
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