package site.itwill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.itwill.dao.PayDAO;
import site.itwill.dto.Pay;

@Service
public class PayServiceImpl implements PayService{
	@Autowired
	PayDAO payDAO;
	
	@Override
	public void addPay(Pay pay) {
		payDAO.insertPay(pay);
	}

	@Override
	public List<Pay> getPayList(String id) {
		return payDAO.selectPayList(id);
		
	}

}
