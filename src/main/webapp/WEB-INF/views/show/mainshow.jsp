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
<title>Shows</title>
</head>
<body>
	<!-- WRAPPER -->
		<div id="wrapper">

			<div id="shop">
					<div class="row">

						<!-- items -->
						<c:forEach var="show" items="${showList}">
						<div class="col-sm-6 col-md-3"><!-- item -->
							<div class="item-box">
								<figure>
									<a class="item-hover" href="${pageContext.request.contextPath}/show/showdetail?showseq=${show.showseq}">
										<span class="overlay color2"></span>
										<span class="inner">
											<strong>자세히</strong>
										</span>
									</a>
									<img class="img-responsive" src="${pageContext.request.contextPath}/images/${show.posterPicture}.jpg" width="260" height="260" alt="">
								</figure>
								<div class="item-box-desc">
									<h4><strong>${show.title}</strong></h4><span><strong>공연시간&nbsp;:</strong>&nbsp;${fn:substring(show.showTime,0,16)}</span><br><span><strong>공연관&nbsp;:</strong>&nbsp;${show.theatre }관</span>
									<small class="styleColor">줄거리</small>
									<div>${show.shortSummary}</div>
								</div>
							</div>
						</div>
						</c:forEach>

						<!-- items -->

					</div>
			</div>
		</div>
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
</body>
</html>