<%@include file="../../jsp/modules/header.jsp"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
   
  <style type="text/css">

 
table{
border-collapse: collapse;
text-align: center;
width: 70%;
margin-left:275px;
margin-top: 50px;
}
body{
margin-bottom:3000px;
}


 th{
padding: 10px;
font-size: 20px;
background-color: wheat;
color: black;
}
input{
font-size: 20px;
margin-top: 20px;
color: gray;
}

input[type="text"]:hover{

border: 4px solid red;
}
td{
color: black;
font-size: 20px;
background-color:#F0FFF0;
}
h3{
 color: #ff5733;
}


</style>
 
<body>

<table border="6">
<tr>
<th>Medicine Id</th>
<th>Medicine Name</th>
<th>Rate</th>
<th>Manufacturer</th>
<th>Expiry Date</th>

</tr>

<c:forEach  var="med" items="${MedicineList}">

<tr>

   <td>${med.medicineId}</td>
  <td>${med.medicineName}</td>
  <td>${med.rate}</td>
  <td>${med.manufacturer}</td>
  <td>${med.expiryDate}</td>



</tr>
</c:forEach>
</table>




</body>
<%@include file="../../jsp/modules/footer.jsp"%>
