package site.itwill.dto;
/*
이름         널? 유형           
---------- -- ------------ 
PAY_NO        NUMBER       
ID            VARCHAR2(20) 
PAY_STATUS    NUMBER       
PRICE         NUMBER       
PAY_DETAIL    VARCHAR2(20) 
*/
public class PayProduct {
	

	private String name;
	private String category;
	private int num;
	private int qty;
	private int price;
	
	public PayProduct() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
