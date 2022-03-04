package org.apache.jsp.estado;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gerenciarestados_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        \n");
      out.write("        <title>Gerenciar Estados</title>\n");
      out.write("        <style>\n");
      out.write("            table.blueTable {\n");
      out.write("                border: 1px solid #1C6EA4;\n");
      out.write("                background-color: #EEEEEE;\n");
      out.write("                width: 100%;\n");
      out.write("                text-align: left;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("            table.blueTable td, table.blueTable th {\n");
      out.write("                border: 1px solid #AAAAAA;\n");
      out.write("                padding: 3px 2px;\n");
      out.write("            }\n");
      out.write("            table.blueTable tbody td {\n");
      out.write("                font-size: 13px;\n");
      out.write("            }\n");
      out.write("            table.blueTable tr:nth-child(even) {\n");
      out.write("                background: #D0E4F5;\n");
      out.write("            }\n");
      out.write("            table.blueTable thead {\n");
      out.write("                background: #1C6EA4;\n");
      out.write("                background: -moz-linear-gradient(top, #5592bb 0%, #327cad 66%, #1C6EA4 100%);\n");
      out.write("                background: -webkit-linear-gradient(top, #5592bb 0%, #327cad 66%, #1C6EA4 100%);\n");
      out.write("                background: linear-gradient(to bottom, #5592bb 0%, #327cad 66%, #1C6EA4 100%);\n");
      out.write("                border-bottom: 2px solid #444444;\n");
      out.write("            }\n");
      out.write("            table.blueTable thead th {\n");
      out.write("                font-size: 15px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: #FFFFFF;\n");
      out.write("                border-left: 2px solid #D0E4F5;\n");
      out.write("            }\n");
      out.write("            table.blueTable thead th:first-child {\n");
      out.write("                border-left: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input{\n");
      out.write("                border: 3px groove #FFA5A5;\n");
      out.write("                outline:0;\n");
      out.write("                height:25px;\n");
      out.write("                width: 275px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <h1>Gerenciar Estados</h1>\n");
      out.write("        <!--contextPath retorna a raiz do projeto-->\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/SalvarEstado\">\n");
      out.write("            <label for=\"id\">ID</label>\n");
      out.write("            <input type=\"number\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${oEstado.idEstado}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("            <br />\n");
      out.write("            <label for=\"nome\">Nome</label>\n");
      out.write("            <input type=\"text\" name=\"nome\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${oEstado.nomeEstado}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("            <br />\n");
      out.write("            <label for=\"sigla\">Sigla</label>\n");
      out.write("            <input type=\"text\" name=\"sigla\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${oEstado.siglaEstado}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("            <br />            \n");
      out.write("            <input type=\"submit\" value=\"Salvar\"/>\n");
      out.write("        </form>   \n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensagem}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        <h1>Lista de Estados</h1>\n");
      out.write("        <table class=\"blueTable\">\n");
      out.write("            <thead>\n");
      out.write("            <th>ID</th>\n");
      out.write("            <th>Nome</th>\n");
      out.write("            <th>Sigla</th>\n");
      out.write("            <th colspan=\"2\">Editar</th>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("estado");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listaestados}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <!--Vai se repetir enquanto houver estados para serem mostrados-->\n");
          out.write("                <tr>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${estado.idEstado}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${estado.nomeEstado}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${estado.siglaEstado}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td><a href=\"ExcluirEstado?idestadoexcluir=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${estado.idEstado}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Excluir</a></td>\n");
          out.write("                    <td><a href=\"CarregarEstado?idestadocarregar=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${estado.idEstado}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Alterar</a></td>\n");
          out.write("                </tr>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
