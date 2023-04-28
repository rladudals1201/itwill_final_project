package site.itwill.service;

import java.util.List;
import java.util.Map;

import site.itwill.dto.Blost;

public interface BlostService {
	void addBlost(Blost blost);
	void modifyBlost(Blost blost);
	void removeBlost(int num);
	int getBlostCount();
	List<Blost> getBlostList();
	List<Blost> getBlostBoardList(Map<String , Object>map);
	
}
