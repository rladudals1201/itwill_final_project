package site.itwill.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import site.itwill.dto.Bquestion;
import site.itwill.dto.Users;
import site.itwill.service.BquestionService;
import site.itwill.service.UsersService;
import site.itwill.util.Pager;

/*@RequestMapping(value = "/board")*/
@Controller
public class BquestionBoardController {

	@Autowired
	private BquestionService bquestionService;
	@Autowired
	private UsersService usersService;
	
	
	  @RequestMapping(value="/board/bquestion_list",method = RequestMethod.GET)
	  public String bquestionBoard(Model model) {
			List<Bquestion> list=bquestionService.getQuestionList();
			model.addAttribute("list",list);
	  return "/board/bquestion_list";
	  } 
	 
	@RequestMapping(value="/board/bquestion_list", method = RequestMethod.POST)
	public String bquestionA(@ModelAttribute Bquestion bquestion, Model model) {
		/* bquestionService.addQuestionBoard(bquestion); */
		List<Bquestion> list=bquestionService.getQuestionList();
		model.addAttribute("list",list);
		
		return "/board/bquestion_list";
	}
		
	
	
	/* 게시글 페이징 
	@RequestMapping(value = "/bquestion_list", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> bquestionList(@RequestParam(defaultValue = "1") int pageNum) {
		int totalBoard = bquestionService.getQuestionBoardCount();
		int pageSize = 5;
		int blockSize = 5;

		Pager pager = new Pager(pageNum, totalBoard, pageSize, blockSize);

		Map<String, Object> pagerMap = new HashMap<String, Object>();
		pagerMap.put("startRow", pager.getStartRow());
		pagerMap.put("endRow", pager.getEndRow());

		Map<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("bquestionList", bquestionService.getQuestionBoardList(pagerMap));
		returnMap.put("pager", pager);

		return returnMap;
	}
	*/
	/*
	 * 게시글 추가
	 * 
	 * @RequestMapping(value = "/board_add", method = RequestMethod.POST)
	 * 
	 * @ResponseBody public String bquestionAdd(@RequestBody Bquestion bquestion,
	 * HttpSession session, Model model) {
	 * bquestion.setQcontent(HtmlUtils.htmlEscape(bquestion.getQcontent()));
	 * bquestionService.addQuestionBoard(bquestion);
	 * 
	 * Users loginUsers=(Users) session.getAttribute("loginUsers");
	 * 
	 * model.addAttribute("qname",loginUsers.getName());
	 * model.addAttribute("qemail",loginUsers.getEmail());
	 * 
	 * return "board/bquestion_main"; }
	 */

	/* 게시글 보기 */
	@RequestMapping(value = "/board/bquestion_view", method = RequestMethod.GET)
	public String bquestionView(@RequestParam("qno") int qno, Model model) {
		model.addAttribute("bquestion", bquestionService.getQuestionBoard(qno));
		return "/board/bquestion_view";
		
	}



	/* 게시글 수정 */
	@RequestMapping(value = "/board/bquestion_update", method =  RequestMethod.GET)
	public String bquestionModify(@RequestParam("qno") int qno, Model model) {
		model.addAttribute("bquestion", bquestionService.getQuestionBoard(qno));
		return "/board/bquestion_update";
	}

	/* 게시글 수정 */
	@RequestMapping(value = "/board/bquestion_update", method =  RequestMethod.POST)
	public String bquestionModify(@ModelAttribute Bquestion bquestion) {
		bquestionService.modifyQuestionBoard(bquestion);
		return "redirect:/board/bquestion_list?qno="+bquestion.getQno();
	}

	/* 게시글 삭제 */
	@RequestMapping(value = "/board_remove", method = RequestMethod.POST)
	@ResponseBody
	public String deleteCart(@RequestParam("qno") int qno) {
		bquestionService.removeQuestionBoard(qno);
		
		return "redirect:/board/bquestion_list";
		}
	

	/* 1:1 문의 */
	@RequestMapping(value = "/board/bquestion", method = RequestMethod.GET)
	public String bquestion(@ModelAttribute Users users, Bquestion bquestion, HttpSession session  ) {
		 Users loginUsers=(Users)session.getAttribute("loginUsers");
	
		return "/board/bquestion";

	}
	@RequestMapping(value = "/board/bquestion", method = RequestMethod.POST)
	public String bquestionAdd(@ModelAttribute Bquestion bquestion, Model model) {

		bquestionService.addQuestionBoard(bquestion);
		return "redirect:/board/bquestion_list";
		
	}
}
