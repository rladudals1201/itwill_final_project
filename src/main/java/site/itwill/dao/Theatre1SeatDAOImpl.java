package site.itwill.dao;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import site.itwill.dto.Theatre1Seat;
import site.itwill.mapper.Theatre1SeatMapper;

@Repository
public class Theatre1SeatDAOImpl implements Theatre1SeatDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertSeat(Theatre1Seat seat) {
		return sqlSession.getMapper(Theatre1SeatMapper.class).insertSeat(seat);
	}

	@Override
	public int updateSeat(Theatre1Seat seat) {
		return sqlSession.getMapper(Theatre1SeatMapper.class).updateSeat(seat);
	}

	@Override
	public int deleteSeat(int seatNo) {
		return sqlSession.getMapper(Theatre1SeatMapper.class).deleteSeat(seatNo);
	}

	@Override
	public Theatre1Seat selectSeat(int seatNo) {
		return sqlSession.getMapper(Theatre1SeatMapper.class).selectSeat(seatNo);
	}

	@Override
	public List<Theatre1Seat> selectSeatList() {
		return sqlSession.getMapper(Theatre1SeatMapper.class).selectSeatList();
	}

	@Override
	public int updateOneSeat(int seatNo) {
		return sqlSession.getMapper(Theatre1SeatMapper.class).updateOneSeat(seatNo);
	}
	@Override
	public int updateZeroSeat(int seatNo) {
		return sqlSession.getMapper(Theatre1SeatMapper.class).updateZeroSeat(seatNo);
	}
}
