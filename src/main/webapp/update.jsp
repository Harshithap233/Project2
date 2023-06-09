<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="marksheetupdate">
<table>
<tr>
<td><label for="seatnum"><B>University Seat Number:</B></label></td>
<td><input type="number" name="seatnum" value=<%=request.getParameter("seatnum")%>></td>
</tr>
<tr>
<td><label for="first"><B>Student NAME:</B></label></td>
<td><input type="text" name="stuname" value=<%=request.getParameter("stuname")%>></td>
</tr>
<tr>
<td><label for="dob"><B>Date Of Birth:</B></label></td>
<td><input type="date" name="dob" value=<%=request.getParameter("dob") %>></td>
</tr>
<tr>
<td><label for="fname"><B>Father Name:</B></label></td>
<td><input type="text" name="fname" value=<%=request.getParameter("fname") %>></td>
</tr>
<tr>
<td><label for="kan"><B>Kannada:</B></label></td>
<td><input type="number" name="kan" value=<%=request.getParameter("kan")%>></td>
</tr>
<tr>
<td><label for="eng"><B>English::</B></label></td>
<td><input type="number" name="eng" value=<%=request.getParameter("eng") %>></td>
</tr>
<tr>
<td><label for="hin"><B>Hindi:</B></label></td>
<td><input type="number" name="hin" value=<%=request.getParameter("hin") %>></td>
</tr>
<tr>
<td><label for="math"><B>Mathematics:</B></label></td>
<td><input type="number" name="math" value=<%=request.getParameter("math") %>></td>
</tr>
<tr>
<td><label for="ss"><B>Social Science:</B></label></td>
<td><input type="number" name="ss" value=<%=request.getParameter("ss") %>></td>
</tr>
<tr>
<td><label for="science"><B>Science:</B></label></td>
<td><input type="number" name="science" value=<%=request.getParameter("science") %>></td>
</tr>
<tr>
<td><label for="om"><B>Obtained Marks:</B></label></td>
<td><input type="number" name="om" value=<%=request.getParameter("om") %>></td>
</tr>
<tr>

<td><label for="tm"><B>Total Marks:</B></label></td>
<td><input type="number" name="tm" value=<%=request.getParameter("tm") %>></td>
</tr>

<tr>
<td><label for="per"><B>Percentage:</B></label></td>
<td><input type="number" name="per" value=<%=request.getParameter("per") %>></td>

</tr>
<tr>
<td><button>update</button></td>
<td><button>Cancel</button></td>
</tr>
</table>
</form>
</body>
</html>
</body>
</html>