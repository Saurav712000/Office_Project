<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="./design.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update-Product</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/handle-product" method="post">
<input type="hidden" value="${product.id}" name="id"/>
  <div class="form-group">
    <label for="productName">Product Name</label>
    <input type="text" class="form-control" id="name" name="name" aria-describedby="producthelp" placeholder="Enter the Product here"
       value="${product.name}">
    
  </div>
  <div class="form-group">
    <label for="productDescription1">Product Description</label>
    <textarea class="form-control" id="description" name="description" row="5" placeholder="Enter the Description">${product.description}
    </textarea>
  </div>
  
  <div class="form-group">
    <label for="productPrice1">Price</label>
    <input type="text" class="form-control" id="price" name="price" placeholder="Price" value="${product.price}">
  </div>
  <div class="form-group">
  
  <a href="${pageContext.request.ContextPath }/">class="btn btn-primary">Back</a>
  <button type="submit" class="btn btn-warning">Update</button>
  </div>
</form>
</body>
</html>