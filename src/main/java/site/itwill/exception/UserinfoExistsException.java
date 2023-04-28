package site.itwill.exception;

import site.itwill.dto.Users;

//회원등록시 사용자가 입력한 아이디가 이미 존재하는 경우 동작되는 예외 클래스
public class UserinfoExistsException extends Exception {
	private static final long serialVersionUID = 1L;
	
	//예외 처리 메소드(Exception Handler Method)에게 예외 처리에 필요한 정보를 제공하기 위한 필드
	private Users users;
	
	public UserinfoExistsException() {
		// TODO Auto-generated constructor stub
	}

	public UserinfoExistsException(Users users, String message) {
		super(message);
		this.users=users;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
}
