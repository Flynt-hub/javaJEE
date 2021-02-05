<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Test du langage EL</title>
		<style type="text/css" src="style/style.css" ></style>
	</head>
	<body>
		<c:out value='${Personnes[0].getName() } ${Personnes[0].getSurname() }' default='Personne inconnue' />
		<br>	
		<c:if test="${Personnes[1].getSurname() == 'DUPONT'}" var="retourTest"></c:if><!-- on stock le test dans une variable -->
		<c:if test='${retourTest}'>
			Bonjour M. <c:out value='${Personnes[1].getName() } ${Personnes[1].getSurname() }' />			
		</c:if>		
		<br>
		<c:forEach begin="0" end="1" step="1" var="i">
			<c:out value='${Personnes[i].getName() } ${Personnes[i].getSurname() }'/><br>
		</c:forEach>		
	</body>
</html>