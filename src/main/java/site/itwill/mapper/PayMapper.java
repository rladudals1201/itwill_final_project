package site.itwill.mapper;

import java.util.List;

import site.itwill.dto.Pay;

public interface PayMapper {
	int insertPay(Pay pay);
	List<Pay> selectPayList(String id);
}
