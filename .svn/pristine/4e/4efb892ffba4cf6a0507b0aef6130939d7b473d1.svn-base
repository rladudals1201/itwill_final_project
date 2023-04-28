package site.itwill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.itwill.dao.Theatre2SeatDAO;
import site.itwill.dto.Theatre2Seat;

@Service
public class Theatre2SeatServiceImpl implements Theatre2SeatService {
	@Autowired
	private Theatre2SeatDAO theatre2SeatDAO;

	@Override
	public void addSeat(Theatre2Seat seat) {
		theatre2SeatDAO.insertSeat(seat);
	}

	@Override
	public void modifySeat(Theatre2Seat seat) {
		theatre2SeatDAO.updateSeat(seat);
	}

	@Override
	public void removeSeat(int seatNo) {
		theatre2SeatDAO.deleteSeat(seatNo);
	}

	@Override
	public Theatre2Seat getSeat(int seatNo) {
		Theatre2Seat seat=theatre2SeatDAO.selectSeat(seatNo);
		theatre2SeatDAO.selectSeat(seatNo);
		return seat;
	}

	@Override
	public List<Theatre2Seat> getSeatList() {
		return theatre2SeatDAO.selectSeatList();
	}

	@Override
	public void modifyOneSeat(int seatNo) {
	theatre2SeatDAO.updateOneSeat(seatNo);
		
	}

	@Override
	public void modifyZeroSeat(int seatNo) {
		theatre2SeatDAO.updateZeroSeat(seatNo);
		
	}
}
