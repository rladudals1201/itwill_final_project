package site.itwill.service;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import site.itwill.dao.UsersDAO;
import site.itwill.dto.Users;
import site.itwill.exception.LoginAuthFailException;
import site.itwill.exception.UserinfoExistsException;
import site.itwill.exception.UserinfoNotFoundException;

@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersDAO usersDAO;

	@Transactional
	@Override
	public void addUsers(Users users) throws UserinfoExistsException {
		if(usersDAO.selectUsers(users.getId())!=null) {
			throw new UserinfoExistsException(users, "이미 사용중인 아이디를 입력하였습니다.");
		}
		
		users.setPasswd(BCrypt.hashpw(users.getPasswd(), BCrypt.gensalt()));
		
		usersDAO.insertUsers(users);
	}

	@Transactional
	@Override
	public void modifyUsers(Users users) throws UserinfoNotFoundException {
		if(usersDAO.selectUsers(users.getId())==null) {
			throw new UserinfoNotFoundException("아이디의 회원정보가 존재하지 않습니다.");
		}	
		
		String passwd=users.getPasswd();
		if(passwd!=null && !passwd.equals("")) {
			users.setPasswd(BCrypt.hashpw(passwd, BCrypt.gensalt()));
		}
		
		usersDAO.updateUsers(users);
	}

	@Transactional
	@Override
	public void removeUsers(String id) throws UserinfoNotFoundException {
		if(usersDAO.selectUsers(id)==null) {
			throw new UserinfoNotFoundException("아이디의 회원정보가 존재하지 않습니다.");
		}
		usersDAO.deleteUsers(id);
	}

	@Override
	public Users getUsers(String id) throws UserinfoNotFoundException {
		Users users=usersDAO.selectUsers(id);
		if(users==null) {
			throw new UserinfoNotFoundException("아이디의 회원정보가 존재하지 않습니다.");
		}
		return users;
	}

	@Override
	public Users getId(Users user) {
		Users user1=usersDAO.findUsers(user);
		return user1;
	}

	@Override
	public List<Users> getUsersList() {
		return usersDAO.selectUserList();
	}

	@Override
	public void loginAuth(Users users) throws LoginAuthFailException {
		Users authUsers=usersDAO.selectUsers(users.getId());
		if(authUsers==null) {
			throw new LoginAuthFailException("아이디의 회원정보가 존재하지 않습니다.", users.getId());
		}

		if(!BCrypt.checkpw(users.getPasswd(), authUsers.getPasswd())) {
			throw new LoginAuthFailException("아이디가 없거나 비밀번호가 맞지 않습니다.", users.getId());
		}
		//예외가 발생하지 않은 경우 인증 성공
	}
}
