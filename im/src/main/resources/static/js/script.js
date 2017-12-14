$(document).ready(function(){
	/*sub*/
	$(".calHead").click(function(){
		$(".pop").fadeIn(100).css("display","block");
		$(".calendar").fadeIn(100).css("display","block");
		$("#iframebox").attr("src","http://www.jin10.com/jin10.com.html");
	})
	$(".courseHref").click(function(){
		$(".pop").fadeIn(100).css("display","block");
		$(".course").fadeIn(100).css("display","block");
	})
	$(".eiaHref").click(function(){
		$(".pop").fadeIn(100).css("display","block");
		//$(".eia").fadeIn(100).css("display","block");
		$(".calendar").fadeIn(100).css("display","block");
		$("#iframebox").attr("src","http://viewapi.kxt.com/Data/index/code/DOEASCRD%2BIndex.html");
	})
	$(".unHref").click(function(){
		$(".pop").fadeIn(100).css("display","block");
//		$(".unNum").fadeIn(100).css("display","block");
		$(".calendar").fadeIn(100).css("display","block");
		$("#iframebox").attr("src","http://viewapi.kxt.com/Data/index/code/NFP%2BTCH%2BIndex.html");
	})
	$(".unRead").click(function(){
		$(".look").fadeIn(100).css("display","block");
	})
	// 非游客
	// $(".unRead").click(function(){
	// 	$(".pop").fadeIn(100).css("display","block");
	// 	$(".knowledge").fadeIn(100).css("display","block");
	// })
	$(".leftHref").click(function(){
		$(".pop").fadeIn(100).css("display","block");
		if(level>1){
			$(".plot").fadeIn(100).css("display","block");
//			$(".plotspan:eq(0)").click();
			getPlot("new");
		}else{
			$(".leftPop").fadeIn(100).css("display","block");
		}
	})
	$(".aboutUsHref").click(function(){
		$(".pop").fadeIn(100).css("display","block");
		$(".aboutUs").fadeIn(100).css("display","block");
	})
	$(".leftHref2").click(function(){
		$(".pop").fadeIn(100).css("display","block");
		$(".leftPop2").fadeIn(100).css("display","block");
	})
	/*code*/
	$(".codeLeft").toggle(function(){
		$(".codeMain").animate({right:"0"});
		$(".codeLeft p").addClass("line_left");
	},function(){
		$(".codeMain").animate({right:"-184px"});
		$(".codeLeft p").removeClass("line_left");
	})
	$(".codeClose").click(function() {
		$(".codeBox").hide();
	});
	/*marq*/
	var marqs=function(oDiv,speed){
		var oUl=oDiv.getElementsByTagName("ul")[0];
		var aLi=oUl.getElementsByTagName("li");
		// var aSpan=oDiv.getElementsByTagName("span");
		oUl.innerHTML+=oUl.innerHTML;
		var leng = aLi.length;
		var nums=0;
		for(var i=0; i<leng;i++){
		    aLi[i].style.width=aLi[i].offsetWidth+"px";
		    nums=parseInt(aLi[i].style.width)+nums + 160;
		}
		oUl.style.width = nums +"px";

		function animate(){
		   if(oUl.offsetLeft<-oUl.offsetWidth/2)
	            {
	                oUl.style.left="0";
	                }
	            if(oUl.offsetLeft>0)
	            {
	                oUl.style.left=-oUl.offsetWidth/2+"px";
	                }
	            oUl.style.left=oUl.offsetLeft-speed+"px";
	            }
		setInterval(animate,30);
	}
	var oDiv1=document.getElementById("marq");
	marqs(oDiv1,2);
	/*personal*/
	$(".nameList li").click(function(){
		$(this).find("div").show().parent().siblings().find("div").hide();
		return false;
	})
	$("body").click(function(){
		$(".nameList li").find("div").hide();
	})
	$(".alter dd").hide();
	$(".alter dt").click(function(){
		var $con=$(this).siblings("dd");
		$con.find(".tex").val("");
		if($con.is(":visible"))
		{
			$con.slideUp();
			$(this).find("img").attr("src","images/alterDown.png");
		}
		else
		{
			$con.slideDown();
			$(this).find("img").attr("src","images/alterUp.png");
			var $dds=$(this).parent("dl").siblings();
			$dds.find("dd").slideUp();
			$dds.find("img").attr("src","images/alterDown.png");
		}
	})
	$(".perName").click(function(){
		$(".alter dd").hide();
		$(".alter dt img").attr("src","images/alterDown.png");
		$(".perMain").fadeIn(100).css("display","block");
	})
	$(".sbmName").click(function(){
	 	if(!$(this).siblings("input").val() == ""){
	 		var text = $(this).siblings("input").val();
			$(".perBox span").text(text);
			$(this).parent("dd").slideUp();
			$(this).parent("dd").siblings("dt").find("img").attr("src","images/alterDown.png");
	 	}
	 	else{
	 		alert("昵称不能为空!");
	 	}
	 })
	/*tab*/
	$(".tab1").click(function(){
		$(this).addClass("active").siblings().removeClass("active");
		$(".state").hide();
		$(".stateBg").hide();
		$(".change").show();
		$(".ptjs").hide();
	})
	$(".tab2").click(function(){
		$(".pop").fadeIn(100).css("display","block");
		$(".download").fadeIn(100).css("display","block");
	})
	$(".close").click(function(){
		$(".hide").hide();
		$(".perMain").hide();
		$(".knowledge").hide();
	})
	$(".pop").click(function(){
		//$(".hide").hide();
	})
	$(".tab3").click(function(){
		$(this).addClass("active").siblings().removeClass("active");
		$(".stateBg").hide();
		$(".state").show();
		$(".change").hide();
		$(".ptjs").hide();
	})
	$(".tab5").click(function(){
		$(this).addClass("active").siblings().removeClass("active");
		$(".stateBg").hide();
		$(".state").hide();
		$(".change").hide();
		$(".ptjs").show();
	})
	$(".ascrail2000").hide();
	$(".tab4").click(function(){
		$(".pop").fadeIn(100).css("display","block");
		$(".plat").fadeIn(100).css("display","block");
		$("#platBox").fadeIn(100).css("display","block");
	})
	/*teachtb*/
	$(".teach").click(function(){
		$(".pop").fadeIn(100).css("display","block");
		$(".teachtb").fadeIn(100).css("display","block");
	 })
	 /*alertBox*/
	 $(".alclose").click(function(){
		$(".alertBox").hide();
	 })
	 /*look*/
	 $(".loclose").click(function(){
		$(".look").hide();
	 })
	 /*leftPop*/
	 $(".leclose").click(function(){
		$(".leftPop").hide();
		$(".leftPop2").hide();
		$(".pop").hide();
	 })
	 /*download*/
	 $(".download ul li").click(function(){
		$(this).addClass("current").siblings().removeClass("current");
		var index = $(this).index();
		$(".load>div").eq(index).show().siblings().hide();
	 })
	 /*register*/
	 $(".reg").click(function(){
		$(".pop").fadeIn(100).css("display","block");
		$(".register").fadeIn(100).css("display","block");
		$(".register div input").val("");
	 })
	 /*login*/
	 $(".log").click(function(){
		$(".pop").fadeIn(100).css("display","block");
		$(".login").fadeIn(100).css("display","block");
		$(".login p input").val("");
	 })
	 $(".login h1 a").click(function(){
		$(".login").hide();
		$(".register").fadeIn(100).css("display","block");
		$(".register div input").val("");
	 })
	 /*layout*/
	 $(".layout").click(function(){
		$(".layMenu").show();
		return false;
	})
	 $("body").click(function(){
		$(".layMenu").hide();
	})

	 var $pageContainer = $(".bg");
	 function themeChangeEvent($themeItems , value){
		var _themeValue = value;
		$themeItems.click(function(){
			var $this = $(this);
			var data = {};
			var theme = $this.data('theme');
			$themeItems.removeClass('active');
			$this.addClass('active');
			$pageContainer.removeClass(_themeValue).addClass(theme);
			_themeValue = theme;
		});
		$themeItems.filter('[data-theme="'+ value +'"]').addClass('active');
	};
	themeChangeEvent( $('.layoutSider span'), 'layout_sider_left');
	themeChangeEvent( $('.layoutVideo span'), 'layout_video_right');
	themeChangeEvent( $('.btnColorWrap span'), 'btnColor1');
	themeChangeEvent( $('.backWrap span'), 'backBg10');

	 /*fly*/
	function flystart(){
	        $(".fly b").animate({left:'-3000px'},90000,'linear',function(){
	        $(".fly b").css({left:'100%'})
	        })
	}
//	flystart();
	/*draggable*/
	$( "#draggable").draggable();
	$("#draggable").draggable({containment:"parent"});
	$( "#draggable .draClose").click(function(){
		$( "#draggable").hide();
	})
	 /*topiccontent*/
	 chatcontainer.scrollToLast();
	 /*textarea*/
	 $('#sendMsgInput').keydown(function(event) {
		if (event.keyCode == 13) {
				$(".sub_btn").trigger("click");
				return false;
		}
	})
	/*nano*/
	$('.nano').nanoScroller({
    		preventPageScrolling: true
    	})
	/*popPsd*/
	$(".passSub").click(function(){
		$(".popPsd").hide();
	})
})
 /*表情和彩条*/
function showFacePanel(e, toinput) {
	var offset = $(e).offset();
	var t = offset.top;
	var l = offset.left;
	$('#face').css({"top": t - $('#face').outerHeight(), "left": l});
	$('#face').show();
	$('#face').attr("toinput", toinput);
}
function  initFaceColobar() {
	$('#bt_caitiao').on('click', function() {
			$('#caitiao').show();
	});
	$('#caitiaonav li').on('click', function() {
			$('#caitiao dl').hide();
	});
}
$(function() {
	$('#bt_caitiao').on('click', function() {
			$('#caitiao').show();
	});
	$(document).bind('mouseup', function(e) {
			if ($(e.target).attr('isnav') != '1')
			{
					$('#caitiao').hide();
			}
	})
})
function sendCaitiao(e){
	$("#sendMsgInput").val('['+e+']');
}
$('#bt_face').SinaEmotion($('#sendMsgInput'));
/*talk_pic*/
function talk_pic(img){
        TINY.box.show({image: img});
}
/*time*/
$(function(){
    var b = new Date;
    var myDate = new Date();
    var b = -b.getTimezoneOffset() / 60;
    var addtime = 5;
    //var i = '2016__regexoperators___/06/28 14:13:00';
    var i = myDate.getFullYear()+'__regexoperators___/'+(myDate.getMonth()+1)+'/'+myDate.getDate()+' '+myDate.getHours()+':'+(myDate.getMinutes() + addtime)+':'+myDate.getSeconds();
    var config = {
        timeText: i, //倒计时时间
        timeZone: b, //时区
        style: "flip", //显示的样式，可选值有flip,slide,metal,crystal
        color: "white", //显示的颜色，可选值white,black
        width: 82, //倒计时宽度
        textGroupSpace: 10, //天、时、分、秒之间间距
        textSpace: 4, //数字之间间距
        reflection: 0, //是否显示倒影
        reflectionOpacity: 10, //倒影透明度
        reflectionBlur: 0, //倒影模糊程度
        dayTextNumber: 3, //倒计时天数数字个数
        displayDay: 0, //是否显示天数
        displayHour: 0, //是否显示小时数
        displayMinute: !0, //是否显示分钟数
        displaySecond: !0, //是否显示秒数
        displayLabel: 0, //是否显示倒计时底部label
        onFinish: function() {}
    };
    $(".countdown").jCountdown(config);
})