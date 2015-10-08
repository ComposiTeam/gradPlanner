<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registrar Histórico</title>	
</head>
<script>

</script>
<body>
<h1>Registro de Histórico</h1>
<div class="panel">
	<div class="transcript-register">
		
		Número de semestres concluídos: <input name="semestersDone" type="text" size="2"> 
		<br></br><br></br>
		<input type="button" value="Inserir Mais"/>
		<table id="tableOfContents"border="0" cellpadding="1" cellspacing="1">
			
			<tr><td>Menção</td><td>Nome da Disciplina</td></tr>
			<tr><td><input name="mention1" size ="2" type="text"/></td> <td><input name="discipline1" type="text" /></td> </tr>
			<tr><td><input name="mention2" size ="2" type="text"/></td> <td><input name="discipline2" type="text" /> </td></tr>
			<tr><td><input name="mention3" size ="2" type="text"/></td> <td><input name="discipline3" type="text" /> </td> </tr>
			<tr><td><input name="mention4" size ="2" type="text"/></td> <td><input name="discipline4" type="text" /> </td> </tr>
			<tr><td><input name="mention5" size ="2" type="text"/></td> <td><input name="discipline5" type="text" /> </td> </tr>
			<tr><td><input name="mention6" size ="2" type="text"/></td> <td><input name="discipline6" type="text" /> </td> </tr>
        	
        </table> 
        <input name="confirm" type="submit" value="Confirmar" >
	</div>
</div>
	
	
</body>
</html>