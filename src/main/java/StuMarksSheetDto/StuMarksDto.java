package StuMarksSheetDto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StuMarksDto 
{
	@Id
	private Long university_seat_number;
	private String Student_name;
	private String Date_of_birth;
	private String Father_name;
	private int kannada;
	private int English;
	private int Hindi;
	private int Mathematics;
	private int Social_science;
	private int Science;
	private int Total_marks;
	private int Obtained_marks;
	private float percentage;
	private String Kan_Grade;
	private String Eng_Grade;
	private String Hin_Grade;
	private String Math_Grade;
	private String SS_Grade;
	private String S_Grade;
	private String Grade;
	private String Ob_Grade;
	public String getOb_Grade() {
		return Ob_Grade;
	}
	public void setOb_Grade(String ob_Grade) {
		Ob_Grade = ob_Grade;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public String getKan_Grade() {
		return Kan_Grade;
	}
	public void setKan_Grade(String kan_Grade) {
		Kan_Grade = kan_Grade;
	}
	public String getEng_Grade() {
		return Eng_Grade;
	}
	public void setEng_Grade(String eng_Grade) {
		Eng_Grade = eng_Grade;
	}
	public String getHin_Grade() {
		return Hin_Grade;
	}
	public void setHin_Grade(String hin_Grade) {
		Hin_Grade = hin_Grade;
	}
	public String getMath_Grade() {
		return Math_Grade;
	}
	public void setMath_Grade(String math_Grade) {
		Math_Grade = math_Grade;
	}
	public String getSS_Grade() {
		return SS_Grade;
	}
	public void setSS_Grade(String sS_Grade) {
		SS_Grade = sS_Grade;
	}
	public String getS_Grade() {
		return S_Grade;
	}
	public void setS_Grade(String s_Grade) {
		S_Grade = s_Grade;
	}
	public int getTotal_marks() {
		return Total_marks;
	}
	public void setTotal_marks(int total_marks) {
		Total_marks = total_marks;
	}
	
	public Long getUniversity_seat_number() {
		return university_seat_number;
	}
	public void setUniversity_seat_number(Long university_seat_number) {
		this.university_seat_number = university_seat_number;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public String getDate_of_birth() {
		return Date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		Date_of_birth = date_of_birth;
	}
	public String getFather_name() {
		return Father_name;
	}
	public void setFather_name(String father_name) {
		Father_name = father_name;
	}
	public int getKannada() {
		return kannada;
	}
	public void setKannada(int kannada) {
		this.kannada = kannada;
	}
	public int getEnglish() {
		return English;
	}
	public void setEnglish(int english) {
		English = english;
	}
	public int getHindi() {
		return Hindi;
	}
	public void setHindi(int hindi) {
		Hindi = hindi;
	}
	public int getMathematics() {
		return Mathematics;
	}
	public void setMathematics(int mathematics) {
		Mathematics = mathematics;
	}
	public int getSocial_science() {
		return Social_science;
	}
	public void setSocial_science(int social_science) {
		Social_science = social_science;
	}
	public int getScience() {
		return Science;
	}
	public void setScience(int science) {
		Science = science;
	}
	public int getObtained_marks() {
		return Obtained_marks;
	}
	public void setObtained_marks(int obtained_marks) {
		Obtained_marks = obtained_marks;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
}