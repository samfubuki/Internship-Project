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
   <h1>Nursing Master  Registration Form</h1>
   <form:form action="savenursingstationmaster" modelAttribute="NursingStationMaster"
		method="post" onsubmit='return(validateForm())' style="padding-left: 15px; padding-right: 15px">
    <div class="form-group row">
    <div class="col-md-4">
    Nursing Station : <form:input path="nursingstation" id="nursingstation" />
    </div>
    <div class="col-md-4">
    Nursing Station Number:<form:input path="number" id="number" />
    </div>
    
    ${message}
    <input type="submit">
    </div>
    </form:form>

</body>
<script type="text/javascript">
  function validateForm(){
	  var nursingstationname = document.getElementById("nursingstation").value;  

	  if (nursingstationname.length < 1) {
			alert("Please enter the Nursing Station Name with length greater than 1");
			return false;
		}else {
			return true;
		}
</script>