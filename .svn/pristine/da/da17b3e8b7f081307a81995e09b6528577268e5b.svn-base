<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- mobile settings -->
<meta name="viewport" content="width=device-width, maximum-scale=1, initial-scale=1, user-scalable=0" />

<!-- WEB FONTS -->
<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700,800" rel="stylesheet" type="text/css" />

<!-- CORE CSS -->
<link href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/font-awesome.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/plugins/owl-carousel/owl.carousel.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/plugins/owl-carousel/owl.theme.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/plugins/owl-carousel/owl.transitions.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/plugins/magnific-popup/magnific-popup.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/animate.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/superslides.css" rel="stylesheet" type="text/css" />

<!-- SHOP CSS -->
<link href="${pageContext.request.contextPath}/css/shop.css" rel="stylesheet" type="text/css" />

<!-- THEME CSS -->
<link href="${pageContext.request.contextPath}/css/essentials.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/layout.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/layout-responsive.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/yellow.css" rel="stylesheet" type="text/css" />
<!-- <link id="css_dark_skin" href="${pageContext.request.contextPath}/css/layout-dark.css" rel="stylesheet" type="text/css" /> -->

<!-- Morenizr -->
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/modernizr.min.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<title>Show Detail</title>
<style type="text/css">
.white-row {
display: none;
}
</style>

<script type="text/javascript">
var seatList=[];
function getSeat()
</script>

</head>
<body>
	<!-- WRAPPER -->
		<div id="wrapper">

			<div id="shop">

				<!-- PAGE TITLE -->
				<header id="page-title">
					<div class="container">
						<input type="text" id="theatreNo" style="display:none;" value="${show.theatre}">
						<h1><strong>극장&nbsp;${show.theatre}</strong></h1>

						<ul class="breadcrumb">
							<li><a href="${pageContext.request.contextPath}/show/mainshow">쇼 리스트</a></li>
							<li class="active">${show.title}</li>
						</ul>
					</div>
				</header>


				<section class="container">

					<div class="row">
						<div class="col-sm-6 col-md-6">
							<div class="owl-carousel controlls-over product-image">
								<div>
									<img alt="" class="img-responsive" src="${pageContext.request.contextPath}/images/${show.posterPicture}.jpg">
								</div>
							</div>
							<div class="row">
								<div class = "seat-title">좌석</div>
								
									<div id="seatings">
										<c:forEach var="seat" items="${seat }">
										<c:set var="i" value="${i+1 }"/>
										<c:if test="${(i % 10) eq 1 }">
											<br>
										</c:if>
										<c:choose>
										<c:when test="${seat.seatStatus == 1}">										
											<img src="${pageContext.request.contextPath}/images/ic_seat13.gif" class="img" id="${seat.seatNo }">
										</c:when>
										<c:when test="${seat.seatStatus == 0}">										
											<img src="${pageContext.request.contextPath}/images/ic_seat3.gif"id="${seat.seatNo }">
										</c:when>
										</c:choose>
										</c:forEach>
									</div>
								<div id="reserve-button"><button type="button" onclick="Reserve();">예매 확정</button></div>
							</div>
						</div>

						<div class="col-sm-6 col-md-6">

							<!-- product detail -->
						
								<!-- hidden fields -->
								<input type="hidden" name="action" value="cart_add" />
								<input type="hidden" name="product_id" value="1" />

								<h2 class="product-title">${show.title}</h2>

								<!-- 상영 날짜/시간 -->
								<span class="code">공연일자 및 시간 : ${fn:substring(show.showTime,0,16)}</span>
								<!-- /product unique code -->

								<!-- 티켓 가격 -->
								<div class="productRowInfo">
									<span class="price styleSecondColor fsize16">A석:&nbsp;&#8361;${seatPriceA.seatPrice},&nbsp;B석:&nbsp;&#8361;${seatPriceB.seatPrice},&nbsp;C석:&nbsp;&#8361;${seatPriceC.seatPrice}</span>
									<!-- <span class="oldprice">$43.00</span> -->
								</div>
								<!-- /product price -->


								<div class="row attributes">

									<div class="row">
										<div class="col-md-7">

											<!-- product color -->
											<div class="col-md-6 col-sm-6">
												<label class="block" for="product_color">관람시간</label>
												<div>${show.showLength}&nbsp;분</div>
											</div>
											<!-- /product color -->

											<!-- product size -->
											<div class="col-md-6 col-sm-6">
												<label class="block" for="product_size">관람등급</label>
												<div>${show.rating}</div>
											</div>
											<br>
											<hr>
											<!-- /product size -->
											<br>
										</div>
										<div class="desc">
											<h2 class="page-header">캐스트</h2>
											<div>${show.team}</div>
										</div>
									</div>

								</div>


								<!-- <div class="row">

									quantity + add to cart
									<div class="row">
										<div class="col-md-7 col-sm-12">

											<div class="addCartBtn">
												<div class="input-group">
													<input type="text" name="product_qty" id="product_qty" class="text-center form-control" value="1" placeholder="Qty" />
													<span class="input-group-btn">
														<button id="addToCartBtn" class="btn btn-primary"><i class="fa fa-shopping-cart"></i> ADD TO CART</button>
													</span>
												</div>/input-group
											</div>

										</div>
									</div>
									/quantity + add to cart

								</div> -->

								<!-- product description -->
								<div class="desc">
									<h3 class="page-header">줄거리</h3>
									<p>
										${show.summary}
									</p>
								</div>
								<!-- /product description -->

							<!-- product detail -->

						</div>
						
						
					</div>
					<hr />
										
				</section>

			</div>
	<form class="white-row" method="post" action="${pageContext.request.contextPath}/pay/pay">
			<input type="text" id="seat" readonly="readonly"/>
			<input type="text" id="theatreNo" readonly="readonly" value="${show.theatre }"/>
			<input type="text" id="showTime" readonly="readonly" value="${fn:substring(show.showTime,0,16)  }"/>
			
								<p>
									<span class="pull-right shop-cc-icons">

										<img src="${pageContext.request.contextPath}/images/shinhan.jpg" width="41" height="25" alt="">
										<img src="${pageContext.request.contextPath}/images/woori.jpg" width="41" height="25" alt="">
										<img src="${pageContext.request.contextPath}/images/kookmin.jpg" width="41" height="25" alt="">

									</span>
									결제 정보는 개인정보에 의해 보호됩니다.
								</p>

								<!-- CREDIT CARD -->
								<div class="row">
									<div class="form-group">
										<div class="col-md-12">
											<label class="control-label">이름</label>
											<input required type="text" class="form-control" name="card_name" id="card_name"/>
										</div>
									</div>
								</div>

								<!-- Card Type -->
								<div class="row">
									<div class="form-group">
										<div class="col-md-12">
											<label class="control-label">카드 종류</label>
											<select name="card_type" class="form-control pointer" id="card_type">
												<option value="신한">신한</option>
												<option value="국민">국민</option>
												<option value="우리">우리</option>
											</select>
										</div>
									</div>
								</div>

								<!-- Number /CVV -->
								<div class="row">
									<div class="form-group">
										<div class="col-md-9"><!-- Number -->
											<label class="control-label">카드 번호</label>
											<input required type="text" class="form-control" name="card_number" id="card_number"/>
										</div>

										<div class="col-md-3"><!-- CVV/CVV2 -->
											<label class="control-label">보안 번호</label>
											<input required type="text" class="form-control" name="card_code" />
										</div>
									</div>
								</div>

								<!-- Card Expiration -->
								<div class="row">
									<div class="form-group">
										<div class="col-md-9"><!-- Month -->
											<label class="control-label">만기월</label>
											<select name="expiration_month" class="form-control pointer">
												<option value="01">1월</option>
												<option value="02">2월</option>
												<option value="03">3월</option>
												<option value="04">4월</option>
												<option value="05">5월</option>
												<option value="06">6월</option>
												<option value="07">7월</option>
												<option value="08">8월</option>
												<option value="09">9월</option>
												<option value="10">10월</option>
												<option value="11">11월</option>
												<option value="12">12월</option>
											</select>
										</div>
										
										<div class="col-md-3"><!-- Year -->
											<label class="control-label">만기년</label>
											<select name="expiration_year" class="form-control pointer">
												<option value="2020">2020</option>
												<option value="2021">2021</option>
												<option value="2022">2022</option>
												<option value="2023">2023</option>
												<option value="2024">2024</option>
												<option value="2025">2025</option>
												<option value="2026">2026</option>
												<option value="2027">2027</option>
											</select>
										</div>
									</div>
								</div>

								<div class="row">
									<div class="form-group">
										<div class="col-md-12">
											<button type="button" class="btn btn-primary btn-lg" id="cancelBtn" ><i class="fa fa-check"></i> &nbsp; CANCEL</button>
										</div>
									</div>
								</div>
								<!-- /CREDIT CARD -->
											<button type="button" class="btn btn-primary btn-lg" id="submitBtn" ><i class="fa fa-check"></i> &nbsp; SUBMIT</button>

							</form>
	
		</div>
	<!-- /WRAPPER -->

<!-- JAVASCRIPT FILES -->
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/jquery-2.1.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/jquery.cookie.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/jquery.appear.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/jquery.isotope.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/masonry.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/magnific-popup/jquery.magnific-popup.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/owl-carousel/owl.carousel.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/stellar/jquery.stellar.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/knob/js/jquery.knob.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/jquery.backstretch.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/superslides/dist/jquery.superslides.min.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/scripts.js"></script>
<script type="text/javascript">
var theatreNo = $("#theatreNo").val();
var showTime = $("#showTime").val();

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
	function Reserve() {
	var seatList = "";	
	$(".imgClick").each(function() {
	
	seatList+=$(this).attr("id")+",";
	
	});
	if(seatList=="") {
		alert("좌석을 입력해 주세요.");
		return;
	}else{
		if(confirm("정말로 예매하시겠습니까?")) {
			$("#seat").val(seatList.substr(0, seatList.length-1) + "석");
			$("#shop").hide();
			$(".white-row").show();
			
			$("#cancelBtn").click(function() {
				$("#shop").show();
				$("input").filter(".form-control").val("");
				$(".white-row").hide();
			});	
			var cardType = "신한";
			$("#card_type").change(function() {
				cardType = $("#card_type").val();
			})
				
			$("#submitBtn").click(function() {
				var nameReg=/^[가-힣]{2,10}$/g;
				var name = $("#card_name").val();
				if(name==""||!nameReg.test(name)) {
					alert("이름을 올바른 형식으로 입력해주세요.(한글로)");
					return false;
				}
				
				var shinhanReg=/^[0-9]{14}$/g;
				var kookminReg=/^[0-9]{14}$/g;
				var wooriReg=/^[0-9]{14}$/g;
				if(cardType=="신한" && !shinhanReg.test($("#card_number").val())) {
					alert("신한 카드는 숫자 3자리 - 숫자 3자리 - 숫자 6자리로 입력해 주세요.");
					return false;
				}else if(cardType=="국민"&& !kookminReg.test($("#card_number").val())){
					alert("국민 카드는 숫자 6자리 - 숫자 2자리 - 숫자 6자리로 입력해 주세요.");
					return false;
					
				}else if(cardType=="우리"&& !wooriReg.test($("#card_number").val())){					
					alert("우리 카드는 숫자 7자리 - 숫자 3자리 - 숫자 6자리로 입력해 주세요.");
					return false;
				}
				
				$.ajax({
				type: "post",
				url:"${pageContext.request.contextPath}/reserve/reserve_add?seatList="+seatList+"&theatreNo="+theatreNo,
				contentType: "application/json",
				
				data: JSON.stringify({"title":"레미제라블","showTime":showTime}),
				async:false,
				dataType:"text",
				success: function(text) {
					if(text=="success") {
						
						location.href = "${pageContext.request.contextPath}/reserve/reserve";
					}
				},
				error : function(xhr) {
					alert(xhr.status);
				}
			});
				
				
				
			});
			
			
		
			
			
			
	
			
		
		}
		
	}

	
	}
</script>
</body>
</html>