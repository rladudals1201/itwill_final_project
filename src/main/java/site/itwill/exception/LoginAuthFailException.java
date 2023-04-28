package site.itwill.exception;

//로그인에 대한 인증 실패시 동작되는 예외 클래스
public class LoginAuthFailException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	public LoginAuthFailException() {
		// TODO Auto-generated constructor stub
	}

	public LoginAuthFailException(String message, String id) {
		super(message);
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
