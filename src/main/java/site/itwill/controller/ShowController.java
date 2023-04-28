package site.itwill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import site.itwill.exception.ShowNotFoundException;
import site.itwill.service.ShowService;
import site.itwill.service.Theatre1SeatService;
import site.itwill.service.Theatre2SeatService;

@Controller
@RequestMapping("/show")
public class ShowController {
	@Autowired
	private ShowService showService; 
	
	@Autowired
	private Theatre1SeatService theatre1SeatService;
	
	@Autowired
	private Theatre2SeatService theatre2SeatService;
	
	@RequestMapping(value = "/seat", method = RequestMethod.GET)
	public String seatView() {
		return "show/seat";
	}
	
	@RequestMapping(value = "/mainshow", method = RequestMethod.GET)
	public String showList(Model model) { 
		model.addAttribute("showList", showService.getShowList());
		
		return "show/mainshow";
	}
	
	@RequestMapping(value = "/showdetail", method = RequestMethod.GET)
	public String view(@RequestParam int showseq, Model model) throws ShowNotFoundException {
		model.addAttribute("show", showService.getShow(showseq));
		if(showService.getShow(showseq).getTheatre()==1) {
			model.addAttribute("seat", theatre1SeatService.getSeatList());
			model.addAttribute("seatPriceA", theatre1SeatService.getSeat(1));
			model.addAttribute("seatPriceB", theatre1SeatService.getSeat(11));
			model.addAttribute("seatPriceC", theatre1SeatService.getSeat(21));
		}
		else if(showService.getShow(showseq).getTheatre()==2) {
			model.addAttribute("seat", theatre2SeatService.getSeatList());
			model.addAttribute("seatPriceA", theatre2SeatService.getSeat(1));
			model.addAttribute("seatPriceB", theatre2SeatService.getSeat(11));
			model.addAttribute("seatPriceC", theatre2SeatService.getSeat(21));
		}
		return "show/showdetail";
	}
}
