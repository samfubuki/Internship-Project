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
   <h1>Casemaster Registration Form</h1>
   <form:form action="saveCasemaster" modelAttribute="casemaster"
		method="post" onsubmit='return(validateForm())' style="padding-left: 15px; padding-right: 15px">
    <div class="form-group row">
    <div class="col-md-4">
    Case Name: <form:input path="casename" id="casename" />
    </div>
    <div class="col-md-4">
     Case Department:<form:input path="depname" id="depname" />
    </div>
    <br><br><br>
    <div class="col-md-4">
     OB<form:select path="ob">
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
	  var casename = document.getElementById("casename").value;  
	  var depname = document.getElementById("depName").value;
	  if (casename.length < 1) {
			alert("Please enter the casename with length greater than 1");
			return false;
		} else if (depname.length < 1) {
			alert("Please enter the department name with length greater than 1");
			return false;
	  }else {
			return true;
		}
</script>