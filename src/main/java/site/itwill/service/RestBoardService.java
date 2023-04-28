package site.itwill.service;

import java.util.List;
import java.util.Map;

import site.itwill.dto.RestBoard;

public interface RestBoardService {
	void addRestBoard(RestBoard board);
	void modifyRestBoard(RestBoard board);
	void removeRestBoard(int num);
	RestBoard getRestBoard(int num);
	int getRestBoardCount();
	List<RestBoard> getRestBoardList(Map<String, Object> map);
}
