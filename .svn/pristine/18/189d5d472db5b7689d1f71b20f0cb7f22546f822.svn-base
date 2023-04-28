package site.itwill.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import site.itwill.dto.Product;
import site.itwill.dto.Users;
import site.itwill.exception.LoginAuthFailException;
import site.itwill.exception.NotEnoughQtyException;
import site.itwill.exception.UserinfoExistsException;
import site.itwill.exception.UserinfoNotFoundException;
import site.itwill.service.ProductService;
import site.itwill.service.UsersService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private UsersService usersService;

	@Autowired
	private WebApplicationContext context;
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/admin_main", method = RequestMethod.GET)
	public String amain() throws Exception {
		return "/admin/admin_main";
	}
	
	
	@RequestMapping(value = "/aproduct")
	public String aproduct(Model model) {
		model.addAttribute("productList", productService.getCategoryProductList());
		return "/admin/aproduct";
	}
	
	@RequestMapping(value = "/aproduct_view")
	public String view(@RequestParam int num, Model model) {
		model.addAttribute("product", productService.getProduct(num));
		return "admin/product_detail";
	}	
	
	@RequestMapping(value = "/product_add", method = RequestMethod.GET)
	public String add() {
		return "/admin/product_add";
	}
	@RequestMapping(value = "/product_add", method = RequestMethod.POST)
	public String fileUpload(@ModelAttribute Product product, 
							HttpServletRequest req ) throws IllegalStateException, IOException {

		String uploadDir=context.getServletContext().getRealPath("/WEB-INF/upload");
//		String uploadDir = req.getServletContext() + File.separator + "upload";
//		String uploadDir = "C:/Users/lunat/eclipse-workspace/final_project/src/main/webapp/upload";
		
//		System.out.println(new File("").getAbsolutePath());
		
		//전달파일명을 반환받아 저장
		String origin=product.getFile().getOriginalFilename();
		
		//업로드 파일명을 고유값(TimeStamp)으로 설정하여 저장
		// => 업로드 파일이 중복되지 않도록 작성
		String upload=System.currentTimeMillis()+"";
		
		System.out.println(uploadDir);
		//파일 업로드
		product.getFile().transferTo(new File(uploadDir, upload));
		
		//DTO 클래스의 필드값 변경
		product.setImage(origin);
		product.setImage2(upload);
		
		productService.addProduct(product);
		
		return "redirect:/admin/aproduct";
	} 

	@RequestMapping(value = "/product_delete")
	public String productdel(@RequestParam int num, HttpSession session)  {
		productService.removeProduct(num);
		
		return "/admin/aproduct";
	}
	
	@RequestMapping(value = "/product_modify", method = RequestMethod.GET)
	public String productmo(@RequestParam int num, Model model) {
		model.addAttribute("product", productService.getProduct(num));
		return "admin/product_modify";
	}
	
	@RequestMapping(value = "/product_modify", method = RequestMethod.POST)
	public String productmo2(@ModelAttribute Product product, HttpSession session) throws NotEnoughQtyException {
		productService.modifyProduct(product);	
		
		return "redirect:/admin/product_modify?num="+product.getNum();
	}
	
	
	@ExceptionHandler(LoginAuthFailException.class)
	public String execeptionHandler(LoginAuthFailException exception, Model model) {
		model.addAttribute("message", exception.getMessage());
		model.addAttribute("id", exception.getId());
		return "users/login";
	}
	@ExceptionHandler(UserinfoExistsException.class)
	public String execeptionHandler(UserinfoExistsException exception, Model model) {
		model.addAttribute("message", exception.getMessage());
		model.addAttribute("users", exception.getUsers());
		return "users/join_form";
	}
	
	
	//////////////////////////////////// 상품 끝 // 유져 시작
	@RequestMapping(value = "/ausers", method = RequestMethod.GET)
	public String ausers(Model model) {
		model.addAttribute("usersList", usersService.getUsersList());
		return "/admin/ausers";
	}
	
	@RequestMapping(value = "/ausers", method = RequestMethod.POST)
	public String productmo2(@ModelAttribute Users user, HttpSession session) throws UserinfoNotFoundException {
		usersService.modifyUsers(user);	
		
		System.out.println("aaaaaaaaaaaaaaaaaaa");
		System.out.println(user.getId());
		System.out.println(user.getStatus());
		
		return "admin/admin_main";
	}
	
	@RequestMapping(value = "/users_view", method = RequestMethod.GET)
	public String usermo(@RequestParam String id, Model model) throws UserinfoNotFoundException {
		model.addAttribute("users", usersService.getUsers(id));
		return "users/users_view";
	}

	@RequestMapping(value = "/users_view", method = RequestMethod.POST)
	public String usermo(@ModelAttribute Users users, HttpSession session) throws UserinfoNotFoundException {
		usersService.modifyUsers(users);
		
		Users loginUsers=usersService.getUsers(users.getId());
		session.setAttribute("loginUsers", loginUsers);
		return "admin/admin_main";
	}
}