package site.itwill.dao;

import java.util.List;

import site.itwill.dto.SeatReserve;

public interface SeatReserveDAO {
	public int insertSeatReserve(SeatReserve seatReserve);
	public List<SeatReserve> selectReserveList();
	public List<SeatReserve> selectReserve(String id);
	public int deleteReserve(int reserveseq);
	public SeatReserve selectReserveSeq(int reserveseq);

}
