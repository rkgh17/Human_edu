$(document).ready(function(){
    $("#container").addClass("start");
	$("nav li").click(function(){
        $("#container").css("max-width", "100%");
        let id = $(this).attr("data-rol");
        $("nav li").removeClass("on");
        $(this).addClass("on");
        $(".content").removeClass("prev this next");
        $("#"+id).addClass("this").prevAll().addClass("prev");
        $("#"+id).nextAll().addClass("next");
        $(".logo_box").click(function(){
            $("nav li").removeClass("on");
            $(".content").removeClass("prev this next");
            $("#container").css("max-width", "1200px");
        });
        
    });
});

