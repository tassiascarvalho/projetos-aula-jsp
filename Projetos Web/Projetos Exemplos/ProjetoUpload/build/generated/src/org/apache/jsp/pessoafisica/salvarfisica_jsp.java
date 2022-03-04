package org.apache.jsp.pessoafisica;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class salvarfisica_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Cadastrar Cliente</title>\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap-3.3.7-dist/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <h1>Cadastro de Cliente</h1>\n");
      out.write("                <form method=\"POST\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/SalvarPessoaF\" enctype=\"multipart/form-data\">\n");
      out.write("                    <input class=\"form-control\"  type=\"number\" name=\"idpessoa\" size=\"60\" readonly value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaf.idPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" >\n");
      out.write("\n");
      out.write("                    <p>Nome Completo: <input class=\"form-control\" type=\"text\" name=\"nomepessoa\" required value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaf.nomePessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("></p>\n");
      out.write("\n");
      out.write("                    <p>Gênero: \n");
      out.write("                        <label class=\"for-mcheck-label\">\n");
      out.write("                            <input class=\"form-check-input\" type=\"radio\" name=\"sexo\" id=\"masc\" value=\"Masculino\"> Masculino\n");
      out.write("                        </label>\n");
      out.write("                        <label class=\"form-check-label\">\n");
      out.write("                            <input class=\"form-check-input\" type=\"radio\" name=\"sexo\" id=\"fem\" value=\"Feminino\"> Feminino\n");
      out.write("                        </label>\n");
      out.write("                        <label class=\"form-check-label\">\n");
      out.write("                            <input class=\"form-check-input\" type=\"radio\" name=\"sexo\" id=\"outro\" value=\"Outro\"> Outro\n");
      out.write("                        </label>\n");
      out.write("\n");
      out.write("                    </p>\n");
      out.write("                    <p>Data de nascimento: <input type=\"date\"  class=\"form-control\" name=\"data\"  value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaf.dataNascimentoPessoaFisica}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("></p>\n");
      out.write("\n");
      out.write("                    <p>CPF: <input class=\"form-control\" type=\"text\" name=\"cpf\" required value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaf.cpfPessoaFisica}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("></p>\n");
      out.write("\n");
      out.write("                    <p>Telefone: <input class=\"form-control\" type=\"tel\" name=\"telefonepessoa\" required value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaf.telefonePessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("></p>\n");
      out.write("\n");
      out.write("                    <p>Email: <input class=\"form-control\" type=\"email\" name=\"emailpessoa\" required value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaf.emailPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("></p>\n");
      out.write("                    <p>Confirmar Email : <input class=\"form-control\" type=\"email\"  required value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaf.emailPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("></p>\n");
      out.write("\n");
      out.write("                    <p>Senha: <input class=\"form-control\" type=\"password\" name=\"senhapessoa\" required value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaf.senhaPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("></p>\n");
      out.write("                    <p>Confirmar Senha: <input class=\"form-control\" type=\"password\" required value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaf.senhaPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("></p>\n");
      out.write("\n");
      out.write("                    <p>Foto: <input class=\"form-control\" type=\"file\" required value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaf.caminhoImagemPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("></p>\n");
      out.write("\n");
      out.write("                    <p><input type=\"submit\" value=\"Cadastrar\" class=\"btn btn-success\"> </p>           \n");
      out.write("                    <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensagem}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
