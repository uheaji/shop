package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import config.DBConnection;
import model.CookieUser;

public class RegisterMgr {
	public CookieUser 찾기(String id, String pwd) {
		String sql = "SELECT count(*) FROM cookieUser WHERE  id = ? and pwd = ?";
		Connection conn = DBConnection.getConnection();
		try {
			// 버퍼 만들기
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			ResultSet rs = pstmt.executeQuery(); // 커서를 한칸 씩 내리면서 찾는 것
			if(rs.next()) {
				CookieUser cookieUser = CookieUser.builder()
						.id(rs.getString("id"))
						.pwd(rs.getString("pwd"))
						.build();
				System.out.println(cookieUser);
				return cookieUser;
				
	}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
