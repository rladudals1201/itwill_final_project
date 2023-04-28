package site.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import site.itwill.dto.SeatReserve;
import site.itwill.mapper.SeatReserveMapper;

@Repository
public class SeatReserveDAOImpl implements SeatReserveDAO{
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public int insertSeatReserve(SeatReserve seatReserve) {
		return sqlSession.getMapper(SeatReserveMapper.class).insertSeatReserve(seatReserve);
	}

	@Override
	public List<SeatReserve> selectReserveList() {
		return sqlSession.getMapper(SeatReserveMapper.class).selectReserveList();
	}

	@Override
	public List<SeatReserve> selectReserve(String id) {
		return sqlSession.getMapper(SeatReserveMapper.class).selectReserve(id);
	}

	@Override
	public int deleteReserve(int reserveseq) {
		return sqlSession.getMapper(SeatReserveMapper.class).deleteReserve(reserveseq);
	}

	@Override
	public SeatReserve selectReserveSeq(int reserveseq) {
		return sqlSession.getMapper(SeatReserveMapper.class).selectReserveSeq(reserveseq);
	}

}
