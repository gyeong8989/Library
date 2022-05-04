package com.korea.dto;

public class BookDTO
{
	private String bookcode;
	private String BookName;
	
	
	
	//생성자
	public BookDTO(String bookcode, String bookName)
	{
		super();
		this.bookcode = bookcode;
		BookName = bookName;
		
	}
	
	//Getter and Setter
	public String getBookcode()
	{
		return bookcode;
	}
	public void setBookcode(String bookcode)
	{
		this.bookcode = bookcode;
	}
	public String getBookName()
	{
		return BookName;
	}
	public void setBookName(String bookName)
	{
		BookName = bookName;
	}

	@Override
	public String toString()
	{
		return "BookDTO [bookcode=" + bookcode + ", BookName=" + BookName + "]";
	}
	
	
}
