 <%@include file="../../jsp/modules/header.jsp"%>
<%@ page isELIgnored="false"%>
 <style>
           @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap');

* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Poppins', sans-serif;
    
}

body {
    width: 100%;
  background: linear-gradient(135deg, #71b7e6, #9b59b6);
    display: flex;
    justify-content: center;
    align-items: center;
 
}

.registration-container {
    background: #fff;
    border-radius: 0.5rem;
    padding: 1rem;
    margin: 1rem;
    margin-left:300px;
}

.registration-container h2 {
    font-weight: bold;
    font-size: 1.4rem;
    margin-bottom: 1rem;
    position: relative;
}

.registration-container h2::after {
    content: '';
    position: absolute;
    top: 100%;
    left: 0;
    height: 3px;
    width: 20%;
    border-radius: 2px;
    background-color: black;
}

.three-details-item {
    display: flex;
    flex-wrap: wrap;
}

hr {
    width: 70%;
    height: 1px;
     background: linear-gradient(to bottom, #33ccff 0%, #ff99cc 100%);
    margin: 1rem 0;
    border: none;
}

.personal-details,
.identity-details {
    margin: .2rem 0;
}

.personal-details label,
.identity-details label {
    margin: .5rem 1rem;
    font-size: .9rem;
    font-weight: 600;
}

.three-details-item input {
    outline: none;
    font-size: .8rem;
    border-radius: .2rem;
    border: 1px solid rgb(113, 101, 101);
    padding: .1rem;
    background-color: transparent;
}

.submit-btn {
    border: none;
     background: linear-gradient(135deg, #71b7e6, #9b59b6);
  color: #fff;
    padding: .3rem 1rem;
    display: block;
    width: 50%;
    margin: .6rem auto;
    border-radius: 5px;
    font-size: 1.1rem;
}
         </style>

</head>

 



<body>
<section class="registration-container">
        <h2> Purchase </h2>
        <section class="details-section">
            <form action="" class="registration-form">
                <!-- Personal Details Section -->
                <h4> Purchase Details </h4>
                <section class="personal-details">
                    <div class="three-details-item">
                        <label for="name">
                            <p>Supplier Id:</p>
                            <input type="text" name="name" id="name" >
                        </label>
                        <label for="fName">
                            <p> Contact No:</p>
                            <input type="text" name="fName" id="fName">
                        </label>
                        <label for="mName">
                            <p>Address:</p>
                            <input type="text" name="mName" id="mName" >
                        </label>
                    </div>

                    <div class="three-details-item">
                        <label for="DOB">
                            <p>Medicine Id:</p>
                            <input type="text" name="DOB" id="DOB" >
                        </label> 
                        <label for="aadharNo">
                            <p>Rate:</p>
                            <input type="text" name="aadharNo" id="aadharNo" >
                        </label>
                        <label for="email">
                            <p>Purchase Id:</p>
                            <input type="email" name="email" id="email" >
                        </label>
                    </div>
                    
                    <div class="three-details-item">
                        <label for="ph">
                            <p> Quantity:</p>
                            <input type="tel" name="phone" id="ph" >
                        </label>

                        <label for="gender">
                            <p>Total Amount:</p>
                            <input type="text" name="gender" id="gender" >
                        </label>

                        <label for="address">
                            <p> Purchase Date:</p>
                            <input type="text" name="address" id="address" >
                        </label>
                    </div>
                </section>


             
                <button class="submit-btn"> Submit </button>
            </form>
        </section>
    </section>
         <!--     
            <div class="button">
              <input type="submit" value="Submit">
            </div>
          </form>
        </div>
      </div> -->
<%@include file="../../jsp/modules/footer.jsp"%> 