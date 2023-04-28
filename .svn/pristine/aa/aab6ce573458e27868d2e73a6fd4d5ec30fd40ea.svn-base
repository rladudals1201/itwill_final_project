<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <link href="${pageContext.request.contextPath}/css/cartcss/shop.css" rel="stylesheet" type="text/css" />

<!-- THEME CSS -->
<link href="${pageContext.request.contextPath}/css/cartcss/essentials.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/cartcss/layout.css" rel="stylesheet" type="text/css" />
 --%>

<!-- 타이틀 -->
<div id="layout_body" class="layout_body">



	<!-- 타이틀 -->
	<div class="detail_title_area">
		<h3 class="name">${product.name }</h3>	
			<div>
				<p class="summary">${product.detail }</p>
			</div>
	</div>
<form name="goodsForm" method="post" id="goodsForm">
	<div id="goods_view">
		<div class="goods_thumbs_spec">
			<div id="goods_thumbs">
				<img src="${pageContext.request.contextPath }/file_download/${product.num}"  width="60%" title="" />
				<div class="slides_container hide" style="position: relative;">
					<div class="viewImgWrap">
					</div>
				</div>
			</div>

			<!-- ++++++++++++++++++++++++ 상품 스펙 ++++++++++++++++++++++++ -->
			<div id="goods_spec">
					<input type="hidden" name="num" value="${product.num }" />
					<input type="hidden" name="id" value="${loginUsers.id }" />
					<input type="hidden" name="image" value="${product.image }" />


					<ul class="goods_spec_sections">

						<li class="goods_spec_sub_info">
							<ul class="detail_spec_table">
								<li class="th"><span>상품이름</span></li>
								<li><input readonly="readonly" class="gray_06" name = "name"value="${product.name }"></input></li>
								<li class="btn_area1"></li>
							</ul>
						</li>
						<li class="goods_spec_brand">
							<ul class="detail_spec_table">
								<li class="th"><span >상품정보</span></li>
								<li><span class="gray_06" >${product.detail }</span></li>
								
							</ul>
						</li>
						<li class="goods_spec_brand">
							<ul class="detail_spec_table">
								<li class="th"><span>상품색상</span></li>
								<li>
									<span class="gray_06" >
										<select name="category" id="category">
											<option value="ALL" <c:if test="${category eq 'ALL'}" > selected="selected" </c:if>>전체</option>
											<option value="RED" <c:if test="${su eq 'RED'}" > selected="selected" </c:if>>빨강</option>		
											<option value="GREEN" <c:if test="${su eq 'GREEN'}" > selected="selected" </c:if>>초록</option>		
											<option value="YELLOW" <c:if test="${su eq 'YELLOW'}" > selected="selected" </c:if>>노랑</option>		
										</select>
									</span>
								</li>
							<li class="goods_spec_brand">
							<ul class="detail_spec_table">
								<li class="th"><span >상품수량</span></li>
								<li>
									<span class="gray_06" >
										<select id="su" name="qty">
											<option value="1" <c:if test="${su eq '1'}" > selected="selected" </c:if>>1</option>
											<option value="2" <c:if test="${su eq '2'}" > selected="selected" </c:if>>2</option>
											<option value="3" <c:if test="${su eq '3'}" > selected="selected" </c:if>>3</option>
											<option value="4" <c:if test="${su eq '4'}" > selected="selected" </c:if>>4</option>
											<option value="5" <c:if test="${su eq '5'}" > selected="selected" </c:if>>5</option>
										</select>
									</span>
								</li>
							</ul>
						</li>		
							</ul>
						</li>
							</ul>
					<div id="goodsOptionBuySection" class="goods_buy_sections">
						<a href="javascript:void(0);" id="btnSectionClose"
							class="btn_section_close">닫기</a>

						</div>

						<!-- 총 상품 금액 표기 시작-->
						<div class="goods_price_area">
							<table>
								<tr>
									<!-- 단일옵션일 경우 수량 -->
									<td class="total_goods_price">
										<span class="total_goods_tit" >개당 상품금액</span>
										<span id="don">${product.price }</span>&nbsp;&#x20a9;</td>
								</tr>
								<tr>
									<!-- 단일옵션일 경우 수량 -->
									<td class="total_goods_price"><span class="total_goods_tit" >총 상품금액</span>
										<span id="total_goods_price"><input id="sum" name="price" value="10000" readonly="readonly"></input></span>&nbsp;&#x20a9;</td>
								</tr>
							</table>
						</div>
						<!-- 총 상품 금액 표기 끝-->
						<div class="goods_buttons_area">
							<ul class="goods_buttons_section">
								<li>
									<ul class="basic_btn_area">
										<li><button type="button" id="addcart" onclick="" >
											<span>장바구니</span></button></li>
										<li><button type="button" id="buy" class="btn_resp size_extra2 color2 NpayNo">
												<span>구매하기</span>
											</button></li>
									</ul>
								</li>
							</ul>
						</div>

					</div>


					<!-- 오프라인 쿠폰 -->
					<!-- //오프라인 쿠폰 -->

			</div>
		</div>
	</form>
				<%-- <div class="col-md-8">
						
							
							<div  class="white-row" >

								<p>
									<span class="pull-right shop-cc-icons">

										<img src="${pageContext.request.contextPath}/images/cc/ico-american-express.jpg" width="41" height="25" alt="">
										<img src="${pageContext.request.contextPath}/images/cc/ico-discover.jpg" width="41" height="25" alt="">
										<img src="${pageContext.request.contextPath}/images/cc/ico-mastercard.jpg" width="41" height="25" alt="">
										<img src="${pageContext.request.contextPath}/images/cc/ico-visa.jpg" width="41" height="25" alt="">
										<img src="${pageContext.request.contextPath}/images/cc/ico-paypal.jpg" width="41" height="25" alt="">

									</span>
									Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae.
								</p>

								<!-- CREDIT CARD -->
								<div class="row">
									<div class="form-group">
										<div class="col-md-12">
											<label class="control-label">Name (as it appears on yout credit card)</label>
											<input  type="text" class="form-control" name="card_name">
										</div>
									</div>
								</div>

								<!-- Card Type -->
								<div class="row">
									<div class="form-group">
										<div class="col-md-12">
											<label class="control-label">Card Type</label>
											<select name="card_type" class="form-control pointer" id="cardType">
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
											<label class="control-label">Card number (no dashes or spaces)</label>
											<input type="text" class="form-control" name="card_number" id= "cardNumber">
										</div>

										<div class="col-md-3"><!-- CVV/CVV2 -->
											<label class="control-label">Security Code</label>
											<input type="text" class="form-control" name="card_code">
										</div>
									</div>
								</div>

								<!-- Card Expiration -->
								<div class="row">
									<div class="form-group">
										<div class="col-md-9"><!-- Month -->
											<label class="control-label">Exp. Month</label>
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
											<label class="control-label">Exp. Year</label>
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
											<button type = "button" class="btn btn-primary btn-lg" id="submitBtn"><i class="fa fa-check"></i> &nbsp; SUBMIT</button>
											<button type = "button" class="btn btn-primary btn-lg" id="cancelPay"><i class="fa fa-check"></i> &nbsp; CANCEL</button>
										</div>
									</div>
								</div>
								<!-- /CREDIT CARD -->

							</div>

						</div>	 --%>
	
</div>	
<%--장바구니로 보내기! --%>
<script type="text/javascript">
$("#addcart").click(function() {
	$("#goodsForm").attr("method","post");
	$("#goodsForm").attr("action","${pageContext.request.contextPath}/cart/cart_add");
	$("#goodsForm").submit(); 	
});

$("#buy").click(function() {
	$("#goodsForm").attr("method","post");
	$("#goodsForm").attr("action","${pageContext.request.contextPath}/pay/payPage");
	$("#goodsForm").submit(); 	
	
});


	function numberWithCommas(x) {
	    return x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
	}

	function calc() {
		var don=$("#don").text();
		var su=$("#su").val();
		$("#sum").val((don*su));
	}
	
	calc();
	
	$("#su").change(calc);
	


</script>

