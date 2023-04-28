package site.itwill.controller;




import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import site.itwill.dto.Users;
import site.itwill.exception.LoginAuthFailException;
import site.itwill.exception.UserinfoExistsException;
import site.itwill.exception.UserinfoNotFoundException;
import site.itwill.service.UsersService;

@Controller
@RequestMapping("/users")
public class UsersController {
	//Service Ŭ������ ��ϵ� Spring Bean�� �ʵ忡 ������ ó��
	// => Controller Ŭ������ �޼ҵ忡�� Service ��ü�� �޼ҵ� ȣ��
	@Autowired
	private UsersService usersService;
	
	//ȸ������ ������
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() throws Exception {
		return "users/join_form";
	}
	
	//ȸ������
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(@ModelAttribute Users users) throws UserinfoExistsException {
		usersService.addUsers(users);
		return "redirect:/users/login";
	}

	//�α��� ������
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "users/login";
	}
	
	//�α���
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute Users users, HttpSession session) 
			throws LoginAuthFailException, UserinfoNotFoundException {
		// => ���� ���� : LoginAuthFailException ���� �߻� - ���� ó�� �޼ҵ�� ���� ó��
		usersService.loginAuth(users);
		
		//���� ����(���� �̹߻�) - HttpSession ��ü�� ���� ���� ������ ��ü �Ӽ������� ����
		session.setAttribute("loginUsers", usersService.getUsers(users.getId()));
		
		return "redirect:/";
	}
	/*
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam String id, @RequestParam String passwd
			, Model model, HttpSession session) throws UserinfoNotFoundException {
		if(usersService.getUsers(id)==null || !usersService.getUsers(id).getPasswd().equals(passwd)) {
			model.addAttribute("message", "���̵� �Ǵ� ��й�ȣ�� ���� �ʽ��ϴ�.");
			model.addAttribute("id", id);
			return "users/login";
		}
		session.setAttribute("loginUsers", usersService.getUsers(id));
		String url=(String)session.getAttribute("url");
		
		if(url!=null) {
			return "users/redirect:/"+url;
		}
		return "/";
	}
	*/
	
	//�α׾ƿ� ó���ϴ� ��û ó�� �޼ҵ�
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
		
	@RequestMapping(value = "/mypage", method = RequestMethod.GET)
	public String mypage(HttpSession session) {
		return "users/mypage";
	}

	@RequestMapping(value = "/mypage", method = RequestMethod.POST)
	public String mypage(@ModelAttribute Users users, HttpSession session) throws UserinfoNotFoundException {
		Users loginUsers=(Users)session.getAttribute("loginUsers");

		return "users/mypage";
	}
		
	@RequestMapping(value = "/mypage/modify", method = RequestMethod.GET)
	public String mypageModify() {
		return "users/mypage_modify";
	}

	@RequestMapping(value = "/mypage/modify", method = RequestMethod.POST)
	public String mypageModify(@ModelAttribute Users users, HttpSession session) throws UserinfoNotFoundException {
		usersService.modifyUsers(users);
		
		Users loginUsers=usersService.getUsers(users.getId());
		session.setAttribute("loginUsers", loginUsers);
		return "redirect:/users/mypage";
	}
	
	@RequestMapping(value = "/mypage/delete")
	public String mypageDelete(@RequestParam String id, HttpSession session) throws UserinfoNotFoundException {
		usersService.removeUsers(id);
		session.removeAttribute("loginUsers");
		return "redirect:/";
	}
	
	@RequestMapping(value = "/findid", method = RequestMethod.GET)
	public String findid() {
		return "users/findid";

	}
	
	@RequestMapping(value = "/findid", method = RequestMethod.POST)
	public String findid(@RequestParam String email, @RequestParam String birthday
			,@ModelAttribute Users user, Model model) {
		System.out.println(user.getEmail());
		System.out.println(user.getBirthday());
		Users resultuser = usersService.getId(user);
		System.out.println(resultuser.getId());
		model.addAttribute("users", resultuser);
		
		return "users/id_check";
	}

	//ȸ������� ����ϴ� ��û ó�� �޼ҵ�
	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("usersList", usersService.getUsersList());
		return "users/list";
	}

	@ExceptionHandler(UserinfoExistsException.class)
	public String execeptionHandler(UserinfoExistsException exception, Model model) {
		model.addAttribute("message", exception.getMessage());
		model.addAttribute("users", exception.getUsers());
		return "users/join_form";
	}

	@ExceptionHandler(LoginAuthFailException.class)
	public String execeptionHandler(LoginAuthFailException exception, Model model) {
		model.addAttribute("message", exception.getMessage());
		model.addAttribute("id", exception.getId());
		return "users/login";
	}
}
