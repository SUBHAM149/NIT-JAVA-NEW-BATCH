<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>

<h2>Patient Registration</h2>

<form action="savePatient" method="post">

Patient Id :
<input type="number" name="patientId"><br><br>

Patient Name :
<input type="text" name="patientName"><br><br>

Disease :
<input type="text" name="disease"><br><br>

Doctor Name :
<input type="text" name="doctorName"><br><br>

<input type="submit" value="Submit">

</form>

</body>
</html>
