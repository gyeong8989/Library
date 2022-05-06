package com.korea.view;

import java.util.Scanner;

import com.korea.controller.FrontController;
import com.korea.dto.AuthDTO;
import com.korea.dto.BookDTO;

public class Viewer
{
	int num;  //메뉴번호 저장
	Scanner sc = new Scanner(System.in);
	
	//컨트롤러객체를 추가
	FrontController controller = new FrontController();
	
	
	
	//메인메뉴
	 public void LoginMenu()
	 {
		 while(true)
		 {
			 
			 System.out.println("----------LOGIN------------");
			 System.out.println("1 회원로그인");
			 System.out.println("2 직원로그인");
			 System.out.println("3 종료");
			 
			 System.out.println("-----------LOGIN------------");
			 System.out.print("번호 : ");
			 num = sc.nextInt();
			 switch(num)
			 {
			 case 1: //회원로그인
				 System.out.println("ID|PW >");
				 String tmpid = sc.next();
				 String tmppw = sc.next();
				 AuthDTO dto = new AuthDTO(tmpid, tmppw);
				 boolean r1 = controller.SubControllerEX("AUTH", 1, dto);
				 if(r1)
				 {
					 //인증성공 -> 회원메뉴가 출력
					 System.out.println("로그인 성공");
				 }else {
					 System.out.println("로그인 실패...");
				 }
				 break;
			 case 2: //직원로그인
				 System.out.println("ID|PW >");
				 String tmpid2 = sc.next();
				 String tmppw2 = sc.next();
				 AuthDTO dto2 = new AuthDTO(tmpid2, tmppw2);
				boolean r2 =  controller.SubControllerEX("AUTH", 2, dto2);
				if(r2)
				 {
					 //인증성공 -> 회원메뉴가 출력
					 System.out.println("로그인 성공");
					 BookMenu();//직원메뉴중하나인 BookMenu()실행
				 }else {
					 System.out.println("로그인 실패...");
				 }
				break;
			 case 3:// 종료
				 System.out.println("v프로그램 종료");
				 System.exit(-1);
				 break;
				 
			 default:
				 System.out.println("잘못입력하셨습니다..");
			 }//스위치 끝
		 }//와일끝

		}
	
	
	//도서메뉴
	public void BookMenu()
	{
		while(true)
		{
			System.out.println("-----------BOOK------------");
			 System.out.println("1 Select");
			 System.out.println("2 Insert");
			 System.out.println("3 Update");
			 System.out.println("4 Delete");
			 System.out.println("5 Prev");
			 System.out.println("-----------BOOK------------");
			 System.out.print("번호 : ");
			 num = sc.nextInt();
			 
				switch(num)
				{
				case 1: // 조회
					System.out.println("책조회!");
					break;
				case 2: // 삽입
					System.out.println("도서코드|도서명|저자|출판사 > !");
					String Code = sc.next();
					String Name = sc.next();
					String Author = sc.next();
					String publisher = sc.next();
					BookDTO dto = new BookDTO(Code,Name,Author,publisher,1); //코드,책제목,저자,출판사,대여가능여부
					
					boolean result = controller.SubControllerEX("BOOK", 2, dto);//BOOK컨트롤러 선택, 삽입,저자책정보
				
					if(result)
						System.out.println("INSERT성공");
					else
						System.out.println("INSERT실패");
					
					//프론트 컨트로러 도서정보로가서 도서정보 삽입하겠다 ㅜ
					break;
				case 3: // 수정
					System.out.println("책수정요청!");
					break;
				case 4: //삭제
					System.out.println("책수정삭제!");
					break;
				case 5: //이전으로
					return;  // MainMenu로 리턴

				default: //잘못누름
					System.out.println("다시입력하세요!");
				
			}
			 
		}
		
	}
	//로그인메뉴
	
	//직원메뉴
	
	//회원메뉴
	
	
}
