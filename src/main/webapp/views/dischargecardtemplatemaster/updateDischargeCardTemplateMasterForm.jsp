<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page isELIgnored="false" %>
<%@include file="../header.jsp" %>
<style type="text/css">
body{
    margin: 0;
    padding: 0;
    font-family: sans-serif;
    background: #34495e;
}
</style>
<body style="background: cyan">
 <h1>DISCHARGE CARD TEMPLATE MASTER FORM DETAILS</h1>
 <form:form action="updateDischargeCardTemplateMaster" modelAttribute="DischargeCardTemplateMaster"
		method="post" onsubmit='return(validateForm())' style="padding-left: 15px; padding-right: 15px">
  <div class="form-group row">
   <div class="col-md-4">
   Template Name: <form:input path="templateName" id="templateName" />		
   </div>	
   <div class="col-md-4">
   Course During Hospitalization: <form:input path="courseDuringHospitalization" id="courseDuringHospitalization" />		
   </div>	
   <div class="col-md-4">
   Operation Notes: <form:input path="Operation" id="Operation" />		
   </div>
   <div class="col-md-4">
   Final Diagnosis: <form:input path="finalDiagnosis" id="finalDiagnosis" />		
   </div>		
   <div class="col-md-4">
   Examination Findings at Discharge: <form:input path="examinationFindingsDischarge" id="examinationFindingsDischarge" />		
   </div>
   <div class="col-md-4">
   Advice at Discharge: <form:input path="advice" id="advice" />		
   </div>
   <div class="col-md-4">
   Next Follow Up: <form:input path="nextFollowUp" id="nextFollowUp" />		
   </div>
   <div class="col-md-4">
   History of Present Illness: <form:input path="historyPresentIllness" id="historyPresentIllness" />		
   </div>
   <div class="col-md-4">
   Presenting Complaints: <form:input path="presentComplaints" id="presentComplaints" />		
   </div>
   <div class="col-md-4">
   Exam Finding on Admission: <form:input path="examFindingAdmission" id="examFindingAdmission" />		
   </div>
   <div class="col-md-4">
   Drug Sensitivity: <form:input path="drugSensitivity" id="drugSensitivity" />		
   </div>
   <div class="col-md-4">
   History of Past Illness: <form:input path="historyPastIllness" id="historyPastIllness" />		
   </div>
   <div class="col-md-4">
   Menstrual History: <form:input path="menstrual" id="menstrual" />		
   </div>
   ${message}
    <input type="submit">
   </div>
    </form:form>	
 </body>      
   