package site.itwill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.itwill.dao.Theatre1SeatDAO;
import site.itwill.dto.Theatre1Seat;

@Service
public class Theatre1SeatServiceImpl implements Theatre1SeatService {
	@Autowired
	private Theatre1SeatDAO theatre1SeatDAO;

	@Override
	public void addSeat(Theatre1Seat seat) {
		theatre1SeatDAO.insertSeat(seat);
	}

	@Override
	public void modifySeat(Theatre1Seat seat) {
		theatre1SeatDAO.updateSeat(seat);
		
	}

	@Override
	public void removeSeat(int seatNo) {
		theatre1SeatDAO.deleteSeat(seatNo);
	}

	@Override
	public Theatre1Seat getSeat(int seatNo) {
		Theatre1Seat seat=theatre1SeatDAO.selectSeat(seatNo);
		theatre1SeatDAO.selectSeat(seatNo);
		return seat;
	}

	@Override
	public List<Theatre1Seat> getSeatList() {
		return theatre1SeatDAO.selectSeatList();
	}

	@Override
	public void modifyOneSeat(int seatNo) {
		theatre1SeatDAO.updateOneSeat(seatNo);
	}

	@Override
	public void modifyZeroSeat(int seatNo) {
		theatre1SeatDAO.updateZeroSeat(seatNo);
	}
}
