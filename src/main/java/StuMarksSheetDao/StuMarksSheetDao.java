package StuMarksSheetDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import StuMarksSheetDto.StuMarksDto;

public class StuMarksSheetDao
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();

public String update(long seatnum1, String name, String dob, String fname, int kan1, int eng1, int hin1, int math1,
		int ss1, int science1) 
{
	// TODO Auto-generated method stub
	StuMarksDto dto=em.find(StuMarksDto.class, seatnum1);
	dto.setStudent_name(name);
	dto.setDate_of_birth(fname);
	dto.setDate_of_birth(dob);
	dto.setKannada(kan1);
	dto.setEnglish(eng1);
	dto.setHindi(hin1);
	dto.setMathematics(math1);
	dto.setSocial_science(ss1);
	dto.setScience(science1);
	
	et.begin();
	em.merge(dto);
	et.commit();
	 
	return dto.getStudent_name()+" "+"Your data is updated";
	
	
}
public String delete(long seatnum1) 
{
	// TODO Auto-generated method stub
	StuMarksDto d1=em.find(StuMarksDto.class, seatnum1);
	if(d1!=null)
	{
		et.begin();
		em.remove(d1);
		et.commit();
		return "<h1>Data is deleted</h1>";
	}
	else
	{
		return "<h1>Noo Data found</h1>";
	}
	
}
public List<StuMarksDto> fetch() 
{

	Query q=em.createQuery("select aaa from StuMarksDto aaa");
	List<StuMarksDto> l=q.getResultList();
	return l;
}
public StuMarksDto login(long usn1, String dob)
{
	// TODO Auto-generated method stub
	StuMarksDto d1=em.find(StuMarksDto.class,usn1);
	
	
	return d1;
}
public void create(StuMarksDto dto) 
{
	// TODO Auto-generated method stub
	
	et.begin();
	em.persist(dto);
	et.commit();
}
public String KGrade(int kan1) 
{
	// TODO Auto-generated method stub
	if(kan1>95)
	{
		return "A+";
	}
	else if(kan1<=95&&kan1>85)
	{
		return "A";
	}
	else if(kan1<=85&&kan1>75)
	{
		return "B+";
	}
	else if(kan1<=75&&kan1>65)
	{
		return "B";
	}
	else if(kan1<=65&&kan1>55)
	{
		return "C+";
	}
	else 
	{
		return "C";
	}
	
}
public String EGrade(int eng1) 
{
	// TODO Auto-generated method stub
	if(eng1>95)
	{
		return "A+";
	}
	else if(eng1<=95&&eng1>85)
	{
		return "A";
	}
	else if(eng1<=85&&eng1>75)
	{
		return "B+";
	}
	else if(eng1<=75&&eng1>65)
	{
		return "B";
	}
	else if(eng1<=65&&eng1>55)
	{
		return "C+";
	}
	else 
	{
		return "C";
	}
	
}
public String HGrade(int hin1)
{
	// TODO Auto-generated method stub
	if(hin1>95)
	{
		return "A+";
	}
	else if(hin1<=95&&hin1>85)
	{
		return "A";
	}
	else if(hin1<=85&&hin1>75)
	{
		return "B+";
	}
	else if(hin1<=75&&hin1>65)
	{
		return "B";
	}
	else if(hin1<=65&&hin1>55)
	{
		return "C+";
	}
	else 
	{
		return "C";
	}
	
}
public String MGrade(int math1) 
{
	// TODO Auto-generated method stub
	if(math1>95)
	{
		return "A+";
	}
	else if(math1<=95&&math1>85)
	{
		return "A";
	}
	else if(math1<=85&&math1>75)
	{
		return "B+";
	}
	else if(math1<=75&&math1>65)
	{
		return "B";
	}
	else if(math1<=65&&math1>55)
	{
		return "C+";
	}
	else 
	{
		return "C";
	}
	
	
}
public String SocialGrade(int ss1)
{
	// TODO Auto-generated method stub
	if(ss1>95)
	{
		return "A+";
	}
	else if(ss1<=95&&ss1>85)
	{
		return "A";
	}
	else if(ss1<=85&&ss1>75)
	{
		return "B+";
	}
	else if(ss1<=75&&ss1>65)
	{
		return "B";
	}
	else if(ss1<=65&&ss1>55)
	{
		return "C+";
	}
	else 
	{
		return "C";
	}
	
}
public String SGrade(int science1)
{
	// TODO Auto-generated method stub
	if(science1>95)
	{
		return "A+";
	}
	else if(science1<=95&&science1>85)
	{
		return "A";
	}
	else if(science1<=85&&science1>75)
	{
		return "B+";
	}
	else if(science1<=75&&science1>65)
	{
		return "B";
	}
	else if(science1<=65&&science1>55)
	{
		return "C+";
	}
	else 
	{
		return "C";
	}
	
}
public String ObGrade(int obtain_Marks) 
{
	// TODO Auto-generated method stub
	if(obtain_Marks>580)
	{
		return "A+";
	}
	else if(obtain_Marks<=580&&obtain_Marks>530)
	{
		return "A";
	}
	else if(obtain_Marks<=530&&obtain_Marks>450)
	{
		return "B+";
	}
	else if(obtain_Marks<=450&&obtain_Marks>350)
	{
		return "B";
	}
	else if(obtain_Marks<=350&&obtain_Marks>250)
	{
		return "C+";
	}
	else 
	{
		return "C";
	}
	
}



	
}


