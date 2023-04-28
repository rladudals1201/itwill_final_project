package site.itwill.service;

import java.util.List;

import site.itwill.dto.Show;
import site.itwill.exception.ShowExistsException;
import site.itwill.exception.ShowNotFoundException;

public interface ShowService {
	void addShow(Show show) throws ShowExistsException;
	void modifyShow(Show show) throws ShowNotFoundException;
	void removeShow(int showseq) throws ShowNotFoundException;
	Show getShow(int showseq) throws ShowNotFoundException;
	List<Show> getShowList();
}
