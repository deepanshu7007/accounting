<%-- 
    Document   : ContactPage
    Created on : Nov 29, 2021, 9:36:51 PM
    Author     : deepa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.css" rel="stylesheet">
    <script src="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.js"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Dancing+Script&display=swap" rel="stylesheet">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Pacifico&display=swap" rel="stylesheet">
    <title>world!</title>
</head>

<body>
    <%@include file="NavBar.jsp"%>
    <main>
        <div class="container shadow-sm bg-black my-5 rounded-3 text-white text-center p-3">
            <h1 style="font-family: 'Pacifico', cursive;" class="border-bottom">CONTACT</h1>
            <h2>we would love to help you</h2>
            <h6>we like to create things with fun and we hope that you like it</h6>
            <div class="container px-4">
                <div class="row gx-5">
                    <div class="col">
                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">Email address</label>
                            <input type="email" class="form-control" id="exampleInputEmail1"
                                aria-describedby="emailHelp">

                        </div>
                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">Email address</label>
                            <input type="email" class="form-control" id="exampleInputEmail1"
                                aria-describedby="emailHelp">

                        </div>
                        <div class="p-3 border rounded-3 bg-light">
                            <div class="input-group">
                                <span class="input-group-text">With textarea</span>
                                <textarea class="form-control" aria-label="With textarea"></textarea>
                            </div>
                        </div>
                        <div class="pt-3 ">
                            <button class="btn w-25 btn-primary rounded-3">Submit</button>
                            </div>
                    </div>
                    <div class="col">
                        <div class="p-3 border-5 shadow-lg  rounded-3 bg-light">Custom column padding</div>
                    </div>
                </div>
            </div>
        </div>

    </main>
</body>
<%@include file="Footer.jsp"%>
</html>
