<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich</title>
</head>
<body>
<h2>SandWich with?</h2>
<br>
<form action="/save" method="get">
    <input type="checkbox" id="lettuce" name="condiment" value="lettuce">
    <label for="lettuce"> Lettuce</label><br>
    <input type="checkbox" id="tomato" name="condiment" value="tomato">
    <label for="tomato"> Tomato</label><br>
    <input type="checkbox" id="mustard" name="condiment" value="mustard">
    <label for="mustard"> Mutard</label><br>
    <input type="checkbox" id="sporouts" name="condiment" value="sporouts">
    <label for="sporouts"> Sporouts</label><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>