<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div class="panel panel-default">
    <div class="panel-heading">
        <div class="row">
            <div class="col-md-11 col-sm-11 col-xs-10"><h3>New invoice</h3></div>
            <div class="col-md-1 col-sm-1 col-xs-2"><a href="/"><span class=" glyphRemove glyphicon glyphicon-remove-sign"></span></a></div>
        </div>
    </div>
    <div class="panel-body">
        <form:form class="form-horizontal" modelAttribute="invoice" action="/invoice/add"
              method="POST">
            <div class="form-group">
                <label for="input1" class="col-sm-3 control-label">
                    Name
                </label>
                <div class="col-sm-9">
                    <input name="details.name" class="form-control" id="input1"
                           placeholder="Name" required=""/>
                </div>
            </div>
            <div class="form-group">
                <label for="input2" class="col-sm-3 control-label">
                    Email
                </label>
                <div class="col-sm-9">
                    <input name="details.email" class="form-control" id="input2"
                           placeholder="Email" required=""/>
                </div>
            </div>
            <div class="form-group">
                <label for="input4" class="col-sm-3 control-label">
                    Address
                </label>
                <div class="col-sm-9">
                    <input name="details.address" class="form-control" id="input4"
                           placeholder="Address" required=""/>
                </div>
            </div>
            <div class="form-group">
                <label for="input4" class="col-sm-3 control-label">
                    Status
                </label>
                <div class="col-sm-9">
                    <select name="status" class="form-control" id="input3" >
                        <option value="Paid">Paid</option>
                        <option value="Not paid" selected="selected">Not paid</option>
                        <option value="Pending">Pending</option>
                    </select>
                </div>
            </div>
            <div class="form-group addGood">
                <label  class="col-md-3 col-sm-3 col-xs-2 control-label">
                    Goods
                </label>
                <div class="col-md-9 col-sm-9 col-xs-10">
                    <button type="button" class="btn btn-primary btn-sm" id="addGood">
                        <span class="glyphicon glyphicon-plus"></span>
                    </button>
                </div>
            </div>
            <div class="form-group last">
                <div class="col-md-offset-3 col-md-4 col-sm-offset-3 col-sm-4">
                    <button type="submit" class="btn btn-primary btn-sm">
                        Save
                    </button>
                    <button type="reset" class="btn btn-primary btn-sm">
                        Reset
                    </button>
                </div>
            </div>
        </form:form>
    </div>
</div>
