<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="./design.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add-Product</title>
</head>
<body>
<form action="handle-product" method="post">
  <div class="form-group">
    <label for="productName">Product Name</label>
    <input type="text" class="form-control" id="name" name="name" aria-describedby="producthelp" placeholder="ProductName">
    
  </div>
  <div class="form-group">
    <label for="productDescription1">Product Description</label>
    <input type="text" class="form-control" id="description" name="description" placeholder="Description">
  </div>
  
  <div class="form-group">
    <label for="productPrice1">Price</label>
    <input type="text" class="form-control" id="price" name="price" placeholder="Price">
  </div>
  <div class="form-group">
  
  <a href="${pageContext.request.ContextPath }/">class="btn btn-primary">Back</a>
  <button type="submit" class="btn btn-primary">Add</button>
  </div>
</form>
</body>
</html>