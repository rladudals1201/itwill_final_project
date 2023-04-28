package site.itwill.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import site.itwill.dao.BquestionDAO;
import site.itwill.dao.UsersDAO;
import site.itwill.dto.Bquestion;

@Service
public class BquestionServiceImpl implements BquestionService {
	
	@Autowired
	private BquestionDAO bquestionDAO;
	
	
	@Transactional
	@Override
	public void addQuestionBoard(Bquestion bquestion) {
		bquestionDAO.insertQuestionBoard(bquestion);
		
	}
	
	@Transactional
	@Override
	public void modifyQuestionBoard(Bquestion bquestion) {
		bquestionDAO.updateQuestionBoard(bquestion);
		
	}
	
	@Transactional
	@Override
	public void removeQuestionBoard(int qno) {
		bquestionDAO.deleteQuestionBoard(qno);
		
	}

	@Override
	public Bquestion getQuestionBoard(int qno) {
		return bquestionDAO.selectQuestionBoard(qno);
	}

	@Override
	public int getQuestionBoardCount() {
		return bquestionDAO.seletQuestionBoardCount();
	}

	@Override
	public List<Bquestion> getQuestionList() {
		return bquestionDAO.selectQuestionList();
	}

	@Override
	public List<Bquestion> getQuestionBoardList(Map<String, Object> map) {
		return bquestionDAO.selectQuestionBoardList(map);
	}



}
