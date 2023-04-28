<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form name="relogina" method="post">
	<h3 class="title_sub6" style="text-align:center"> 아이디 = ${users.id } </h3>
	<p class="input_area" style="text-align:center">

		<button type="button" onclick="relogin()" class="btn_resp size_b color2">돌아가기<br><br></button>
		<br>
		
	</p>
</form>
<script type="text/javascript">
function relogin() {
	relogina.action="${pageContext.request.contextPath }/users/login";
	relogina.submit();
}
</script>