package site.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import site.itwill.dto.Show;
import site.itwill.mapper.ShowMapper;

@Repository
public class ShowDAOImpl implements ShowDAO {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insertShow(Show show) {
		return sqlSession.getMapper(ShowMapper.class).insertShow(show);
	}

	@Override
	public int updateShow(Show show) {
		return sqlSession.getMapper(ShowMapper.class).updateShow(show);
	}

	@Override
	public int deleteShow(int showseq) {
		return sqlSession.getMapper(ShowMapper.class).deleteShow(showseq);
	}

	@Override
	public Show selectShow(int showseq) {
		return sqlSession.getMapper(ShowMapper.class).selectShow(showseq);
	}

	@Override
	public List<Show> selectShowList() {
		return sqlSession.getMapper(ShowMapper.class).selectShowList();
	}
	
}
