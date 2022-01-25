package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SubmitForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/NavBar.jsp");
    _jspx_dependants.add("/Footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"https://unpkg.com/material-components-web@latest/dist/material-components-web.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://unpkg.com/material-components-web@latest/dist/material-components-web.min.js\"></script>\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Dancing+Script&display=swap\" rel=\"stylesheet\">\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"> </script>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("              >\n");
      out.write("\n");
      out.write("        <title>Submit Form</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-black\">\r\n");
      out.write("    <div class=\"container-fluid \">\r\n");
      out.write("        <span><img src=\"https://img.icons8.com/small/64/ffffff/bull.png\" /></span>\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"HomePage.jsp\">Dry Fruits</a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("            data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("            aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse \" id=\"navbarSupportedContent\">\r\n");
      out.write("            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0 \">\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link active\" aria-current=\"page\" href=\"HomePage.jsp\">Home</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Menu</a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Shop</a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"ContactPage.jsp\">Contact-Us</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"LoginPage.jsp\">Login</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"SubmitForm.jsp\">Sign-up</a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container my-lg-2 align-content-center \">\n");
      out.write("            <div class=\"card primary\" style=\"width: 55rem;\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form id=\"reg-form\" >\n");
      out.write("                        <h1>Sign-up</h1>\n");
      out.write("                        <div class=\"mb-1\">\n");
      out.write("                            <label for=\"exampleInputEmail1\" class=\"form-label\">Email address</label>\n");
      out.write("                            <input name = \"user_email\" type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\"\n");
      out.write("                                   aria-describedby=\"emailHelp\">\n");
      out.write("                            <div id=\"emailHelp\" class=\"form-text\">We'll never share your email with anyone else.</div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label for=\"exampleInputPassword1\" class=\"form-label\">Password</label>\n");
      out.write("                            <input type=\"password\" name = \"user_password\" class=\"form-control\" id=\"exampleInputPassword1\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label for=\"exampleInputPassword1\" class=\"form-label\">Name</label>\n");
      out.write("                            <input type=\"text\" name = \"user_name\" class=\"form-control\" id=\"exampleInputPassword2\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label for=\"exampleInputPassword1\" class=\"form-label\">Address</label>\n");
      out.write("                            <input type=\"textarea\" name=\"user_address\" class=\"form-control\" id=\"text-Area\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mb-3 form-check\">\n");
      out.write("                            <input type=\"checkbox\" name = \"check\"class=\"form-check-input\" id=\"exampleCheck1\" required>\n");
      out.write("                            <label class=\"form-check-label\" for=\"exampleCheck1\">I agree terms and conditions</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"spinner-border container text-centercenter\" id=\"loader\" style=\"display:none\"role=\"status\">\n");
      out.write("                            \n");
      out.write("                        </div><br>\n");
      out.write("                        <button type=\"submit\" id=\"submit-button\"class=\"btn btn-primary\">Submit</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("    </body>\n");
      out.write("    <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("     <script>\n");
      out.write("                         \n");
      out.write("                    $('#reg-form').on('submit', function (event) {\n");
      out.write("                        event.preventDefault();\n");
      out.write("                        let form = new FormData(this);\n");
      out.write("                        $(\"#sumbimt-btn\").hide();\n");
      out.write("                        $(\"#loader\").show();\n");
      out.write("                        //send register servlet:\n");
      out.write("                        $.ajax({\n");
      out.write("                            url: \"RegisterServlet\",\n");
      out.write("                            type: 'POST',\n");
      out.write("                            data: form,\n");
      out.write("                            success: function (data, textStatus, jqXHR) {\n");
      out.write("                                console.log(data)\n");
      out.write("                                $(\"#sumbimt-btn\").show();\n");
      out.write("                                $(\"#loader\").hide();\n");
      out.write("                                if (data.trim() === 'done')\n");
      out.write("                                {\n");
      out.write("                                    swal(\"Registered successfully..We are going to redirect to login page\")\n");
      out.write("                                            .then((value) => {\n");
      out.write("                                                window.location = \"login_page.jsp\"\n");
      out.write("                                            });\n");
      out.write("                                } else\n");
      out.write("                                {\n");
      out.write("                                    swal(data);\n");
      out.write("                                }\n");
      out.write("                            },\n");
      out.write("                            error: function (jqXHR, textStatus, errorThrown) {\n");
      out.write("                                $(\"#sumbimt-btn\").show();\n");
      out.write("                                $(\"#loader\").hide();\n");
      out.write("                                swal(\"something went wrong..try again\");\n");
      out.write("                            },\n");
      out.write("                            processData: false,\n");
      out.write("                            contentType: false\n");
      out.write("                        });\n");
      out.write("                    });\n");
      out.write("                \n");
      out.write("     </script>\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<div class=\"text-center bg-black text-white\" style=\"clip-path: polygon(24% 11%, 76% 0, 100% 26%, 99% 100%, 67% 100%, 19% 100%, 0 100%, 0 0);\n");
      out.write("\">\n");
      out.write("  <footer class=\"py-5\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      \n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("      <div class=\"col-3\">\n");
      out.write("        <h5>Section</h5>\n");
      out.write("        <ul class=\"nav flex-column\">\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Home</a></li>\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Features</a></li>\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">Pricing</a></li>\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">FAQs</a></li>\n");
      out.write("          <li class=\"nav-item mb-2\"><a href=\"#\" class=\"nav-link p-0 text-muted\">About</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"col-4 offset-1\">\n");
      out.write("        <form>\n");
      out.write("          <h5>Subscribe to our newsletter</h5>\n");
      out.write("          <p>Monthly digest of whats new and exciting from us.</p>\n");
      out.write("          <div class=\"d-flex w-100 gap-2\">\n");
      out.write("            <label for=\"newsletter1\" class=\"visually-hidden\">Email address</label>\n");
      out.write("            <input id=\"newsletter1\" type=\"text\" class=\"form-control\" placeholder=\"Email address\">\n");
      out.write("            <button class=\"btn btn-primary\" type=\"button\">Subscribe</button>\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- <div class=\"align-items-center d-flex justify-content-between py-4 my-4 border-top\"> -->\n");
      out.write("      <p>© 2021 Company, Inc. All rights reserved.</p>\n");
      out.write("      <ul class=\"list-unstyled d-flex\">\n");
      out.write("        <li class=\"ms-3\"><a class=\"link-dark\" href=\"#\"><svg class=\"bi\" width=\"24\" height=\"24\"><use xlink:href=\"#twitter\"></use></svg></a></li>\n");
      out.write("        <li class=\"ms-3\"><a class=\"link-dark\" href=\"#\"><svg class=\"bi\" width=\"24\" height=\"24\"><use xlink:href=\"#instagram\"></use></svg></a></li>\n");
      out.write("        <li class=\"ms-3\"><a class=\"link-dark\" href=\"#\"><svg class=\"bi\" width=\"24\" height=\"24\"><use xlink:href=\"#facebook\"></use></svg></a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
