<%@page import="StuMarksSheetDto.StuMarksDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="background-color: #36B4AC; height: 900px">
<center>

<h1><b><u><font color="#ff0066"> All The Details Of Students</font></u></b></h1>
</center><br><br>
<% List<StuMarksDto>  l1 =(List<StuMarksDto>)request.getAttribute("SheetList"); %>
<center>
<table style="border: 2px solid black" border="1px">
<tr>
<th>University Seat Number</th>
<th>Student NAME</th>
<th>Date Of Birth</th>
<th>Father Name</th>
<th>Kannada</th>
<th>English</th>
<th>Hindi</th>
<th>Mathematics</th>
<th>Social Science</th>
<th>Science</th>
<th>Total Marks</th>
<th>Obtained Marks</th>
<th>Percentage</th>
<th>Remove</th>
<th>Update</th>
</tr>
<%for(StuMarksDto d:l1) {%>

<tr>
<td><%=d.getUniversity_seat_number() %></td>
<td><%=d.getStudent_name() %></td>
<td><%=d.getDate_of_birth() %></td>
<td><%=d.getFather_name() %></td>
<td><%=d.getKannada() %></td>
<td><%=d.getEnglish() %></td>
<td><%=d.getHindi() %></td>
<td><%=d.getMathematics() %></td>
<td><%=d.getSocial_science() %></td>
<td><%=d.getScience() %></td>
<td><%=d.getTotal_marks() %></td>
<td><%=d.getObtained_marks() %></td>
<td><%=d.getPercentage() %></td>
<td><a href="delete?seatnum=<%=d.getUniversity_seat_number() %>">Remove</a></td>
<td><a href="update.jsp?seatnum=<%=d.getUniversity_seat_number()%>&stuname=<%=d.getStudent_name()%>&dob=<%=d.getDate_of_birth()%>&fname=<%=d.getFather_name()%>&kan=<%=d.getKannada()%>&eng=<%=d.getEnglish()%>&hin=<%=d.getHindi()%>&math=<%=d.getMathematics()%>&ss=<%=d.getSocial_science()%>&science=<%=d.getScience()%>&om=<%=d.getObtained_marks()%>&tm=<%=d.getTotal_marks()%>&per=<%=d.getPercentage()%>">Update</a></td>
</tr>
<%} %>

</table>
</center>
</div>
</body>
</html>