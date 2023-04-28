package site.itwill.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import site.itwill.dto.Bfaq;
import site.itwill.mapper.BfaqMapper;

public class BfaqDAOImpl implements BfaqDAO {

	@Autowired
	private SqlSession SqlSession;
	
	@Override
	public int insertFaq(Bfaq bfaq) {
		return SqlSession.getMapper(BfaqMapper.class).insertFaq(bfaq);
	}

	@Override
	public int updateFaq(Bfaq bfaq) {
		return SqlSession.getMapper(BfaqMapper.class).updateFaq(bfaq);
	}

	@Override
	public int selectFaqCount() {
		return SqlSession.getMapper(BfaqMapper.class).selectFaqCount();
	}

	@Override
	public List<Bfaq> selectFaqList(Map<String, Object> map) {
		return SqlSession.getMapper(BfaqMapper.class).selectFaqList(map);
	}

}
