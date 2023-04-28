package site.itwill.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import site.itwill.service.ProductService;

@Controller
public class HomeController {
	@Autowired
	private ProductService productService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String main(Model model) {
		logger.info("/main.jsp");
		
		model.addAttribute("productList", productService.getCategoryProductList());
		return "main";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		logger.info("/company_hello.jsp");
		return "/basic/company_hello";
	}	
	
	@RequestMapping("/hello2")
	public String hello2() {
		logger.info("/company_hello2.jsp");
		return "/basic/company_hello2";
	}	
	
	@RequestMapping("/agreement")
	public String agreement() {
		return "/basic/agreement";
	}	
	@RequestMapping("/guide")
	public String guide() {
		return "/basic/guide";
	}		
	@RequestMapping("/privacy")
	public String privacy() {
		return "/basic/privacy";
	}		
	@RequestMapping("/qa")
	public String qa() {
		return "/basic/qa";
	}		
}
