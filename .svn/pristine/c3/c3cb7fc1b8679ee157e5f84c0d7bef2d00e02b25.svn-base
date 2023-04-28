package site.itwill.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.itwill.dao.SeatReserveDAO;
import site.itwill.dto.SeatReserve;

@Service
public class SeatReserveServiceImpl implements SeatReserveService{
	@Autowired
	SeatReserveDAO seatReserveDAO;
		
	@Override
	public void addSeatReserve(SeatReserve seatReserve) {
		seatReserveDAO.insertSeatReserve(seatReserve);
	}

	@Override
	public List<SeatReserve> getReserveList() {
		return seatReserveDAO.selectReserveList();
	}

	@Override
	public List<SeatReserve> getReserve(String id){
	
		return seatReserveDAO.selectReserve(id);
	}

	@Override
	public void removeReserve(int reserveseq) {
		seatReserveDAO.deleteReserve(reserveseq);
	}

	@Override
	public SeatReserve getReserveSeq(int reserveseq) {
		return seatReserveDAO.selectReserveSeq(reserveseq);
	}
	
}
