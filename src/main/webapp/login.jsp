<%@page import="StuMarksSheetDto.StuMarksDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<nav style="border: 15px solid black ; position:relative; left:230px;  border-color:#C5A576; height: 1000px; width: 1000px;  background-image: linear-gradient(to left,#FFCCFF,#FFFFCC,#b3ecff);">

<br>

<center>
<img alt="" src="https://tse1.mm.bing.net/th?id=OIP.7nj3OMfGCFvlsPu6sLiJkwAAAA&pid=Api&P=0&h=180" height="100px" width="150px" border="0px"></center>
<%StuMarksDto d1=(StuMarksDto)request.getAttribute("marklist");%>
<center>
<P><font color="red">GOVERNMENT OF KARNATAKA</font></P>
<P><fon size="30px"><h1>Karnataka Secondary Education Examination Board</h1></fon></P>
<P><font color="blue">THIS IS TO CERTIFY THAT THE BELOW MENTIONED CANDIDATE HAS PASSED SSLC EXAMINATION</font></P>
</center>

<center>

<table style="border: 2px solid black; border-collapse: collapse;" border="2px" height="100px" width="900px">
<tr>
<td><center>University Seat Number:<b><%=d1.getUniversity_seat_number()%></b></center></td>
<td><center>Student Name:<b><%=d1.getStudent_name()%></b></center></td>
</tr>
<tr>

<td><center>Father Name:<b><%=d1.getFather_name()%></b></center></td>
<td><center>Date Of Birth:<b><%=d1.getDate_of_birth()%></b></center></td>
</tr>
</table>
</center><br>
<center>
<table style="border:2px solid black; border-collapse: collapse;" width="900px" height="20px">
<tr>
<td><center><b>PART-A</b></center></td>
</tr>

</table>
<table style="border: 2px solid black; border-collapse: collapse;" border="2px" height="300px" width="900px">
<tr style="background-color: #ffccff">
<th><center><h4>Subjects</h4></center></th>
<th><h4>Max Marks</h4></th>
<th>Min Marks</th>
<th><h4>Marks Obtained</h4></th>
<th><h4>Grade</h4></th>
</tr>
<tr>
<td style=""><center>Kannada</center></td>
<td><center>100</center></td>
<td><center>35</center></td>
<td><center><%=d1.getKannada()%></center></td>
<td><center><%=d1.getKan_Grade() %></center></td>
</tr>

<tr>
<td><center>English</center></td>
<td><center>100</center></td>
<td><center>35</center></td>
<td><center><%=d1.getEnglish()%></center></td>
<td><center><%=d1.getEng_Grade() %></center></td>
</tr>
<tr>
<td><center>Hindi</center></td>
<td><center>100</center></td>
<td><center>35</center></td>
<td><center><%=d1.getHindi()%></center></td>
<td><center><%=d1.getHin_Grade() %></center></td>
</tr>
<tr>
<td><center>Mathematics</center></td>
<td><center>100</center></td>
<td><center>35</center></td>
<td><center><%=d1.getMathematics()%></center></td>
<td><center><%=d1.getMath_Grade() %></center></td>
</tr>
<tr>
<td><center>Social Science</center></td>
<td><center>100</center></td>
<td><center>35</center></td>
<td><center><%=d1.getSocial_science()%></center></td>
<td><center><%=d1.getSS_Grade() %></center></td>
</tr>
<tr>
<td><center>Science</center></td>
<td><center>100</center></td>
<td><center>35</center></td>
<td><center><%=d1.getScience()%></center></td>
<td><center><%=d1.getS_Grade() %></center></td>
</tr>
<tr style="background-color: #ffccff">
<td><center><b>Total Marks</b></center></td>
<td><center><b><%=d1.getTotal_marks()%></b></center></td>
<td><center><b>210</b></center></td>
<td><center><b><%=d1.getObtained_marks()%></b></center></td>
<td><center><b><%=d1.getOb_Grade() %></b></center></td>
</tr>
</table>
</center>

<center>
<table style="border: 2px solid black;border-collapse: collapse;" border="1px" height="40px" width="900px">
<tr style="background-color: #ffccff">
<td><b><center>Percentage</center></b></td>
<td><b><%=d1.getPercentage()%></b></td>
<td><b><center>Grade</center></b></td>
<td><b><%=d1.getGrade() %></b></td>
</tr>
</table>
</center>

<center>

<table style="border:2px solid black; border-collapse: collapse;" width="900px" height="20px">
<tr>
<td><center><b>PART-B</b></center></td>
</tr>

</table>

<table style="border: 2px solid black; border-collapse: collapse;" border="1px"  height="60px" width="900px">

<tr>

<th>SLNO</th>
<th>CO-SCHOLASTIC SUBJECTS</th>
<th>GRADE</th>
<th>SLNO</th>
<th>CO-SCHOLASTIC SUBJECTS</th>
<th>GRADE</th>
</tr>
<tr>
<td>1.</td>
<td>Physical & Health Education</td>
<td><b>A</b></td>
<td>2.</td>
<td>Attitude & Values</td>
<td><b>A</b></td>
</tr>
<tr>
<td>3.</td>
<td>Work Experience</td>
<td><b>A</b></td>
<td>4.</td>
<td>Art Education</td>
<td><b>A</b></td>
</tr>
</table>
</center><br><br>
<center>
<button onclick="window.print()">Print</button>
</center>
</div>
</nav>
</body>
</html>