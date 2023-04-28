<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring</title>
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

</head>
<body>
	
	
		
<div class="container">
		<div id="wrapper">

			<div id="shop">

				<!-- PAGE TITLE -->
			

				<section class="container">

					<div class="row">
						<div class="col-md-8">
						
							<h2>결제</h2>
							<form class="white-row" method="post" action="${pageContext.request.contextPath}/pay/pay">
							<input type="hidden" name="cartNo" value="${cartNo }"></input>
							<input type="hidden" name="id" value="${loginUsers.id }"></input>
							<input type="hidden" name="num" value="${product.num }"></input>
							<input type="hidden" name="name" value="${product.name }"></input>
							<input type="hidden" name="qty" value="${product.qty }"></input>
							<input type="hidden" name="price" value="${product.price }"></input>
							
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
											<label class="control-label">이름(신용카드)</label>
											<input required type="text" class="form-control" name="card_name" />
										</div>
									</div>
								</div>

								<!-- Card Type -->
								<div class="row">
									<div class="form-group">
										<div class="col-md-12">
											<label class="control-label">카드 종류</label>
											<select name="card_type" class="form-control pointer">
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
											<input required type="text" class="form-control" name="card_number" />
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
												<option value="01">January</option>
												<option value="02">February</option>
												<option value="03">March</option>
												<option value="04">April</option>
												<option value="05">May</option>
												<option value="06">June</option>
												<option value="07">July</option>
												<option value="08">August</option>
												<option value="09">September</option>
												<option value="10">October</option>
												<option value="11">November</option>
												<option value="12">December</option>
											</select>
										</div>
										
										<div class="col-md-3"><!-- Year -->
											<label class="control-label">만기년</label>
											<select name="expiration_year" class="form-control pointer">
												<option value="2013">2013</option>
												<option value="2014">2014</option>
												<option value="2015">2015</option>
												<option value="2016">2016</option>
												<option value="2017">2017</option>
												<option value="2018">2018</option>
												<option value="2019">2019</option>
												<option value="2020">2020</option>
											</select>
										</div>
									</div>
								</div>

								<div class="row">
									<div class="form-group">
										<div class="col-md-12">
											<button class="btn btn-primary btn-lg"><i class="fa fa-check"></i> &nbsp; SUBMIT</button>
										</div>
									</div>
								</div>
								<!-- /CREDIT CARD -->

							</form>

						</div>


					</div>

				</section>

			</div>
		</div>
		</div>
		<script type="text/javascript">
					
		
		
		
		
		
						
						
	
		</script>				
</body>
</html>