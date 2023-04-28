package site.itwill.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import site.itwill.dao.BlostDAO;
import site.itwill.dto.Blost;

@Service
public class BlostServiceImpl implements BlostService{

	@Autowired
	private BlostDAO blostDAO;
	
	@Transactional
	@Override
	public void addBlost(Blost blost) {
		blostDAO.insertlostProducts(blost);
	}

	@Transactional
	@Override
	public void modifyBlost(Blost blost) {
		blostDAO.updatelostProducts(blost);
	}

	@Transactional
	@Override
	public void removeBlost(int num) {
		blostDAO.deleteLostProducts(num);
	}

	@Override
	public int getBlostCount() {
		return blostDAO.selectLostProductsCount();
	}

	@Override
	public List<Blost> getBlostList() {
		return blostDAO.selectBlostList();
	}

	@Override
	public List<Blost> getBlostBoardList(Map<String, Object> map) {
		return blostDAO.selectBlostBoardList(map);
	}

}
