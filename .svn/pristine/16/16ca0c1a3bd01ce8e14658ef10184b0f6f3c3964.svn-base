<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.7.7/handlebars.min.js"></script>
<link rel=stylesheet
	href="${pageContext.request.contextPath }/css/bquestion_main.css"
	type="text/css">
<style type="text/css">
.pname { width: 400px; }

td a, td a:visited {
	text-decoration: none;
}
</style>

</style>
</head>
<body>


	<%-- 페이지 번호를 출력하는 영역 --%>
	<div id="pageNumDiv"></div>

	<div id="contents" class="contents_customer">
		<div class="title_top">
			<h2 class="tit">게시판</h2>
		</div>
		<ul class="tab_wrap outer">
			<li><button type="button" class="tab_tit"
					style="width: 20%; left: 0%;">
					<span>FAQ</span>
				</button></li>
			<li><button type="button" class="tab_tit"
					style="width: 20%; left: 20%;">
					<span>공지사항</span>
				</button></li>
			<li><button type="button"
					onclick="location.href='${pageContext.request.contextPath}/bquestion_list"
					class="tab_tit" style="width: 20%; left: 40%;">
					<span>1:1문의</span>
				</button>
			<li><button type="button" class="tab_tit"
					style="width: 20%; left: 60%;">
					<span>단체관람/대관문의</span>
				</button></li>
			<li><button type="button" class="tab_tit"
					style="width: 20%; left: 80%;">
					<span>분실물문의</span>
				</button></li>
		</ul>
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
				<div class="btn_wrap">
					<a href="${pageContext.request.contextPath}/board/bquestion"
						class="btn_col4 ty5">1:1 문의하기</a>
				</div>
				<div class="btn_wrap"></div>
			</div>
			<dl class="contxt_type1">
				<dt class="tit">
					고객님의 문의에 <span class="txt_color02">답변하는 직원은 고객 여러분의 가족 중 한
						사람</span>일 수 있습니다.
				</dt>
				<dd class="desc">고객의 언어폭력(비하, 욕설, 반말, 성희롱 등)으로부터 직원을 보호하기 위해 관련
					법에 따라 수사기관에 필요한 조치를 요구할 수 있으며, 형법에 의해 처벌 대상이 될 수 있습니다.</dd>
			</dl>
			<div class="con_tit ty2">
				<h4 class="tit">문의내용</h4>
			</div>
			
			&nbsp;
			&nbsp;
		</div>
	</div>
	
	<table class="tbl_list text_c ty2" align="center" >
		
		<thead>
			<tr>
				
				<!-- <th><input type="checkbox" name="check" id="allCheck" class="allCheck">모두 선택</th> -->
				<th width="100">번호</th>
				<th width="120">문의 종류</th>
				<th width="150">작성자</th>
				<th class="pname" width="280">제목</th>
				<th width="100">작성일</th>
				<th width="60">수정</th>
				<th width="60">삭제</th>
			</tr>
			<c:forEach items="${list }" var="bquestion">
			<tr>
				<%-- <td><input type="checkbox" name="check" id="check" value="${bquestion.qno} " class="check"></td> --%>
				<td>${bquestion.qno} </td>
				<td>${bquestion.qcategory} </td>
				<td>${bquestion.qname}</td>
				<td>
					<a href="${pageContext.request.contextPath }/board/bquestion_view?qno=${bquestion.qno}" >${bquestion.qtitle}</a>
				</td>
				<td>${bquestion.qdate}</td>
				<td colspan="2">
					<button type="button" id="updateBtn" onclick="location.href='${pageContext.request.contextPath }/board/bquestion_update?qno=${bquestion.qno }';">수정</button> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<button type="button" id="cancelBtn" class="selectDelete_btn" onclick="bquestion(${bquestion.qno});">삭제</button> 
				</td>
			</tr>
		</c:forEach>
		</thead>
		
	</table>
	<script type="text/javascript">
	$("#updateBtn").click(function () {
		location.href="${pageContext.request.contextPath }/board/bquestion_update?qno="+qno;	
	});
	
	
	function bquestion(qno) {
		var del = confirm("정말 삭제하시겠습니까?");
		if (del){
		
			location.reload();
		$.ajax({
			url: "${pageContext.request.contextPath }/board_remove?qno="+qno,
			type: "post",
			dateType: "text",
			success: function(text) {
				alert("삭제 성공")
			},
			error: function(xhr) {
				alert("에러코드 = "+xhr.status);
			 }
		   });
		 
	}
	}
	
/* 	$("#allCheck").click(function(){
		 var chk = $("#allCheck").prop("checked");
			 if(chk) {
	  		$(".check").prop("checked", true);
	 			} else {
		  	$(".check").prop("checked", false);
		 }
	});

	$(".check").click(function(){
		  $("#allCheck").prop("checked", false);
	 });

	
	$(".selectDelete_btn").click(function(){
		var confirm = confirm("정말로 게시글을 삭제 하시겠습니까?");
	
		if(confirm) {
			var checkArr = new Array();
			$("input[class='check']:checked").each(function(i){
			    checkArr.push($(this).val());
			   });
			
			$.ajax({
				url: "/board_remove",
				type: "post",
				data: { check : checkArr },
				dateType: "text",
				success: function(text) {
					alert("삭제 성공")
				},
				error: function() {
					alert("에러코드 = "+xhr.status);
				 }
			   });
			  } 
			 }); */
	</script>
<!--  <script type="text/javascript">
	var page=1;//현재 요청 페이지 번호를 저장하는 전역변수
	boardDisplay(page);
	
	function bquestionDisplay(pageNum){
		page=pageNum;
		$.ajax({
			type: "get",
			url: "board_list?pageNum="+pageNum,
			dataType: "text",
			success: function(text) {
				if(json.bquestionList.length==0) {
					$("#contents").html("검색된 게시글이 존재하지 않습니다.");
					return;
				}
				
				//템플릿 코드를 반환받아 저장
				var source=$("#template").html();
				//템플릿 코드를 전달하여 템플릿 객체 생성
				var template=Handlebars.compile(source);
				//템플릿 객체에 자바스크립트 객체를 전달하여 HTML 코드로 변환하여 반환받아 응답 처리
				$("#contents").html(template(json.bquestionList));
				
				pageDisplay(json.pager);
			}, 
			error: function(xhr) {
				alert("에러코드 = "+xhr.status);
			}
		});
	}
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
	</script>  -->
	<script src="/NLCHS/Scripts/Dist/OneToOneRegistration.bundle.js?v=2021041506"></script>
</body>
</html>