package StuMarksSheet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import StuMarksSheetDao.StuMarksSheetDao;

@WebServlet("/marksheetupdate")
public class StuMarksSheetUpdate extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String seatnum=req.getParameter("seatnum");
		long seatnum1=Long.parseLong(seatnum);
		
		String name=req.getParameter("stuname");
		
		String dob=req.getParameter("dob");
		
		String fname=req.getParameter("fname");
		
		String kan=req.getParameter("kan");
		int kan1=Integer.parseInt(kan);
		
		String eng=req.getParameter("eng");
		int eng1=Integer.parseInt(eng);
		
		String hin=req.getParameter("hin");
		int hin1=Integer.parseInt(hin);
		
		String math=req.getParameter("math");
		int math1=Integer.parseInt(math);
		
		String ss=req.getParameter("ss");
		int ss1=Integer.parseInt(ss);
		
		String science=req.getParameter("science");
		int science1=Integer.parseInt(science);
		
		
		StuMarksSheetDao dao=new StuMarksSheetDao();
		String msg=dao.update(seatnum1,name,dob,fname,kan1,eng1,hin1,math1,ss1,science1);
		res.getWriter().print(msg);

		
		
	}

}
