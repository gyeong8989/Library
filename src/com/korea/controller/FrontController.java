package com.korea.controller;

import java.util.HashMap;
import java.util.Map;

import com.korea.dto.BookDTO;

public class FrontController
{
	//서브컨트롤러를 담는 컬렉션 지정  서브컨트롤러 등록 시키는 작업 (컬렉션) 
	Map<String,SubController> map = new HashMap();  //서브컨트롤러 인페에 상속관계에있다 상위클래 참조변수로 업캐스팅
	
	public FrontController()  // 하위개개체 연결  ???????????
	{
		Init(); 
	}
	
	//서브컨트롤러를 Map 에 등록
	void Init()
	{
		map.put("BOOK", new BookController());
		map.put("AUTH", new AuthController());
//		map.put("EMPLOYEE", new EmployeeController());
//		map.put("MEMBER", new MemberController());
	}
	public void SubConExecute(String menu,int num,BookDTO dto)
	{
		if(menu.equals("BOOK"))
		{
			
			//도서관련 요청  (1 : 조회,2 : 삽입,3 : 수정, 4 : 삭제)
			SubController sub = map.get("BOOK");  //Bookcontroller 를 map 에서 꺼내옴
			sub.execute(num, dto);    //특정한 도서 수정인지 재정의된 함수 사용  ..//요청번호, 도서정보를 bookcontroller의 execute로 전달
			
		}else if(menu.equals("AUTH"))
		{
			//로그인 or 로그아웃 요청
		}else if(menu.equals("MEMBER"))
		{
			//멤버관련 요청(멤버조회,수정,탈퇴)
		}
	}
}
