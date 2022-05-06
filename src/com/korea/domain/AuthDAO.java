package com.korea.domain;

import com.korea.dto.AuthDTO;

public class AuthDAO extends DAO{
   public AuthDAO () {};
   
   //회원로그인(num=1)
   public boolean MemberLogin(AuthDTO dto) {
      
      try {
         pstmt = conn.prepareStatement("select id,pw from member_tbl where id=?");
         pstmt.setString(1, dto.getid());
         rs = pstmt.executeQuery();
         
         String tid=null; String tpw=null;
         while(rs.next()) {
            tid=rs.getString("id");
            tpw=rs.getString("pw");
         }
         
         if(tid!=null && tpw!=null) {
            if(tid.equals(dto.getid())&&tpw.equals(dto.getPw())) //dto.get~ 은 외부로부터 입력받은 값 tpw,tid는 저장되어있는 값
            {
               return true;
            }
         }
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         try {rs.close();}catch(Exception e) {e.printStackTrace();}
         try {pstmt.close();}catch(Exception e) {e.printStackTrace();}
      }
      return false;
   }
   //직원로그인(num=2)
   public boolean EmployeeLogin(AuthDTO dto) {

         try {
            pstmt = conn.prepareStatement("select id,pw from employee_tbl where id=?");
            pstmt.setString(1, dto.getid());
            rs = pstmt.executeQuery();
            
            String tid=null; String tpw=null;
            while(rs.next()) {
               tid=rs.getString("id");
               tpw=rs.getString("pw");
            }
            
            if(tid!=null && tpw!=null) {
               if(tid.equals(dto.getid())&&tpw.equals(dto.getPw())) //dto.get~ 은 외부로부터 입력받은 값 tpw,tid는 저장되어있는 값
               {
                  return true;
               }
            }
         }catch(Exception e) {
            e.printStackTrace();
         }finally {
            try {rs.close();}catch(Exception e) {e.printStackTrace();}
            try {pstmt.close();}catch(Exception e) {e.printStackTrace();}
         }
      
         
         return false;
      
}
}