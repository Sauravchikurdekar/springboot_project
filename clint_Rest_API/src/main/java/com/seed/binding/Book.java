package com.seed.binding;

public class Book {
	
	private int bookid;
	private String bookname;
	private double bookprice;
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid1(int bookid) {
		this.bookid = bookid;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookprice=" + bookprice + "]";
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public double getBookprice() {
		return bookprice;
	}
	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}
	public void setBookid(int bookid2) {
		// TODO Auto-generated method stub
		
	}

}
