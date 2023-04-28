package site.itwill.service;

import java.util.List;


import site.itwill.dto.SeatReserve;


public interface SeatReserveService {
	void addSeatReserve(SeatReserve seatReserve);
	List<SeatReserve> getReserveList();
	List<SeatReserve> getReserve(String id);
	void removeReserve(int reserveseq);
	SeatReserve getReserveSeq(int reserveseq);
}
