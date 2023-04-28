<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<style>


.title_container2 {

margin-bottom: 50px;	

}



#btn_register {

margin-top: 30px;	

}

</style> 
<script language="JavaScript">
function userRemove(id) {
	if (confirm("정말로 삭제 하시겠습니까?") ) {
		location.href='${pageContext.request.contextPath }/users/mypage/delete?id='+id;
	}
}
</script>

<div id="layout_body" class="layout_body">
<div id="boardlayout" >
<div class="subpage_wrap">
		<div id="subpageLNB" class="subpage_lnb">

<div id="boardLnbCommon">
	<h2 class="title1"><a href="index.jsp?workgroup=company&work=cs" >CS CENTER</a></h2>
	<ul class="lnb_sub">
			<li><a href="${pageContext.request.contextPath }">공지사항</a></li>
			<li><a href="${pageContext.request.contextPath }">자주 묻는 질문</a></li>
			<li><a href="${pageContext.request.contextPath }">예약문의</a></li>
			<li><a href="${pageContext.request.contextPath }">공연후기</a></li>
	</ul>
</div>
	</div>
			<div class="title_container2">
				<h3 class="title_sub6" style="text-align:center"><span style="text-align:center; font-size: 2.0em;  designElement="text" textIndex="8"  textTemplatePath="cmVzcG9uc2l2ZV9jYW1waW5nX2hlYWxpbmdfZ2wvc2VydmljZS9jcy5odG1s" >My Page</span> <span class="top5" designElement="text" textIndex="9"  textTemplatePath="cmVzcG9uc2l2ZV9jYW1waW5nX2hlYWxpbmdfZ2wvc2VydmljZS9jcy5odG1s" ></span></h3>
			</div>
			
	<div class="resp_member_join_wrap">

			<div id="formMemberArea" class="resp_member_join">
				<div class="resp_join_table">
					<ul>
						<li class="th"><p >아이디</p></li>
						<li class="td">${loginUsers.id }</li>
				
						<li class="th"><p >성함</p></li>
						<li class="td">${loginUsers.name }</li>
					</ul>
					<ul>
						<li class="th"><p >번호</p></li>
						<li class="td">${loginUsers.phone }</li>
				
						<li class="th"><p >성별</p></li>
						<li class="td">${loginUsers.gender }</li>
					</ul>
					<ul>
						<li class="th"><p >생년월일</p></li>
						<li class="td">${loginUsers.birthday }</li>
				
						<li class="th"><p >이메일</p></li>
						<li class="td">${loginUsers.email }</li>
					</ul>

					<ul>
						<li class="th"><p >기본주소</p></li>
						<li class="td">${loginUsers.zipcode },<br>${loginUsers.address1 }</li>
				
						<li class="th"><p >상세주소</p></li>
						<li class="td">${loginUsers.address2 },${loginUsers.address3 }</li>
					</ul>
					<ul>
						<li class="th"><p >회원가입일</p></li>
						<li class="td">${loginUsers.joinDate }</li>
				
						<li class="th"><p >최종로그인</p></li>
						<li class="td">${loginUsers.lastLogin }</li>
					</ul>
				</div>
			</div>
		</div>

	<div id="btn_register" class="btn_area_a">
		<a  class="btn_resp size_c color2 " href="${pageContext.request.contextPath }/users/mypage/modify">회원정보변경</a>
		<a  class="btn_resp size_c color2 " href="javascript:userRemove('${loginUsers.id }')">회원탈퇴</a>
	</div>
</div>	
</div>

</div>
