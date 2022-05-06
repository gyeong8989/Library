package com.korea.controller;

import com.korea.dto.BookDTO;
import com.korea.dto.DTO;
import com.korea.service.BookService;

public class BookController implements SubController
{
	BookService service = new BookService();

	@Override
	public boolean execute(int num, DTO dto) //서비스 요청 지시   dto 업캐스팅이라 다운캐스팅 해줘야함
	{
		//다운 캐스팅 
		BookDTO bdto = (BookDTO)dto;  //다운캐스팅 한번 해줘야함
		
		//조회 1, 삽입 2,수정 3, 삭제 4
		if(num==1)
		{
			
		}else if(num==2)
		{
			return service.Insert(bdto);
		}else if(num==3)
		{
			
		}else if(num==4)
		{
			
		}
		return false;
	}

	
}
