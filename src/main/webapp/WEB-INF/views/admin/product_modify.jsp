
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<style type="text/css">
table {
	margin: 0 auto;
	border: 1px solid black;
	border-collapse: collapse;
}

td {
	border: 1px solid black;
}

.title {
	background: black;
	color: white;
	text-align: center;
	width: 100px;
}

.value {
	padding: 3px;
	text-align: left;
	width: 400px;
}
</style>
<script type="text/javascript">
function userModify() {
	if ( f.name.value == "" ) {
		alert("이름을 입력하십시요.");
		f.name.focus();
		return false;
	}
	f.action = "${pageContext.request.contextPath }/admin/product_modify?num=${product.num }";
	f.submit();
}
</script>

<h2>제품상세정보</h2>
<form name="f" method="post">
<table>
	<tr>
		<td class="title">제품코드</td>
		<td class="value"><input type="text" style="width:240" name="code" value="${product.code }"></td>
	</tr>
	<tr>
		<td class="title">제품명</td>
		<td class="value"><input type="text" style="width:240" name="name" value="${product.name }"></td>
	</tr>
	<tr>
		<td class="title">제품색상</td>
		<td class="value"><input type="text" style="width:240" name="color" value="${product.color }"></td>
	</tr>
	<tr>
		<td class="title">제품이미지</td>
		<td class="value"><img src="${pageContext.request.contextPath }/images/product/${product.num}.png" width="200"></td>
	</tr>
	<tr>
		<td class="title">상세설명</td>
		<td class="value"><input type="text" style="width:240" name="detail" value="${product.detail }"></td>
	</tr>
	<tr>
		<td class="title">제품수량</td>
		<td class="value"><input type="text" style="width:240" name="qty" value="${product.qty }"></td>
	</tr>
	<tr>
		<td class="title">제품가격</td>
		<td class="value"><input type="text" style="width:240 " name="price" value="${product.price }"></td>
	</tr>
</table>
</form>
<p>
	<input type="button" value="수정" onClick="userModify();">
	<input type="button" value="목록" onClick="location.href='${pageContext.request.contextPath }/admin/aproduct';">
</p>

<script type="text/javascript">
$("#modifyBtn").click(function() {
	location.href="${pageContext.request.contextPath }/admin/product_modify?num=${product.num }";	
});

$("#removeBtn").click(function() {
	if(confirm("현재 제품정보를 삭제 하겠습니까?")) {
		location.href="${pageContext.request.contextPath }/admin/product_delete?num=${product.num }";
	}
});


</script>
