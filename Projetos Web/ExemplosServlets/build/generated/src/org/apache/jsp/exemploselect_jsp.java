package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class exemploselect_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>exemploselect.jsp</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Classificação de um hotel</h1>\n");
      out.write("\n");
      out.write("        <p>1.\tDesenvolva um software para classificar um hotel \n");
      out.write("            de acordo com a quantidade de estrelas, e permita ao usuario\n");
      out.write("            fazer um comentário sobre sua estadia:\n");
      out.write("            <br>    1 estrela  - Péssimo\n");
      out.write("            <br>    2 estrelas - Ruim\n");
      out.write("            <br>    3 estrelas - Médio\n");
      out.write("            <br>    4 estrelas - Bom \n");
      out.write("            <br>    5 estrelas – Ótimo\n");
      out.write("        </p>\n");
      out.write("        \n");
      out.write("        <form action=\"ClassificacaoHotel\" method=\"get\">\n");
      out.write("            <select name=\"qtdestrela\" required=\"required\">\n");
      out.write("                <option value=\"1\">1 Estrela</option>\n");
      out.write("                <option value=\"2\">2 Estrelas</option>\n");
      out.write("                <option value=\"3\">3 Estrelas</option>\n");
      out.write("                <option value=\"4\">4 Estrelas</option>\n");
      out.write("                <option value=\"5\">5 Estrelas</option>\n");
      out.write("            </select>\n");
      out.write("            <br><br><br>\n");
      out.write("            <textarea placeholder=\"Acrescente suas observações\" rows=\"15\" cols=\"40\" name=\"comentario\"></textarea>\n");
      out.write("               \n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"Enviar\" name=\"Enviar\"/>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
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
