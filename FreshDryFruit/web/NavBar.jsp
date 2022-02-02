<%@page import="com.shop.entities.User"%>
<html lang="en">

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Dancing+Script&display=swap" rel="stylesheet">
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              >
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css">
        <title>world!</title>
    </head>

    <body>
<nav class="navbar navbar-expand-lg navbar-dark bg-black">
    <div class="container-fluid ">
        <span><img src="https://img.icons8.com/small/16/ffffff/bull.png" /></span>
        <a class="navbar-brand" href="HomePage.jsp">Dry Fruits</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
            data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
            aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse " id="navbarSupportedContent">
            <ul class="navbar-nav   ">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="HomePage.jsp"><i class="bi bi-house"></i>Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="bi bi-collection"></i>Menu</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="bi bi-cart3"></i> Shop</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="ContactPage.jsp"><i class="bi bi-person-lines-fill"></i> Contact-Us</a>
                </li>
                <%
                User u = (User)session.getAttribute("currentUser");
                if(u!=null){
                %>
                <li class="nav-item">
                    <a class="nav-link" href="ProfilePage.jsp"><i class="bi bi-person"></i> <%=u.getName()%></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="ProfilePage.jsp"><i class="bi bi-box-arrow-left "></i> Logout</a>
                </li>
                <%
                }else
                {
                %>
                <li class="nav-item">
                    <a class="nav-link" href="LoginPage.jsp"><i class="bi bi-person"></i> Log-in</a>
                </li>
                <li class="nav-item justify-content-lg-end">
                    
                    <a class="nav-link bi bi-person-plus" href="SubmitForm.jsp"><i class=""></i> Sign-up</a>
                </li>
                <%
                }
                %>

                
            </ul>
        </div>
    </div>
</nav>