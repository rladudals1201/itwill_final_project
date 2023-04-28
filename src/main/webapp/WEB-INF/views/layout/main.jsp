<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 슬라이드 배너 영역  (light_style_2_11) :: START -->
<style type="text/css">
#productList {
	width: 1000px;
	margin: 0 auto;
}

.product {
	padding: 10px 5px;
	border: 1px solid black;
	width: 300px;
	margin: 10px;
	text-align: center;
	float: left;
}

</style>

<div class="wide_visual_slider sliderB center">
	<!-- 슬라이드 배너 데이터 영역 :: START -->
	<div class="light_style_2_11 designBanner">
		<div class="sslide">
			<img class="simg"
				src="${pageContext.request.contextPath}/images/images_1.png" />
			<div class="slide_contents">
				<div class="wrap1">
					<div class="wrap2">
						<ul class="text_wrap">
							<li class="sbtns1"><a></a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="sslide">
			<img class="simg"
				src="${pageContext.request.contextPath}/images/images_2.png" />
			<div class="slide_contents">
				<div class="wrap1">
					<div class="wrap2">

					</div>
				</div>
			</div>
		</div>
		<div class="sslide">
			<img class="simg"
				src="${pageContext.request.contextPath}/images/images_3.png" />
			<div class="slide_contents">
				<div class="wrap1">
					<div class="wrap2">
						<ul class="text_wrap">
							<li class="text1"><br>
							</li>
							<li class="sbtns1"><a></a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 슬라이드 배너 데이터 영역 :: END -->
</div>

<div class="resp_wrap">
	<div class="title_group1">
		<h3 class="title1">
			상품 목록
		</h3>
	</div>
</div>		
		<div id="productList">
<c:forEach var="product" items="${productList }">
		<div class="product">
		<div>${product.name }</div>
		<div>[${proudct.code }] ${product.color }</div>
		<div>
			<a href=" ${pageContext.request.contextPath}/product/product_view?num=${product.num }" class="prouct">
			<img src="${pageContext.request.contextPath }/images/product/${product.num }.png" width="200">
			</a>
		</div>
		<div>
			${product.price}원 
		</div>
		</div>
	</c:forEach>
		</div>

<div class="camping_goods_list">
		<!-- ++++++++++++++++++++++++++++++++++++++++++++++++++++
@@ [반응형] 디스플레이 템플릿 - 격자 반응형 @@
- 파일위치 : [스킨폴더]/_modules/display/goods_display_responsible.html
++++++++++++++++++++++++++++++++++++++++++++++++++++ -->

<style type="text/css">
	.designDisplay_603f380f11056 .goods_list li.gl_item{ width:300px; }
</style>

<div id='designDisplay_603f380f11056' class='designDisplay' designElement='display' templatePath='main/index.html' displaySeq='10301' page='' perpage='' category='' displayStyle='responsible'>

	<div class="designDisplay_603f380f11056 display_responsible_class ">
	
	</div>

</div>

</div>
<script type="text/javascript">
	$(function() {
		$(".light_style_2_11").not(".slick-initialized").slick({
			// $('.light_style_타입num_배너num')에서 '배너num'는 showDesignBanner(배너num)과 반드시 일치해야 합니다
			dots : true, // 도트 페이징 사용( true 혹은 false )
			autoplay : true, // 슬라이드 자동( true 혹은 false )
			speed : 1000, // 슬라이딩 모션 속도 ms( 밀리세컨드, ex. 600 == 0.6초 )
			fade : true, // 슬라이딩 fade 모션 사용( true 혹은 fasle )
			autoplaySpeed : 3000, // autoplay 사용시 슬라이드간 시간 ms( 밀리세컨드, ex. 3000 == 3초 )
		// 이 외 slick 슬라이더의 자세한 옵션사항은 http://kenwheeler.github.io/slick/ 참고
		});
	});
</script>
<!-- 슬라이드 배너 영역 (light_style_2_11) :: END -->
