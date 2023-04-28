package site.itwill.mapper;

import java.util.List;
import java.util.Map;

import site.itwill.dto.Bquestion;

public interface BquestionMapper {
	int insertQuestionBoard(Bquestion bquestion);
	int updateQuestionBoard(Bquestion bquestion);
	int deleteQuestionBoard(int qno);
	Bquestion selectQuestionBoard(int num);
	int seletQuestionBoardCount();
	List<Bquestion> selectQuestionList();
	List<Bquestion> selectQuestionBoardList(Map<String, Object>map);
	
}
