<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@page isELIgnored="false" %>
<%@include file="../header.jsp" %>
<style type="text/css">
body{
    margin: 0;
    padding: 0;
    font-family: sans-serif;
    background: #34495e;
}
//jsp mein implement nahi hui hai. ek baar dikha dijiye
</style>
<body style="background: cyan">
  <h1>PATIENT DETAILS ENTRY</h1>
  <form:form action="updateDeliveryEntryTransaction" modelAttribute="deliveryentrytransaction"
		method="post" onsubmit='return(validateForm())' style="padding-left: 15px; padding-right: 15px">
   <div class="form-group row">
   <div class="col-md-4">	
    Patient Delivery Date:<form:select path="deliverydate">
    <form:option value="Normal" label="Normal" />
    <form:option value="Caesarean" label="Caesarean" />
    </form:select>	
    </div>
    <br><br><br>
    <div class="col-md-4">	
    Patient Status:<form:input path="status" id="status" />
    </div>
    <br><br><br>
    <div class="col-md-4">
    Pregnancy in Week:<form:input path="pregWeek" id="pregWeek" />
    </div>
    <br><br><br>
    <div class="col-md-4">
    Born Child:<form:input path="bornChild" id="bornChild" />
    </div>
    <br><br><br>
    <div class="col-md-4">
    Alive Child:<form:input path="aliveChild" id="aliveChild" />
    </div>
    <br><br><br>
    <div class="col-md-4">
    Dead Child:<form:input path="deadChild" id="deadChild" />
    </div>
    <br><br><br>
    <div class="col-md-4">
    Last Child Age:<form:input path="deadChild" id="deadChild" />
    </div>
    <br><br><br>
    <div class="col-md-4">
    Last Child Sex:<form:select path="lastchildsex">
    <form:option value="Male" label="Male" />
    <form:option value="Female" label="Female" />
    <form:option value="Other" label="Other" />
    </form:select>	
    </div>
    <br><br><br>
    <div class="col-md-4">
    Total Living Child:<form:input path="totalLivingChild" id="totalLivingChild" />
    </div>
   </div> 
  </form:form>	
  <br><br><br>
  <h1>PATIENT MOTHER DETAILS</h1>	
  <form:form action="updateDeliveryEntryTransaction" modelAttribute="deliveryentrytransaction"
		method="post" onsubmit='return(validateForm())' style="padding-left: 15px; padding-right: 15px">
   <div class="form-group row">
   <div class="col-md-4">	
    Age At Marriage:<form:input path="ageAtMarriagem" id="ageAtMarriagem" />
    </div>	
    <div class="col-md-4">	
    Nationality:<form:input path="nationalitym" id="nationalitym" />
    </div>	
    <div class="col-md-4">	
    Religion:<form:input path="religionm" id="religionm" />
    </div>	
    <div class="col-md-4">	
    Qualification:<form:input path="qualificationm" id="qualificationm" />
    </div>	
    <div class="col-md-4">	
    Occupation:<form:input path="occupationm" id="occupationm" />
    </div>	
   </div> 
  </form:form>		
  <br><br><br>
  <h1>PATIENT FATHER DETAILS</h1>	
   <form:form action="updateDeliveryEntryTransaction" modelAttribute="deliveryentrytransaction"
		method="post" onsubmit='return(validateForm())' style="padding-left: 15px; padding-right: 15px">
    <div class="form-group row">
   <div class="col-md-4">	
    Age At Marriage:<form:input path="ageAtMarriagef" id="ageAtMarriagef" />
    </div>	
    <div class="col-md-4">	
    Nationality:<form:input path="nationalityf" id="nationalityf" />
    </div>	
    <div class="col-md-4">	
    Religion:<form:input path="religionf" id="religionf" />
    </div>	
    <div class="col-md-4">	
    Qualification:<form:input path="qualificationf" id="qualificationf" />
    </div>	
    <div class="col-md-4">	
    Occupation:<form:input path="occupationf" id="occupationf" />
    </div>	
   </div>  		
   </form:form>			
</body>
<script type="text/javascript">
 function vaidateForm(){
  var patientstatus = document.getElementById("status").value;
  var pregnancyweek = document.getElementById("pregWeek").value;
  var bornchild = document.getElementById("bornChild").value;
  var alivechild = document.getElementById("aliveChild").value;
  var deadchild = document.getElementById("deadChild").value;
  var nationalitymother = document.getElementById("nationalitym").value;
  var nationalityfather = document.getElementById("nationalityf").value;
  if(patientstatus.length<1){
	   alert("Please Enter the Patient Status of length greater than 1");
	   return false;
	  }	 
  else if(pregnancyweek.length<1){
	  alert("Please Enter the Pregnancy Week of length greater than 1");
	  return false;  
	  }
  else if(bornchild.length<1){
	  alert("Please Enter the name of born child greater than 1 ");
	  return false;
	  }
  else if(alivechild.length<1){
	  alert("Please Enter the name of alive child greater than 1");
	  return false;
	  }
  else if(deadchild.length<1){
	  alert("Please Enter the name of dead child greater than 1");
	  return false;
	  }
  else if(nationalitymother.length<1){
	  alert("Please Enter the mother's nationality");
	  return false;
	  }
  else if(nationalityfather.length<1){
      alert("Please Enter the father's nationality"); 
      return false;
  }
  else
	  {
	   return true;  
	  }
	 }
</script>