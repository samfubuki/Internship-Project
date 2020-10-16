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
		<td>Template Name</td>
		<td>Course During Hospitalization</td>
		<td>Operation Notes</td>
		<td>Final Diagnosis</td>
		<td>Examination Findings at Discharge</td>
		<td>Advice at Discharge</td>
		<td>Next Follow Up</td>
		<td>History of Present Illness</td>
		<td>Presenting Complaints</td>
		<td>Exam Finding on Submission</td>
		<td>Drug Sensitivity</td>
		<td>History of Past Illness</td>
		<td>Present History</td>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="data" items="${allDischargeCardTemplateMasterData}">
		<tr>
		<td>${data.templateName}</td>
		<td>${data.courseDuringHospitalization}</td>
		<td>${data.operation}</td>
		<td>${data.finalDiagnosis}</td>
		<td>${data.examinationFindingsDischarge}</td>
		<td>${data.advice}</td>
		<td>${data.nextFollowUp}</td>
		<td>${data.historyPresentIllness}</td>
		<td>${data.presentComplaints}</td>
		<td>${data.examFindingAdmission}</td>
		<td>${data.drugSensitivity}</td>
		<td>${data.historyPastIllness}</td>
		<td>${data.menstrual}</td>
		<td><a href="javascript:void(0)"
							onclick="updateUserdc('${data.sno}')">Update</a> <a
							href="javascript:void(0)" onclick="deleteUserdc('${data.sno}')">Delete</a></td>
	    </tr>
	     </c:forEach>
	    </tbody>
	   </table>
	   <select>
			<c:forEach var="data" items="${allDischargeCardTemplateMasterData}">
				<option value="${data.sno }">${data.templateName}</option>
			</c:forEach>
		</select>   
		</tbody>
</div>
</body>
<script>
function deleteUserdc(sno) {
	$.ajax({
		url : "deleteUserdc",
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
function updateUserdc(sno) {
	$.ajax({
		url : "updateUserdc",
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