<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Dashboard Administrateur</title>

    <style type="text/css">
        body{
            text-align: center;
        }
        table {
            margin-left: 15%;
            min-width: 70%;
            border: 1px solid #CCC;
            border-collapse: collapse;
        }
        table tr{line-height: 30px;}
        table tr th { background: #000033; color: #FFF;}
        table tr td { border:1px solid #CCC; margin: 5px;}
        input[type=text], input[type=email], input[type=tel]{
            min-width: 60%;
        }
        input[type=submit], a{
            background: green;
            padding: 5px;
            margin: 5px;
            color: #FFF;
        }
        a{
            text-decoration: none;
        }
    </style>
</head>
<body>
<h1>Gestion des utilisateurs</h1>
<c:url value="/user/inscription" var="registerUrl" />
<form action="/user/inscription" method="post">
    <table>
        <tr>
            <td>Nom:</td>
            <td><input type="text" name="firstName"  required></td>
        </tr>
        <tr>
            <td>Prénom:</td>
            <td><input type="text" name="lastName" required></td>
        </tr>
        <tr>
            <td>Login:</td>
            <td><input type="email" name="email" required></td>
        </tr>
        <tr>
            <td>Mot de passe:</td>
            <td><input type="password"  name="mobile" required></td>
        </tr>
       <tr>
    <td>Rôle :</td>
    <td>
    <select id="role" name="role">
        <option value="Admin">Admin</option>
        <option value="Enseignant">Enseignant</option>
        <option value="Agent">Agent</option>
    </select>
    </td>
</tr>
            <tr>
                <td colspan="2"><input type="submit" value="Enregistrer"></td>
            </tr>
    </table>
</form>
<br>
<h1>Liste des comptes</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Nom</th>
        <th>Prenom</th>
        <th>Login</th>
        <th>Rôle</th>
        <th>Statut</th>
        <th>Modifier Statut</th>
    </tr>

</table>
</body>
</html>