<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registrar Histórico</title>	
</head>
<body>
<h1>Registro de Histórico</h1>
<div class="panel">
	<div class="transcript-register">
		
		Número de semestres concluídos: <select name="semestersDone">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
			<option value="9">9</option>
			<option value="10">10</option>
			<option value="11">11</option>
			<option value="12">12</option>
			<option value="13">13</option>
			<option value="14">14</option>
			<option value="15">15</option>
			<option value="16">16</option>
		</select>
		<br></br><br></br>
		
		<table border="0" cellpadding="1" cellspacing="1" style="width: 500px">
			
			<tr><td>Menção</td><td>Nome da Disciplina</td></tr>
			<tr><td><input name="mention1" size ="2" type="text"/></td> <td><input name="discipline1" type="text" /></td> </tr>
			<tr><td><input name="mention2" size ="2" type="text"/></td> <td><input name="discipline2" type="text" /> </td></tr>
			<tr><td><input name="mention3" size ="2" type="text"/></td> <td><input name="discipline3" type="text" /> </td> </tr>
			<tr><td><input name="mention4" size ="2" type="text"/></td> <td><input name="discipline4" type="text" /> </td> </tr>
			<tr><td><input name="mention5" size ="2" type="text"/></td> <td><input name="discipline5" type="text" /> </td> </tr>
			<tr><td><input name="mention6" size ="2" type="text"/></td> <td><input name="discipline6" type="text" /> </td> </tr>
        	
        </table> 
        <input name="confirm" type="submit" value="Confirmar" actionListener="#{transcriptMB}">
	</div>
</div>
	
	
</body>
</html>