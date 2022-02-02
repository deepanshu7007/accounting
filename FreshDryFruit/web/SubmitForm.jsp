<%-- 
    Document   : SubmitForm.jsp
    Created on : Nov 29, 2021, 8:39:29 PM
    Author     : deepa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

        <%@include file="NavBar.jsp"%>

        <div class="container my-lg-2 align-content-center ">
            <div class="card primary" style="width: 55rem;">
                <div class="card-body">
                    <form id="reg-form" >
                        <h1>Sign-up</h1>
                        <div class="mb-1">
                            <label for="exampleInputEmail1" class="form-label">Email address</label>
                            <input name = "user_email" type="email" class="form-control" id="exampleInputEmail1"
                                   aria-describedby="emailHelp">
                            <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                        </div>
                        <div class="mb-3">
                            <label for="exampleInputPassword1" class="form-label">Password</label>
                            <input type="password" name = "user_password" class="form-control" id="exampleInputPassword1">
                        </div>
                        <div class="mb-3">
                            <label for="exampleInputPassword1" class="form-label">Name</label>
                            <input type="text" name = "user_name" class="form-control" id="exampleInputPassword2">
                        </div>
                        <div class="mb-3">
                            <label for="exampleInputPassword1" class="form-label">Address</label>
                            <input type="textarea" name="user_address" class="form-control" id="text-Area">
                        </div>
                        <div class="mb-3 form-check">
                            <input type="checkbox" name = "check"class="form-check-input" id="exampleCheck1" required>
                            <label class="form-check-label" for="exampleCheck1">I agree terms and conditions</label>
                        </div>
                        <div class="spinner-border container text-centercenter" id="loader" style="display:none"role="status">
                            
                        </div><br>
                        <button type="submit" id="submit-button"class="btn btn-primary">Submit</button>
                    </form>
                </div>
            </div>
        </div>

 
    </body>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
     <script>
                         
                    $('#reg-form').on('submit', function (event) {
                        event.preventDefault();
                        let form = new FormData(this);
                        $("#sumbimt-btn").hide();
                        $("#loader").show();
                        //send register servlet:
                        $.ajax({
                            url: "RegisterServlet",
                            type: 'POST',
                            data: form,
                            success: function (data, textStatus, jqXHR) {
                                console.log(data)
                                $("#sumbimt-btn").show();
                                $("#loader").hide();
                                if (data.trim() === 'done')
                                {
                                    swal("Registered successfully..We are going to redirect to login page")
                                            .then((value) => {
                                                window.location = "login_page.jsp"
                                            });
                                } else
                                {
                                    swal(data);
                                }
                            },
                            error: function (jqXHR, textStatus, errorThrown) {
                                $("#sumbimt-btn").show();
                                $("#loader").hide();
                                swal("something went wrong..try again");
                            },
                            processData: false,
                            contentType: false
                        });
                    });
                
     </script>

   

    <%@include file="Footer.jsp" %>

</html>
