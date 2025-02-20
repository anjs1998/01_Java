package edu.kh.oop.practice.model.vo;

public class Book {
	private String title;
	private int price;
	
	private double discountRate;
	private String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title, int price, double discountRate, String author) {
		super();
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override //어노테이션 : 컴파일러 인식용 주석
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", discountRate=" + discountRate + ", author=" + author
				+ "]";
	}
	//@Override : 메서드가 부모 클래스의 메서드를 "정확히" 재정의(오버라이딩) 검사
	//1. 만약에 오타가 있거나, 부모 클래스에 없는 메서드를 잘못 작성했을 경우 컴파일 오류를 일으킴
	
	//toString을 오버라이드 시 Book b1 = new Book(); System.out.println(b1); 을 실행시 객체 주소가 아니라 오버라이딩된 toString()이 실행된다.
	
}
