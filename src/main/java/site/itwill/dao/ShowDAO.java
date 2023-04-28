package site.itwill.dao;

import java.util.List;

import site.itwill.dto.Show;

public interface ShowDAO {
	int insertShow(Show show);
	int updateShow(Show show);
	int deleteShow(int showseq);
	Show selectShow(int showseq);
	List<Show> selectShowList();
}
