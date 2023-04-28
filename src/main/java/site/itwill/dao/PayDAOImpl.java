package site.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import site.itwill.dto.Pay;
import site.itwill.mapper.PayMapper;
@Repository
public class PayDAOImpl implements PayDAO{
	@Autowired
	SqlSession sqlSession;
		
	@Override
	public int insertPay(Pay pay) {
	 return sqlSession.getMapper(PayMapper.class).insertPay(pay);
	}

	@Override
	public List<Pay> selectPayList(String id) {
		return sqlSession.getMapper(PayMapper.class).selectPayList(id);
	}

}
