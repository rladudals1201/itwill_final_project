package site.itwill.mapper;

import java.util.List;

import site.itwill.dto.Users;

public interface UsersMapper {
	int insertUsers(Users users);
	int updateUsers(Users users);
	int updateUsersLastLogin(String id);
	int deleteUsers(String id);
	Users selectUsers(String id);

	/* Users findId(String email,String birthday); */
	Users findId(Users user);
	List<Users> selectUserList();
}
