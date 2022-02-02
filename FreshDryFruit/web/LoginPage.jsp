<%@page import="com.shop.entities.Message"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
        <%@include file="NavBar.jsp"%>
        <div class="container pt-5 align-items-center">
            <div class="row">
                <div class="col">
                    <img src="https://cdn.pixabay.com/photo/2018/03/02/18/56/apple-3193936_960_720.jpg" class="img-fluid rounded-3 shadow-lg" alt="...">
                </div>
                <div class="col">
                    <div class="card  shadow-lg" style="width: 25rem;">
                        <div class="card-body">
                            <h5 class="card-title">Login</h5>
                            <%
                                Message msg = (Message) session.getAttribute("msg");
                                if (msg != null) {


                            %>
                            <div class="alert <%=msg.getCssClass()%>" role="alert">
                                <%=msg.getContent()%>
                            </div>                      
                            <%
                                    session.removeAttribute("msg");
                                }
                            %>
                            <form action="LoginServlet" method="post" >
                                <div class="mb-3">
                                    <label for="exampleInputEmail1" class="form-label">Email address</label>
                                    <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                                </div>
                                <div class="mb-3">
                                    <label for="exampleInputPassword1" class="form-label">Password</label>
                                    <input type="password" name = "password"class="form-control" id="exampleInputPassword1">
                                </div>
                                <div class="mb-3 form-check">
                                    <input type="checkbox" class="form-check-input" id="exampleCheck1">
                                    <label class="form-check-label" for="exampleCheck1">Check me out</label>
                                </div>
                                <button type="submit" class="btn btn-primary w-100">Submit</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
    <%@include file="Footer.jsp"%>
</html>
