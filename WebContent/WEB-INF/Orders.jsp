<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Cr�ation d'une commande</title>
        <link type="text/css" rel="stylesheet" href="style/style.css" />
    </head>
    <body>
        <div>
			<h1>Cr�ation d'une commande</h1>
            <form method="get" action="creationCommande">
                <fieldset>
                    <legend>Informations client</legend>
    
					<label for="idClient">Num�ro client</label>
                    <input type="text" id="idClient" name="idClient" value="" size="5" maxlength="5" disabled="disabled"/>
					<br />
                    <label for="nomClient">Nom</label>
                    <input type="text" id="nomClient" name="nomClient" value="" size="20" maxlength="20" disabled="disabled"/>
                    <br />
                    
                    <label for="prenomClient">Pr�nom </label>
                    <input type="text" id="prenomClient" name="prenomClient" value="" size="20" maxlength="20" disabled="disabled"/>
                    <br />
    
                    <label for="adresseClient">Adresse de livraison</label>
                    <input type="text" id="adresseClient" name="adresseClient" value="" size="20" maxlength="20" disabled="disabled"/>
                    <br />
    
                    <label for="telephoneClient">Num�ro de t�l�phone</label>
                    <input type="text" id="telephoneClient" name="telephoneClient" value="" size="20" maxlength="20" disabled="disabled"/>
                    <br />
                    
                    <label for="emailClient">Adresse email</label>
                    <input type="email" id="emailClient" name="emailClient" value="" size="20" maxlength="60" disabled="disabled"/>
                    <br />
                </fieldset>
                <fieldset>
                    <legend>Informations commande</legend>
                    <label for="numCommande">num�ro</label>
                    <input type="number" id="numCommande" name="numCommande" value="" size="20" maxlength="20" disabled />
                    <br />

                    <label for="dateCommande">Date <span class="requis">*</span></label>
                    <input type="text" id="dateCommande" name="dateCommande" value="" size="20" maxlength="20" disabled />
                    <br />
                    
                    <label for="montantCommande">Montant <span class="requis">*</span></label>
                    <input type="text" id="montantCommande" name="montantCommande" value="" size="20" maxlength="20" />
                    <br />
                    
                    <label for="modePaiementCommande">Mode de paiement <span class="requis">*</span></label>
					<select id="modePaiementCommande" name="modePaiementCommande">
						<option>Carte bancaire</option>
						<option>Ch�que</option>
						<option>Argent liquide</option>
					</select>
                    <br />
                    
                    <label for="statutPaiementCommande">Statut du paiement</label>
					<select id="statutPaiementCommande" name="statutPaiementCommande">
						<option>Non pay�</option>
						<option>Pay�</option>
					</select>
                    <br />
                    
                    <label for="modeLivraisonCommande">Mode de livraison <span class="requis">*</span></label>
					<select id="modeLivraisonCommande" name="modeLivraisonCommande">
						<option>Relais</option>
						<option>Domicile Standard</option>
						<option>Express</option>
					</select>
                    <br />
                    
                    <label for="statutLivraisonCommande">Statut de la livraison</label>
 					<select id="statutLivraisonCommande" name="statutLivraisonCommande">
						<option>Non livr�</option>
						<option>En cours de livraison</option>
						<option>Livr�</option>
					</select>
                    <br />
                </fieldset>
				<fieldset>
					<input type="submit" value="Valider"  />
					<input type="reset" value="Remettre � z�ro" /> <br />
				</fieldset>
			</form>
        </div>
    </body>
</html>