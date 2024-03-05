<%@ page isELIgnored="false"%>

 <%@include file="../../jsp/modules/header.jsp"%>
<body>
 <div class="page-wrapper">
	<div class="content container-fluid">

		<!-- Page Header -->
		<div class="page-header">
			<div class="row align-items-center">
				<div class="col">
					<h3 class="page-title">Edit Customer</h3>
					<ul class="breadcrumb">
						<li class="breadcrumb-item"><a href="library.html">Customer</a></li>
						<li class="breadcrumb-item active">Edit Customer</li>
					</ul>
				</div>
			</div>
		</div>
		<!-- /Page Header -->

		<div class="row">
			<div class="col-sm-12">

				<div class="card">
					<div class="card-body">
						<form action="edits" method="post">
							<div class="row">
								
								<div class="col-12 col-sm-4">
									<div class="form-group local-forms">
										<label> Id <span class="login-danger">*</span></label> <input
											type="text" class="form-control" name="customerId"
											value="${param.customerId }">
									</div>
								</div>
								<div class="col-12 col-sm-4">
									<div class="form-group local-forms">
										<label> Name<span class="login-danger">*</span></label> <input
											type="text" class="form-control" name="customerName"
											value="${param.customerName}">

									</div>
								</div>
								<div class="col-12 col-sm-4">
									<div class="form-group local-forms">
										<label>contactNumber<span class="login-danger">*</span></label>
										<input type="text" class="form-control" name="contactNumber"
											value="${param.contactNumber }">
									</div>
								</div>

								
								
								</div>

								
								
								

								<div class="col-12">
									<div class="student-submit">
										<button type="submit" class="btn btn-primary">Update</button>
									</div>
								</div>
							</div>
						</form>
					</div>
				</div>

			</div>
		</div>
	</div>

</div>
      
           
  
</body>
<%@include file="../../jsp/modules/footer.jsp"%> 