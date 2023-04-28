package site.itwill.dto;

/*
이름          널?       유형          
----------- -------- ----------- 
SEAT_NO     NOT NULL NUMBER(2)   
SEAT_LVL             VARCHAR2(1) 
SEAT_PRICE           NUMBER(5)   
SEAT_STATUS          NUMBER(1)  
*/

public class Theatre2Seat {
	private int seatNo;
	private String seatLvl;
	private int seatPrice;
	private int seatStatus;
	
	public Theatre2Seat() {
		// TODO Auto-generated constructor stub
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
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

	public int getSeatStatus() {
		return seatStatus;
	}

	public void setSeatStatus(int seatStatus) {
		this.seatStatus = seatStatus;
	}
}
