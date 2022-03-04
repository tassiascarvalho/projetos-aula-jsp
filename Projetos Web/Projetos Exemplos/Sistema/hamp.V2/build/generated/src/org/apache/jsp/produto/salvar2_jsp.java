package org.apache.jsp.produto;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class salvar2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=ISO-8859-1");
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap-3.3.7-dist/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>  \n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap-3.3.7-dist/js/jquery-3.2.1.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap-3.3.7-dist/js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <form method=\"POST\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/SalvarProduto\" enctype=\"multipart/form-data\" >\n");
      out.write("                    <h3>Adicionar novo produto</h3>\n");
      out.write("                    <!-- Id da pessoa da Empresa -->\n");
      out.write("                    <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${idpessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"idempresa\">\n");
      out.write("                    <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.idProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"idproduto\">\n");
      out.write("\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <div class=\"form-group col-md-6\">\n");
      out.write("                            <label for=\"inputEmail4\">Nome do produto</label>\n");
      out.write("                            <input  class=\"form-control\" type=\"text\" name=\"nome\"  required />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-md-6\">\n");
      out.write("                            <label for=\"inputPassword4\">Categoria do produto</label>\n");
      out.write("                            <select  class=\"form-control\" name=\"categoria\" required>\n");
      out.write("                                <option value=\"1\">Almofadas Ortopédicas</option>\n");
      out.write("                                <option value=\"2\">Andadores</option>\n");
      out.write("                                <option value=\"3\">Bengalas</option>\n");
      out.write("                                <option value=\"4\">Botas Imobilizadoras</option>\n");
      out.write("                                <option value=\"5\">Cadeiras de rodas e banho</option>\n");
      out.write("                                <option value=\"6\">Coletes de coluna</option>\n");
      out.write("                                <option value=\"7\">Faixas Abdominais</option>\n");
      out.write("                                <option value=\"8\">Imobilizadores de Joelhos</option>\n");
      out.write("                                <option value=\"9\">Joelheiras Articuladas</option>\n");
      out.write("                                <option value=\"10\">Muletas </option>\n");
      out.write("                                <option value=\"11\">Ortese para Ombro</option>                  \n");
      out.write("                                <option value=\"12\">Tornozeleira</option>\n");
      out.write("                                <option value=\"13\">Outros</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-md-12\">\n");
      out.write("                            <label>Valor da locação por dia</label>\n");
      out.write("                            <input  class=\"form-control\" type=\"number\"  name=\"preco\" required/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-md-4\">\n");
      out.write("                            <label>Tamanho do Produto</label>\n");
      out.write("                            <input class=\"form-control\" type=\"number\"  name=\"tamanho\" required/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-md-4\">\n");
      out.write("                            <label>Peso do produto</label>\n");
      out.write("                            <input class=\"form-control\" type=\"number\"  name=\"peso\" required/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-md-4\">\n");
      out.write("                            <label>Cor do produto</label>\n");
      out.write("                            <input class=\"form-control\"  type=\"color\"  name=\"cor\" required/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-md-6\">\n");
      out.write("                            <label>Referencia do Produto</label>\n");
      out.write("                            <input class=\"form-control\" type=\"text\"  name=\"ref\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-md-6\">\n");
      out.write("                            <label>Quantidade</label>\n");
      out.write("                            <input type=\"number\" name=\"quant\"  class=\"form-control\" />\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group col-md-9\">\n");
      out.write("                            <p><label>Descrição do produto</label></p>\n");
      out.write("                            <textarea  class=\"form-control\" rows=\"5\" required name=\"desc\">                   \n");
      out.write("                            </textarea>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-md-3\">\n");
      out.write("                            <label>Diponibilidade de Locação</label>\n");
      out.write("                            <p> <label>Dísponivel</label> <input type=\"radio\" class=\"radio\" name=\"disp\" value=\"Diponivel\" required/></p>\n");
      out.write("                            <p> <label>Indisponivel</label><input type=\"radio\" class=\"radio\" name=\"disp\" value=\"Indisponivel\" required/></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-md-12\">\n");
      out.write("                            <label>Adcionar fotos <input class=\"form-control\" type=\"file\"  name=\"file[]\"  required></label>\n");
      out.write("                            <input type=\"submit\" value=\"Publicar Produto\" class=\"btn btn-success\"/>\n");
      out.write("                        </div>\n");
      out.write("               \n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensagem}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
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
