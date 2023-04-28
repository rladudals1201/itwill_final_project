<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
		<link href="${pageContext.request.contextPath}/css/cartcss/bootstrap.min.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/cartcss/font-awesome.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/cartcss/owl.carousel.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/cartcss/owl.theme.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/cartcss/owl.transitions.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/cartcss/magnific-popup.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/cartcss/animate.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/cartcss/superslides.css" rel="stylesheet" type="text/css" />

		<!-- SHOP CSS -->
		<link href="${pageContext.request.contextPath}/css/cartcss/shop.css" rel="stylesheet" type="text/css" />

		<!-- THEME CSS -->
		<link href="${pageContext.request.contextPath}/css/cartcss/essentials.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/cartcss/layout.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/cartcss/layout-responsive.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/cartcss/orange.css" rel="stylesheet" type="text/css" /><!-- orange: default style -->
		<!--<link id="css_dark_skin" href="assets/css/layout-dark.css" rel="stylesheet" type="text/css" />--><!-- DARK SKIN -->

		<!-- styleswitcher - demo only -->
		<link href="${pageContext.request.contextPath}/css/cartcss/orange.css" rel="alternate stylesheet" type="text/css" title="orange" />
		<link href="${pageContext.request.contextPath}/css/cartcss/red.css" rel="alternate stylesheet" type="text/css" title="red" />
		<link href="${pageContext.request.contextPath}/css/cartcss/pink.css" rel="alternate stylesheet" type="text/css" title="pink" />
		<link href="${pageContext.request.contextPath}/css/cartcss/yellow.css" rel="alternate stylesheet" type="text/css" title="yellow" />
		<link href="${pageContext.request.contextPath}/css/cartcss/darkgreen.css" rel="alternate stylesheet" type="text/css" title="darkgreen" />
		<link href="${pageContext.request.contextPath}/css/cartcss/green.css" rel="alternate stylesheet" type="text/css" title="green" />
		<link href="${pageContext.request.contextPath}/css/cartcss/darkblue.css" rel="alternate stylesheet" type="text/css" title="darkblue" />
		<link href="${pageContext.request.contextPath}/css/cartcss/blue.css" rel="alternate stylesheet" type="text/css" title="blue" />
		<link href="${pageContext.request.contextPath}/css/cartcss/brown.css" rel="alternate stylesheet" type="text/css" title="brown" />
		<link href="${pageContext.request.contextPath}/css/cartcss/lightgrey.css" rel="alternate stylesheet" type="text/css" title="lightgrey" />
		<!-- /styleswitcher - demo only -->
		
		<!-- STYLESWITCHER - REMOVE ON PRODUCTION/DEVELOPMENT -->
		<link href="${pageContext.request.contextPath}/css/cartcss/styleswitcher.css" rel="stylesheet" type="text/css" />		

<title>Spring</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<%-- handlebars : JSON 형식으로 표현된 JavaScript 객체를 전달받아 HTML 코드로 변환하는
기능을 제공하는 자바스크립트 템플릿 라이브러리 --%>
<%-- => https://cdnjs.com 사이트에서 handlebars 라이브러리를 검색하여 포함 --%>
<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.7.7/handlebars.min.js"></script>
<style type="text/css">
#btnDiv {
	margin: 10px;
}
#insertDiv, #updateDiv {
	width: 240px;
	height: 80px;
	border: 2px solid black;
	background-color: gray;
	position: absolute;
	top: 50%;
	left: 50%;
	margin-top: -40px;
	margin-left: -120px;
	padding: 5px;
	z-index: 100;
	display: none;
}


</style>
</head>
<body>	<div class = "title">좌석</div>
	<form method="post" name="f">
	<div class="seat">
	</div>
	<button type="button" onclick="ReserveCheck();">예매</button>
	</form>
	
	
	<script type="text/javascript">
	
	for(var i = 1 ; i <= 25; i++) {			
		$(".seat").append("<img name='seat' src='${pageContext.request.contextPath}/images/ic_seat13.gif' class='img' val='"+i+"'>");

	}
	
 	$(".img").mouseover(function() {		
		$(this).attr("src", "${pageContext.request.contextPath}/images/ic_seat3.gif");
			
	});

	$(".img").mouseout(function() {		
		$(this).attr("src", "${pageContext.request.contextPath}/images/ic_seat13.gif");

	}); 
	
	$(".img").click(function() {
	if($(this).attr("src")=="${pageContext.request.contextPath}/images/ic_seat3.gif" && $(this).attr("class")=="imgClick") {
		$(this).attr("src", "${pageContext.request.contextPath}/images/ic_seat13.gif");
		$(this).removeClass();
		$(this).addClass("img");
		$(this).on("mouseover", function() {
			$(this).attr("src","${pageContext.request.contextPath}/images/ic_seat3.gif");
		});
		$(this).on("mouseout", function() {
			$(this).attr("src","${pageContext.request.contextPath}/images/ic_seat13.gif");				
		});
		
	}else {
		$(this).attr("src", "${pageContext.request.contextPath}/images/ic_seat3.gif");
		$(this).removeClass();
		$(this).addClass("imgClick");			
		$(this).off("mouseout");	
		$(this).off("mouseover");	 		
		
	}
	});
	
	function ReserveCheck() {
	
	var seatList = "";	
		
	$(".imgClick").each(function() {
	
	seatList+=$(this).attr("val")+",";
	
	});
	
	alert(seatList);
	f.action="reservetest?seatList="+seatList;
	
	f.submit();
	}
	
	</script>
	</body>

</html>
