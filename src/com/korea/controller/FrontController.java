package com.korea.controller;

import java.util.HashMap;
import java.util.Map;

import com.korea.dto.DTO;

public class FrontController
{		
	//서브컨트롤러 저장용
	
	private Map<String, SubController> map = new HashMap<>();  //프론트에 해쉬맵이라고 있는 키는 String

	//벨류는 서브컨트롤러 로 인터페이스 참조변수 지금 맘약 상위클래스 참조 변수로  
	
	public FrontController()
	{
		Init(); // ma 에 Init 에 지정된 대로 서브컨트롤러가 추가됨
	}
	//등록할 서비스 지정
	private void Init()
	{
		map.put("BOOK", new BookController());
		map.put("AUTH", new AuthController());
		
	}
	//MAP 에 있는 서브컨트롤러를 꺼내어 해당 컨트롤러를 실행하는 함수
	public boolean SubControllerEX(String menu, int num, DTO dto)
	{
		SubController tmp;
		if(menu.equals("BOOK")){
			tmp = map.get("BOOK"); // Book Controller 를 꺼내어 tmp 에 연결
			return tmp.execute(num, dto);   // 서브컨트롤러 execute 실후 결과(true/false)를 view로 전달
											//num : 1 (조회) 2(삽입) 3(수정) 3(삭제) 
		}else if(menu.equals("AUTH")) {
			tmp = map.get("AUTH"); // authcontroller 를 꺼내어 tmp 에 연결
			return tmp.execute(num, dto); //서브컨트롤러 execute 실행 결과 (true/false) 를view 로 전달
											// num == 1 회원로그인 / n um == 2 직원로그인
	}
		return false;
	}
}
