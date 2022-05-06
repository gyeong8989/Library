package com.korea.main;

import com.korea.controller.FrontController;
import com.korea.dto.BookDTO;
import com.korea.view.Viewer;

public class Main
{

	public static void main(String[] args)
	{
		//1 
		
//		BookDTO dto = new BookDTO("1010", "열혈C언어", "윤성우","오렌지미디어" , 0);
//		BookDAO dao = new BookDAO();
//		
//		dao.Insert(dto);
		
		//2 Controller_Service - Dao 확인
		
//		FrontController controller = new FrontController();
//		BookDTO dto = new BookDTO("2020", "예전부터자바했었어", "허준석","코리아" , 0);
//		controller.SubControllerEX("BOOK", 2, dto);// 서비스명,작업번호,전달단위
		
		//3 View - Controller
		
		Viewer view1 = new Viewer();
//		view1.BookMenu();
		
		//4 View - LoginController
		view1.LoginMenu();
		
	}

}
