package com.hw3.model.dto;

public  class Book {
	private int num;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	private String title;
	private String author;
	private int price;
	private String publisher;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", publisher=" + publisher + "]";
	}
	public void displayInfo() { System.out.println(num + "번 도서 : [도서제목 = " + title + " / 도서저자 = " + author + " /  도서가격 = " + price + " / 출판사 = " + publisher + "]");} ;
	public Book(int num, String title, String author, int price, String publisher) {
		super();
		this.num = num;
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	public Book() {
		super();
	}
	
	
}
