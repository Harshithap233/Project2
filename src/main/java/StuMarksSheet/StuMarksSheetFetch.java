package StuMarksSheet;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import StuMarksSheetDao.StuMarksSheetDao;
import StuMarksSheetDto.StuMarksDto;

@WebServlet("/view")
public class StuMarksSheetFetch extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		StuMarksSheetDao dao=new StuMarksSheetDao();
		 List<StuMarksDto>  l=dao.fetch();
		 
		 
		 req.setAttribute("SheetList",l);
		 RequestDispatcher rd=req.getRequestDispatcher("view.jsp");
		 rd.forward(req, res);
		
	}

}
