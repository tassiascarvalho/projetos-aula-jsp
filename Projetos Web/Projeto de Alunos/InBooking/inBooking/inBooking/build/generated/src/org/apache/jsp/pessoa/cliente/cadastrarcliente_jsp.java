package org.apache.jsp.pessoa.cliente;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastrarcliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Cadastrar Cliente</title>\n");
      out.write("        <script src=\"cidades-estados-1.4-utf8.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form id=\"form\" name=\"cadastrarpessoa\" method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/CadastrarPessoaCliente\">\n");
      out.write("            <input type=\"text\" name=\"nomepessoa\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.nomePessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Nome\" required><br>\n");
      out.write("            <input type=\"text\" name=\"responsavelpessoa\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.responsavelPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Pai ou Responsável\" required><br>\n");
      out.write("            <input type=\"text\" name=\"telefoneresponsavelpessoa\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.telefoneResponsavelPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Telefone do responsável\" required><br>\n");
      out.write("            <input type=\"text\" name=\"ceppessoa\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.cepPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Cep\" required><br>\n");
      out.write("            <select id=\"estado\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.estadoPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></select>\n");
      out.write("            <select id=\"cidade\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.cidadePessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></select>\n");
      out.write("            <script language=\"JavaScript\" type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("                new dgCidadesEstados({\n");
      out.write("                    cidade: document.getElementById('cidade1'),\n");
      out.write("                    estado: document.getElementById('estado1')\n");
      out.write("                })\n");
      out.write("            </script><br>\n");
      out.write("            <input type=\"text\" name=\"cpfpessoa\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.cpfPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Cpf\" required><br>\n");
      out.write("            <input type=\"text\" name=\"telefonepessoa\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.telefonePessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Telefone\"><br>\n");
      out.write("            <input type=\"text\" name=\"celularpessoa\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.celularPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Celular\" required><br>\n");
      out.write("            <input type=\"text\" name=\"enderecopessoa\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.enderecoPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Endereço\" required><br>\n");
      out.write("            <input type=\"text\" name=\"bairropessoa\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.bairroPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Bairro\" required><br>\n");
      out.write("            <input type=\"radio\" id=\"Casado\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.sexoPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"Civil\"><label>Masculino</label>\n");
      out.write("            <input type=\"radio\" id=\"Solteiro\" value=\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.sexoPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"Civil\" checked=\"\"><label>Feminino</label>\n");
      out.write("            <input type=\"radio\" id=\"Separado\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.sexoPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"Civil\"><label>Outros</label><br>\n");
      out.write("            <input type=\"text\" name=\"emailpessoa\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.emailPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Email\" required><br>\n");
      out.write("            <input type=\"password\" name=\"senhapessoa\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.senhaPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Senha\" required><br>\n");
      out.write("            <input type=\"date\" name=\"datanascimentopessoa\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoa.dataNascimentoPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Data de nascimento\" required><br>\n");
      out.write("            <input type=\"hidden\" name=\"perfilpessoa\" value=\"Cliente\"><br>\n");
      out.write("            <input type=\"submit\" value=\"Cadastrar\" name=\"cadastrarpessoa\" />\n");
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
