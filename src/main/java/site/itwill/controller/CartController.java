package site.itwill.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import site.itwill.dto.Cart;
import site.itwill.dto.Users;
import site.itwill.exception.UserinfoNotFoundException;
import site.itwill.service.CartService;

@Controller
public class CartController {
	@Autowired
	CartService cartService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/cart/cart")
	public String cart(Model model,HttpSession session) throws UserinfoNotFoundException {
		Users loginUsers = (Users)session.getAttribute("loginUsers");
		if(loginUsers == null) {
			throw new UserinfoNotFoundException("비회원입니다.");
		}
		model.addAttribute("cartList",cartService.getCartList());
		return "cart/cart";
	}
	@RequestMapping(value="/cart/cart_add",method=RequestMethod.POST)
	public String cartAdd(@ModelAttribute Cart cart,HttpSession session) throws UserinfoNotFoundException {
		
		Users loginUsers = (Users)session.getAttribute("loginUsers");
		if(loginUsers == null) {
			throw new UserinfoNotFoundException("비회원입니다.");
		}
		cartService.addCart(cart);
		session.setAttribute("cartList",cartService.getCartList());
		return "redirect:/cart/cart";
	}
	@RequestMapping(value="/cart/cart_delete",method=RequestMethod.GET)
	public String cartDelete(@RequestParam String cartNo,HttpSession session) throws UserinfoNotFoundException {
		
		Users loginUsers = (Users)session.getAttribute("loginUsers");
		if(loginUsers == null) {
			throw new UserinfoNotFoundException("비회원입니다.");
		}
		cartService.removeCart(Integer.parseInt(cartNo));
		session.setAttribute("cartList",cartService.getCartList());
		return "redirect:/cart/cart";
	}
		
	
	@ExceptionHandler(UserinfoNotFoundException.class)
	public String execeptionHandler(UserinfoNotFoundException exception, Model model) {
		return "redirect:/users/login";	
	
}
	
	

}
