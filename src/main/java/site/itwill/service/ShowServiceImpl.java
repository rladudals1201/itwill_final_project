package site.itwill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.itwill.dao.ShowDAO;
import site.itwill.dto.Show;
import site.itwill.exception.ShowExistsException;
import site.itwill.exception.ShowNotFoundException;

@Service
public class ShowServiceImpl implements ShowService {
	@Autowired
	private ShowDAO showDAO;
	
	@Override
	public void addShow(Show show) throws ShowExistsException {		
		showDAO.insertShow(show);
	}

	@Override
	public void modifyShow(Show show) throws ShowNotFoundException {
		showDAO.updateShow(show);
	}

	@Override
	public List<Show> getShowList() {
		return showDAO.selectShowList();
	}

	@Override
	public void removeShow(int showseq) throws ShowNotFoundException {
		showDAO.deleteShow(showseq);
	}

	@Override
	public Show getShow(int showseq) throws ShowNotFoundException {
		Show show=showDAO.selectShow(showseq);
		showDAO.selectShow(showseq);
		return show;
	}

}
