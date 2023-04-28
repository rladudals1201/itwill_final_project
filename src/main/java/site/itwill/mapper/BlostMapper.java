package site.itwill.mapper;

import java.util.List;
import java.util.Map;

import site.itwill.dto.Blost;

public interface BlostMapper {
	int insertlostProducts(Blost blost);
	int updatelostProducts(Blost blost);
	int deleteLostProducts(int num);
	int selectLostProductsCount();
	List<Blost> selectBlostList();
	List<Blost> selectBlostBoardList(Map<String , Object>map);
	
	
}
