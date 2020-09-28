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
				<td>Bill Charge Master Rate</td>
				<td>Bill Charge Master Nature</td>
				<td>Bill Charge Master Type</td>
				<td>Bill Charge Master Rate Editable</td>
				<td>Bill Charge Master Discount Allow</td>
				<td>Bill Charge Master Tax</td>
				</tr>
		     </thead>
		     <tbody>
		        <c:forEach var="data" items="${allBillMasterData}">
		        <tr>
		        <td>${data.rate}</td>
				<td>${data.nature}</td>
				<td>${data.type}</td>
				<td>${data.rateEditable}</td>
				<td>${data.discountAllow}</td>
				<td>${data.tax}</td>
				<td><a href="javascript:void(0)"
							onclick="updateUserbm('${data.sno}')">Update</a> <a
							href="javascript:void(0)" onclick="deleteUserbm('${data.sno}')">Delete</a></td>
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
function deleteUserbm(sno) {
	$.ajax({
		url : "deleteUserbm",
		type : "DELETE",
		data : {
			sno : sno,
			"key" : "value",
			"key" : "kjashd"
		},
		beforeSend : function() {
			alert("Are you sure you want to delete this bill charge master?");
		},
		success : function(html) {
			if (html.trim() === "deleted") {
				alert("You have successfully deleted the bill charge master data");
				location.reload(true);
			}
		}

	});
}
function updateUserbm(sno) {
	$.ajax({
		url : "updateUserbm",
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