﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<style>
#idCheck, #postt {
	font-size: 12px;
	font-weight: bold;
	cursor: pointer;
	margin-left: 10px;
	padding: 2px 10px;
	border: 1px solid black;
}

#idCheck:hover, #postt:hover {
	background: orange;
}

.resp_member_join input[type].size_phone2 {
    width: 60px;
}

.error {
	color: red;
	position: relative;
	left: 160px;
	display: none;
}
</style>

<form name="joinForm" id="join" method="post" action="${pageContext.request.contextPath }/users/join">
<div id="layout_body" class="layout_body">
	<div class="title_container">
		<h2>
			<span>회원정보 입력</span>
		</h2>
	</div>	
	<div class="resp_member_join_wrap">

			<div id="formMemberArea" class="resp_member_join">
				<div class="resp_join_table">
					<ul class="required">
						<li class="th"><p >아이디</p></li>
						<li class="td"><input type="text" name="id" id="id"	placeholder="공백 없는 영문/숫자 포함 6~20자">
							<div id="idMsg" class="error">아이디를 입력해 주세요.</div>
							<div id="idRegMsg" class="error">아이디는 영문자로 시작되는 영문자,숫자,_의 6~20범위의 문자로만 작성 가능합니다.</div>
						</li>
					</ul>
					<ul class="required">
						<li class="th "><p>비밀번호</p></li>
						<li class="td"><input type="password" name="passwd" id="passwd" placeholder="공백 없는 영문/숫자 포함 6~20자">
							<div id="passwdMsg" class="error">비밀번호를 입력해 주세요.</div>
							<div id="passwdRegMsg" class="error">비밀번호는 영문자,숫자,특수문자가 반드시 하나이상 포함된 6~20 범위의 문자로만 작성 가능합니다.</div>
						</li>
					</ul>
					<ul class="required">
						<li class="th "><p>비밀번호 확인</p></li>
						<li class="td"><input type="password" name="repasswd" id="repasswd">
							<div id="repasswdMsg" class="error">비밀번호 확인을 입력해 주세요.</div>
							<div id="repasswdMatchMsg" class="error">비밀번호와 비밀번호 확인이 서로 맞지 않습니다.</div>
						</li>
					</ul>
					<ul class="required">
						<li class="th "><p>이름</p></li>
						<li class="td"><input type="text" name="name" id="name">
							<div id="nameMsg" class="error">이름을 입력해 주세요.</div>
						</li>
					</ul>
					<ul class="required">
						<li class="th "><p>성별</p></li>
						<li class="td">
							<select class="gender" name="gender">
								<option value="1">남자</option>
								<option value="2">여자</option>
							</select>
						</li>
					</ul>
					<ul>
						<li class="th "><p>&nbsp;&nbsp;&nbsp;생일</p></li>
						<li class="td"><input type="text" name="birthday" id="birthday" placeholder="ex) 19900512" size="8" maxlength="8">
							<div id="birthdayMsg" class="error">생일을 입력해 입력해 주세요.</div>
							<div id="birthdayRegMsg" class="error">생일은 8자리의 숫자로만 입력해 주세요.</div>
						</li>
					</ul>
					<ul class="required">
						<li class="th "><p>이메일</p></li>
						<li class="td">
							<input type="text" name="email" id="email" >
							<div id="emailMsg" class="error">이메일을 입력해 주세요.</div>
							<div id="emailRegMsg" class="error">이메일은 영문자,숫자,특수문자 중 6~20 범위의 문자로만 작성 가능합니다..</div>
							<div class="Pt10">
								<label><input type="checkbox" name="mailing" value="Y">
									<span>정보메일을 수신하겠습니다.</span></label>
							</div>
							<p class="Pt10 desc">
								이메일 수신에 동의하시면 여러가지 할인혜택과 각종 이벤트 정보를 받아보실 수 있습니다.<br>
								회원가입관련, 주문배송관련 등의 메일은 수신동의와 상관없이 모든 회원에게 발송됩니다.<br>
							</p></li>
							
					</ul>
	
					<ul class="required">
						<li class="th"><p>휴대폰번호</p></li>
						<li class="td">
								<input type="text" name="phone" id="phone" >
								<div id="phoneMsg" class="error">전화번호를 입력해 입력해 주세요.</div>
								<div id="phoneRegMsg" class="error">전화번호는 11자리의 숫자로만 입력해 주세요.</div>
							<div class="Pt10">
								<label><input type="checkbox" name="sms" value="Y"><span>SMS를 수신하겠습니다.</span></label>
							</div>
							<p class="Pt10 desc">
								SMS 수신에 동의하시면 여러가지 할인혜택과 각종 이벤트 정보를 받아보실 수 있습니다.<br>
								회원가입관련, 주문배송관련 등의 SMS는 수신동의와 상관없이 구매 회원에게 발송됩니다.<br>
							</p></li>
					</ul>
					
					<ul class="required">
						<li class="th "><p>&nbsp;&nbsp;&nbsp;주소</p></li>
						<li class="td">
							<input type="text" id="zipcode" name="zipcode" placeholder="우편번호" readonly="readonly">
							<input id="postt" type="button" onclick="sample3_execDaumPostcode()" value="우편번호 찾기"><br>
							<input type="text" id="address1" name="address1" placeholder="주소" readonly="readonly">
							<input type="text" id="address2" name="address2" placeholder="상세주소">
							<input type="text" id="address3" name="address3" placeholder="참고항목">
							
							<div id="wrap" style="display:none;border:1px solid;width:500px;height:300px;margin:5px 0;position:relative">
								<img src="//t1.daumcdn.net/postcode/resource/images/close.png" id="btnFoldWrap" style="cursor:pointer;position:absolute;right:0px;top:-1px;z-index:1" onclick="foldDaumPostcode()" alt="접기 버튼">
							</div>
							
							<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
							<script>
							    // 우편번호 찾기 찾기 화면을 넣을 element
							    var element_wrap = document.getElementById('wrap');
							
							    function foldDaumPostcode() {
							        // iframe을 넣은 element를 안보이게 한다.
							        element_wrap.style.display = 'none';
							    }
							
							    function sample3_execDaumPostcode() {
							        // 현재 scroll 위치를 저장해놓는다.
							        var currentScroll = Math.max(document.body.scrollTop, document.documentElement.scrollTop);
							        new daum.Postcode({
							            oncomplete: function(data) {
							                // 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
							
							                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
							                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
							                var addr = ''; // 주소 변수
							                var extraAddr = ''; // 참고항목 변수
							
							                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
							                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
							                    addr = data.roadAddress;
							                } else { // 사용자가 지번 주소를 선택했을 경우(J)
							                    addr = data.jibunAddress;
							                }
							
							                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
							                if(data.userSelectedType === 'R'){
							                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
							                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
							                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
							                        extraAddr += data.bname;
							                    }
							                    // 건물명이 있고, 공동주택일 경우 추가한다.
							                    if(data.buildingName !== '' && data.apartment === 'Y'){
							                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
							                    }
							                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
							                    if(extraAddr !== ''){
							                        extraAddr = ' (' + extraAddr + ')';
							                    }
							                    // 조합된 참고항목을 해당 필드에 넣는다.
							                    document.getElementById("address3").value = extraAddr;
							                
							                } else {
							                    document.getElementById("address3").value = '';
							                }
							
							                // 우편번호와 주소 정보를 해당 필드에 넣는다.
							                document.getElementById('zipcode').value = data.zonecode;
							                document.getElementById("address1").value = addr;
							                // 커서를 상세주소 필드로 이동한다.
							                document.getElementById("address2").focus();
							
							                // iframe을 넣은 element를 안보이게 한다.
							                // (autoClose:false 기능을 이용한다면, 아래 코드를 제거해야 화면에서 사라지지 않는다.)
							                element_wrap.style.display = 'none';
							
							                // 우편번호 찾기 화면이 보이기 이전으로 scroll 위치를 되돌린다.
							                document.body.scrollTop = currentScroll;
							            },
							            // 우편번호 찾기 화면 크기가 조정되었을때 실행할 코드를 작성하는 부분. iframe을 넣은 element의 높이값을 조정한다.
							            onresize : function(size) {
							                element_wrap.style.height = size.height+'px';
							            },
							            width : '100%',
							            height : '100%'
							        }).embed(element_wrap);
							
							        // iframe을 넣은 element를 보이게 한다.
							        element_wrap.style.display = 'block';
							    }
							</script>
						
						</li>
					</ul>

				</div>
			</div>

</div>
</div>
	<div id="btn_register" class="btn_area_c">
		<button type="submit" class="btn_resp size_c color2 Wmax">입력 완료</button>
		<button type="reset" class="btn_resp size_b color1 Wmax">다시입력</button>
	</div>
	</form>


<script type="text/javascript">
$("#id").focus();

$("#join").submit(function() {	
	var submitResult=true;
	
	$(".error").css("display","none");


	var idReg=/^[a-zA-Z]\w{5,19}$/g;
	if($("#id").val()=="") {
		$("#idMsg").css("display","block");
		submitResult=false;
	} else if(!idReg.test($("#id").val())) {
		$("#idRegMsg").css("display","block");
		submitResult=false;
	}
	
	var passwdReg=/^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[~!@#$%^&*_-]).{6,20}$/g;
	if($("#passwd").val()=="") {
		$("#passwdMsg").css("display","block");
		submitResult=false;
	} else if(!passwdReg.test($("#passwd").val())) {
		$("#passwdRegMsg").css("display","block");
		submitResult=false;
	} 
	
	if($("#repasswd").val()=="") {
		$("#repasswdMsg").css("display","block");
		submitResult=false;
	} else if($("#passwd").val()!=$("#repasswd").val()) {
		$("#repasswdMatchMsg").css("display","block");
		submitResult=false;
	}
	
	if($("#name").val()=="") {
		$("#nameMsg").css("display","block");
		submitResult=false;
	}
	
	var email=$("#email").val();
	var emailReg=/^([a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+(\.[-a-zA-Z0-9]+)+)*$/g;
	if(email=="") {
		$("#emailNullMsg").show();
		submitResult=false;
	} else if(!emailReg.test(email)) {
		$("#emailVaildMsg").show();
		submitResult=false;
	}

	var birthReg=/\d{8}/;
	if($("#birthday").val()=="") {
		$("#birthdayMsg").css("display","block");
		submitResult=false;
	} else if(!birthReg.test($("#birthday").val())) {
		$("#birthdayRegMsg").css("display","block");
		submitResult=false;
	}
	
	var phoneReg=/\d{10,12}/;
	if($("#phone").val()=="") {
		$("#phoneMsg").css("display","block");
		submitResult=false;
	} else if(!mobile2Reg.test($("#phone").val())) {
		$("#phoneRegMsg").css("display","block");
		submitResult=false;
	}
	
	if($("#zipcode").val()=="") {
		$("#zipcodeMsg").css("display","block");
		submitResult=false;
	}
	
	if($("#address1").val()=="") {
		$("#address1Msg").css("display","block");
		submitResult=false;
	}
	
	if($("#address2").val()=="") {
		$("#address2Msg").css("display","block");
		submitResult=false;
	}
	

	return submitResult;
});
</script>