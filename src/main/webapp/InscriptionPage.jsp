<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ProjetGestionImpression</title>
</head>
<body>
<h2>Inscription d'Utilisateur</h2>
<form action="" method="post">
    <label for="prenom">Prénom :</label><br>
    <input type="text" id="prenom" name="prenom" required><br><br>

    <label for="nom">Nom :</label><br>
    <input type="text" id="nom" name="nom" required><br><br>

    <label for="login">Nom d'utilisateur :</label><br>
    <input type="text" id="login" name="login" required><br><br>

    <label for="motDePasse">Mot de passe :</label><br>
    <input type="password" id="motDePasse" name="motDePasse" required><br><br>

    <input type="submit" value="S'inscrire">
</form>
</body>
</html>
