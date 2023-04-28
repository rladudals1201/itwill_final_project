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


<div id="productList">
	<h2 align="center">제품목록</h2>
	
	<table id="btnDivv">
		<tr>
			<td>제품코드</td>
			<td class="pname">제품명</td>
			<td>제품수량</td>
			<td>제품색상</td>
			<td>제품가격</td>
		</tr>

		<c:forEach var="product" items="${productList }">
		<tr>
			<td>[${proudct.code }] </td>
			<td>
				<a href="${pageContext.request.contextPath }/admin/aproduct_view?num=${product.num }" class="user">
							${product.name }
				</a>
			</td>
			<td>${product.qty }</td>
			<td>${product.color }</td>
			<td>${product.price }</td>
		</tr>
		</c:forEach>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td><input type="button" id="btnDivvv" value="제품등록" onclick="location.href='${pageContext.request.contextPath }/admin/product_add';"/></td>
		</tr>
	</table>
</div>
	<div>&nbsp;</div>
	<!-- action 속성이 생략된 경우 현재 URL 주소의 웹문서를 재요청(자기자신) -->



<script type="text/javascript">


$("#category").change(function() {
	$("#categoryForm").submit();
});

</script>


















