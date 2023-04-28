package site.itwill.dao;

import java.util.List;
import java.util.Map;

import site.itwill.dto.Blost;

public interface BlostDAO {
	int insertlostProducts(Blost blost);
	int updatelostProducts(Blost blost);
	int deleteLostProducts(int num);
	int selectLostProductsCount();
	List<Blost> selectBlostList();
	List<Blost> selectBlostBoardList(Map<String , Object>map);
}
