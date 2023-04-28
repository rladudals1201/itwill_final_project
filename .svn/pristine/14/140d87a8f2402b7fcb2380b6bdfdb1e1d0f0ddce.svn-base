<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<style type="text/css">
#product {
	width : 800px;
	margin: 0 auto;
}

table {
	margin: 0 auto;
}

td {
	text-align: left;
}
</style>

<div id="product">
	<h2 align="center">제품등록</h2>
	<form action="${pageContext.request.contextPath }/admin/product_add" enctype="multipart/form-data" method="post" id="productForm" name="productForm"> 
	<table>
		<tr>
			<td>제품코드</td>
			<td>
				<select name="code" id="code">
					<option value="A" selected="selected">머그컵</option>
					<option value="B">화보</option>
					<option value="C">기타</option>
				</select>
			</td>
		</tr>
		<tr>	
			<td>제품명</td>
			<td>
				<input type="text" name="name"  id="name">
			</td>
		</tr>	
		<tr>
			<td>제품색상</td>
			<td>
				<select name="color" id="color">
					<option value="RED" selected="selected">빨강</option>
					<option value="GREEN">초록</option>
					<option value="YELLOW">노랑</option>
				</select>
			</td>
		</tr>		
		<tr>	
			<td>제품이미지</td>
			<td>
				<input type="file" name="file" id="file">
			</td>
			
		</tr>
		<tr>	
			<td>제품상세설명</td>
			<td>
				<textarea rows="7" cols="60" name="detail" id="detail"></textarea>
			</td>
		</tr>
		<tr>
			<td>제품수량</td>
			<td>
				<input type="text" name="qty" id="qty" >
			</td>
		</tr>
		<tr>
			<td>제품가격</td>
			<td>
				<input type="text" name="price" id="price" >
				<button type="submit" class="btn_resp size_login1" id="login_btn" style="align:center;" >제품등록</button>
				<input type="button" value="목록" onClick="location.href='${pageContext.request.contextPath }/admin/aproduct';">
			</td>
		</tr>
				
	

	</table>
	</form>
	
	<div>
	</div>
	<div id="message" style="color:red;">${message }</div>
</div>
	
		
		
<script type="text/javascript">
$("#productForm").submit(function() {
	if($("#code").val()=="") {
		$("#message").text("제품코드를 입력해 주세요.");
		$("#code").focus();
		return false;
	}
	if($("#name").val()=="") {
		$("#message").text("제품명을 입력해 주세요.");
		$("#name").focus();
		return false;
	}
	if($("#file").val()=="") {
		$("#message").text("제품이미지를 입력해 주세요.");
		$("#file").focus();
		return false;
	}
	if($("#detail").val()=="") {
		$("#message").text("제품상세설명을 입력해 주세요.");
		$("#detail").focus();
		return false;
	}
	if($("#qty").val()=="") {
		$("#message").text("제품수량을 입력해 주세요.");
		$("#qty").focus();
		return false;
	}
	if($("#price").val()=="") {
		$("#message").text("제품가격을 입력해 주세요.");
		$("#price").focus();
		return false;
	}

});

</script>


