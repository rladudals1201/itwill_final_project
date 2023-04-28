<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<style type="text/css">
#productList {
	width: 1000px;
	margin: 0 auto;
}

.product {
	padding: 10px 5px;
	border: 1px solid black;
	width: 300px;
	margin: 10px;
	text-align: center;
	float: left;
}

</style>

	<div class="category_edit_area mobile_img_adjust">
		<p xss="removed">
			<img src="${pageContext.request.contextPath }/images/smain.png" class="txc-image" xss="removed" >
		</p>
	</div>
	<form name="goodsSearchForm" id="goodsSearchForm" method="post">
		<input type="hidden" name="osearchtext">
		<input type="hidden" name="ship_grp_seq">
		<input type="hidden" name="event">
		<input type="hidden" name="gift">
		<input type="hidden" name="page" value="1">
		<input type="hidden" name="searchMode" value="catalog">
		<div id="filterResultCount">${fn:length(productList) }</div>		
		<input type="hidden" name="searchMode" value="catalog">
		<div id="filterResultCount"></div>
		<div class="search_filter_wrap" data-ezmark="undo">
			<ul id="searchFilter" class="search_filter no_filter devide0" style=""></ul>

			<ul id="filteredItemSorting" class="filtered_item_sorting">
				<li class="item_total"><a href="javascript:void(0)"id="btnFilterOpen" class="total"> <span class="num">${fn:length(productList) }</span>개</a></li>
			</ul>
		</div>
	</form>
	

<script type="text/javascript">
		$("#category").change(function() {
			$("#categoryForm").submit();
		});
</script>
<div id="productList">
<c:forEach var="product" items="${productList }">
		<div class="product">
		<div>${product.name }</div>
		<div>[${proudct.code }] ${product.color }</div>
		<div>
			<a href=" ${pageContext.request.contextPath}/product/product_view?num=${product.num }" class="prouct">
			<img src="${pageContext.request.contextPath }/images/product/${product.num }.png" width="200">
			</a>
		</div>
		<div>
			${product.price}원 
		</div>
		</div>
	</c:forEach>
		</div>

<div style="clear:both;"></div>