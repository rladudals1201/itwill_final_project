<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
#map {
        width: 100%;
        height: 400px;
        background-color: grey;
      }
 </style>
<div id="layout_body" class="layout_body">
<div class="visual_title">

	<div class="img_area">
	
	</div>
	<div class="visual_gon">
		<ul class="title_inner_a">
			<li>
				<p class="descr"></p>
			</li>
		</ul>
	</div>
</div>



<div class="service_section v3">
	<h3 class="title1">
		<span>자바 117기 검은소극장, BlackCowTheatre</span>
	</h3>
	<p class="desc1" >Java 117th BlackCowTheatre</p>
	<p>
		117기 2조의 구성원은 팀장 박철호, 팀원, 김모수, 김영민, 박소연, 정성진으로 총 5명입니다.<br>
		디자인과 상품파트는 박철호가 담당하였으며, 결제/장바구니파트는 김영민/정성진이 담당하였고, 게시판파트는 박소연, 회원파트는 김모수가 각 담당하였습니다.<br>
		AJAX와 MYBatis를 최대한 이용하고자 하였습니다.
	</p>
</div>

<div class="service_section v3">
	<h3 class="title1">
		<span>기능구현 : 게시판</span>
	</h3>
	<p class="desc1" ></p>
	<p>
		공연 예약에 AJAX를 최대한 활용하였고, 기존의 페이지 이동이 아닌 하나의 페이지에서 처리 될 수 있도록 하였습니다.
		회원 관리는 STATUS를 활용하여 간소화하였습니다.
	</p>
</div>
<div class="service_section v3">
	<h3 class="title1">
		<span>오시는길</span>
	</h3>
<div id="staticMap" style="width:600px;height:350px;"></div> 

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=3a2032d1b11a8d1460ab804a488b7c22"></script>
<script>    
// 이미지 지도에 표시할 마커입니다
// 이미지 지도에 표시할 마커를 아래와 같이 배열로 넣어주면 여러개의 마커를 표시할 수 있습니다 
var markers = [
    {
        position: new kakao.maps.LatLng(37.4989421532737, 127.03164708226217)
    },
    { 
        position: new kakao.maps.LatLng(37.4989421532737, 127.03164708226217), 
        text: '검은소극장' // text 옵션을 설정하면 마커 위에 텍스트를 함께 표시할 수 있습니다     
    }
];

var staticMapContainer  = document.getElementById('staticMap'), // 이미지 지도를 표시할 div  
    staticMapOption = { 
        center: new kakao.maps.LatLng(37.4989421532737, 127.03164708226217), // 이미지 지도의 중심좌표
        level: 3, // 이미지 지도의 확대 레벨
        marker: markers // 이미지 지도에 표시할 마커 
    };     

// 이미지 지도를 생성합니다
var staticMap = new kakao.maps.StaticMap(staticMapContainer, staticMapOption);
</script>	
	<p class="desc1" >Member</p>
	<p>
		서울 강남구 테헤란로 124 삼원타워지번복사<br>
		강남역1번 출구에서 276m
	</p>
</div>
<!-- ================= 파트 페이지들 :: END. ================= -->
</div>