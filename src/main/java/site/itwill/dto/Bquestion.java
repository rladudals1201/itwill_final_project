package site.itwill.dto;

/*�̸�        ��?       ����            

QNO       NOT NULL NUMBER(5)     -�Խñ۹�ȣ
QNAME              VARCHAR2(10)  -�̸�
QEMAIL             VARCHAR2(20)  -�̸���
QID                VARCHAR2(20)  -���̵�
QCATEGORY          VARCHAR2(20)  -ī�װ�
QKIND              VARCHAR2(10)  -����
QTITLE             VARCHAR2(20)  -����
QCONTENT           VARCHAR2(500) -����
QFILE              VARCHAR2(20)  -����
QANSWER            VARCHAR2(500) -�亯
QSTATUS            NUMBER(1)     -�亯1, �̴亯9
STATUS             NUMBER(1)     -������, ȸ��
QDATE              DATE    		 -��¥	*/

public class Bquestion {
	private int qno;
	private String qname;
	private String qemail;
	private String qid;
	private String qcategory;
	private String qkind;
	private String qtitle;
	private String qcontent;
	private String qfile;
	private String qanswer;
	private int qstatus;
	private int status;
	private String qdate;

	public Bquestion() {
		// TODO Auto-generated constructor stub
	}



	public int getQno() {
		return qno;
	}

	public void setQno(int qno) {
		this.qno = qno;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public String getQemail() {
		return qemail;
	}

	public void setQemail(String qemail) {
		this.qemail = qemail;
	}

	public String getQid() {
		return qid;
	}

	public void setQid(String qid) {
		this.qid = qid;
	}

	public String getQcategory() {
		return qcategory;
	}

	public void setQcategory(String qcategory) {
		this.qcategory = qcategory;
	}

	public String getQkind() {
		return qkind;
	}

	public void setQkind(String qkind) {
		this.qkind = qkind;
	}

	public String getQtitle() {
		return qtitle;
	}

	public void setQtitle(String qtitle) {
		this.qtitle = qtitle;
	}

	public String getQcontent() {
		return qcontent;
	}

	public void setQcontent(String qcontent) {
		this.qcontent = qcontent;
	}

	public String getQfile() {
		return qfile;
	}

	public void setQfile(String qfile) {
		this.qfile = qfile;
	}

	public String getQanswer() {
		return qanswer;
	}

	public void setQanswer(String qanswer) {
		this.qanswer = qanswer;
	}

	public int getQstatus() {
		return qstatus;
	}

	public void setQstatus(int qstatus) {
		this.qstatus = qstatus;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getQdate() {
		return qdate;
	}

	public void setQdate(String qdate) {
		this.qdate = qdate;
	}
}

	