<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file="header.jsp" %>
<body style="background: cyan">
	
	
	<ul class="breadcrumb">
		<li><a href="#" style="padding-left: 50px;">Home</a></li>
		<li><a href="#">Account</a></li>
		<li><a href="#">Dashboard</a></li>
		<li>Italy</li>
	</ul>
	
	
	
	
	<form style="padding-left: 15px; padding-right: 15px">
  <div class="form-group row">
    <div class="col-md-4">
    <label for="">Name</label>
    <input type="text" class="form-control" id="" placeholder="Enter Name">
    </div>
    <div class="col-md-4">
    <label for="">Mobile Number</label>
    <input type="number" class="form-control" id="" placeholder="Enter Mobile">
    </div>
    <div class="col-md-4">
    <label for="">Email</label>
    <input type="email" class="form-control" id="" placeholder="Enter Mobile">
    </div>
    </div>
    
    <div class="form-group row">
    <div class="col-md-4">
    <label for="">DOB</label>
    <input type="date" class="form-control" id="" placeholder="Enter DOB">
    </div>
    <div class="col-md-4">
    <label for="sel1">Select list (select ones):</label>
      <select class="form-control" id="sel1">
        <option>1</option>
        <option>2</option>
        <option>3</option>
        <option>4</option>
      </select>
    
    </div>
    
    
    
    </div>
    
   <table class="table table-striped table-hover w-auto">
    <thead>
      <tr style="background-color: #ddbbf8">
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Email</th>
      </tr>
    </thead>
    <tbody style="background-color: white">
      <tr >
        <td>John</td>
        <td>Doe</td>
        <td>john@example.com</td>
      </tr>
      <tr>
        <td>Mary</td>
        <td>Moe</td>
        <td>mary@example.com</td>
      </tr>
      <tr>
        <td>July</td>
        <td>Dooley</td>
        <td>july@example.com</td>
      </tr>
    </tbody>
  </table>
    
    
    <div class="form-group row">
    <div class="col-md-2">
   
    <input type="checkbox" value="Checkbox">
    <label>Checkbox</label>
    </div>
    <div class="col-md-2">
    <input type="radio" value="Checkbox">
    <label>Radio Button</label>
    
    
    </div>
    </div>
    
  <div style="align-items: center">
  <button type="submit" class="btn btn-primary">Submit</button>
  </div>
</form>
	

</body>
</html>