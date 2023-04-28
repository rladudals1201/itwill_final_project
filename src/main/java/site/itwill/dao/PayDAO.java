package site.itwill.dao;

import java.util.List;

import site.itwill.dto.Pay;

public interface PayDAO {
	int insertPay(Pay pay);
	List<Pay> selectPayList(String id);

}
