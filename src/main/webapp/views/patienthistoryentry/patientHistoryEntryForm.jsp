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
 <h1>Patient History Entry Form</h1>
 <form:form action="savePatientHistoryEntry" modelAttribute="patienthistoryentry"
		method="post" onsubmit='return(validateForm())' style="padding-left: 15px; padding-right: 15px">	
  <div class="form-group row">
   <div class="col-md-4">
   Complaints: <form:input path="complaints" />
   </div>
   <div class="col-md-4">
   History of Present Illness: <form:input path="hopresentillness" />
   </div>
   <div class="col-md-4">
   History of Past Illness: <form:input path="hopastillness" />
    </div>
   <div class="col-md-4"> 
   Family History: <form:input path="familyhistory" />
   </div>
     ${message}
    <input type="submit">
   </div>  			
 </form:form>		
</body> 
       