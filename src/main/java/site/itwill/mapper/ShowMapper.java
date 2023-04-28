package site.itwill.mapper;

import java.util.List;

import site.itwill.dto.Show;

public interface ShowMapper {
	int insertShow(Show show);
	int updateShow(Show show);
	int deleteShow(int showseq);
	Show selectShow(int showseq);
	List<Show> selectShowList();
}
