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
   <h1>Room Master Registration Form</h1>
   <form:form action="updateroommasterForm" modelAttribute="RoomMaster"
		method="post" onsubmit='return(validateForm())' style="padding-left: 15px; padding-right: 15px">
    <div class="form-group row">
    <div class="col-md-4">
    Room Master Room Number: <form:input path="roomno" id="roomno" />
    </div>
    <div class="col-md-4">
    Room Master Room Description:<form:input path="roomdescrip" id="roomdescrip" />
    </div>
    <div class="col-md-4">
    Room Master Room Charge:<form:input path="roomcharge" id="roomcharge" />
    </div>
     <div class="col-md-4">
    Room Master Room Type:<form:input path="type" id="type" />
    </div>
    
    ${message}
    <input type="submit">
    </div>
    </form:form>

</body>
<script type="text/javascript">
  function validateForm(){
	  var roomdescription = document.getElementById("roomdescrip"").value;  
	  var roomtype = document.getElementById("type").value;
	  if (roomdescription.length < 1) {
			alert("Please enter the Room Description Name with length greater than 1");
			return false;
		} else if (roomtype.length < 1) {
			alert("Please enter the Room Type name with length greater than 1");
			return false;
	  }else {
			return true;
		}
</script>