<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
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

<title>Insert title here</title>
</head>
<body>


		<div id="showSwitcher" class="styleSecondColor"><i class="fa fa-angle-double-right"></i></div>
		<!-- /STYLESWITCHER -->



		<!-- WRAPPER -->
		<div id="wrapper">

			<div id="shop">

				<!-- PAGE TITLE -->
			


				<section class="container">
					<h2>물품구매 내역</h2>
				
					<c:choose>
						<c:when test="${empty(payList) }">
						<div style="text-align: center;">장바구니에 담긴 상품이 없습니다.</div>
						</c:when>
						<c:otherwise>
						<form class="white-row" method="post" action="#">

						<!-- cart content -->
						<div id="cartContent">
							<!-- cart header -->
							
							<!-- /cart header -->
							<c:forEach var="pay" items="${payList }" >	
							<div class="item">
								<div class="cart_img"><img src="assets/images/demo/shop/2.jpg" alt="" width="60" /></div>
								<div class="product_name">${pay.payDetail }</div>
								
								<div class="total_price"><span>${pay.price }원</span></div>
								<div class="qty"></div>
								<div class="clearfix"></div>
							</div>
							</c:forEach>
							<!-- cart item -->
							<!-- cart total -->
						<!-- /update cart -->

							<div class="clearfix"></div>
						</div>
					</form>		
					</c:otherwise>
					</c:choose>
				</section>
			</div>
		</div>

</body>
</html>