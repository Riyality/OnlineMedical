<%@include file="../jsp/modules/header.jsp"%>
<style>
        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap');
*{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: 'Poppins',sans-serif;
}
body{

  display: flex;
  justify-content: center;
  align-items: center;
  color:#00aaff;
  background: linear-gradient(135deg, #71b7e6, #9b59b6);

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
</head>

    <body>
       <div class="container">
        <div class="title">Medicine</div>
        <div class="content">
         <form action="Medicine">
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
              <input type="submit" value ="Submit">
          </div>
            </div>
          </form>
        </div>
      </div>
       
    
    </body>
	<%@include file="../jsp/modules/footer.jsp"%>