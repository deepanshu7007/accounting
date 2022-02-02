<%-- 
    Document   : ContactPage
    Created on : Nov 29, 2021, 9:36:51 PM
    Author     : deepa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!doctype html>
<html lang="en">
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
