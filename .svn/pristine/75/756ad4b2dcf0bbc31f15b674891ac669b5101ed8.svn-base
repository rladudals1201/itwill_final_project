<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
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
<body><!-- Available classes for body: boxed , pattern1...pattern10 . Background Image - example add: data-background="assets/images/boxed_background/1.jpg"  -->

		<!-- Top Bar -->
	<!-- /Top Bar -->

		<!-- TOP NAV -->
		

		<span id="header_shadow"></span>
		<!-- /TOP NAV -->

		<!-- STYLESWITCHER - REMOVE ON PRODUCTION/DEVELOPMENT -->
		<div id="switcher">
			<div class="content-switcher" >        
				<h4>STYLE OPTIONS</h4>

				<p>10 Predefined Color Schemes</p>
				<ul>            
					<li><a href="#" onclick="setActiveStyleSheet('orange'); return false;" title="orange" class="color"><img src="assets/images/demo/color_schemes/1.png" alt="" width="30" height="30" /></a></li>
					<li><a href="#" onclick="setActiveStyleSheet('red'); return false;" title="red" class="color"><img src="assets/images/demo/color_schemes/2.png" alt="" width="30" height="30" /></a></li>
					<li><a href="#" onclick="setActiveStyleSheet('pink'); return false;" title="pink" class="color"><img src="assets/images/demo/color_schemes/3.png" alt="" width="30" height="30" /></a></li>
					<li><a href="#" onclick="setActiveStyleSheet('yellow'); return false;" title="yellow" class="color"><img src="assets/images/demo/color_schemes/4.png" alt="" width="30" height="30" /></a></li>
					<li><a href="#" onclick="setActiveStyleSheet('darkgreen'); return false;" title="darkgreen" class="color"><img src="assets/images/demo/color_schemes/5.png" alt="" width="30" height="30" /></a></li>
					<li><a href="#" onclick="setActiveStyleSheet('green'); return false;" title="green" class="color"><img src="assets/images/demo/color_schemes/6.png" alt="" width="30" height="30" /></a></li>
					<li><a href="#" onclick="setActiveStyleSheet('darkblue'); return false;" title="darkblue" class="color"><img src="assets/images/demo/color_schemes/7.png" alt="" width="30" height="30" /></a></li>
					<li><a href="#" onclick="setActiveStyleSheet('blue'); return false;" title="blue" class="color"><img src="assets/images/demo/color_schemes/8.png" alt="" width="30" height="30" /></a></li>
					<li><a href="#" onclick="setActiveStyleSheet('brown'); return false;" title="brown" class="color"><img src="assets/images/demo/color_schemes/9.png" alt="" width="30" height="30" /></a></li>
					<li><a href="#" onclick="setActiveStyleSheet('lightgrey'); return false;" title="lightgrey" class="color"><img src="assets/images/demo/color_schemes/10.png" alt="" width="30" height="30" /></a></li>
				</ul>        

				<p>CHOOSE YOUR COLOR SKIN</p>
				<label><input class="dark_switch" type="radio" name="color_skin" id="is_light" value="light" checked="checked" /> Light</label>
				<label><input class="dark_switch" type="radio" name="color_skin" id="is_dark" value="dark" /> Dark</label>

				<hr />

				<p>CHOOSE YOUR LAYOUT STYLE</p>
				<label><input class="boxed_switch" type="radio" name="layout_style" id="is_wide" value="wide" checked="checked" /> Wide</label>
				<label><input class="boxed_switch" type="radio" name="layout_style" id="is_boxed" value="boxed" /> Boxed</label>


				<p>Patterns for Boxed Version</p>
				<div>
					<button onclick="pattern_switch('none');" class="pointer switcher_thumb"><img src="assets/images/patterns/none.jpg" width="27" height="27" alt="" /></button>
					<button onclick="pattern_switch('pattern2');" class="pointer switcher_thumb"><img src="assets/images/patterns/pattern2.png" width="27" height="27" alt="" /></button>
					<button onclick="pattern_switch('pattern3');" class="pointer switcher_thumb"><img src="assets/images/patterns/pattern3.png" width="27" height="27" alt="" /></button>
					<button onclick="pattern_switch('pattern4');" class="pointer switcher_thumb"><img src="assets/images/patterns/pattern4.png" width="27" height="27" alt="" /></button>
					<button onclick="pattern_switch('pattern5');" class="pointer switcher_thumb"><img src="assets/images/patterns/pattern5.png" width="27" height="27" alt="" /></button>
				</div>

				<div>
					<button onclick="pattern_switch('pattern6');" class="pointer switcher_thumb"><img src="assets/images/patterns/pattern6.png" width="27" height="27" alt="" /></button>
					<button onclick="pattern_switch('pattern7');" class="pointer switcher_thumb"><img src="assets/images/patterns/pattern7.png" width="27" height="27" alt="" /></button>
					<button onclick="pattern_switch('pattern8');" class="pointer switcher_thumb"><img src="assets/images/patterns/pattern8.png" width="27" height="27" alt="" /></button>
					<button onclick="pattern_switch('pattern9');" class="pointer switcher_thumb"><img src="assets/images/patterns/pattern9.png" width="27" height="27" alt="" /></button>
					<button onclick="pattern_switch('pattern10');" class="pointer switcher_thumb"><img src="assets/images/patterns/pattern10.png" width="27" height="27" alt="" /></button>
				</div>

				<p>Images for Boxed Version</p>
				<button onclick="background_switch('none');" class="pointer switcher_thumb"><img src="assets/images/boxed_background/none.jpg" width="27" height="27" alt="" /></button>
				<button onclick="background_switch('assets/images/boxed_background/1.jpg');" class="pointer switcher_thumb"><img src="assets/images/boxed_background/1_thumb.jpg" width="27" height="27" alt="" /></button>
				<button onclick="background_switch('assets/images/boxed_background/2.jpg');" class="pointer switcher_thumb"><img src="assets/images/boxed_background/2_thumb.jpg" width="27" height="27" alt="" /></button>
				<button onclick="background_switch('assets/images/boxed_background/3.jpg');" class="pointer switcher_thumb"><img src="assets/images/boxed_background/3_thumb.jpg" width="27" height="27" alt="" /></button>
				<button onclick="background_switch('assets/images/boxed_background/4.jpg');" class="pointer switcher_thumb"><img src="assets/images/boxed_background/4_thumb.jpg" width="27" height="27" alt="" /></button>

				<hr />

				<div class="text-center">
					<button onclick="resetSwitcher();" class="btn btn-primary btn-xs">Reset Styles</button>
				</div>

				<div id="hideSwitcher">&times;</div>
			</div>
		</div>

		<div id="showSwitcher" class="styleSecondColor"><i class="fa fa-angle-double-right"></i></div>
		<!-- /STYLESWITCHER -->



		<!-- WRAPPER -->
		<div id="wrapper">

			<div id="shop">

				<!-- PAGE TITLE -->
			


				<section class="container">

					<h2>예약 목록</h2>
					<form class="white-row" method="post" action="#">

						<!-- cart content -->
						<div id="cartContent">
							<!-- cart header -->
						
							<!-- /cart header -->

							<!-- cart item -->
							<c:forEach var="reserve" items="${reserveList }">
							<div class="item">
							
								<div  class="product_name">${reserve.title }</div>
								<div class="cart_img"></div>
								<button type="button" onclick="deleteReserve(${reserve.seatReserveseq});" class="remove_item">X</button>
								<div class="total_price"><span>${reserve.theatre }관</span>&nbsp;&nbsp;&nbsp;<span>${reserve.seatNo }석</span></div>
								<div class="qty"></div>
								<div class="clearfix"></div>
							</div>							
							</c:forEach>
						
							<div class="total pull-right">
								<small>
									
								</small>

								

							</div>
				
							<div class="clearfix"></div>
						</div>
						<!-- /cart content -->

					</form>
				</section>

			</div>
		</div>
	
		<!-- <script type="text/javascript" src="assets/plugins/jquery-2.1.3.min.js"></script>
		<script type="text/javascript" src="assets/plugins/jquery.easing.1.3.js"></script>
		<script type="text/javascript" src="assets/plugins/jquery.cookie.js"></script>
		<script type="text/javascript" src="assets/plugins/jquery.appear.js"></script>
		<script type="text/javascript" src="assets/plugins/jquery.isotope.js"></script>
		<script type="text/javascript" src="assets/plugins/masonry.js"></script>

		<script type="text/javascript" src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="assets/plugins/magnific-popup/jquery.magnific-popup.min.js"></script>
		<script type="text/javascript" src="assets/plugins/owl-carousel/owl.carousel.min.js"></script>
		<script type="text/javascript" src="assets/plugins/stellar/jquery.stellar.min.js"></script>
		<script type="text/javascript" src="assets/plugins/knob/js/jquery.knob.js"></script>
		<script type="text/javascript" src="assets/plugins/jquery.backstretch.min.js"></script>
		<script type="text/javascript" src="assets/plugins/superslides/dist/jquery.superslides.min.js"></script>
		<script type="text/javascript" src="assets/plugins/styleswitcher/styleswitcher.js"></script>STYLESWITCHER - REMOVE ON PRODUCTION/DEVELOPMENT
		

		<script type="text/javascript" src="assets/plugins/holder.js"></script>remove on production
		<script type="text/javascript" src="assets/js/scripts.js"></script>
 -->

		<!-- Google Analytics: Change UA-XXXXX-X to be your site's ID. Go to http://www.google.com/analytics/ for more information. -->
		<!--<script>
			(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
			(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
			m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
			})(window,document,'script','//www.google-analytics.com/analytics.js','ga');

			ga('create', 'UA-XXXXX-X', 'domainname.com');
			ga('send', 'pageview');
		</script>
		-->
	<script type="text/javascript">
	
	function calc() {
		
	}
	
	
	$(".qty").change(function() {
		/* 			
		alert($(this).find(".selectQty").val());
		alert($(this).text());
		alert(Number($(this).find(".selectQty").val())* Number($(this).parent(".item").find(".total_price").text()));
	 	*/		
		
	 	$(this).parent(".item").find(".total_price").text(Number($(this).find(".selectQty").val())* Number($(this).parent(".item").find(".cart_img").text()));
	});
	
	/* $(".remove_item").click(function() {
		if(confirm("정말로 삭제하시겠습니까?")){
			alert($(this).parent().attr("class"));
		}
	}) */
	
	function deleteReserve(reserveseq) {
		if(confirm("정말로 삭제하시겠습니까?")){
			location.href="${pageContext.request.contextPath}/reserve/reserve_delete?reserveseq="+reserveseq;
		}
	
	}
	
	</script>
	</body>

</html>
