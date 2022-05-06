package com.korea.dto;

public class AuthDTO extends DTO

{
	private String id;
	private String pw;
	
	
	//생성자
	public AuthDTO(String id, String pw)
	{
		super();
		this.id = id;
		this.pw = pw;
	}


	//getter and Setter
	public String getid()
	{
		return id;
	}


	public void setid(String id)
	{
		this.id = id;
	}


	public String getPw()
	{
		return pw;
	}


	public void setPw(String pw)
	{
		this.pw = pw;
	}


	//toString()
	@Override
	public String toString()
	{
		return "AuthDTO [id=" + id + ", pw=" + pw + "]";
	}
	
	
	
	
	
}
