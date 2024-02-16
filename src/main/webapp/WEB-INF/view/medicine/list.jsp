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

.container{
 margin-top:70px;
 margin-left:280px;
  max-width: 700px;

  background-color: #fff;
  padding: 25px 30px;
  border-radius: 5px;
  box-shadow: 0 5px 10px rgba(0,0,0,0.15);
}
.container .title{
  font-size: 25px;
  font-weight: 500;
  position: relative;
   color: black;
}
.container .title::before{
  content: "";
  position: absolute;
  left: 0;
  bottom: 0;
  height: 3px;
  width: 30px;
  border-radius: 5px;
  background: linear-gradient(135deg, #71b7e6, #9b59b6);
}
.content form .user-details{
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
  margin: 20px 0 12px 0;
}
form .user-details .input-box{
  margin-bottom: 15px;
  width: calc(100% / 2 - 20px);
 
}
form .input-box span.details{
  display: block;
  font-weight: 500;
  margin-bottom: 5px;
  color: black;
}
.user-details .input-box input{
  height: 45px;
  width: 100%;
  outline: none;
  font-size: 16px;
  border-radius: 5px;
  padding-left: 15px;
  border: 1px solid #ccc;
  border-bottom-width: 2px;
  transition: all 0.3s ease;
}
.user-details .input-box input:focus,
.user-details .input-box input:valid{
  border-color: #9b59b6;
}
 form .gender-details .gender-title{
  font-size: 20px;
  font-weight: 500;
 }
 form .category{
   display: flex;
   width: 80%;
   margin: 14px 0 ;
   justify-content: space-between;
 }
 form .category label{
   display: flex;
   align-items: center;
   cursor: pointer;
 }
 form .category label .dot{
  height: 18px;
  width: 18px;
  border-radius: 50%;
  margin-right: 10px;
  background: #d9d9d9;
  border: 5px solid transparent;
  transition: all 0.3s ease;
}
 #dot-1:checked ~ .category label .one,
 #dot-2:checked ~ .category label .two,
 #dot-3:checked ~ .category label .three{
   background: #9b59b6;
   border-color: #d9d9d9;
 }
 form input[type="radio"]{
   display: none;
 }
 form .button{
   height: 45px;
   
   margin-right: 1000px;
   width: 100%;
   margin: auto;
 }
 form .button input{
   height: 100%;
   width: 100%;
   border-radius: 5px;
   border: none;
   color: #fff;
   font-size: 18px;
   font-weight: 500;
   letter-spacing: 1px;
   cursor: pointer;
   transition: all 0.3s ease;
   background: linear-gradient(135deg, #71b7e6, #9b59b6);
 }
 form .button input:hover{
  /* transform: scale(0.99); */
  background: linear-gradient(-135deg, #71b7e6, #9b59b6);
  }
 @media(max-width: 584px){
 .container{
  max-width: 100%;
}
form .user-details .input-box{
    margin-bottom: 15px;
    width: 100%;
  }
  form .category{
    width: 100%;
  }
  .content form .user-details{
    max-height: 300px;
    overflow-y: scroll;
  }
  .user-details::-webkit-scrollbar{
    width: 5px;
  }
  }
  @media(max-width: 459px){
  .container .content .category{
    flex-direction: column;
  }
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
 <th>Update</th>
 

</tr>

<c:forEach  var="med" items="${MedicineList}">

<tr>

   <td>${med.medicineId}</td>
  <td>${med.medicineName}</td>
  <td>${med.rate}</td>
  <td>${med.manufacturer}</td>
  <td>${med.expiryDate}</td>
     <td data-th="Movie Title"><button type="button" data-toggle="modal" data-target="#exampleModal" value="click" ><i class="fas fa-pencil-alt"></i></button></td>



</tr>
</c:forEach>
</table>

 <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">

 <div class="container">
        <div class="title">Medicine</div>
        <div class="content">
         <form action="updates" method="post">
            <div class="user-details">
              <div class="input-box">
                <span class="details">Medicine Id:</span>
                <input type="text" name ="medicineId" placeholder="Enter your Medicine Id" required>
              </div>
              <div class="input-box">
                <span class="details">Medicine Name:</span>
                <input type="text" name ="medicineName" placeholder="Enter your Medicine Name" required>
              </div>
              <div class="input-box">
                <span class="details">Rate:</span>
                <input type="text" name ="rate" placeholder="Enter your Rate" required>
              </div>
              <div class="input-box">
                <span class="details">Manufacturer:</span>
                <input type="text" name ="manufacturer" placeholder="Enter your Manufacturer" required>
              </div> 
              <div class="input-box">
                <span class="details">Expire Date:</span>
                <input type="date" name ="expiryDate" placeholder="Enter your Expire Date" required>
              </div> 
          
            <div class="button">
              <input type="submit" value ="Update">
          </div>
            </div>
          </form>
        </div>
      </div>
      
    </div>
  </div>
</div>




</body>
<%@include file="../../jsp/modules/footer.jsp"%>
