package site.itwill.dto;

/*
이름        널?       유형            
--------- -------- ------------- 
ID        NOT NULL VARCHAR2(20)  
PASSWD             VARCHAR2(100) 
NAME               VARCHAR2(20)  
ZIPCODE            VARCHAR2(10)  
ADDRESS1           VARCHAR2(100) 
ADDRESS2           VARCHAR2(100) 
ADDRESS3           VARCHAR2(100) 
PHONE              VARCHAR2(20)  
EMAIL              VARCHAR2(30)  
GENDER             VARCHAR2(10)  
STATUS             NUMBER(1)     
LASTLOGIN          DATE          
BIRTHDAY           VARCHAR2(50)  
JOINDATE           DATE          
NO                 NUMBER  
 */
public class Users {
	private String id;
	private String passwd;
	private String name;
	private String zipcode;
	private String address1;
	private String address2;
	private String address3;
	private String phone;
	private String email;
	private String gender;
	private int status;
	private String lastLogin;
	private String birthday;
	private String joinDate;
	private int no;
	
	public Users() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
}
