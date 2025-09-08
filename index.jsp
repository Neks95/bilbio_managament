<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login</title>
 
  <link href="assets/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="assets/style.css">

</head>
<body class="d-flex align-items-center justify-content-center" style="height:100vh;">

  <div class="card shadow p-4" style="width: 20rem; background-color: #fffaf5;">
    <h4 class="text-center mb-4" style="color:#6f4a2a;">Login</h4>
    <form action="traitement.jsp" method="post">
      <div class="mb-3">
        <input type="email" class="form-control" placeholder="pseudo" name="pseudo">
      </div>
      <div class="mb-3">
        <input type="password" class="form-control" placeholder="Mot de passe" name="mdp">
      </div>
      <div class="d-grid">
        <button type="submit" class="btn btn-brown">Login</button>
      </div>
    </form>
  </div>

</body>
</html>
