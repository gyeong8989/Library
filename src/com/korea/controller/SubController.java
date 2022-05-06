package com.korea.controller;

import com.korea.dto.DTO;

public interface SubController
{
	boolean execute(int num,DTO dto);  //북 dto 인증 , 멤버 dto 사용 상위 하나 있어야함 업캐스팅 받을수 있음
										// A B C D 다 가능
}
