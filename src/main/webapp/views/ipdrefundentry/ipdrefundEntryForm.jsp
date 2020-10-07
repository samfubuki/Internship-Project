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
 <h1>Ipd Refund Entry Form</h1>
 <form:form action="saveIpdRefundEntry" modelAttribute="ipdrefundentry"
		method="post" onsubmit='return(validateForm())' style="padding-left: 15px; padding-right: 15px">	
   <div class="form-group row">
   <div class="col-md-4">
   Amount: <form:input path="amount" id="amount" />
   </div>
  <div class="col-md-4"> 
   Remark: <form:input path="remark" id="amount" />
  </div>
   ${message}
    <input type="submit">
 </div>  			
 </form:form>		
</body>
<script type="text/javascript">
 var remarkvalidate = document.getElementById("remark").value;
 function validateForm()
 {
 if(remarkvalidate.length<1)
	 {
	   alert("Please Enter the remarks value greater than 1"); 
	   return false;
	 }
 else
	 {
	  return true;
	 }
 } 
</script>
</html>