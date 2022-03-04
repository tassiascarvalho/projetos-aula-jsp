package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class exercicio9_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Exercício 9</h1>\n");
      out.write("\n");
      out.write("        <p>Construir um programa que efetue o cálculo do salário líquido de um professor. Para fazer este programa, \n");
      out.write("            você deverá possuir alguns dados, tais como: valor da hora aula, número de horas trabalhadas no mês e \n");
      out.write("            percentual de desconto do INSS. Exibir, salário bruto, total descontado e salário liquido.\n");
      out.write("            <br />\n");
      out.write("            <br />salariobruto = valorhora * numerohoras;\n");
      out.write("            <br />desconto = salariobruto * (porcentageminsss/100);\n");
      out.write("            <br />salarioliquido = salariobruto - desconto;\n");
      out.write("        </p>\n");
      out.write("        <br />\n");
      out.write("        <form action=\"Exercicio9\" method=\"get\">\n");
      out.write("            <label>Valor Hora Aula</label>\n");
      out.write("            <input type=\"text\" name=\"vlhora\">\n");
      out.write("            <br /><br />\n");
      out.write("            <label>Quantidade de Horas Trabalhadas</label>\n");
      out.write("            <input type=\"text\" name=\"hrtrabalhadas\">\n");
      out.write("            <br /><br />\n");
      out.write("            <label>Percentual de desconto INSS</label>\n");
      out.write("            <input type=\"text\" name=\"pinss\">\n");
      out.write("            <br /><br />\n");
      out.write("                \n");
      out.write("            <input type=\"submit\" value=\"Calcular\">\n");
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
