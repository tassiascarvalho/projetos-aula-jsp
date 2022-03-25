package org.apache.jsp.estrutura;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <link href=\"../assets/dist/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../assets/dist/css/sidebars.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"d-flex flex-column flex-shrink-0 bg-light\" style=\"width: 4.5rem;\">\n");
      out.write("            <a href=\"/\" class=\"d-block p-3 link-dark text-decoration-none\" title=\"Icon-only\" data-bs-toggle=\"tooltip\" data-bs-placement=\"right\">\n");
      out.write("                <svg class=\"bi\" width=\"40\" height=\"32\"><use xlink:href=\"#bootstrap\"/></svg>\n");
      out.write("                <span class=\"visually-hidden\">Icon-only</span>\n");
      out.write("            </a>\n");
      out.write("            <ul class=\"nav nav-pills nav-flush flex-column mb-auto text-center\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a href=\"#\" class=\"nav-link active py-3 border-bottom\" aria-current=\"page\" title=\"Home\" data-bs-toggle=\"tooltip\" data-bs-placement=\"right\">\n");
      out.write("                        <svg class=\"bi\" width=\"24\" height=\"24\" role=\"img\" aria-label=\"Home\"><use xlink:href=\"#home\"/></svg>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" class=\"nav-link py-3 border-bottom\" title=\"Dashboard\" data-bs-toggle=\"tooltip\" data-bs-placement=\"right\">\n");
      out.write("                        <svg class=\"bi\" width=\"24\" height=\"24\" role=\"img\" aria-label=\"Dashboard\"><use xlink:href=\"#speedometer2\"/></svg>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" class=\"nav-link py-3 border-bottom\" title=\"Orders\" data-bs-toggle=\"tooltip\" data-bs-placement=\"right\">\n");
      out.write("                        <svg class=\"bi\" width=\"24\" height=\"24\" role=\"img\" aria-label=\"Orders\"><use xlink:href=\"#table\"/></svg>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" class=\"nav-link py-3 border-bottom\" title=\"Products\" data-bs-toggle=\"tooltip\" data-bs-placement=\"right\">\n");
      out.write("                        <svg class=\"bi\" width=\"24\" height=\"24\" role=\"img\" aria-label=\"Products\"><use xlink:href=\"#grid\"/></svg>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" class=\"nav-link py-3 border-bottom\" title=\"Customers\" data-bs-toggle=\"tooltip\" data-bs-placement=\"right\">\n");
      out.write("                        <svg class=\"bi\" width=\"24\" height=\"24\" role=\"img\" aria-label=\"Customers\"><use xlink:href=\"#people-circle\"/></svg>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"dropdown border-top\">\n");
      out.write("                <a href=\"#\" class=\"d-flex align-items-center justify-content-center p-3 link-dark text-decoration-none dropdown-toggle\" id=\"dropdownUser3\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                    <img src=\"https://github.com/mdo.png\" alt=\"mdo\" width=\"24\" height=\"24\" class=\"rounded-circle\">\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"dropdown-menu text-small shadow\" aria-labelledby=\"dropdownUser3\">\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"#\">New project...</a></li>\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"#\">Settings</a></li>\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"#\">Profile</a></li>\n");
      out.write("                    <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"#\">Sign out</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"../assets/dist/js/sidebars.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../assets/dist/js/bootstrap.bundle.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
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
