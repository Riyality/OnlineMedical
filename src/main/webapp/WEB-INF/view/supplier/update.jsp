<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  
      <div class="modal-body">
    <form action="update">
          <div class="container">
        <div class="title">Suppliers</div>
        <div class="content">
          <form action="update" method="POST">
            <div class="user-details">
              <div class="input-box">
                <span class="details">Supplier Id:</span>
                <input type="text" placeholder="Enter your supplier id" name="SupplierId" required Supplier Id="${param.supplierId}" >
              </div>
              <div class="input-box">
                <span class="details">Supplier Name:</span>
                <input type="text" placeholder="Enter your supplier name" name="SupplierName" required Supplier Name="${param.supplierName} ">
              </div>
              <div class="input-box">
                <span class="details">Contact No:</span>
                <input type="text" placeholder="Enter your contact no" name="ContactNumber" required  Contact Number="${param.contactNumber}">
              </div>
              <div class="input-box">
                <span class="details">Address:</span>
                <input type="text" placeholder="Enter your address" name="Address" required  Address="${param.address}">
              </div> 
             
          
            <div class="button">
              <input type="submit" value="Submit">
            </div>
          </form>
        </div>
      </div>
         </form>
      </div>
      
      
    </div>
  </div>
</div>

</body>
</html>