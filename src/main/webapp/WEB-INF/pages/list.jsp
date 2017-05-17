<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="panel panel-default">
	<div class="panel-heading">
		<div class="row">
			<div class="col-md-11 col-sm-11 col-xs-10"><h3>Invoices</h3></div>
			<div class="col-md-1 col-sm-1 col-xs-2"><a href="invoice/add"><span class="glyphRemove glyphicon glyphicon-plus-sign"></span></a></div>
		</div>
	</div>
	<div class="panel-body">
	</div>
	<table class="table table-striped">
		<thead>
		<tr>
			<th>#</th>
			<th>Date</th>
			<th>Status</th>
			<th>Total</th>
			<th></th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${listInvoice}" var="invoice">
			<tr>
				<td>${listInvoice.indexOf(invoice)+1}</td>
				<td><a href="/details/${invoice.getId()}">${invoice.getDate()}</a></td>
				<td><a href="/details/${invoice.getId()}">${invoice.getStatus()}</a></td>
				<td><a href="/details/${invoice.getId()}">${invoice.getTotal()}$</a></td>
				<td><a href="/invoice/delete/${invoice.getId()}"><span class="glyphicon glyphicon-trash"></span></a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</div>

