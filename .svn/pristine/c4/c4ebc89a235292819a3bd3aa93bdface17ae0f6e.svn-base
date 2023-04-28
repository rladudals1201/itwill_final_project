package site.itwill.dao;

import java.util.List;



import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import site.itwill.dto.Theatre2Seat;
import site.itwill.mapper.Theatre2SeatMapper;

@Repository
public class Theatre2SeatDAOImpl implements Theatre2SeatDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertSeat(Theatre2Seat seat) {
		return sqlSession.getMapper(Theatre2SeatMapper.class).insertSeat(seat);
	}

	@Override
	public int updateSeat(Theatre2Seat seat) {
		return sqlSession.getMapper(Theatre2SeatMapper.class).updateSeat(seat);
	}

	@Override
	public int deleteSeat(int seatNo) {
		return sqlSession.getMapper(Theatre2SeatMapper.class).deleteSeat(seatNo);
	}

	@Override
	public Theatre2Seat selectSeat(int seatNo) {
		return sqlSession.getMapper(Theatre2SeatMapper.class).selectSeat(seatNo);
	}

	@Override
	public List<Theatre2Seat> selectSeatList() {
		return sqlSession.getMapper(Theatre2SeatMapper.class).selectSeatList();
	}

	@Override
	public int updateOneSeat(int seatNo) {
		return sqlSession.getMapper(Theatre2SeatMapper.class).updateOneSeat(seatNo);
	}

	@Override
	public int updateZeroSeat(int seatNo) {
		return sqlSession.getMapper(Theatre2SeatMapper.class).updateZeroSeat(seatNo);
	}
}
