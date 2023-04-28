package site.itwill.dto;

import org.springframework.web.multipart.MultipartFile;

/*
NUM    NOT NULL NUMBER(4)     
CODE            VARCHAR2(20)  
NAME            VARCHAR2(50)  
IMAGE           VARCHAR2(30)  
DETAIL          VARCHAR2(300) 
COLOR           VARCHAR2(10)  
QTY             NUMBER(8)     
PRICE           NUMBER(8)     
IMAGE2          VARCHAR2(100) 

 
 */
public class Product {
	private int num;
	private String code;
	private String name;
	private String image;
	private String detail;
	private String color;
	private int qty;
	private int price;
	private String image2;
	private MultipartFile file;
	
	
	
	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
