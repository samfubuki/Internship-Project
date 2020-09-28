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
   <h1>Bill Charge Master  Registration Form</h1>
   <form:form action="savebillchargemaster" modelAttribute="BillChargeMaster"
		method="post" onsubmit='return(validateForm())' style="padding-left: 15px; padding-right: 15px">		
    <div class="form-group row">
    <div class="col-md-4">
    Bill Charge Master Rate: <form:input path="rate" id="rate" />
    </div>
    <div class="col-md-4">
    Bill Charge Master Nature:<form:input path="nature" id="nature" />
    </div>
    <br><br><br>
    <div class="col-md-4">
      Type:<form:select path="type">
      </form:select>
    </div>
    <br><br><br>
    <div class="col-md-4">
     Rate Editable:<form:select path="rateEditable">
     <form:option value="Yes" label="Yes" />
     <form:option value="No" label="No" />
    </form:select>
    </div>
    <div class="col-md-4">
     Discount Allow:<form:select path="discountAllow">
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
  function validateForm(){
	  var nature = document.getElementById("nature").value;  

	  if (nature.length < 1) {
			alert("Please enter the Nature Name with length greater than 1");
			return false;
		}else {
			return true;
		}
</script>