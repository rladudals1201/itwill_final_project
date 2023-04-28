package site.itwill.controller;


import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import site.itwill.service.ProductService;
import site.itwill.service.RestBoardService;
import site.itwill.util.Pager;
import site.itwill.dto.RestBoard;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@Autowired
	private RestBoardService restBoardService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/product") 
	public String main(Model model) {
		logger.info("/product.jsp");
		model.addAttribute("productList", productService.getCategoryProductList());
		return "/product/product";
	}	
	
	@RequestMapping(value = "/product_view",method = RequestMethod.GET)
	public String view(@RequestParam int num, Model model) {
		logger.info("/product_view.jsp");
		model.addAttribute("product", productService.getProduct(num));
		//board.setContent(HtmlUtils.htmlEscape(board.getContent()));
		//restBoardService.addRestBoard(board);
		//return "success";
		return "product/product_view2" ;
		
	}
	
	@RequestMapping(value = "/board_list", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> restBoardList(@RequestParam(defaultValue = "1") int pageNum) {
		//System.out.println("pageNum = "+pageNum);
		
		//REST_BOARD 테이블에 저장된 게시글 갯수를 반환받아 저장
		int totalBoard=restBoardService.getRestBoardCount();
		int pageSize=5;//페이지에 출력될 게시글의 갯수 저장
		int blockSize=5;//페이지 블럭에 출력될 페이지의 갯수 저장
		
		//페이징 관련 값을 제공하는 Pager 객체를 생성하여 저장
		Pager pager=new Pager(pageNum, totalBoard, pageSize, blockSize);
		
		//Service 클래스의 메소드 호출을 위해 매개변수에 전달하기 위한 Map 객체 생성
		// => 요청 페이지의 시작 행번화와 종료 행번호를 Map 객체의 엔트리로 저장하여 SQL 명령에 제공
		Map<String, Object> pagerMap=new HashMap<String, Object>();
		pagerMap.put("startRow", pager.getStartRow());
		pagerMap.put("endRow", pager.getEndRow());
		
		//요청 처리 메소드의 반환값으로 사용되는 Map 객체 생성
		// => 게시글 목록과 페이징 관련 값을 Map 객체의 엔트리로 저장하여 반환 - JSON 
		Map<String, Object> returnMap=new HashMap<String, Object>();
		returnMap.put("restBoardList", restBoardService.getRestBoardList(pagerMap));
		returnMap.put("pager", pager);
		
		return returnMap;
	}
	
	//게시글을 전달받아 REST_BOARD 테이블에 저장하고 일반 텍스트 결과를 응답하는 요청 처리 메소드
	// => @RequestBody 어노테이션을 이용하여 JSON 형식의 전달값을 Java 객체의 필드값으로 저장
	@RequestMapping(value = "/board_add", method = RequestMethod.POST)
	@ResponseBody
	public String restBoardAdd(@RequestBody RestBoard board) {
		
		//HtmlUtils.htmlEscape(String str) : 전달받은 문자열에서 태그 관련 문자를 
		//Escape 문자로 변환하여 반환하는 메소드 - XSS 공격에 대한 방어
		board.setContent(HtmlUtils.htmlEscape(board.getContent()));
		restBoardService.addRestBoard(board);
		return "success";
	}
	
	/*
	//글번호를 전달받아 REST_BOARD 테이블에 저장된 해당 게시글을 검색하여 JSON으로 응답하는 요청 처리 메소드
	// => QueryString을 이용하여 글번호 전달
	@RequestMapping(value = "/board_view", method = RequestMethod.GET)
	@ResponseBody
	public RestBoard restBoardView(@RequestParam int num) {
		return restBoardService.getRestBoard(num);
	}
	*/
	
	//글번호를 전달받아 REST_BOARD 테이블에 저장된 해당 게시글을 검색하여 JSON으로 응답하는 요청 처리 메소드
	// => URL 주소를 이용하여 글번호 전달
	//매핑된 URL 주소에 {변수명} 형식으로 값을 표현하여 요청
	// => @PathVariable 어노테이션을 이용하여 값으로 전달받아 사용 
	// => 고유값을 전달받아 검색하거나 삭제할 경우 사용
	@RequestMapping(value = "/board_view/{no}", method = RequestMethod.GET)
	@ResponseBody
	//@PathVariable : URL 주소로 표현된 값을 전달받아 매개변수에 저장하는 어노테이션
	// => 요청 URL 주소에 표현된 변수명과 매개변수의 이름을 동일하게 선언해야만 값을 전달받아 저장
	// => @PathVariable 어노테이션의 value 속성값으로 요청 URL 주소에 표현된 변수명 설정 가능
	public RestBoard restBoardView(@PathVariable int no) {
		return restBoardService.getRestBoard(no);
	}

	//게시글을 전달받아 REST_BOARD 테이블에 저장된 게시글을 변경하고 일반 텍스트 결과를 응답하는 요청 처리 메소드
	// => 요청방식이 여러 개인 경우 method 속성값을 {} 안에 나열하여 작성 
	@RequestMapping(value = "/board_modify", method = {RequestMethod.PUT, RequestMethod.PATCH})
	@ResponseBody
	public String restBoardModify(@RequestBody RestBoard board) {
		restBoardService.modifyRestBoard(board);
		return "success";
	}
	
	//글번호를 전달받아 REST_BOARD 테이블에 저장된 게시글을 삭제하고 일반 텍스트 결과를 응답하는 요청 처리 메소드
	@RequestMapping(value = "/board_remove/{no}", method = RequestMethod.DELETE)
	@ResponseBody
	public String restBoardRemove(@PathVariable int no) {
		restBoardService.removeRestBoard(no);
		return "success"; 
	}
} 
 