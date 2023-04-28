package site.itwill.dto;


/*
이름          널? 유형           
----------- -- ------------ 
ID             VARCHAR2(20) 
TITLE          VARCHAR2(50) 
THEATRE        NUMBER(1)    
SEAT_NO        NUMBER(2)    
SEAT_STATUS    NUMBER(1)    
SEAT_LVL       VARCHAR2(1)  
SEAT_PRICE     NUMBER(5)    
SHOW_TIME      DATE         
*/
public class SeatReserve {
	
	private int seatReserveseq;

	private String id;
	private String title;
	private int theatre;
	private int seatNo;
	private int seatStatus;
	private String seatLvl;
	private int seatPrice;
	private String showTime;
	
	public SeatReserve() {
		// TODO Auto-generated constructor stub
	}
	

	public int getSeatReserveseq() {
		return seatReserveseq;
	}


	public void setSeatReserveseq(int seatReserveseq) {
		this.seatReserveseq = seatReserveseq;
	}


	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTheatre() {
		return theatre;
	}

	public void setTheatre(int theatre) {
		this.theatre = theatre;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public int getSeatStatus() {
		return seatStatus;
	}

	public void setSeatStatus(int seatStatus) {
		this.seatStatus = seatStatus;
	}

	public String getSeatLvl() {
		return seatLvl;
	}

	public void setSeatLvl(String seatLvl) {
		this.seatLvl = seatLvl;
	}

	public int getSeatPrice() {
		return seatPrice;
	}

	public void setSeatPrice(int seatPrice) {
		this.seatPrice = seatPrice;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	
	
	
}
