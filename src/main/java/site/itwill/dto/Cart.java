package site.itwill.dto;
/*
이름      널?       유형           
------- -------- ------------ 
CART_NO NOT NULL NUMBER       
NAME             VARCHAR2(20) 
IMAGE            VARCHAR2(30) 
QTY              NUMBER       
PRICE            NUMBER       
*/
public class Cart {
	
	private int cartNo;
	private String name;
	private String id;
	private String image;
	private int num;
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	private int qty;
	private int price;
	
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}
	
	public int getCartNo() {
		return cartNo;
	}
	public void setCartNo(int cartNo) {
		this.cartNo = cartNo;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
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
