package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Br.com.ComboBox.MODEL.EstadoMODEL;
import Br.com.ComboBox.DAO.EstadoDAO;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");

EstadoDAO dao = new EstadoDAO();

List<EstadoMODEL> estadoList;
estadoList = dao.ListarEstado();


      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"JavaScript/jquery-3.2.0.min.js\"></script>\n");
      out.write("        <script src=\"JavaScript/CidadeAjax.js\"></script>\n");
      out.write("        <title>Exemplo Combo box</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("            \n");
      out.write("            <label for=\"estado\" >Estado</label>\n");
      out.write("            <select name=\"estado\" id=\"estado\">\n");
      out.write("                <option selected disabled>Estado</option>\n");
      out.write("                ");
for(EstadoMODEL registro : estadoList){
      out.write("   \n");
      out.write("                <option value=");
      out.print( registro.getCod_Estado() );
      out.write('>');
      out.print( registro.getNome_Estado());
      out.write("</option>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("             <label for=\"cidade\" >Cidade</label>\n");
      out.write("            <select name=\"cidade\" id=\"cidade\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </select>\n");
      out.write("             \n");
      out.write("        </form>\n");
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
