package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logarusuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Bootstrap Example</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!DOCTYPE html>\n");
      out.write("    <!--\n");
      out.write("    To change this license header, choose License Headers in Project Properties.\n");
      out.write("    To change this template file, choose Tools | Templates\n");
      out.write("    and open the template in the editor.\n");
      out.write("    -->\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <title>LAN-HOUSE TSUNDERE</title>\n");
      out.write("            <meta charset=\"UTF-8\">\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("            <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("            <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("            <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("            <link href=\"css/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("            <script src=\"jv/js.js\" type=\"text/javascript\"></script>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            <div class=\"login-reg-panel\">\n");
      out.write("                <div class=\"login-info-box\">\n");
      out.write("                    <h2>Ja tem uma conta existente?</h2>\n");
      out.write("                    <p>Clique aqui para logar</p>\n");
      out.write("                    <label id=\"label-register\" for=\"log-reg-show\" onclick=\"fadeLogar()\">Login</label>\n");
      out.write("                    <input type=\"radio\" name=\"active-log-panel\" id=\"log-reg-show\"  >\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"register-info-box\">\n");
      out.write("                    <h2>Você não tem uma conta?</h2>\n");
      out.write("                    <p>Clique aqui agora mesmo para se cadastrar!</p>\n");
      out.write("\n");
      out.write("                    <label id=\"label-login\" for=\"log-login-show\" onclick=\"fadeRegistrar()\">Registrar\n");
      out.write("                        <input type=\"radio\" name=\"active-log-panel\" id=\"log-login-show\"> </label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"white-panel\">\n");
      out.write("                    <div class=\"login-show\">\n");
      out.write("                        <h2>LOGIN</h2>\n");
      out.write("                        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/LogarPessoa\" method=\"POST\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Email\" name=\"loginpessoa\">\n");
      out.write("                            <input type=\"password\" placeholder=\"Senha\" name=\"senhapessoa\">\n");
      out.write("                            <input type=\"button\" value=\"Login\">\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                        <a href=\"\">Esqueceu a senha?</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"register-show\">\n");
      out.write("                        <h2>REGISTRAR</h2>\n");
      out.write("                        <input type=\"text\" placeholder=\"Email\" >\n");
      out.write("                        <input type=\"password\" placeholder=\"Senha\">\n");
      out.write("                        <input type=\"password\" placeholder=\"Confirmar Senha\">\n");
      out.write("                        <input type=\"button\" value=\"Registrar\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </body>\n");
      out.write("    </html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
