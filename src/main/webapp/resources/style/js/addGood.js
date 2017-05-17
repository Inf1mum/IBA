$(document).ready(function(){
    var countGood = 0;
    $("#addGood").click(function(){
        $(".addGood:last").after('<div class="form-group addGood" id="' + countGood + '"><div class="col-sm-4 col-sm-offset-3 col-xs-6"><input name="goods[' + countGood + '].goodName" class="form-control" id="input4" placeholder="Good" required=""/></div><div class="col-sm-4 col-xs-4"><input  name="goods[' + countGood + '].cost" class="form-control" id="input4" placeholder="Cost" required=""/></div><div class="col-sm-1 col-xs-2"><span class=" glyphTrash glyphicon glyphicon-trash removeGood" id="' + countGood + '"></span></div></div>');
        countGood++;

        $(".removeGood").click(function(){
            var id = $(this).attr("id");
            $("#" + id).remove();
        });
    });
});
