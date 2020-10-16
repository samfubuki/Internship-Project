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
 <h1>OPERATION MASTER FORM DETAILS</h1>
 <form:form action="saveOperationMaster" modelAttribute="operationmaster"
		method="post" onsubmit='return(validateForm())' style="padding-left: 15px; padding-right: 15px">
  <div class="form-group row">
   <div class="col-md-4">
   Operation Name: <form:input path="opname" id="opname" />		
   </div>
   <div class="col-md-4">
   Operation Charge: <form:input path="opcharge" id="opcharge" />
   </div>
   <div class="col-md-4">
    Print Sr No: <form:input path="srno" id="srno" />
   </div>
   <div class="col-md-4">
    Rate Editable:<form:select path="rateeditable">
    <form:option value="Yes" label="Yes" />
    <form:option value="No" label="No" />
    </form:select>	
   </div>
   <div class="col-md-4">
    Discount Allow:<form:select path="discountallow">
    <form:option value="Yes" label="Yes" />
    <form:option value="No" label="No" />
    </form:select>	
   </div>
   <div class="col-md-4">
    Tax:<form:select path="tax">
    <form:option value="Yes" label="Yes" />
    <form:option value="No" label="No" />
    </form:select>	
   </div>
    ${message}
    <input type="submit">
    </div>
 </form:form>		 				
</body>
<script type="text/javascript">
 function vaidateForm(){
  var operationname = document.getElementById("opname").value;
  if(operationname.length<1)
	  {
	    alert("Please Enter the Operation Name");
	    return false;
	  }	 
  else
	  {
	    return true;
	  }
	 }
</script>