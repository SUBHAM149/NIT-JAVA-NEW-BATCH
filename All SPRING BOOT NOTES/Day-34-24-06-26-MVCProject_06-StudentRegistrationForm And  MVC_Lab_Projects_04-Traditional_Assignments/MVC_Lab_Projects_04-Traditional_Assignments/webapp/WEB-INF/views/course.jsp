<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>

<h2>Course Enrollment</h2>

<form action="saveCourse" method="post">

Student Name :
<input type="text" name="studentName"><br><br>

Course Name :
<input type="text" name="courseName"><br><br>

Duration :
<input type="text" name="duration"><br><br>

Fee :
<input type="number" name="fee"><br><br>

<input type="submit" value="Enroll">

</form>

</body>
</html>
