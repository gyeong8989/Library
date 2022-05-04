package com.korea.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.korea.dto.BookDTO;

public class BookDAO
{
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/librarydb";
	private String id = "root";
	private String pw = "1234";
	
	//연결객체 정보
	
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private Connection conn = null;
	
	//생성자
	
	public BookDAO()
	{
		try
		{
			Class.forName(driver);
			System.out.println("Driver Loading Success");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DBconnected....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//조회
	void Select()
	{
		
	}
	//삽입
	public void Insert(BookDTO dto)
	{
		try
		{
			// Controller 로부터 받은 도서정보를 Book_tbl 에 저장
			pstmt = conn.prepareStatement("insert into book_tbl values(?,?)");
			pstmt.setString(1, dto.getBookcode());
			pstmt.setString(2, dto.getBookName());
			int result = pstmt.executeUpdate();
			if(result!= 0 )
			{
				System.out.println("도서 등록완료!");
			}else {
				System.out.println("도서 등록 실패..");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			try
			{
				pstmt.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	//수정
	void Update()
	{
		
	}
	//삭제
	void Delete()
	{
		
	}
	
	//Book_tbl과 연결되어 조회/삽입/수정/삭제하는데 사용
	//DB 연동코드가 기본으로 Setup
	
	
}
