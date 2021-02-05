<!doctype html>
<html lang="fr">
<head>
	<meta charset="utf-8">
	<title>Création d'un client</title>
	<link type="text/css" rel="stylesheet" href="./style/style.css" />
</head>
<title>Création d'un client</title>
<body>
	<div>
		<h1>Création d'un client</h1>

		<form method="post" action="">
			<fieldset>
				<legend>Informations client</legend>
<!-- 
				<label for="idClient">Numéro client</label>
				<input type="text" id="idClient" name="idClient" value="" size="5" maxlength="5" disabled="disabled"/>
-->				<br />

				<label for="nomClient">Nom <span class="requis">*</span></label>
				<input type="text" id="nomClient" name="nomClient" value="<c:if test='${CustomerExist}'><c:out value='${LastCustomer.getName()}'/></c:if>" size="20" maxlength="20" />
				<br />
				
				<label for="prenomClient">Prénom </label>
				<input type="text" id="prenomClient" name="prenomClient" value="<c:if test='${CustomerExist}'><c:out value='${LastCustomer.getSurname()}'/></c:if>" size="20" maxlength="20" />
				<br />

				<label for="adresseClient1">Adresse <span class="requis">*</span></label>
				<input type="text" id="adresseClient1" name="adresseClient1" value="<c:if test='${CustomerExist}'><c:out value='${LastCustomer.getFirstAddress()}'/></c:if>" size="20" maxlength="20" />
				<br />

				<label for="adresseClient2">Adresse suite</label>
				<input type="text" id="adresseClient2" name="adresseClient2" value="<c:if test='${CustomerExist}'><c:out value='${LastCustomer.getSecondAddress()}'/></c:if>" size="20" maxlength="20" />
				<br />

				<label for="cpClient">Code postal <span class="requis">*</span></label>
				<input type="text" id="cpClient" name="cpClient" value="<c:if test='${CustomerExist}'><c:out value='${LastCustomer.getZipCode()}'/></c:if>" size="6" maxlength="6" />
				<br /><br />

				<label for="villeClient">Ville <span class="requis">*</span></label>
				<select id="villeClient" name="villeClient">
					<!-- <c:if test="${CustomerExist}"><option value="${LastCustomer.city}"/></c:if>-->
					<!-- <c:if test='${!CustomerExist}'>-->
						<c:forEach items="${CityList}" var="City">
							<option><c:out value='${City}'/> <!-- <c:if test="${LastCustomer.city == City}">selected="selected" </c:if> --> 
							   
							</option>				
						</c:forEach>
					<!-- </c:if>-->
				</select>
				<br />

				<label for="telephoneClient">Numéro de téléphone <span class="requis">*</span></label>
				<input type="text" id="telephoneClient" name="telephoneClient" value="<c:if test='${CustomerExist}'><c:out value='${LastCustomer.getPhone()}'/></c:if>" size="14" maxlength="14" />
				<br />
				
				<label for="emailClient">Adresse email</label>
				<input type="email" id="emailClient" name="emailClient" value="<c:if test='${CustomerExist}'><c:out value='${LastCustomer.getEmail()}'/></c:if>" size="40" maxlength="60" />
				<br />
			</fieldset>
			
			<fieldset>
				<legend>Liste des commandes</legend>
				<table>
					<tr>
						<th>Numéro</th>
						<th>Date</th>
						<th>Montant</th>
						<th>Mode de paiement</th>
						<th>Mode de livraison</th>
					</tr>
<!-- 					<tr>
						<td>1</td>
						<td>10/11/2021</td>
						<td>100</td>
						<td>Espèces</td>
						<td>Relais</td>
					</tr>
-->				</table>
			</fieldset>			
			<fieldset>
				<input type="submit" name="valider"  value="Valider"  />
					<c:if test='${CustomerExist}'>
						<input type="submit" name="commande" value="Commande"  />
					</c:if>
				<input type="reset"  value="Remettre à zéro" /> <br />
			</fieldset>
		</form>
	</div>
</body>
</html>