package site.itwill.controller;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import site.itwill.dto.Reservation;
import site.itwill.dto.SeatReserve;
import site.itwill.dto.Theatre1Seat;
import site.itwill.dto.Theatre2Seat;
import site.itwill.dto.Users;
import site.itwill.exception.UserinfoNotFoundException;
import site.itwill.service.SeatReserveService;
import site.itwill.service.Theatre1SeatService;
import site.itwill.service.Theatre2SeatService;


@Controller
public class ReserveController {
	
	@Autowired
	SeatReserveService seatReserveService;
	@Autowired
	Theatre1SeatService theatre1SeatService;
	
	@Autowired
	Theatre2SeatService theatre2SeatService;

	@RequestMapping(value = "reserve/reserve", method = RequestMethod.GET)
	public String Reserve(Model model, HttpSession session) throws UserinfoNotFoundException{
		
		Users loginUsers = (Users)session.getAttribute("loginUsers");
		if(loginUsers == null) {
			throw new UserinfoNotFoundException("비회원입니다.");
		}
		
		model.addAttribute("reserveList", seatReserveService.getReserve(loginUsers.getId()));
		return "/reserve/reserve";
	}

	@RequestMapping(value = "reserve/reserve_add", method = RequestMethod.POST)
	@ResponseBody
	public String ReserveAdd(@RequestParam int theatreNo, @RequestParam String seatList,@RequestBody SeatReserve seatReserve,HttpSession session) throws UserinfoNotFoundException {
		Users loginUsers = (Users)session.getAttribute("loginUsers");
		if(loginUsers == null) {
			throw new UserinfoNotFoundException("비회원입니다.");
		}
		String [] seatArray = seatList.split(",");
		
		if(theatreNo==1) {
			for(int i = 0 ; i < seatArray.length; i++) {
				Theatre1Seat seat = theatre1SeatService.getSeat(Integer.parseInt(seatArray[i]));
				SeatReserve reserve = new SeatReserve();			
				reserve.setId(loginUsers.getId());
				reserve.setTitle(seatReserve.getTitle());
				reserve.setTheatre(1);
				reserve.setSeatNo(Integer.parseInt(seatArray[i]));			
				reserve.setSeatStatus(theatre1SeatService.getSeat(Integer.parseInt(seatArray[i])).getSeatStatus());			
				reserve.setSeatLvl(theatre1SeatService.getSeat(Integer.parseInt(seatArray[i])).getSeatLvl());
				reserve.setSeatPrice(theatre1SeatService.getSeat(Integer.parseInt(seatArray[i])).getSeatPrice());
				reserve.setShowTime(seatReserve.getShowTime());
				
				theatre1SeatService.modifyZeroSeat(seat.getSeatNo());
				seatReserveService.addSeatReserve(reserve);
					
				
			}
		}else {
			for(int i = 0 ; i < seatArray.length; i++) {
				Theatre2Seat seat = theatre2SeatService.getSeat(Integer.parseInt(seatArray[i]));
				SeatReserve reserve = new SeatReserve();			
				reserve.setId(loginUsers.getId());
				reserve.setTitle(seatReserve.getTitle());
				reserve.setTheatre(2);
				reserve.setSeatNo(Integer.parseInt(seatArray[i]));			
				reserve.setSeatStatus(theatre2SeatService.getSeat(Integer.parseInt(seatArray[i])).getSeatStatus());			
				reserve.setSeatLvl(theatre2SeatService.getSeat(Integer.parseInt(seatArray[i])).getSeatLvl());
				reserve.setSeatPrice(theatre2SeatService.getSeat(Integer.parseInt(seatArray[i])).getSeatPrice());
				reserve.setShowTime(seatReserve.getShowTime());
			
				theatre2SeatService.modifyZeroSeat(seat.getSeatNo());
				seatReserveService.addSeatReserve(reserve);
			}
		}
		return "success";
		
	}
	@RequestMapping(value = "reserve/reserve_delete", method = RequestMethod.GET)
	public String Reserve(@RequestParam int reserveseq, HttpSession session) throws UserinfoNotFoundException{
		
		Users loginUsers = (Users)session.getAttribute("loginUsers");
		if(loginUsers == null) {
			throw new UserinfoNotFoundException("비회원입니다.");
		}
		SeatReserve reserve= seatReserveService.getReserveSeq(reserveseq);
		
		if(reserve.getTheatre()==1) {	
			
			Theatre1Seat seat =  theatre1SeatService.getSeat(reserve.getSeatNo());
			
			theatre1SeatService.modifyOneSeat(seat.getSeatNo());
		} else {
			Theatre2Seat seat =  theatre2SeatService.getSeat(reserve.getSeatNo());
			
			theatre2SeatService.modifyOneSeat(seat.getSeatNo());
		}
		
		seatReserveService.removeReserve(reserveseq);
		return "redirect:/reserve/reserve";
	}
	@ExceptionHandler(UserinfoNotFoundException.class)
	public String execeptionHandler(UserinfoNotFoundException exception, Model model) {
		
		return "redirect:/users/login";
	}
	
	
	
}
