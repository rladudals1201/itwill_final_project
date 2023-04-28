package site.itwill.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import site.itwill.dto.Blost;
import site.itwill.mapper.BlostMapper;

@Repository
public class BlostDAOImpl implements BlostDAO {

	@Autowired
	private SqlSession SqlSession;
	
	@Override
	public int insertlostProducts(Blost blost) {
		return SqlSession.getMapper(BlostMapper.class).insertlostProducts(blost);
	}

	@Override
	public int updatelostProducts(Blost blost) {
		return SqlSession.getMapper(BlostMapper.class).updatelostProducts(blost);
	}

	@Override
	public int deleteLostProducts(int num) {
		return SqlSession.getMapper(BlostMapper.class).deleteLostProducts(num);
	}

	@Override
	public int selectLostProductsCount() {
		return SqlSession.getMapper(BlostMapper.class).selectLostProductsCount();
	}

	@Override
	public List<Blost> selectBlostList() {
		return SqlSession.getMapper(BlostMapper.class).selectBlostList();
	}

	@Override
	public List<Blost> selectBlostBoardList(Map<String, Object> map) {
		return SqlSession.getMapper(BlostMapper.class).selectBlostBoardList(map);
	}

}
