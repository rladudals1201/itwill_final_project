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

#modifyBtn {
	color: red;
}

#removeBtn {
	color: blue;
}
</style>

<h2 align="center">제품상세정보</h2>

<table> 
	<tr>
		<td class="title">제품코드</td>
		<td class="value">${product.code }</td>
	</tr>
	<tr>
		<td class="title">제품명</td>
		<td class="value">${product.name }</td>
	</tr>
	<tr>
		<td class="title">제품색상</td>
		<td class="value">${product.color }</td>
	</tr>
	<tr>
		<td class="title">제품이미지</td>
		<td class="value"><img src="${pageContext.request.contextPath }/images/product/${product.num}.png" width="200"></td>
	</tr>
	<tr>
		<td class="title">상세설명</td>
		<td class="value">${product.detail }</td>
	</tr>
	<tr>
		<td class="title">제품수량</td>
		<td class="value">${product.qty }</td>
	</tr>
	<tr>
		<td class="title">제품가격</td>
		<td class="value">${product.price }</td>
	</tr>
	<tr>
		<td></td>
		<td><button type="button" id="modifyBtn">제품정보변경</button>
		<button type="button" id="removeBtn">제품정보삭제</button>
		<input type="button" value="목록" onClick="location.href='${pageContext.request.contextPath }/admin/aproduct';"></td>
	</tr>
</table>

<p>
	
	
	
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
