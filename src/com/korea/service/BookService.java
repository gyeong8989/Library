package com.korea.service;

import com.korea.domain.BookDAO;
import com.korea.dto.BookDTO;

public class BookService
{
	BookDAO dao = new BookDAO();
	
	//조회
	
	
	//추가
	
	public boolean Insert(BookDTO dto)
	{
		return dao.Insert(dto); // 전달받은 dto 를 dao 로 넘김
								//그리고 반환되는 값을 Controller 머시기....
	}
}
