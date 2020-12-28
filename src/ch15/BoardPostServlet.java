package ch15;

import java.io.UnsupportedEncodingException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch15/boardPost")
public class BoardPostServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		BoardMgr = bMgr = new BoardMgr();
		bMgr.insertBoard(request);
		response.sendRedirect("list.jsp");
	}
}
