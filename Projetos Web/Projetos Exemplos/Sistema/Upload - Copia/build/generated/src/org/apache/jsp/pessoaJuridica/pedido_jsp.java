package org.apache.jsp.pessoaJuridica;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pedido_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_pattern_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.release();
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

      out.write("<!--Author: W3layouts\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>HAMP EMPRESA - Pedidos</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/dashbord/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/dashbord/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("        <!--js-->\n");
      out.write("        <link rel=\"sortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/logo.png\" type=\"image/png\" />\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/dashbord/js/jquery-2.1.1.min.js\"></script> \n");
      out.write("        <!--icons-css-->\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/dashbord/css/font-awesome.css\" rel=\"stylesheet\"> \n");
      out.write("        <!--Google Fonts-->\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Carrois+Gothic' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Work+Sans:400,500,600' rel='stylesheet' type='text/css'>\n");
      out.write("        <!--static chart-->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/dashbord/js/Chart.min.js\"></script>\n");
      out.write("        <!--//charts-->\n");
      out.write("        <!-- geo chart -->\n");
      out.write("        <script src=\"//cdn.jsdelivr.net/modernizr/2.8.3/modernizr.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script>window.modernizr || document.write('<script src=\"lib/modernizr/modernizr-custom.js\"><\\/script>')</script>\n");
      out.write("        <!--<script src=\"lib/html5shiv/html5shiv.js\"></script>-->\n");
      out.write("        <!-- Chartinator  -->\n");
      out.write("        <script src=\"js/chartinator.js\" ></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(function ($) {\n");
      out.write("\n");
      out.write("                var chart3 = $('#geoChart').chartinator({\n");
      out.write("                    tableSel: '.geoChart',\n");
      out.write("                    columns: [{role: 'tooltip', type: 'string'}],\n");
      out.write("                    colIndexes: [2],\n");
      out.write("                    rows: [\n");
      out.write("                        ['China - 2015'],\n");
      out.write("                        ['Colombia - 2015'],\n");
      out.write("                        ['France - 2015'],\n");
      out.write("                        ['Italy - 2015'],\n");
      out.write("                        ['Japan - 2015'],\n");
      out.write("                        ['Kazakhstan - 2015'],\n");
      out.write("                        ['Mexico - 2015'],\n");
      out.write("                        ['Poland - 2015'],\n");
      out.write("                        ['Russia - 2015'],\n");
      out.write("                        ['Spain - 2015'],\n");
      out.write("                        ['Tanzania - 2015'],\n");
      out.write("                        ['Turkey - 2015']],\n");
      out.write("                    ignoreCol: [2],\n");
      out.write("                    chartType: 'GeoChart',\n");
      out.write("                    chartAspectRatio: 1.5,\n");
      out.write("                    chartZoom: 1.75,\n");
      out.write("                    chartOffset: [-12, 0],\n");
      out.write("                    chartOptions: {\n");
      out.write("                        width: null,\n");
      out.write("                        backgroundColor: '#fff',\n");
      out.write("                        datalessRegionColor: '#F5F5F5',\n");
      out.write("                        region: 'world',\n");
      out.write("                        resolution: 'countries',\n");
      out.write("                        legend: 'none',\n");
      out.write("                        colorAxis: {\n");
      out.write("                            colors: ['#679CCA', '#337AB7']\n");
      out.write("                        },\n");
      out.write("                        tooltip: {\n");
      out.write("                            trigger: 'focus',\n");
      out.write("                            isHtml: true\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--geo chart-->\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <!--skycons-icons-->\n");
      out.write("        <script src=\"js/skycons.js\"></script>\n");
      out.write("        <!--//skycons-icons-->\n");
      out.write("    </head>\n");
      out.write("    <body>\t\n");
      out.write("        <div class=\"page-container\">\t\n");
      out.write("            <div class=\"left-content\">\n");
      out.write("                <div class=\"mother-grid-inner\">\n");
      out.write("                    <!--header start here-->\n");
      out.write("                    <div class=\"header-main\">\n");
      out.write("                        <div class=\"header-left\">\n");
      out.write("                            <div class=\"logo-name\">\n");
      out.write("\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/logo.png\" style=\"width: 50%;\" alt=\"\" id=\"logo\"/>\n");
      out.write("                                <span id=\"hamp2\">HAMP</span> \n");
      out.write("                                <p><span id=\"descricao2\">EMPRESA</span></p> \n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <!--search-box-->\n");
      out.write("                            <div class=\"search-box\">\n");
      out.write("                                <form>\n");
      out.write("                                    <input type=\"text\" placeholder=\"Search...\" required=\"\">\t\n");
      out.write("                                    <input type=\"submit\" value=\"\">\t\t\t\t\t\n");
      out.write("                                </form>\n");
      out.write("                            </div><!--//end-search-box-->\n");
      out.write("                            <div class=\"clearfix\"> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"header-right\">\n");
      out.write("                            <!--notification menu end -->\n");
      out.write("                            <div class=\"profile_details\">\t\t\n");
      out.write("                                <ul>\n");
      out.write("                                    <li class=\"dropdown profile_details_drop\">\n");
      out.write("                                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                            <div class=\"profile_img\">\t\n");
      out.write("                                                <span class=\"prfil-img\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/fotos/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaj.imagemPessoaJ}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"width: 100px;\" alt=\"\"> </span> \n");
      out.write("                                                <div class=\"user-name\">\n");
      out.write("                                                    <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaj.nomePessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                                    <label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaj.razaoSocialPessoaJuridica}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                                                </div>\n");
      out.write("                                                <i class=\"fa fa-angle-down lnr\"></i>\n");
      out.write("                                                <i class=\"fa fa-angle-up lnr\"></i>\n");
      out.write("                                                <div class=\"clearfix\"></div>\t\n");
      out.write("                                            </div>\t\n");
      out.write("                                        </a>\n");
      out.write("                                        <ul class=\"dropdown-menu drp-mnu\">\n");
      out.write("\n");
      out.write("                                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/CarregarPessoaJ?idpessoa=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaj.idPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <i class=\"fa fa-user\"></i> Peril</a></li> \n");
      out.write("                                            <li><a  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/LogarUsuario?acao=logout\"><i class=\"fa fa-sign-out\"></i> Sair</a></li>\n");
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"clearfix\"> </div>\t\t\t\t\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"> </div>\t\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"page-head_agile_info_w3l\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("\n");
      out.write("                            <label style=\"font-weight: 600;  font-size: 3em; color:white; position: relative; left: -20%;text-shadow: 2px 2px 7px black;\">PEDIDOS <i class=\"fa fa-shopping-cart\"></i></label>\n");
      out.write("                            <!--/w3_short-->\n");
      out.write("\n");
      out.write("                            <div class=\"services-breadcrumb\">\n");
      out.write("                                <div class=\"agile_inner_breadcrumb\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!--//w3_short-->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--heder end here-->\n");
      out.write("                    <!-- script-for sticky-nav -->\n");
      out.write("                    <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                var navoffeset = $(\".header-main\").offset().top;\n");
      out.write("                $(window).scroll(function () {\n");
      out.write("                    var scrollpos = $(window).scrollTop();\n");
      out.write("                    if (scrollpos >= navoffeset) {\n");
      out.write("                        $(\".header-main\").addClass(\"fixed\");\n");
      out.write("                    } else {\n");
      out.write("                        $(\".header-main\").removeClass(\"fixed\");\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("                    </script>\n");
      out.write("                    <!-- /script-for sticky-nav -->\n");
      out.write("                    <!--inner block start here-->\n");
      out.write("\n");
      out.write("                    <div class=\"inner-block\" style=\"padding-top: 2em;\">\n");
      out.write("                        <!--market updates updates-->\n");
      out.write("                        <div class=\"market-updates\">\n");
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("\n");
      out.write("                        <!--market updates end here-->\n");
      out.write("                        <!--mainpage chit-chating-->\n");
      out.write("                        <!--main page chit chating end here-->\n");
      out.write("                        <!--main page chart start here-->\n");
      out.write("\n");
      out.write("                        <!--main page chart layer2-->\n");
      out.write("                        <div class=\"chart-layer-2\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-12\" style=\"height: 450px;\"></div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--climate start here-->\n");
      out.write("\n");
      out.write("                        <!--climate end here-->\n");
      out.write("                    </div>\n");
      out.write("                    <!--inner block end here-->\n");
      out.write("                    <!--copy rights start here-->\n");
      out.write("                    <div class=\"copyrights\">\n");
      out.write("                        <p>Â© 2016 Shoppy. All Rights Reserved | Design by  <a href=\"http://w3layouts.com/\" target=\"_blank\">W3layouts</a> </p>\n");
      out.write("                    </div>\t\n");
      out.write("                    <!--COPY rights end here-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--slider menu-->\n");
      out.write("            <div class=\"sidebar-menu\">\t  \n");
      out.write("                <div class=\"menu\">\n");
      out.write("                    <ul id=\"menu\" >\n");
      out.write("                        <li id=\"menu-home\" ><a style=\"font-size: 3em;\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/pessoaJuridica/index.jsp\"><i class=\"fa fa-tachometer\"></i><span>HOME</span></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-product-hunt\"></i><span>Produto</span><span class=\"fa fa-angle-right\" style=\"float: right\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/IdProduto?idpessoa=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaj.idPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Cadastrar</a></li>\n");
      out.write("                                <li> <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ListarProduto?idempresa=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaj.idPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Listar</a></li>\t\t            \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ListarPedidoJ?idempresa=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaj.idPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><i class=\"fa fa-shopping-cart\"></i><span>Pedidos</span></a></li>\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/CarregarPessoaJ?idpessoa=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaj.idPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><i class=\"fa fa-user\"></i><span>Perfil</span></a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li><a href=\"\"><i class=\"fa fa-envelope\"></i><span>Mensagens</span><span class=\"fa fa-angle-right\" style=\"float: right\"></span></a>\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"> </div>\n");
      out.write("        </div>\n");
      out.write("        <!--slide bar menu end here-->\n");
      out.write("        <script>\n");
      out.write("            var toggle = true;\n");
      out.write("\n");
      out.write("            $(\".sidebar-icon\").click(function () {\n");
      out.write("                if (toggle)\n");
      out.write("                {\n");
      out.write("                    $(\".page-container\").addClass(\"sidebar-collapsed\").removeClass(\"sidebar-collapsed-back\");\n");
      out.write("                    $(\"#menu span\").css({\"position\": \"absolute\"});\n");
      out.write("                } else\n");
      out.write("                {\n");
      out.write("                    $(\".page-container\").removeClass(\"sidebar-collapsed\").addClass(\"sidebar-collapsed-back\");\n");
      out.write("                    setTimeout(function () {\n");
      out.write("                        $(\"#menu span\").css({\"position\": \"relative\"});\n");
      out.write("                    }, 400);\n");
      out.write("                }\n");
      out.write("                toggle = !toggle;\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <!--scrolling js-->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/dashbord/js/jquery.nicescroll.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/dashbord/js/scripts.js\"></script>\n");
      out.write("        <!--//scrolling js-->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/dashbord/js/bootstrap.js\"></script>\n");
      out.write("        <!-- mother grid end here-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("pedido");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedidos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("\n");
          out.write("                                <div class=\"row\" style=\"box-shadow: 0px 0px 15px 0px #d6d6d6\">\n");
          out.write("                                    <br><br>\n");
          out.write("                                    <div class=\"col-md-2 \">\n");
          out.write("\n");
          out.write("                                        <div class=\"thumbnail team-w3agile\">\n");
          out.write("                                            <img class=\"img-rounded img-responsive\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/produtos/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.imagemProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" >\n");
          out.write("                                            <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.imagemProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"imgproduto\">\n");
          out.write("                                            <div class=\"social-icons team-icons right-w3l fotw33\">\n");
          out.write("\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                        <br>\n");
          out.write("                                        <h3 class=\"text-center\" style=\"color: black;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.nomeProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3><br>\n");
          out.write("                                        <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.nomeProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"nomeproduto\">\n");
          out.write("\n");
          out.write("                                        <table class=\"table table-striped table-responsive\">\n");
          out.write("                                            <tbody>\n");
          out.write("                                                <tr><td><label>Categoria</label></td><td><input type=\"hidden\" name=\"categoria\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.categoriaPoduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><label id=\"cat\"> </label> </td></tr>\n");
          out.write("                                                <tr><td><label>Tamanho</label></td><td><label> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.tamanhoProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" cm</label></td></tr>\n");
          out.write("                                            <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.tamanhoProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"tamanho\">\n");
          out.write("                                            <tr><td><label>Peso</label></td><td><label> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.pesoProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" gramas</label></td></tr>\n");
          out.write("                                            <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.pesoProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"peso\">\n");
          out.write("                                            <tr><td><label>Cor Prodominante</label></td><td> <div id=\"div-color\" style=\"background-color: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.corPredominante}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("; width: 20px;\n");
          out.write("                                                                                                  height: 20px;\"></div></td></tr>\n");
          out.write("                                            <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.corPredominante}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"cor\">\n");
          out.write("                                            </tbody>\n");
          out.write("                                        </table>\n");
          out.write("                                        <div class=\"alert alert-success\" role=\"alert\">\n");
          out.write("                                            <strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.situacaoPedido}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong>\n");
          out.write("                                        </div>\n");
          out.write("                                        <form method=\"POST\" action=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/SituacaoPedido\">\n");
          out.write("                                            <input type=\"hidden\" name=\"idpedido\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.idPedido}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            <input type=\"hidden\" name=\"idempresa\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaj.idPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">                                           \n");
          out.write("                                            <div class=\"col-lg-12\">\n");
          out.write("                                                <label for=\"sit\">Alterar Situacção Pedido</label>\n");
          out.write("                                                <div class=\"input-group\">\n");
          out.write("\n");
          out.write("                                                    <select id=\"sit\" name=\"situacao\" class=\"form-control\">\n");
          out.write("\n");
          out.write("                                                        <option value=\"Seu pedido foi comfirmado e seu produto está a caminho\">Aceitar</option>\n");
          out.write("                                                        <option value=\"Seu pedido foi revogado, contate a empresa para saber mais\">Revogar</option>\n");
          out.write("                                                    </select>\n");
          out.write("                                                    <span class=\"input-group-btn\">\n");
          out.write("                                                        <input type=\"submit\" class=\"btn btn-success\" value=\"ALterar\">\n");
          out.write("                                                    </span>\n");
          out.write("                                                </div><!-- /input-group -->\n");
          out.write("                                            </div>\n");
          out.write("                                        </form>\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"col-md-3\">\n");
          out.write("                                        <form action=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/ListarMensagem\">\n");
          out.write("                                            <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaj.idPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"idReceptor\">\n");
          out.write("                                            <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.idPessoFisica}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"idEmissor\">\n");
          out.write("                                            <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaj.idPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"idempresa\">\n");
          out.write("                                            <input type=\"submit\" class=\"btn btn-info\" value=\"VER MENSAGENS\">                                                       \n");
          out.write("                                        </form>\n");
          out.write("                                        <br>\n");
          out.write("                                        <h4>Mensagens:</h4>\n");
          out.write("                                        <br>\n");
          out.write("                                        ");
          if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("                            \n");
          out.write("                                        <form method=\"POST\" action=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/SalvarMensagemJ\">\n");
          out.write("                                            <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.idPessoFisica}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"idReceptor\">\n");
          out.write("\n");
          out.write("                                            <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pessoaj.idPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"idEmissor\">\n");
          out.write("                                            <div class=\"row\">\n");
          out.write("                                                <div class=\"col-md-9\">\n");
          out.write("                                                    <label>Envie uma mensagem</label>\n");
          out.write("                                                    <textarea name=\"mensagem\" class=\"form-control\" style=\"resize: none;\" rows=\"4\" name=\"mensagem\"></textarea>\n");
          out.write("                                                    <strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensagem}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong>\n");
          out.write("                                                </div>\n");
          out.write("                                                <div class=\"col-md-3\">\n");
          out.write("                                                    <br>\n");
          out.write("                                                    <span class=\"glyphicon glyphicon-sen\"></span><input type=\"submit\" value=\"Enviar\" class=\"btn btn-success\"> \n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                        </form>\n");
          out.write("                                    </div>\n");
          out.write("\n");
          out.write("                                    <div class=\"col-md-2\">\n");
          out.write("                                        <div class=\"panel-default\">\n");
          out.write("                                            <div class=\"panel-heading\">\n");
          out.write("                                                <h4 class=\"text-center\"><span class=\" glyphicon glyphicon-road\"></span>  Local de Entrega</h4> \n");
          out.write("                                            </div>\n");
          out.write("                                            <br>\n");
          out.write("\n");
          out.write("                                            <h4>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.enderecoLocal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4><br>\n");
          out.write("                                            <h4>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.numeroLocal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4><br>\n");
          out.write("                                            <h4>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.bairroLocal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4><br>\n");
          out.write("                                            <h4>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.cidadeLocal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4><br>\n");
          out.write("                                            <h4>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.cepLocal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4><br>\n");
          out.write("                                            <h4>São Paulo</h4><br>                                       \n");
          out.write("\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"col-md-2\">\n");
          out.write("                                        <div class=\"panel-default\">\n");
          out.write("                                            <div class=\"panel-heading\">\n");
          out.write("                                                <h4 class=\"text-center\"><span class=\" glyphicon glyphicon-user\"></span>  Cliente Locatário</h4> \n");
          out.write("                                            </div>\n");
          out.write("                                            <br>\n");
          out.write("\n");
          out.write("\n");
          out.write("                                            <h4>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.nomePessoaFisica}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4><br>\n");
          out.write("\n");
          out.write("                                            <h4><label>CPF: </label> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4><br>\n");
          out.write("\n");
          out.write("                                            <h4><span class=\" glyphicon glyphicon-phone-alt\"></span> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.telefonePessoaFisica}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4><br>\n");
          out.write("\n");
          out.write("                                            <h5><span class=\" glyphicon glyphicon-envelope\"></span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.emailPessoaFisica}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5><br>\n");
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"col-md-3\">\n");
          out.write("                                        <div class=\"panel-default\">\n");
          out.write("                                            <div class=\"panel-heading\">\n");
          out.write("                                                <h4 class=\"text-center\"><span class=\" glyphicon glyphicon-list\"></span> Detalhe do Pedido</h4> \n");
          out.write("                                            </div>\n");
          out.write("                                            <table class=\"table table-striped\">\n");
          out.write("                                                <tbody>\n");
          out.write("                                                    <tr><td><label>Data de Inicio</label></td><td><input type=\"hidden\" name=\"dataInicio\" value=\"");
          if (_jspx_meth_fmt_formatDate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\"><label>");
          if (_jspx_meth_fmt_formatDate_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</label></td></tr>                                                      \n");
          out.write("                                                    <tr><td><label>Data de Término</label></td><td><input type=\"hidden\" name=\"dataLimite\" value=\"");
          if (_jspx_meth_fmt_formatDate_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\"><label>");
          if (_jspx_meth_fmt_formatDate_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</label></td></tr>                                                      \n");
          out.write("                                                    <tr><td><label>Total de dias</label></td><td><input type=\"hidden\" name=\"totalDias\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalDias}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><label>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.totalDias}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</label> </td></tr>                                                      \n");
          out.write("\n");
          out.write("                                                </tbody>\n");
          out.write("\n");
          out.write("                                            </table>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"panel-default\">\n");
          out.write("                                            <div class=\"panel-heading\">\n");
          out.write("                                                <label style=\" font-size: 25px;\" class=\"text-center\">Valor Total <span  style=\"color: #17c3a2; font-weight: 700;\" > R$: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.valorLocacao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span> </label> \n");
          out.write("                                            </div>\n");
          out.write("\n");
          out.write("                                        </div>\n");
          out.write("\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"row contrato\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.idPedido}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                        <div class=\"col-md-2\"></div>\n");
          out.write("                                        <div class=\"col-md-8\" >\n");
          out.write("                                            <br><BR>\n");
          out.write("                                            <h3 class=\"text-center\">CONTRATO DE LOCAÇÃO DE PRODUTO MÉDICO OU HOSPITALAR \n");
          out.write("                                            </h3><br><br>\n");
          out.write("\n");
          out.write("                                            <p class=\"text-justify\">\n");
          out.write("                                                LOCADOR: <b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.razaoSocial}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b>, inscrito nº CNPJ sob o nº ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.cnpj}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(", pela responsabilidade de ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.nomePessoaJuridica}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".\n");
          out.write("                                                <br>LOCATÁRIO: <b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.nomePessoaFisica}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b>, brasileiro, inscrito nº CPF sob o nº ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".\n");
          out.write("\n");
          out.write("                                                As partes acima qualificadas, por este instrumento particular, ajustam a locação de um(a) <b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.nomeProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b>, de acordo com as cláusulas seguintes:\n");
          out.write("\n");
          out.write("                                            </p><br>\n");
          out.write("                                            <p class=\"text-justify\">\n");
          out.write("                                                CLÁUSULA PRIMEIRA:  O LOCADOR declara, tendo vistoriado o produto, que este encontra-se em condições próprias para o uso ao qual se destina.\n");
          out.write("                                            </p><br>\n");
          out.write("                                            <p class=\"text-justify\">\n");
          out.write("                                                CLÁUSULA TERCEIRA: O prazo da locação é de <b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.totalDias}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" dias</b>, iniciando-se no dia que o produto for entregue , momento da aceitação do seguinte contrato e entrega do produto ao LOCATÁRIO, com término em<b> ");
          if (_jspx_meth_fmt_formatDate_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(" </b>independentemente de aviso, notificação ou interpelação judicial ou mesmo extrajudicial, no entanto, o contrato poderá ser prorrogado mediante termo aditivo, havendo interesse de ambas as partes.\n");
          out.write("                                            </p><br>\n");
          out.write("                                            <p class=\"text-justify\">\n");
          out.write("                                                CLÁUSULA QUINTA: A entrega do produto será de total responsabilidade do LOCADOR, podendo ser entregue ao LOCATARIO por transportadora no seu local de entrga, situado\n");
          out.write("                                                no endereço <b> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.enderecoLocal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </b>, <b> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.numeroLocal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </b>, bairro <b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.bairroLocal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b>, <b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.cidadeLocal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" - SP</b>,  ou retirada na loja.\n");
          out.write("                                            </p><br>\n");
          out.write("                                            <p class=\"text-justify\">\n");
          out.write("                                                CLÁUSULA SEXTA: O valor do aluguel fica acordado em <b>R$ ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.valorLocacao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b>. Tendo seu valor calculado pelo número de dias, vezes seu custo semanal.\n");
          out.write("                                            </p><br>\n");
          out.write("                                            <p class=\"text-justify\">\n");
          out.write("                                                PARÁGRAFO PRIMEIRO: O valor do aluguel deverá ser pago após a finalização do pedido, por cartão de crédito, em que a transação é automaticamente feita pelo sistema HAMP.\n");
          out.write("                                            </p><br>\n");
          out.write("                                            <p class=\"text-justify\">\n");
          out.write("                                                PARÁGRAFO SEGUNDO: Após o vencimento do prazo de locação o produto deve ser devolvido ao LOCADOR, passando do prazo será cobrado uma multa de 10% sobre o valor da locação, com isso o LOCATÁRIO ficara impossibilitado de fazer novas locações até que a multa seja paga.\n");
          out.write("                                            </p><br>\n");
          out.write("                                            <p class=\"text-justify\">\n");
          out.write("                                                PARÁGRAFO SEGUNDO: Caso o produto não seja devolvido após 30 de vencimento do prazo de locação, o LOCATÁRIO deverá ressarcir o LOCADOR com o preço de tabela do produto locado.\n");
          out.write("                                            </p><br>\n");
          out.write("                                            <p class=\"text-justify\">\n");
          out.write("                                                CLÁUSULA SÉTIMA: Fica ao LOCATÁRIO, a responsabilidade em zelar pela conservação e limpeza do produto. O LOCATÁRIO está obrigado a devolver o produto em perfeitas condições de limpeza e conservação, quando finda ou rescindida esta avença.\n");
          out.write("                                            </p><br>\n");
          out.write("                                            <p class=\"text-justify\">\n");
          out.write("                                                E, por assim estarem justos e contratados, aceitam o presente instrumento.\n");
          out.write("                                            </p><br>\n");
          out.write("                                            <p>\n");
          out.write("                                                <b>LOCADOR:</b> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.razaoSocial}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<BR>\n");
          out.write("                                                <b>CNPJ:</b>   ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.cnpj}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<BR>\n");
          out.write("                                                <b>RESPONSÁVEL LEGAL:</b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.nomePessoaJuridica}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<BR>\n");
          out.write("                                                <br>\n");
          out.write("                                                <b>LOCATÁRIO:</b> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.nomePessoaFisica}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<BR>\n");
          out.write("                                                <b>CPF:</b> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<BR>\n");
          out.write("                                            </p>\n");
          out.write("                                            <p class=\"text-center\"><b>");
          if (_jspx_meth_fmt_formatDate_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</b></p>\n");
          out.write("\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"col-md-2\"></div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                                <BR><BR>\n");
          out.write("\n");
          out.write("                            ");
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

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_forEach_1.setVar("mensagem");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensagens}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <div class=\"alert alert-info\" role=\"alert\">                    \n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensagem.mensagem}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("   \n");
          out.write("                                            </div>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatDate_0.setPattern("yyyy-MM-dd");
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.dataInicio}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatDate_1.setPattern("dd/MM/yyyy");
    _jspx_th_fmt_formatDate_1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.dataInicio}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_1 = _jspx_th_fmt_formatDate_1.doStartTag();
    if (_jspx_th_fmt_formatDate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_1);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_1);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatDate_2.setPattern("yyyy-MM-dd");
    _jspx_th_fmt_formatDate_2.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.dataLimite}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_2 = _jspx_th_fmt_formatDate_2.doStartTag();
    if (_jspx_th_fmt_formatDate_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_2);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_2);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatDate_3.setPattern("dd/MM/yyyy");
    _jspx_th_fmt_formatDate_3.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.dataLimite}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_3 = _jspx_th_fmt_formatDate_3.doStartTag();
    if (_jspx_th_fmt_formatDate_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_3);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_3);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_4 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatDate_4.setPattern("dd/MM/yyyy");
    _jspx_th_fmt_formatDate_4.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.dataLimite}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_4 = _jspx_th_fmt_formatDate_4.doStartTag();
    if (_jspx_th_fmt_formatDate_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_4);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_4);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_5 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatDate_5.setPattern("dd/MM/yyyy");
    _jspx_th_fmt_formatDate_5.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pedido.dataInicio}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_5 = _jspx_th_fmt_formatDate_5.doStartTag();
    if (_jspx_th_fmt_formatDate_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_5);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_5);
    return false;
  }
}
