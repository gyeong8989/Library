package com.korea.view;

import java.util.Scanner;

import com.korea.controller.FrontController;
import com.korea.dto.BookDTO;

public class Viewer
{
	int num;  //메뉴번호 저장
	Scanner sc = new Scanner(System.in);
	
	//컨트롤러객체를 추가
	FrontController controller = new FrontController();
	
	
	//메인메뉴
	 public void MainMenu()
	 {
		 while(true)
		 {
			 
			 System.out.println("-----------MAIN------------");
			 System.out.println("1 도서메뉴");
			 System.out.println("2 직원메뉴");
			 System.out.println("3 회원메뉴");
			 System.out.println("4 종료");
			 
			 System.out.println("-----------MAIN------------");
			 System.out.print("번호 : ");
			 num = sc.nextInt();
			 switch(num)
			 {
			 case 1: //도서메뉴
				 BookMenu();
				 break;
			 case 2: //직원메뉴
				 break;
			 case 3: //회원메뉴
				 break;
			 case 4:// 종료
				 System.out.println("v프로그램 종료");
				 System.exit(-1);
				 break;
				 
			 default:
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
					System.out.println("도서코드|도서명> !");
					String Code = sc.next();
					String Name = sc.next();
					BookDTO dto = new BookDTO(Code, Name); 
					controller.SubConExecute("BOOK", 2, dto); //컨트롤러 key,서비스번호,bookdto
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
