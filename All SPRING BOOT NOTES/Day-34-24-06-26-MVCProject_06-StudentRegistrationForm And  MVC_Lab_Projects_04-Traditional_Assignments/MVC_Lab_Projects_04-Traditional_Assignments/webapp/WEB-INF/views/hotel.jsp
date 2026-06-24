<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>

<h2>Hotel Reservation</h2>

<form action="saveHotel" method="post">

Customer Name :
<input type="text" name="customerName"><br><br>

Room Type :
<input type="text" name="roomType"><br><br>

Days :
<input type="number" name="days"><br><br>

Contact :
<input type="text" name="contact"><br><br>

<input type="submit" value="Reserve">

</form>

</body>
</html>
