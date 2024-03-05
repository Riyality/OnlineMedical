<%@include file="../../jsp/modules/header.jsp"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>

<style type="text/css">
table {
	border-collapse: collapse;
	text-align: center;
	width: 70%;
	margin-left: 280px;
	margin-top: 50px;
	border-color: gray;
	border: 1px solid black;
}

table, tr, th, td {
	border: 1px solid black;
}

th {
	padding: 8px;
	font-size: 15px;
	background-color: wheat;
	color: black;
}

input {
	font-size: 20px;
	margin-top: 20px;
	color: gray;
}

input[type="submit"]:hover {
	color: blue;
}

input[type="text"]:hover {
	border: 4px solid red;
}

td {
	color: black;
	font-size: 20px;
	background-color: white;
}

h3 {
	color: #ff5733;
}

#box1 {
	font-size: 20px;
	font-weight: 600;
}

#box3 {
	background-color: gray;
}
</style>

<body>

	<table border="6">
		<tr>
			<th>customerId</th>
			<th>customerName</th>
			<th>ContactNumber</th>
			<th>Update</th>
			<th>Delete</th>

		</tr>

		<c:forEach var="cust" items="${customerList}">

			<tr>

				<td>${cust.customerId}</td>
				<td>${cust.customerName}</td>
				<td>${cust.contactNumber}</td>
			
				<td data-th="Movie Title"><a
					href="updates?customerId=${cust.customerId}&customerName=${cust.customerName}&contactNumber=${cust.contactNumber}">
						<i class="fa-solid fa-pen-to-square"></i>
				</a></td>
				<td><a class="btn btn-sm bg-danger-light" href="#"
					onclick="confirmDelete(${cust.customerId});"> <i
						class="fa-solid fa-trash" style="color: red;"></i>
				</a></td>
			</tr>
		</c:forEach>
	</table>




</body>
<script>
    function confirmDelete(customerId) {
        if (confirm('Are you sure you want to customer this record?')) {
            window.location.href = 'customer-delete?customerId=' + customerId;
        }
    }
</script>

<%@include file="../../jsp/modules/footer.jsp"%> 