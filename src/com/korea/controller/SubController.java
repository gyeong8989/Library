package com.korea.controller;

import com.korea.dto.BookDTO;

public interface SubController
{
	//실행하기 함수
	//num : 서비스종류(1 : 조회,2 : 삽입,3 : 수정, 4 : 삭제)
	void execute(int num, BookDTO dto); //book이단위로 받아온다
}
