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
				<td>Patient Delivery Date</td>
				<td>Patient Status</td>
				<td>Pregnancy Week</td>
				<td>Born Child</td>
				<td>Alive Child</td>
				<td>Dead Child</td>
				<td>Last Child Age</td>
				<td>Last Child Sex</td>
				<td>Total Living Child</td>
				<td>Age At Marriage of Mother</td>
				<td>Nationality of Mother</td>
				<td>Religion of Mother</td>
				<td>Qualification of Mother</td>
				<td>Occcupation of Mother</td>
				<td>Age At Marriage of Father</td>
				<td>Nationality of Father</td>
				<td>Religion of Father</td>
				<td>Qualification of Father</td>
				<td>Occcupation of Father</td>
				</tr>
		     </thead>
		     <tbody>
		        <c:forEach var="data" items="${allDeliveryEntryTransactionData}">
		        <tr>
		        <td>${data.deliverydate}</td>
				<td>${data.status}</td>
				<td>${data.pregWeek}</td>
				<td>${data.bornChild}</td>
				<td>${data.aliveChild}</td>
				<td>${data.deadChild}</td>
				<td>${data.lastChildAge}</td>
				<td>${data.totalLivingChild}</td>
				<td>${data.ageAtMarriagem}</td>
				<td>${data.nationalitym}</td>
				<td>${data.religionm}</td>
				<td>${data.qualificationm}</td>
				<td>${data.occupationm}</td>
				<td>${data.ageAtMarriagef}</td>
				<td>${data.nationalityf}</td>
				<td>${data.religionf}</td>
				<td>${data.qualificationf}</td>
				<td>${data.occupationf}</td>
				<td><a href="javascript:void(0)"
							onclick="updateUserd('${data.sno}')">Update</a> <a
							href="javascript:void(0)" onclick="deleteUserd('${data.sno}')">Delete</a></td>
			    </tr>
			    </c:forEach>
		     </tbody>
		 </table>
		 <select>
			<c:forEach var="data" items="${allDeliveryTransactionData}">
				<option value="${data.sno}">${data.status}</option>
			</c:forEach>
		</select> 
</div>
</body>
<script>
function deleteUserd(sno) {
	$.ajax({
		url : "deleteUserd",
		type : "DELETE",
		data : {
			sno : sno,
			"key" : "value",
			"key" : "kjashd"
		},
		beforeSend : function() {
			alert("Are you sure you want to delete this patient details?");
		},
		success : function(html) {
			if (html.trim() === "deleted") {
				alert("You have successfully deleted the patient details");
				location.reload(true);
			}
		}

	});
}
function updateUserd(sno) {
	$.ajax({
		url : "updateUserd",
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