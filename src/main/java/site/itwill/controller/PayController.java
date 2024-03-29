package site.itwill.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import site.itwill.dao.PayDAO;
import site.itwill.dto.Cart;
import site.itwill.dto.Pay;
import site.itwill.dto.PayProduct;
import site.itwill.dto.Product;
import site.itwill.dto.Users;
import site.itwill.exception.NotEnoughQtyException;
import site.itwill.exception.UserinfoNotFoundException;
import site.itwill.service.CartService;
import site.itwill.service.PayService;
import site.itwill.service.ProductService;

@Controller
public class PayController {
	@Autowired
	PayService payService;
	@Autowired
	ProductService productService;
	@Autowired
	CartService cartService;
	
	@RequestMapping(value="/pay/payPage", method=RequestMethod.GET)
	public String cartPayPage(HttpSession session,Model model,@RequestParam String cartNo,HttpServletRequest request) throws UserinfoNotFoundException {
		Users loginUsers = (Users)session.getAttribute("loginUsers");
		if(loginUsers == null) {
			throw new UserinfoNotFoundException("비회원입니다.");
		}
		Cart product = cartService.getCart(Integer.parseInt(cartNo));
		request.setAttribute("cartNo", cartNo);
		model.addAttribute("product", product);
		
		return "pay/payPage";		
	}	
	
	@RequestMapping(value="/pay/payPage", method=RequestMethod.POST)
	public String payPage(HttpSession session ,Model model,@RequestParam String id, @ModelAttribute PayProduct product) throws UserinfoNotFoundException {
		Users loginUsers = (Users)session.getAttribute("loginUsers");
		if(loginUsers == null) {
			throw new UserinfoNotFoundException("비회원입니다.");
		}
		model.addAttribute("product", product);
		
		return "pay/payPage";		
	}	
	
	
	@RequestMapping(value="/pay/pay", method=RequestMethod.POST)
	public String pay(HttpSession session,Model model,@RequestParam String id, @ModelAttribute PayProduct product,HttpServletRequest request) throws NotEnoughQtyException, UserinfoNotFoundException {
		Users loginUsers = (Users)session.getAttribute("loginUsers");
		if(loginUsers == null) {
			throw new UserinfoNotFoundException("비회원입니다.");
		}

		Product selectProduct = productService.getProduct(product.getNum());
		
		Pay pay = new Pay();
		pay.setId(id);
		pay.setPayStatus(1);
		pay.setPrice(product.getPrice());
		pay.setPayDetail(product.getName()+" "+product.getQty()+"개");
		
		selectProduct.setQty(selectProduct.getQty()-product.getQty());
		if(selectProduct.getQty()-product.getQty() < 0) {
			throw new NotEnoughQtyException("주문 수량이 재고보다 많습니다.");
			
		}
		productService.modifyProduct(selectProduct);
		String cartNo = request.getParameter("cartNo");
		if(!cartNo.equals("")&& cartNo!=null ) {
			
			cartService.removeCart(Integer.parseInt(cartNo));
		}
		payService.addPay(pay);
		return "redirect:/history/history";		
	}	
	
	
	
	@RequestMapping("/history/history")
	public String History(HttpSession session, Model model) throws UserinfoNotFoundException {
		Users loginUsers = (Users)session.getAttribute("loginUsers");
		if(loginUsers == null) {
			throw new UserinfoNotFoundException("비회원입니다.");
		}
		String id = loginUsers.getId();
		List<Pay> payList = payService.getPayList(id); 
		model.addAttribute("payList",payList);
		return "history/history";		
	}	
	
	
	@ExceptionHandler(UserinfoNotFoundException.class)
	public String UserexeceptionHandler(UserinfoNotFoundException exception, Model model) {
		return "redirect:/users/login";	
	
	}
	@ExceptionHandler(NotEnoughQtyException.class)
	public String QtyexeceptionHandler(NotEnoughQtyException exception, Model model) {
		return "/error/qtyerror";	
		
	}
	
}
