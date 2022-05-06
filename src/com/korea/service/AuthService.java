package com.korea.service;

import com.korea.domain.AuthDAO;
import com.korea.dto.AuthDTO;
import com.mysql.cj.QueryReturnType;

public class AuthService
{
	AuthDAO dao = new AuthDAO();
	
	//회원 로그인
	public boolean MemberLogin(AuthDTO dto)
	{
		return dao.MemberLogin(dto);
	}
	// 직원 로그인
	
	public boolean EmployeeLogin(AuthDTO dto)
	{
		return dao.EmployeeLogin(dto);
	}
}
