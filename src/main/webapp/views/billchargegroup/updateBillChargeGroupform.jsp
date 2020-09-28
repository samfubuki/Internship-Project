<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <%@page isELIgnored="false" %>
<html>
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
   <h1>Update Bill Charge Group Registration Form</h1>
   <form:form action="updatebillchargegroup" modelAttribute="BillChargeGroup"
		method="post" onsubmit='return(validateForm())' style="padding-left: 15px; padding-right: 15px">
	<form:hidden path="sno" />		
    <div class="form-group row">
    <div class="col-md-4">
    Bill Charge Group Name: <form:input path="billchargegroupname" id="billchargegroupname" />
    </div>
    <div class="col-md-4">
    Bill Charge Group Sr No : <form:input path="srno" id="srno" />
    </div>
    
    ${message}
    <input type="submit">
    </div>
    </form:form>

</body>
<script type="text/javascript">
  function validateForm(){
	  var billchargegroupname = document.getElementById("billchargegroupname").value;  
	  var srno = document.getElementById("srno").value;
	  if (billchargegroupname.length < 1) {
			alert("Please enter the Bill Charge Group Name with length greater than 1");
			return false;
		} else if (srno.length < 1) {
			alert("Please enter the Bill Charge Sr No with length greater than 1");
			return false;
	  }else {
			return true;
		}
</script>