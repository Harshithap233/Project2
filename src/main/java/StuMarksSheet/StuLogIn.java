package StuMarksSheet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import StuMarksSheetDao.StuMarksSheetDao;
import StuMarksSheetDto.StuMarksDto;

@WebServlet("/login1")
public class StuLogIn extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usn=req.getParameter("usn");
		long usn1=Long.parseLong(usn);
		
		String dob=req.getParameter("dob");
		
		StuMarksSheetDao dao=new StuMarksSheetDao();
		StuMarksDto dto=dao.login(usn1,dob);
		
		
		req.setAttribute("marklist", dto);
		RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
		rd.forward(req, res);
		rd.include(req, res);
	}
}
