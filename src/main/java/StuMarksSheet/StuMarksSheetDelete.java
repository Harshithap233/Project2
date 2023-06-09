package StuMarksSheet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import StuMarksSheetDao.StuMarksSheetDao;

@WebServlet("/delete")
public class StuMarksSheetDelete extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String seatnum=req.getParameter("seatnum");
		long seatnum1=Long.parseLong(seatnum);
		
		StuMarksSheetDao dao=new StuMarksSheetDao();
		String msg=dao.delete(seatnum1);
		res.getWriter().print(msg);
		
	}

}
