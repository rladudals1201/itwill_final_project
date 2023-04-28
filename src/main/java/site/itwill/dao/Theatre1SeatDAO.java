package site.itwill.dao;

import java.util.List;

import site.itwill.dto.Theatre1Seat;

public interface Theatre1SeatDAO {
	int insertSeat(Theatre1Seat seat);
	int updateSeat(Theatre1Seat seat);
	int deleteSeat(int seatNo);
	Theatre1Seat selectSeat(int seatNo);
	List<Theatre1Seat> selectSeatList();
	int updateOneSeat(int seatNo);
	int updateZeroSeat(int seatNo);

}
