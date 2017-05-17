<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="panel panel-default">
    <div class="panel-heading">
        <div class="row">
            <div class="col-md-11 col-sm-11 col-xs-10"><h3>Details  <small>${invoice.getDate()}</small></h3></div>
            <div class="col-md-1 col-sm-1 col-xs-2"><a href="/"><span class=" glyphRemove glyphicon glyphicon-remove-sign"></span></a></div>
        </div>
    </div>
    <div class="panel-body">
        <br>
        <div class="row">
            <div class="col-md-9 col-md-offset-1 col-sm-9 col-sm-offset-1 col-xs-8 col-xs-offset-1">
                <h4>Name : ${invoice.getDetails().getName()}</h4>
                <h4>Email :${invoice.getDetails().getEmail()}</h4>
                <h4>Address : ${invoice.getDetails().getAddress()}</h4>
            </div>
        </div>
        <br>
        <hr>
        <br>
        <c:forEach items="${invoice.getGoods()}" var="good">
            <div class="row">
                <div class="col-md-9 col-md-offset-1 col-sm-9 col-sm-offset-1 col-xs-8 col-xs-offset-1"><h4>${good.getGoodName()}</h4></div>
                <div class="col-md-2 col-sm-2 col-xs-3"><h4>${good.getCost()}$</h4></div>
            </div>
        </c:forEach>
        <hr>
        <div class="row">
            <div class="col-md-4 col-md-offset-6 col-sm-4 col-sm-offset-6 col-xs-3 col-xs-offset-6"><h4>Total</h4></div>
            <div class="col-md-2 col-sm-2 col-xs-3"><h4>${total}$</h4></div>
        </div>


    </div>
</div>

