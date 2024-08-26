<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="public/bootstrap-5.3.3-dist/css/bootstrap.min.css" rel="stylesheet" />
<title>Insert title here</title>
</head>
<body>
  <div class="container mt-3 col-md-10 col-md-offset-1">
  <h3 class="navbar navbar-dark bg-primary" style="color:white;">Recherche des produits</h3>
  <div class="card">
    <div class="card-body">
       <form action="chercher.do" method="get">
           <label>Mot Clé:</label>
           <input type="text" name="motCle" />
            <button type="submit" class="btn btn-primary">Chercher</button>
       </form>
    </div>

  <br>
  </div>
    
</div>
</body>
</html>