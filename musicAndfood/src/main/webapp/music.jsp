<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="song.do" method="post">
<pre>
SongName:<input type="text" name="songName"/><br>
Singer:<input type="text" name="singerName"/><br>
Duration:<input type="text" name="time"/><br>
ProducerName:<input type="text" name="producer"/><br>
Lyricswritter:<input type="text" name="lyricsWritter"/><br>
Language:
<select name="language">
<option>Kannada</option>
<option>Telagu</option>
<option>Hindhi</option>
<option>English</option>
</select>
<br>
SongType:
<select name="type">
<option>Love Song</option>
<option>Item Song</option>
<option>Patho Song</option>
<option>Party Song</option>
</select>
<br>
<input type="submit" value="Save"/>
</pre>
</form>
</body>
</html>