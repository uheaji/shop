package ch15;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BoardUpdateServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset= UTF-8");
		
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		
		BoardMgr bMgr = new BoardMgr();
		BoardBean bean = (BoardBean) session.getAttribute("bean");
		String nowPage = request.getParameter("nowPage");
		
		BoardBean upBean = new BoardBean();
		upBean.setNum(Integer.parseInt(request.getParameter("num")));
		upBean.setName(request.getParameter("name"));
		upBean.setSubject("subject");
		upBean.setContent("content");
		upBean.setPass("pass");
		upBean.setIp("ip");
		
		String upPass = upBean.getPass();
		String inPass = upBean.getPass();
		
		if(upPass.equals(inPass)) {
			bMgr.updateBoard(upBean);
			String url = "read.jsp?nowPage=" + nowPage + "&num=" + upBean.getNum();
			response.sendRedirect(url);
		} else {
			out.println("<script>");
			out.println("history.back();");
			out.println("</script>");
		}
	}
}
