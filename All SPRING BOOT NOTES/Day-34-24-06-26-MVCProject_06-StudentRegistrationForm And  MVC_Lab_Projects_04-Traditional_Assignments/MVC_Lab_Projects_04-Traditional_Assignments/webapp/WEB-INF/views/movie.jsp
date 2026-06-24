<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>

<h2>Movie Ticket Booking</h2>

<form action="saveMovie" method="post">

Customer Name :
<input type="text" name="customerName"><br><br>

Movie Name :
<input type="text" name="movieName"><br><br>

Tickets :
<input type="number" name="tickets"><br><br>

Show Time :
<input type="text" name="showTime"><br><br>

<input type="submit" value="Book">

</form>

</body>
</html>
