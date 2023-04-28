<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


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
				<img src="${pageContext.request.contextPath }/images/product/${product.num }.png"  width="60%" title="" />
				<div class="slides_container hide" style="position: relative;">
					<div class="viewImgWrap">
					</div>
				</div>
			</div>

			<!-- ++++++++++++++++++++++++ 상품 스펙 ++++++++++++++++++++++++ -->
			<div id="goods_spec">
					<input type="hidden" name="goodsSeq" value="49" />
					<input type="hidden" name="num" value="${product.num }" />
					<input type="hidden" name="id" value="${loginUsers.id }" />
					<input type="hidden" name="image" value="${product.image }" />

					<ul class="goods_spec_sections">

						<li class="goods_spec_sub_info">
							<ul class="detail_spec_table">
								<li class="th"><span>상품이름</span></li>
								<li><span class="gray_06" ><input readonly="readonly" class="gray_06" name = "name"value="${product.name }"></span></li>
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
										<span id="total_goods_price"><input id="sum" name="price" value="${product.price }" readonly="readonly"></input></span>&nbsp;&#x20a9;</td>
								</tr>
							</table>
						</div>
						<!-- 총 상품 금액 표기 끝-->
						<div class="goods_buttons_area">
							<ul class="goods_buttons_section">
								<li>
									<ul class="basic_btn_area">
										<li><button type="button" id="addcart" onclick="sproduct_cart_action();" >
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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<%-- handlebars : JSON 형식으로 표현된 JavaScript 객체를 전달받아 HTML 코드로 변환하는
기능을 제공하는 자바스트크립 템플릿 라이브러리 --%>
<%-- => https://cdnjs.com 사이트에서 handlebars 라이브러리를 검색하여 포함 --%>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.7.7/handlebars.min.js"></script>
<style type="text/css">
#btnDiv { margin: 10px; }

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
<body>

	<h1 align="center">후 기</h1>

	
	<%-- 게시글 목록을 출력하는 영역 --%>
	<div id="restBoardListDiv" align="center"></div>
	
	<%-- 페이지 번호를 출력하는 영역 --%>
	<div id="pageNumDiv" align="center"></div>
	<div id="btnDiv" align="center">
		<button type="button" id="writeBtn">글쓰기</button>
	</div>	
	<%-- 신규 게시글을 입력하는 영역 --%>
	<div id="insertDiv">
		<table>
			<tr>
				<td>작성자</td>
				<td><input type="text" name="writer" id="insertWriter" class="insert"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><input type="text" name="content" id="insertContent" class="insert"></td>
					<input type="hidden" name="num" id="insertNum"  value=${product.num } >
			</tr>
			<tr>
				<td colspan="2">
					<button type="button" id="insertBtn">저장</button>
					<button type="button" id="cancelInsertBtn">취소</button>
				</td>
			</tr>
		</table>
	</div>
	
	<%-- 변경 게시글을 입력하는 영역 --%>
	<div id="updateDiv">
		<input type="hidden" name="num" id="updateNum">
		<table>
			<tr>
				<td>작성자</td>
				<td><input type="text" name="writer" id="updateWriter" class="update"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><input type="text" name="content" id="updateContent" class="update"></td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="button" id="updateBtn">변경</button>
					<button type="button" id="cancelUpdateBtn">취소</button>
				</td>
			</tr>
		</table>
	</div>	
	
	<%-- Handlebars 템플릿 코드(HTML) 작성 --%>
	<%-- => {{each}} 표현식을 이용하여 Array 객체에 대한 반복 처리 --%>
	<%-- => {{propertyName}} 표현식으로 객체 속성값을 표현 --%>
	<script id="template" type="text/x-handlebars-template">
	<table border="1" cellspacing="0" cellpadding="3">
		<tr>	
			<th width="50">번호</th>
			<th width="100">작성자</th>
			<th width="350">내용 </th>
			<th width="200">작성일</th>
			<th width="50">변경</th>
			<th width="50">삭제</th>
		</tr>	
		
		{{#each .}}
		<tr>	
			<td align="center">{{no}}</td>
			<td align="center">{{writer}}</td>
			<td>{{content}}</td>
			<td align="center">{{regdate}}</td>
			<td align="center"><button type="button" onclick="modify({{no}});">변경</button></td>
			<td align="center"><button type="button" onclick="remove({{no}});">삭제</button></td>
		</tr>
		{{/each}}
	</table>
	</script>
	
	<script type="text/javascript">
	var page=1;//현재 요청 페이지 번호를 저장하는 전역변수
	boardDisplay(page);
	
	//게시글 목록을 요청하여 응답하는 함수
	function boardDisplay(pageNum) {
		page=pageNum;
		$.ajax({
			type: "get",
			url: "board_list?pageNum=" + pageNum ,
			dataType: "json",
			success: function(json) {
				if(json.restBoardList.length==0) {
					$("#restBoardListDiv").html("검색된 게시글이 존재하지 않습니다.");
					return;
				}
				
				//템플릿 코드를 반환받아 저장
				var source=$("#template").html();
				//템플릿 코드를 전달하여 템플릿 객체 생성
				var template=Handlebars.compile(source);
				//템플릿 객체에 자바스크립트 객체를 전달하여 HTML 코드로 변환하여 반환받아 응답 처리
				$("#restBoardListDiv").html(template(json.restBoardList));
				
				pageDisplay(json.pager);
			}, 
			error: function(xhr) {
				alert("에러코드 = "+xhr.status);
			}
		});
	}
	
	//페이지 번호를 응답하는 함수
	function pageDisplay(pager) {
		var html="";
		if(pager.startPage>pager.blockSize) {
			html+="<a href='javascript:boardDisplay(1);'>[처음]</a>";
			html+="<a href='javascript:boardDisplay("+pager.prevPage+");'>[이전]</a>";
		} else {
			html+="[처음][이전]";
		}
		
		for(var i=pager.startPage;i<=pager.endPage;i++) {
			if(pager.pageNum!=i) {
				html+="<a href='javascript:boardDisplay("+i+");'>["+i+"]</a>";
			} else {
				html+="["+i+"]";
			}
		}
		
		if(pager.endPage!=pager.totalPage) {
			html+="<a href='javascript:boardDisplay("+pager.nextPage+");'>[다음]</a>";
			html+="<a href='javascript:boardDisplay("+pager.totalPage+");'>[마지막]</a>";
		} else {
			html+="[다음][마지막]";
		}
		
		$("#pageNumDiv").html(html);
	}
	
	//글쓰기 버튼을 클릭한 경우 호출되는 이벤트 핸들러 함수 등록 - 게시글을 입력받아 저장
	$("#writeBtn").click(function() {
		//게시글 변경 관련 영역 초기화
		$(".update").val("");
		$("#updateDiv").hide();
		
		//게시글 입력 관련 영역 출력
		$("#insertDiv").show(300);
	});
	
	$("#insertBtn").click(function() {
		//입력태그의 입력값을 반환받아 저장
		var writer=$("#insertWriter").val();
		var content=$("#insertContent").val();
		var num=$("#insertNum").val();
		
		if(writer=="") {
			alert("작성자를 입력해 주세요.");
			return;
		}
		
		if(content=="") {
			alert("내용을 입력해 주세요.");
			return;
		}
		
		
		//게시글 저장을 요청하여 응답 처리
		$.ajax({
			type: "post",
			url: "board_add",

			//headers : 요청 자원의 헤더정보를 변경하기 위한 속성
			// => content-type 속성으로 전달값에 대한 전송 형식 변경 
			//headers: {"content-type":"application/json"},
			contentType: "application/json",
			
			//JSON.stringify(Object object) : 자바스트립트 객체를 JSON 형식의 문자값으로 변경하는 메소드
			// => JSON 형식의 문자값을 Java 객체의 필드값으로 전달받아 저장
			data: JSON.stringify({"writer":writer, "content":content, "num":num}),
			dataType: "text",
			success: function(text) {
				if(text=="success") {
					//게시글 입력 관련 영역 초기화
					$(".insert").val("");
					$("#insertDiv").hide(300);
					boardDisplay(1);
				}				
			}, 
			error: function(xhr) {
				alert("에러코드 = "+xhr.status);
			}
		});
	});
	
	$("#cancelInsertBtn").click(function() {
		$(".insert").val("");
		$("#insertDiv").hide(300);
	});
	
	//게시글의 [변경]을 누른 경우 호출되는 이벤트 핸들러 함수
	function modify(num) {
		//alert("num = "+num);
		$(".insert").val("");
		$("#insertDiv").hide();
		
		$("#updateDiv").show(300);
		
		//글번호를 전달하여 게시글을 반환받아 입력태그에 출력되도록 AJAX 요청
		$.ajax({
			type: "get",
			url: "board_view/"+num,
			dataType: "json",
			success: function(json) {
				$("#updateNum").val(json.num);
				$("#updateWriter").val(json.writer);
				$("#updateContent").val(json.content);
			},
			error: function() {
				alert("에러코드 = "+xhr.status);
			}
		});
	}
	
	$("#updateBtn").click(function() {
		//입력태그의 입력값을 반환받아 저장
		var num=$("#updateNum").val();
		var writer=$("#updateWriter").val();
		var content=$("#updateContent").val();
		
		if(writer=="") {
			alert("작성자를 입력해 주세요.");
			return;
		}
		
		if(content=="") {
			alert("내용을 입력해 주세요.");
			return;
		}
		
		$.ajax({
			type: "put",
			url: "board_modify",
			contentType: "application/json",
			data: JSON.stringify({"num":num, "writer":writer, "content":content}),
			dataType: "text",
			success: function(text) {
				$(".update").val("");
				$("#updateDiv").hide(300);
				boardDisplay(page);
			},
			error: function() {
				alert("에러코드 = "+xhr.status);
			}
		});
	});
	
	$("#cancelUpdateBtn").click(function() {
		$(".update").val("");
		$("#updateDiv").hide(300);
	});
	
	//게시글의 [삭제]을 누른 경우 호출되는 이벤트 핸들러 함수
	function remove(no) {
		if(confirm("정말로 게시글을 삭제 하시겠습니까?")) {
			$.ajax({
				type: "delete",
				url: "board_remove/"+no,
				dataType: "text",
				success: function(text) {
					boardDisplay(1);
				},
				error: function() {
					alert("에러코드 = "+xhr.status);
				}
			});
		}
	}
	</script>
