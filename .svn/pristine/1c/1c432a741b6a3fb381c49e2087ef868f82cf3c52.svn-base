<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style type="text/css">
#product {
	width: 800px;
	margin: 10px auto;
}	

#btnDiv {
	text-align: right;
	margin-bottom: 5px;
}

table {
	border: 1px solid black;
	border-collapse: collapse;
}

td {
	border: 1px solid black;
	text-align: center;
	width: 200px;
}

.pname { width: 400px; }

td a, td a:visited {
	text-decoration: none;
}

td a:hover {
	text-decoration: underline;
	color: blue;
}

#btnDiv {
	margin: 0 auto;
}

#btnDivv {
margin: 0 auto;
}

#btnDivvv {
margin: 0 auto;
}

</style>
<script type="text/javascript">
function userModify() {
	if ( f.name.value == "" ) {
		alert("이름을 입력하십시요.");
		f.name.focus();
		return false;
	}
	f.action = "${pageContext.request.contextPath }/admin/ausers";
	f.submit();
	
	$("#modifyBtn").click(function() {
		location.href="${pageContext.request.contextPath }/admin/users_view?id=${users.id }";	
	});	
}
</script>

<div id="usersList">
	<h2 align="center">제품목록</h2>
	<form name="f" method="post">
	<table id="btnDivv">
		<tr>
			<td>ID</td>
			<td class="pname">이름</td>
			<td>생년월일</td>
			<td>이메일</td>
			<td>가입일</td>
			<td>등급</td>
		</tr>

		<c:forEach var="users" items="${usersList }">
		<tr>
			<td>${users.id }</td>
			<td>
				<a href="${pageContext.request.contextPath }/admin/users_view?id=${users.id }" class="user">
							${users.name }
				</a>
			</td>
			<td>${users.birthday }</td>
			<td>${users.email }</td>
			<td>${users.joinDate}</td>
			<td class="member_status">
			<select class="status" name="status" id="status" onchange="yo(this.value,'${users.id }')">
				<option value="1" <c:if test="${users.status eq 1}" > selected="selected" </c:if>>
					일반회원
				</option>
				<option value="9" <c:if test="${users.status eq 9}" > selected="selected" </c:if>>
					관리자
				</option>
			</select>
		</td>
		</tr>
		</c:forEach>

	</table>
	</form>
	<form name="yo2"  method="post">
		<input type="hidden" name="status" id="status2">
		<input type="hidden" name="id" id="id2">
	</form>
</div>

<script type="text/javascript">
function yo(value, value2) {
	$("#status2").val(value);
	$("#id2").val(value2);
	var form2 = document.yo2;
	form2.action = "${pageContext.request.contextPath }/admin/ausers";
	form2.submit();
}



</script>
	<div>&nbsp;</div>
	<!-- action 속성이 생략된 경우 현재 URL 주소의 웹문서를 재요청(자기자신) -->



<script type="text/javascript">


$("#category").change(function() {
	$("#categoryForm").submit();
});

</script>
