package site.itwill.service;

import java.util.List;

import site.itwill.dto.Users;
import site.itwill.exception.LoginAuthFailException;
import site.itwill.exception.UserinfoExistsException;
import site.itwill.exception.UserinfoNotFoundException;

public interface UsersService {
	void addUsers(Users users) throws UserinfoExistsException;
	void modifyUsers(Users users) throws UserinfoNotFoundException;
	void removeUsers(String id) throws UserinfoNotFoundException;
	Users getUsers(String id) throws UserinfoNotFoundException;
	Users getId(Users user);
	List<Users> getUsersList();
	void loginAuth(Users users) throws LoginAuthFailException;
}
