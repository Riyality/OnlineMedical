 <%@ page isELIgnored="false"%>

 <%@include file="../../jsp/modules/header.jsp"%>
<body>
 <div class="page-wrapper">
	<div class="content container-fluid">

		<!-- Page Header -->
		<div class="page-header">
			<div class="row align-items-center">
				<div class="col">
					<h3 class="page-title">Edit Suppliers</h3>
					<ul class="breadcrumb">
						<li class="breadcrumb-item"><a href="library.html">Supplier</a></li>
						<li class="breadcrumb-item active">Edit Suppliers</li>
					</ul>
				</div>
			</div>
		</div>
		<!-- /Page Header -->

		<div class="row">
			<div class="col-sm-12">

				<div class="card">
					<div class="card-body">
						<form action="edit" method="post">
							<div class="row">
								
								<div class="col-12 col-sm-4">
									<div class="form-group local-forms">
										<label> SupplierId <span style = "color:red" class="login-danger">*</span></label> <input
											type="text" class="form-control" name="supplierId"
											value="${param.supplierId }">
									</div>
								</div>
								<div class="col-12 col-sm-4">
									<div class="form-group local-forms">
										<label>Supplier Name<span style = "color:red" class="login-danger">*</span></label> <input
											type="text" class="form-control" name="supplierName"
											value="${param.supplierName}">

									</div>
								</div>
								<div class="col-12 col-sm-4">
									<div class="form-group local-forms">
										<label>ContactNumber<span style = "color:red" class="login-danger">*</span></label>
										<input type="text" class="form-control" name="contactNumber"
											value="${param.contactNumber }">
									</div>
								</div>

								
								<div class="col-12 col-sm-4">
									<div class="form-group local-forms">
										<label>Address<span style = "color:red" class="login-danger">*</span></label>
										<input type="text" class="form-control" name="address"
											value="${param.address }">
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