package StuMarksSheet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import StuMarksSheetDao.StuMarksSheetDao;
import StuMarksSheetDto.StuMarksDto;

@WebServlet("/insert")
public class StuMarksSheetInsert extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
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
		
		int Total_Marks=600;
		int  Obtain_Marks=eng1+eng1+hin1+math1+ss1+science1;
		float percentage=(Obtain_Marks/6);
		
		StuMarksDto dto=new StuMarksDto();
		dto.setUniversity_seat_number(seatnum1);
		dto.setStudent_name(name);
		dto.setFather_name(fname);
		dto.setDate_of_birth(dob);
		dto.setKannada(eng1);
		dto.setEnglish(eng1);
		dto.setHindi(hin1);
		dto.setMathematics(math1);
		dto.setSocial_science(ss1);
		dto.setScience(science1);
		dto.setTotal_marks(Total_Marks);
		dto.setObtained_marks(Obtain_Marks);
		dto.setPercentage(percentage);
		
		if(percentage>95)
		{
			dto.setGrade("A+");
		}
		else if(percentage<=95&&percentage>85)
		{
			dto.setGrade("A");
		}
		else if(percentage<=85&&percentage>75)
		{
			dto.setGrade("B+");
		}
		else if(percentage<=75&percentage>65)
		{
			dto.setGrade("B");
		}
		else if(percentage<=65&percentage>55)
		{
			dto.setGrade("C+");
		}
		else 
		{
			dto.setGrade("C");
		}
	
		
		
		StuMarksSheetDao dao=new StuMarksSheetDao();
		
		
		String KGrade=dao.KGrade(kan1);
		dto.setKan_Grade(KGrade);
		
		String EGrade=dao.EGrade(eng1);
		dto.setEng_Grade(EGrade);
		
		String HGrade=dao.HGrade(hin1);
		dto.setHin_Grade(HGrade);
		
		String MGrade=dao.MGrade(math1);
		dto.setMath_Grade(MGrade);
		
		String SocialGrade=dao.SocialGrade(ss1);
		dto.setSS_Grade(SocialGrade);
		
		String SGrade=dao.SGrade(science1);
		dto.setS_Grade(SGrade);
		
		String ObGrade=dao.ObGrade(Obtain_Marks);
		dto.setOb_Grade(ObGrade);
		
		dao.create(dto);
		
	}

	
		
	}


