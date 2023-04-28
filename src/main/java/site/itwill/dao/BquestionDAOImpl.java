package site.itwill.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import site.itwill.dto.Bquestion;
import site.itwill.mapper.BquestionMapper;

@Repository
public class BquestionDAOImpl implements BquestionDAO{
	@Autowired
	private SqlSession SqlSession;
	
	
	@Override
	public int insertQuestionBoard(Bquestion bquestion) {
		return SqlSession.getMapper(BquestionMapper.class).insertQuestionBoard(bquestion);
	}

	@Override
	public int updateQuestionBoard(Bquestion bquestion) {
		return SqlSession.getMapper(BquestionMapper.class).updateQuestionBoard(bquestion);
	}

	@Override
	public int deleteQuestionBoard(int qno) {
		return SqlSession.getMapper(BquestionMapper.class).deleteQuestionBoard(qno);
	}

	@Override
	public Bquestion selectQuestionBoard(int qno) {
		return SqlSession.getMapper(BquestionMapper.class).selectQuestionBoard(qno);
	}

	@Override
	public int seletQuestionBoardCount() {
		return SqlSession.getMapper(BquestionMapper.class).seletQuestionBoardCount();
	}

	@Override
	public List<Bquestion> selectQuestionList() {
		return SqlSession.getMapper(BquestionMapper.class).selectQuestionList();
	}

	@Override
	public List<Bquestion> selectQuestionBoardList(Map<String, Object> map) {
		return SqlSession.getMapper(BquestionMapper.class).selectQuestionBoardList(map);
	}


}
