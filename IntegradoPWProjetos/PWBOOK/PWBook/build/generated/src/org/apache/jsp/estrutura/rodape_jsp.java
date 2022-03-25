package org.apache.jsp.estrutura;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rodape_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"d-flex flex-column flex-shrink-0 bg-light vh-100\" style=\"width: 100px;\">\n");
      out.write("            <ul class=\"nav nav-pills nav-flush flex-column mb-auto text-center\">\n");
      out.write("                <li class=\"nav-item\"> <a href=\"#\" class=\"nav-link active py-3 border-bottom\"> <i class=\"fa fa-home\"></i> <small>Home</small> </a> </li>\n");
      out.write("                <li> <a href=\"#\" class=\"nav-link py-3 border-bottom\"> <i class=\"fa fa-dashboard\"></i> <small>Dashboard</small> </a> </li>\n");
      out.write("                <li> <a href=\"#\" class=\"nav-link py-3 border-bottom\"> <i class=\"fa fa-first-order\"></i> <small>My Orders</small> </a> </li>\n");
      out.write("                <li> <a href=\"#\" class=\"nav-link py-3 border-bottom\"> <i class=\"fa fa-cog\"></i> <small>Settings</small> </a> </li>\n");
      out.write("                <li> <a href=\"#\" class=\"nav-link py-3 border-bottom\"> <i class=\"fa fa-bookmark\"></i> <small>Bookmark</small> </a> </li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"dropdown border-top\"> <a href=\"#\" class=\"d-flex align-items-center justify-content-center p-3 link-dark text-decoration-none dropdown-toggle\" id=\"dropdownUser3\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> <img src=\"https://github.com/mdo.png\" alt=\"mdo\" width=\"24\" height=\"24\" class=\"rounded-circle\"> </a>\n");
      out.write("                <ul class=\"dropdown-menu text-small shadow\" aria-labelledby=\"dropdownUser3\">\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"#\">New project...</a></li>\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"#\">Settings</a></li>\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"#\">Profile</a></li>\n");
      out.write("                    <li>\n");
      out.write("                        <hr class=\"dropdown-divider\">\n");
      out.write("                    </li>\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"#\">Sign out</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
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
