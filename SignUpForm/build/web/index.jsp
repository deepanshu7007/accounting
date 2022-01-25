<%-- 
    Document   : index
    Created on : Nov 20, 2021, 11:08:43 AM
    Author     : deepa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration page</title>
    </head>
    <body>
        <form action="FormSubmit" id="myform">
            <label>First-Name</label>
            <input type="text" name="first_name"><br><br>
            <label>Last-Name</label>
            <input type="text" name="last_name"><br><br>
            <label>User-Name</label>
            <input type="text"  name="user_name"><br><br>
            <label>Password</label>
            <input type="password" name="password"><br><br>
            <input type="submit">
        </form>
    </body>
    <script
  src="https://code.jquery.com/jquery-3.6.0.min.js">
     
    </script>
    <script>
        $(document).ready(function(){
            console.log("This is ready to use");
    $("#myform").on('submit',function(event){
       event.preventDefault();
       var f = $(this).serialize();
       console.log(f);
    })    
    });
    </script>
</html>
