<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.7.7/handlebars.min.js"></script>
<link rel=stylesheet href="${pageContext.request.contextPath }/css/bquestion.css" type="text/css">


</head>
<body>

	<div id="contents" class="contents_customer" >
		<div class="title_top">
			<h2 class="tit">고객센터</h2>
		</div>
		<ul class="tab_wrap outer">
			<li><button type="button" class="tab_tit"style="width: 20%; left: 0%;"><span>FAQ</span></button></li>
			<li><button type="button" class="tab_tit"style="width: 20%; left: 20%;"><span>공지사항</span></button></li>
		<li><button type="button" onclick="location.href='${pageContext.request.contextPath}/bquestion_list'" class="tab_tit"style="width: 20%; left: 40%;"><span>1:1문의</span></button>
			<li><button type="button" class="tab_tit" style="width: 20%; left: 60%;"><span>단체관람/대관문의</span></button></li>
			<li><button type="button" class="tab_tit" style="width: 20%; left: 80%;"><span>분실물문의</span></button></li>
				<div class="tab_con">
					<h3 class="hidden">1:1문의</h3>
					<div class="con_top">
						<div class="ico_tit qus">
							FAQ를 이용하시면 궁금증을 더 빠르게 해결하실 수 있습니다.
							<ul class="list_txt mt10">
								<li>1:1 문의글 답변 운영시간 10:00 ~ 19:00</li>
								<li>접수 후 48시간 안에 답변 드리겠습니다.</li>
							</ul>
						</div>
					</div>
					<dl class="contxt_type1">
						<dt class="tit">
							고객님의 문의에 <span class="txt_color02">답변하는 직원은 고객 여러분의 가족 중 한
								사람</span>일 수 있습니다.
						</dt>
						<dd class="desc">고객의 언어폭력(비하, 욕설, 반말, 성희롱 등)으로부터 직원을 보호하기 위해
							관련 법에 따라 수사기관에 필요한 조치를 요구할 수 있으며, 형법에 의해 처벌 대상이 될 수 있습니다.</dd>
					</dl>
					<div class="con_tit ty2">
						<h4 class="tit">문의내용</h4>
						<div class="group_rgt">
							<span class="txt_req">필수입력</span>
						</div>
					</div>
					
				<form action="${pageContext.request.contextPath }/board/bquestion_list" method="post" name="f" id="qcontent">
					<table class="tbl_form" summary="문의내용작성 테이블">
						<caption>문의 내용을 작성해주세요</caption>
						<colgroup>
							<col style="width: 15%;">
							<col style="width: auto;">
						</colgroup>
						<tbody>
							<tr>
								<th scope="row" class="req">분류</th>
								<td>
									<select title="문의내용 분류선택" name="qcategory" id="qcategory">
										<option value="1" selected="selected">분류 선택</option>
											<option value="극장">극장</option>
											<option value="연극">연극</option>
											<option value="예매/결제">예매/결제</option>
											<option value="홈페이지">홈페이지</option>
											<option value="개인정보">개인정보</option>
									</select>
								</td>
							</tr>
							<tr>
								<th scope="row" class="req">종류</th>
								<td>
										<select title="문의내용 문의종류" name="qkind" id="qkind">
										<option value="10" selected="selected">문의 종류</option>
											<option value="문의">문의</option>
											<option value="칭찬">칭찬</option>
											<option value="불만">불만</option>
											<option value="건의">건의</option>
										</select>
								
								</td>
							</tr>
							<tr>
								<th scope="row" class="req">제목</th>
								<td><div class="bx_textarea">
										<input type="text" class="ty2 w_full" placeholder="제목을 입력해주세요" title="문의내용 제목입력" id="qtitle" name="qtitle" value="${bquestion.qtitle }">
										<span class="txt_count"><em id="strongContentsCount_Title">0</em>/한글<em> 50</em>자</span>
									</div>
								</td>
							</tr>
							<tr>
								<th scope="row" class="req">내용</th>
								<td>
									<div class="bx_textarea">
										<textarea class="ty2" cols="10" rows="10" id="qcontent" name="qcontent" title="문의내용을 입력해주세요" placeholder="내용을 입력해주세요" value="${bquestion.qcontent }"></textarea>
											
										<span class="txt_count"><em id="strongContentsCount">0</em>/한글<em>2,000</em>자</span>
									</div>
								</td>
							</tr>
							<tr>
								<th scope="row">첨부파일</th>
								<td>
									<div class="bx_file "><input type="file" id="file" name="file" value="${qfile }">
										<label class="" for="file">파일선택</label>
											<div class="file_item"></div>
									</div>
										<span class="txt_caution1 fl_r with_inp">첨부 파일형식 : jpg / jpeg / png / bmp / gif / pdf (5MB X 1개)</span>
								</td>
							</tr>
							<!-- <tr>
								<th scope="row">답변수신 여부</th>
								<td><input type="checkbox" id="iDemailReplyYN" checked="">
									<label for="iDemailReplyYN">이메일 알림받기</label>
										<input type="checkbox" id="iDsmsReplyYN">
											&nbsp;<label for="iDsmsReplyYN">SMS 알림받기</label>
												&nbsp;<span class="txt_caution1 fl_r ">비회원 문의 시 이메일로 답변 내용이 발송되므로 이메일로 답변 알림 받기는 필수입니다. </span>
								</td>
							</tr> -->
						</tbody>
					</table>
					<!-- <div class="con_tit ty2">
						<h4 class="tit">고객정보</h4>
						<div class="group_rgt">
							<span class="txt_req">필수입력</span>
						</div>
					</div> -->
					<%-- <table class="tbl_form" summary="고객정보작성 테이블">
						<caption>고객정보를 작성해주세요</caption>
						<colgroup>
							<col style="width: 15%;">
							<col style="width: auto;">
						</colgroup>
						<tbody>
							<tr>
								<th scope="row" class="req">성명</th>
								<td><input type="text" class="ty2 inp_name" id="qname" title="성명을 입력해주세요" name="qname" value="${loginUsers.name}" ></td>
							</tr>
						
							<tr>
								<th scope="row" class="req">이메일</th>
								<td><input type="text" class="ty2 inp_id" title="이메일 아이디" id="qemail" name="qemail" value="${loginUsers.email} ">  &nbsp;답변 등록시 해당 이메일로 답변 여부가 발송됩니다.</span>
								</td>
							</tr>
						</tbody>
					</table> --%>
				</form>
					<!-- <div class="con_tit ty2">
						<h4 class="tit">개인정보 수집에 대한 동의</h4>
						<div class="group_rgt">
							<p class="txt_form">문의를 통해 아래의 개인정보를 수집합니다. 수집된 개인정보는 문의 외
								목적으로 사용하지 않습니다.</p>
						</div>
					</div>
					<div class="privacy_wrap">
						<div class="txtarea">
							<a class="focus_textarea" href="javascript:void(0);">개인정보의
								수집목적 및 항목</a><br>① 수집 목적 : 원활한 고객 상담, 불편사항 및 문의사항 관련 의사소통 경로 확보<br>②
							수집 항목<br>*필수입력사항<br>- 이용자 식별을 위한 항목 : 성명, 연락처, 생년월일,
							이메일, 아이디(로그인 시 수집)<br>
							<span class="color_red"><br>개인정보의 보유 및 이용기간<br>입력하신
								개인정보는 문의 접수 후 처리 완료 시점으로 부터 3년간 보유 합니다. (단, 생년월일은 이용자 식별 목적으로
								이용되며 별도 보관되지 않습니다.)<br>다만, 소비자보호에 관한 법률 등 관계 법률에 의해 보유할 필요가
								있는 경우에는 다음과 같이 보유합니다.<br>보유기간 : 소비자의 불만 또는 분쟁처리에 관한 기록 3년</span><br>
							<br>※ 1:1문의 서비스 제공을 위한 최소한의 개인정보이며 거부할 수 있습니다. 다만, 수집에 동의하지
							않을 경우 서비스 이용이 제한됩니다.
						</div>
						<div class="bx_inp">
							<input type="radio" name="rdo01" id="radio10" class="iDrdoAgreeY"><label
								for="radio10">동의 </label><input type="radio" name="rdo01"
								id="radio11" checked=""><label for="radio11">동의하지않음</label>
						</div>
						<div class="btn_btm_wrap">
							<button type="button" class="btn_col3 ty6" id="cancelInsertBtn" >취소</button>
							<button type="button"  class="btn_col2 ty6" id="insertBtn" onclick="bquestion();">확인</button>
								
						</div>
					</div> -->
				</div>
			</li>
		
		</ul>
	</div>
	<script type="text/javascript">
	
	$("#qcategory").change(function() {
		
		//이벤트가 발생된 엘리먼트의 속성값을 반환받아 저장
		var qcategory=$(this).attr("name");//고유값
		var statusOne=$(this).val();//변경값
		/* alert(qcategory+" = "+statusOne); */
		
	});
	$("#qkind").change(function() {
		//이벤트가 발생된 엘리먼트의 속성값을 반환받아 저장
		var qkind=$(this).attr("name");//고유값
		var statusTwo=$(this).val();//변경값
		/* alert(qkind+" = "+statusTwo); */
		
	});
	
	function bquestion() {
	if ( f.qtitle.value == "" ) {
		alert("제목을 입력하십시요.");
		f.qtitle.focus();
		return;
	} 
	if ( f.qcontent.value == "" ) {
		alert("내용을 입력하십시요.");
		f.qcontent.focus();
		return;
	}	
	if ( f.name.value == "" ) {
		alert("이름을 입력하십시요.");
		f.name.focus();
		return;
	}	
	var statusOne=$("#qcategory").val();
	var statusTwo=$("#qkind").val();
	var qtitle=$("#qtitle").val();
	var qcontent=$("#qcontent").val();
	var qfile=$("#qfile").val();
	var qname=$("#qname").val();
	var qemail=$("#qemail").val();
/* 	f.action = "${pageContext.request.contextPath }/bquestion_main";  */
	 f.submit();
	
/*  	$.ajax({
		type: "post",
		url: "${pageContext.request.contextPath }/board_add",
		
		//headers : 요청 자원의 헤더정보를 변경하기 위한 속성
		// => content-type 속성으로 전달값에 대한 전송 형식 변경 
		//headers: {"content-type":"application/json"},
		 contentType: "application/json; charset=UTF-8",

		
		//JSON.stringify(Object object) : 자바스트립트 객체를 JSON 형식의 문자값으로 변경하는 메소드
		// => JSON 형식의 문자값을 Java 객체의 필드값으로 전달받아 저장
		
		data: JSON.stringify({"qname":qname, "qemail":qemail, "qid":"", "qcategory":statusOne, "qkind":statusTwo, "qtitle":qtitle
			,"qcontent":qcontent, "qfile":"", "qanswer":"", "qstatus":"", "status":""}),
		async: false,
		dataType: "text", 
		success: function(text) {
			if(text=="success") {
				//게시글 입력 관련 영역 초기화
				alert("성공")
				
			}				
		}, 
		error: function(xhr) {
			alert("에러코드 = "+xhr.status);
		}
	});  */
	/* f.action = "${pageContext.request.contextPath }/bquestion_main"; */
	/* f.submit(); */
}
	

</script>

<%-- 	


	var page=1;//현재 요청 페이지 번호를 저장하는 전역변수
	/* boardDisplay(page); */
	
	
/* 	function bquestion() {
		if ( f.iDtitle.value == "" ) {
			alert("제목을 입력하십시요.");
			f.iDtitle.focus();
			return;
		} 
		if ( f.iDcontents.value == "" ) {
			alert("내용을 입력하십시요.");
			f.iDcontents.focus();
			return;
		}	
		
		f.action = "${pageContext.request.contextPath}/bquestion_main";
		f.submit();
		

}); */

</script> --%>
<!-- <script type="text/javascript">
$("#writeBtn").click(function() {
	//게시글 변경 관련 영역 초기화
	$(".update").val("");
	$("#updateDiv").hide();
	
	//게시글 입력 관련 영역 출력
	$("#insertDiv").show(300);
});

$("#insertBtn").click(function() {
	//입력태그의 입력값을 반환받아 저장

	var iDtitle=$("#iDtitle").val();
	var iDcontents=$("#iDcontents").val();
	
	if(iDdivisionCode=="") {
		alert("분류를 선택해 주세요.");
		return;
	}
	
	if(inquiryType=="") {
		alert("문의 종류를 선택해 주세요.");
		return;
	}
	if(iDtitle=="") {
		alert("제목을 입력해 주세요.");
		return;
	}
	
	if(iDcontents=="") {
		alert("내용을 입력해 주세요.");
		return;
	}
	$.ajax({
		type: "post",
		url: "bquestion_add",

		//headers : 요청 자원의 헤더정보를 변경하기 위한 속성
		// => content-type 속성으로 전달값에 대한 전송 형식 변경 
		//headers: {"content-type":"application/json"},
		contentType: "application/json",
		
		//JSON.stringify(Object object) : 자바스트립트 객체를 JSON 형식의 문자값으로 변경하는 메소드
		// => JSON 형식의 문자값을 Java 객체의 필드값으로 전달받아 저장
		data: JSON.stringify({"qtitle":qtitle, "qcontent":qcontent}),
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
</script> -->


</body>
</html>
