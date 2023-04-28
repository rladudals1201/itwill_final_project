package site.itwill.dao;

import java.util.List;

import site.itwill.dto.Theatre2Seat;

public interface Theatre2SeatDAO {
	int insertSeat(Theatre2Seat seat);
	int updateSeat(Theatre2Seat seat);
	int deleteSeat(int seatNo);
	Theatre2Seat selectSeat(int seatNo);
	List<Theatre2Seat> selectSeatList();
	int updateOneSeat(int seatNo);
	int updateZeroSeat(int seatNo);
}
