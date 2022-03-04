<!--Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>HAMP EMPRESA - Pedidos</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
        <meta name="keywords" content="Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <link href="${pageContext.request.contextPath}/dashbord/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
        <!-- Custom Theme files -->
        <link href="${pageContext.request.contextPath}/dashbord/css/style.css" rel="stylesheet" type="text/css" media="all"/>
        <!--js-->
        <link rel="sortcut icon" href="${pageContext.request.contextPath}/images/logo.png" type="image/png" />
        <script src="${pageContext.request.contextPath}/dashbord/js/jquery-2.1.1.min.js"></script> 
        <!--icons-css-->
        <link href="${pageContext.request.contextPath}/dashbord/css/font-awesome.css" rel="stylesheet"> 
        <!--Google Fonts-->
        <link href='//fonts.googleapis.com/css?family=Carrois+Gothic' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Work+Sans:400,500,600' rel='stylesheet' type='text/css'>
        <!--static chart-->
        <script src="${pageContext.request.contextPath}/dashbord/js/Chart.min.js"></script>
        <!--//charts-->
        <!-- geo chart -->
        <script src="//cdn.jsdelivr.net/modernizr/2.8.3/modernizr.min.js" type="text/javascript"></script>
        <script>window.modernizr || document.write('<script src="lib/modernizr/modernizr-custom.js"><\/script>')</script>
        <!--<script src="lib/html5shiv/html5shiv.js"></script>-->
        <!-- Chartinator  -->
        <script src="js/chartinator.js" ></script>
        <script type="text/javascript">
            jQuery(function ($) {

                var chart3 = $('#geoChart').chartinator({
                    tableSel: '.geoChart',
                    columns: [{role: 'tooltip', type: 'string'}],
                    colIndexes: [2],
                    rows: [
                        ['China - 2015'],
                        ['Colombia - 2015'],
                        ['France - 2015'],
                        ['Italy - 2015'],
                        ['Japan - 2015'],
                        ['Kazakhstan - 2015'],
                        ['Mexico - 2015'],
                        ['Poland - 2015'],
                        ['Russia - 2015'],
                        ['Spain - 2015'],
                        ['Tanzania - 2015'],
                        ['Turkey - 2015']],
                    ignoreCol: [2],
                    chartType: 'GeoChart',
                    chartAspectRatio: 1.5,
                    chartZoom: 1.75,
                    chartOffset: [-12, 0],
                    chartOptions: {
                        width: null,
                        backgroundColor: '#fff',
                        datalessRegionColor: '#F5F5F5',
                        region: 'world',
                        resolution: 'countries',
                        legend: 'none',
                        colorAxis: {
                            colors: ['#679CCA', '#337AB7']
                        },
                        tooltip: {
                            trigger: 'focus',
                            isHtml: true
                        }
                    }


                });
            });
        </script>
        <!--geo chart-->
        <style>

        </style>
        <!--skycons-icons-->
        <script src="js/skycons.js"></script>
        <!--//skycons-icons-->
    </head>
    <body>	
        <div class="page-container">	
            <div class="left-content">
                <div class="mother-grid-inner">
                    <!--header start here-->
                    <div class="header-main">
                        <div class="header-left">
                            <div class="logo-name">

                                <img src="${pageContext.request.contextPath}/images/logo.png" style="width: 50%;" alt="" id="logo"/>
                                <span id="hamp2">HAMP</span> 
                                <p><span id="descricao2">EMPRESA</span></p> 


                            </div>
                            <!--search-box-->
                            <div class="search-box">
                                <form>
                                    <input type="text" placeholder="Search..." required="">	
                                    <input type="submit" value="">					
                                </form>
                            </div><!--//end-search-box-->
                            <div class="clearfix"> </div>
                        </div>
                        <div class="header-right">
                            <!--notification menu end -->
                            <div class="profile_details">		
                                <ul>
                                    <li class="dropdown profile_details_drop">
                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                            <div class="profile_img">	
                                                <span class="prfil-img"><img src="${pageContext.request.contextPath}/fotos/${pessoaj.imagemPessoaJ}" style="width: 100px;" alt=""> </span> 
                                                <div class="user-name">
                                                    <p>${pessoaj.nomePessoa}</p>
                                                    <label>${pessoaj.razaoSocialPessoaJuridica}</label>
                                                </div>
                                                <i class="fa fa-angle-down lnr"></i>
                                                <i class="fa fa-angle-up lnr"></i>
                                                <div class="clearfix"></div>	
                                            </div>	
                                        </a>
                                        <ul class="dropdown-menu drp-mnu">

                                            <li><a href="${pageContext.request.contextPath}/CarregarPessoaJ?idpessoa=${pessoaj.idPessoa}"> <i class="fa fa-user"></i> Peril</a></li> 
                                            <li><a  href="${pageContext.request.contextPath}/LogarUsuario?acao=logout"><i class="fa fa-sign-out"></i> Sair</a></li>

                                        </ul>
                                    </li>
                                </ul>
                            </div>
                            <div class="clearfix"> </div>				
                        </div>
                        <div class="clearfix"> </div>	
                    </div>
                    <div class="page-head_agile_info_w3l">
                        <div class="container">

                            <label style="font-weight: 600;  font-size: 3em; color:white; position: relative; left: -20%;text-shadow: 2px 2px 7px black;">PEDIDOS <i class="fa fa-shopping-cart"></i></label>
                            <!--/w3_short-->

                            <div class="services-breadcrumb">
                                <div class="agile_inner_breadcrumb">


                                </div>
                            </div>
                            <!--//w3_short-->
                        </div>
                    </div>
                    <!--heder end here-->
                    <!-- script-for sticky-nav -->
                    <script>
            $(document).ready(function () {
                var navoffeset = $(".header-main").offset().top;
                $(window).scroll(function () {
                    var scrollpos = $(window).scrollTop();
                    if (scrollpos >= navoffeset) {
                        $(".header-main").addClass("fixed");
                    } else {
                        $(".header-main").removeClass("fixed");
                    }
                });

            });
                    </script>
                    <!-- /script-for sticky-nav -->
                    <!--inner block start here-->

                    <div class="inner-block" style="padding-top: 2em;">
                        <!--market updates updates-->
                        <div class="market-updates">

                            <c:forEach var="pedido" items="${pedidos}"> 

                                <div class="row" style="box-shadow: 0px 0px 15px 0px #d6d6d6">
                                    <br><br>
                                    <div class="col-md-2 ">

                                        <div class="thumbnail team-w3agile">
                                            <img class="img-rounded img-responsive" src="${pageContext.request.contextPath}/produtos/${pedido.imagemProduto}" >
                                            <input type="hidden" value="${pedido.imagemProduto}" name="imgproduto">
                                            <div class="social-icons team-icons right-w3l fotw33">

                                            </div>
                                        </div>
                                        <br>
                                        <h3 class="text-center" style="color: black;">${pedido.nomeProduto}</h3><br>
                                        <input type="hidden" value="${pedido.nomeProduto}" name="nomeproduto">

                                        <table class="table table-striped table-responsive">
                                            <tbody>
                                                <tr><td><label>Categoria</label></td><td><input type="hidden" name="categoria" value="${pedido.categoriaPoduto}"><label id="cat"> </label> </td></tr>
                                                <tr><td><label>Tamanho</label></td><td><label> ${pedido.tamanhoProduto} cm</label></td></tr>
                                            <input type="hidden" value="${pedido.tamanhoProduto}" name="tamanho">
                                            <tr><td><label>Peso</label></td><td><label> ${pedido.pesoProduto} gramas</label></td></tr>
                                            <input type="hidden" value="${pedido.pesoProduto}" name="peso">
                                            <tr><td><label>Cor Prodominante</label></td><td> <div id="div-color" style="background-color: ${pedido.corPredominante}; width: 20px;
                                                                                                  height: 20px;"></div></td></tr>
                                            <input type="hidden" value="${pedido.corPredominante}" name="cor">
                                            </tbody>
                                        </table>
                                        <div class="alert alert-success" role="alert">
                                            <strong>${pedido.situacaoPedido}</strong>
                                        </div>
                                        <form method="POST" action="${pageContext.request.contextPath}/SituacaoPedido">
                                            <input type="hidden" name="idpedido" value="${pedido.idPedido}">
                                            <input type="hidden" name="idempresa" value="${pessoaj.idPessoa}">                                           
                                            <div class="col-lg-12">
                                                <label for="sit">Alterar Situacção Pedido</label>
                                                <div class="input-group">

                                                    <select id="sit" name="situacao" class="form-control">

                                                        <option value="Seu pedido foi comfirmado e seu produto está a caminho">Aceitar</option>
                                                        <option value="Seu pedido foi revogado, contate a empresa para saber mais">Revogar</option>
                                                    </select>
                                                    <span class="input-group-btn">
                                                        <input type="submit" class="btn btn-success" value="ALterar">
                                                    </span>
                                                </div><!-- /input-group -->
                                                <br><br>
                                            </div>
                                        </form>
                                    </div>
                                    <div class="col-md-3">
                                        <form action="${pageContext.request.contextPath}/ListarMensagem">
                                            <input type="hidden" value="${pessoaj.idPessoa}" name="idReceptor">
                                            <input type="hidden" value="${pedido.idPessoFisica}" name="idEmissor">
                                            <input type="hidden" value="${pessoaj.idPessoa}" name="idempresa">
                                            <input type="submit" class="btn btn-info" value="VER MENSAGENS">

                                        </form>

                                        <br>
                                        <h4>Mensagens:</h4>
                                        <br>
                                        <c:forEach var="mensagem" items="${mensagens}">
                                            <div class="alert alert-info" role="alert">                    
                                                ${mensagem.mensagem}   
                                            </div>
                                        </c:forEach>                            
                                        <form method="POST" action="${pageContext.request.contextPath}/SalvarMensagemJ">
                                            <input type="hidden" value="${pedido.idPessoFisica}" name="idReceptor">

                                            <input type="hidden" value="${pessoaj.idPessoa}" name="idEmissor">
                                            <div class="row">
                                                <div class="col-md-9">
                                                    <label>Envie uma mensagem</label>
                                                    <textarea name="mensagem" class="form-control" style="resize: none;" rows="4" name="mensagem"></textarea>
                                                    <strong>${mensagem}</strong>
                                                </div>
                                                <div class="col-md-3">
                                                    <br>
                                                    <span class="glyphicon glyphicon-sen"></span><input type="submit" value="Enviar" class="btn btn-success"> 
                                                </div>
                                            </div>
                                        </form>
                                    </div>

                                    <div class="col-md-2">
                                        <div class="panel-default">
                                            <div class="panel-heading">
                                                <h4 class="text-center"><span class=" glyphicon glyphicon-road"></span>  Local de Entrega</h4> 
                                            </div>
                                            <br>

                                            <h4>${pedido.enderecoLocal}</h4><br>
                                            <h4>${pedido.numeroLocal}</h4><br>
                                            <h4>${pedido.bairroLocal}</h4><br>
                                            <h4>${pedido.cidadeLocal}</h4><br>
                                            <h4>${pedido.cepLocal}</h4><br>
                                            <h4>São Paulo</h4><br>                                       

                                        </div>
                                    </div>
                                    <div class="col-md-2">
                                        <div class="panel-default">
                                            <div class="panel-heading">
                                                <h4 class="text-center"><span class=" glyphicon glyphicon-user"></span>  Cliente Locatário</h4> 
                                            </div>
                                            <br>


                                            <h4>${pedido.nomePessoaFisica}</h4><br>

                                            <h4><label>CPF: </label> ${pedido.cpf}</h4><br>
                                            <h4><span class=" glyphicon glyphicon-phone-alt"></span> Telefone</h4>
                                            <h4>${pedido.telefonePessoaFisica}</h4><br>
                                            <h4><span class=" glyphicon glyphicon-envelope"></span> E-mail</h4>
                                            <h5>${pedido.emailPessoaFisica}</h5><br>



                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="panel-default">
                                            <div class="panel-heading">
                                                <h4 class="text-center"><span class=" glyphicon glyphicon-list"></span> Detalhe do Pedido</h4> 
                                            </div>
                                            <table class="table table-striped">
                                                <tbody>
                                                    <tr><td><label>Data de Inicio</label></td><td><input type="hidden" name="dataInicio" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${pedido.dataInicio}" />"><label><fmt:formatDate pattern="dd/MM/yyyy" value="${pedido.dataInicio}" /></label></td></tr>                                                      
                                                    <tr><td><label>Data de Término</label></td><td><input type="hidden" name="dataLimite" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${pedido.dataLimite}" />"><label><fmt:formatDate pattern="dd/MM/yyyy" value="${pedido.dataLimite}" /></label></td></tr>                                                      
                                                    <tr><td><label>Total de dias</label></td><td><input type="hidden" name="totalDias" value="${totalDias}"><label>${pedido.totalDias}</label> </td></tr>                                                      

                                                </tbody>

                                            </table>
                                        </div>
                                        <div class="panel-default">
                                            <div class="panel-heading">
                                                <label style=" font-size: 25px;" class="text-center">Valor Bruto R$:<span  style="color: #17c3a2; font-weight: 700;" >  <input type="text" value="${pedido.valorLocacao}" readonly style="border: none; text-align: center;"></span> </label> 
                                                <input type="hidden" id="bruto" value="${pedido.valorLocacao}">
                                                <label style=" font-size: 25px;" class="text-center">Comissão HAMP R$: <span  style="color: #17c3a2; font-weight: 700;" > <input id="comissao" type="text" readonly style="border: none; text-align: center;"></span> </label> 
                                                <label style=" font-size: 25px;" class="text-center">TOTAL R$: <span  style="color: #006699; font-weight: 700;" > <input id="total" type="text" readonly style="border: none; text-align: center;"></span> </label> 
                                            </div>

                                        </div>

                                    </div>
                                    <div class="row contrato" id="${pedido.idPedido}">
                                        <div class="col-md-2"></div>
                                        <div class="col-md-8" >
                                            <br><BR>
                                            <h3 class="text-center">CONTRATO DE LOCAÇÃO DE PRODUTO MÉDICO OU HOSPITALAR 
                                            </h3><br><br>

                                            <p class="text-justify">
                                                LOCADOR: <b>${pedido.razaoSocial}</b>, inscrito nº CNPJ sob o nº ${pedido.cnpj}, pela responsabilidade de ${pedido.nomePessoaJuridica}.
                                                <br>LOCATÁRIO: <b>${pedido.nomePessoaFisica}</b>, brasileiro, inscrito nº CPF sob o nº ${pedido.cpf}.

                                                As partes acima qualificadas, por este instrumento particular, ajustam a locação de um(a) <b>${pedido.nomeProduto}</b>, de acordo com as cláusulas seguintes:

                                            </p><br>
                                            <p class="text-justify">
                                                CLÁUSULA PRIMEIRA:  O LOCADOR declara, tendo vistoriado o produto, que este encontra-se em condições próprias para o uso ao qual se destina.
                                            </p><br>
                                            <p class="text-justify">
                                                CLÁUSULA TERCEIRA: O prazo da locação é de <b>${pedido.totalDias} dias</b>, iniciando-se no dia que o produto for entregue , momento da aceitação do seguinte contrato e entrega do produto ao LOCATÁRIO, com término em<b> <fmt:formatDate pattern="dd/MM/yyyy" value="${pedido.dataLimite}" /> </b>independentemente de aviso, notificação ou interpelação judicial ou mesmo extrajudicial, no entanto, o contrato poderá ser prorrogado mediante termo aditivo, havendo interesse de ambas as partes.
                                            </p><br>
                                            <p class="text-justify">
                                                CLÁUSULA QUINTA: A entrega do produto será de total responsabilidade do LOCADOR, podendo ser entregue ao LOCATARIO por transportadora no seu local de entrga, situado
                                                no endereço <b> ${pedido.enderecoLocal} </b>, <b> ${pedido.numeroLocal} </b>, bairro <b>${pedido.bairroLocal}</b>, <b>${pedido.cidadeLocal} - SP</b>,  ou retirada na loja.
                                            </p><br>
                                            <p class="text-justify">
                                                CLÁUSULA SEXTA: O valor do aluguel fica acordado em <b>R$ ${pedido.valorLocacao}</b>. Tendo seu valor calculado pelo número de dias, vezes seu custo semanal.
                                            </p><br>
                                            <p class="text-justify">
                                                PARÁGRAFO PRIMEIRO: O valor do aluguel deverá ser pago após a finalização do pedido, por cartão de crédito, em que a transação é automaticamente feita pelo sistema HAMP.
                                            </p><br>
                                            <p class="text-justify">
                                                PARÁGRAFO SEGUNDO: Após o vencimento do prazo de locação o produto deve ser devolvido ao LOCADOR, passando do prazo será cobrado uma multa de 10% sobre o valor da locação, com isso o LOCATÁRIO ficara impossibilitado de fazer novas locações até que a multa seja paga.
                                            </p><br>
                                            <p class="text-justify">
                                                PARÁGRAFO SEGUNDO: Caso o produto não seja devolvido após 30 de vencimento do prazo de locação, o LOCATÁRIO deverá ressarcir o LOCADOR com o preço de tabela do produto locado.
                                            </p><br>
                                            <p class="text-justify">
                                                CLÁUSULA SÉTIMA: Fica ao LOCATÁRIO, a responsabilidade em zelar pela conservação e limpeza do produto. O LOCATÁRIO está obrigado a devolver o produto em perfeitas condições de limpeza e conservação, quando finda ou rescindida esta avença.
                                            </p><br>
                                            <p class="text-justify">
                                                E, por assim estarem justos e contratados, aceitam o presente instrumento.
                                            </p><br>
                                            <p>
                                                <b>LOCADOR:</b> ${pedido.razaoSocial}<BR>
                                                <b>CNPJ:</b>   ${pedido.cnpj}<BR>
                                                <b>RESPONSÁVEL LEGAL:</b>${pedido.nomePessoaJuridica}<BR>
                                                <br>
                                                <b>LOCATÁRIO:</b> ${pedido.nomePessoaFisica}<BR>
                                                <b>CPF:</b> ${pedido.cpf}<BR>
                                            </p>
                                            <p class="text-center"><b><fmt:formatDate pattern="dd/MM/yyyy" value="${pedido.dataInicio}" /></b></p>
                                            <BR><BR>
                                        </div>
                                        <div class="col-md-2"></div>
                                    </div>
                                </div>
                                <BR><BR>

                            </c:forEach>
                        </div>
                        <div class="clearfix"> </div>

                        <!--market updates end here-->
                        <!--mainpage chit-chating-->
                        <!--main page chit chating end here-->
                        <!--main page chart start here-->

                        <!--main page chart layer2-->
                        <div class="chart-layer-2">
                            <div class="row">
                                <div class="col-md-12" style="height: 450px;"></div>
                            </div>

                        </div>

                        <!--climate start here-->

                        <!--climate end here-->
                    </div>
                    <!--inner block end here-->
                    <!--copy rights start here-->
                    <div class="copyrights">
                        <p>Â© 2016 Shoppy. All Rights Reserved | Design by  <a href="http://w3layouts.com/" target="_blank">W3layouts</a> </p>
                    </div>	
                    <!--COPY rights end here-->
                </div>
            </div>
            <!--slider menu-->
            <div class="sidebar-menu">	  
                <div class="menu">
                    <ul id="menu" >
                        <li id="menu-home" ><a style="font-size: 3em;" href="${pageContext.request.contextPath}/pessoaJuridica/index.jsp"><i class="fa fa-tachometer"></i><span>HOME</span></a></li>
                        <li><a href="#"><i class="fa fa-product-hunt"></i><span>Produto</span><span class="fa fa-angle-right" style="float: right"></span></a>
                            <ul>
                                <li><a href="${pageContext.request.contextPath}/IdProduto?idpessoa=${pessoaj.idPessoa}">Cadastrar</a></li>
                                <li> <a href="${pageContext.request.contextPath}/ListarProduto?idempresa=${pessoaj.idPessoa}">Listar</a></li>		            
                            </ul>
                        </li>

                        <li><a href="${pageContext.request.contextPath}/ListarPedidoJ?idempresa=${pessoaj.idPessoa}"><i class="fa fa-shopping-cart"></i><span>Pedidos</span></a></li>
                        <li><a href="${pageContext.request.contextPath}/CarregarPessoaJ?idpessoa=${pessoaj.idPessoa}"><i class="fa fa-user"></i><span>Perfil</span></a></li>


                        <li><a href=""><i class="fa fa-envelope"></i><span>Mensagens</span><span class="fa fa-angle-right" style="float: right"></span></a>

                        </li>

                    </ul>
                </div>
            </div>
            <div class="clearfix"> </div>
        </div>
        <!--slide bar menu end here-->
        <script>
            var toggle = true;

            $(".sidebar-icon").click(function () {
                if (toggle)
                {
                    $(".page-container").addClass("sidebar-collapsed").removeClass("sidebar-collapsed-back");
                    $("#menu span").css({"position": "absolute"});
                } else
                {
                    $(".page-container").removeClass("sidebar-collapsed").addClass("sidebar-collapsed-back");
                    setTimeout(function () {
                        $("#menu span").css({"position": "relative"});
                    }, 400);
                }
                toggle = !toggle;
            });

        </script>
        <!--scrolling js-->
        <script src="${pageContext.request.contextPath}/dashbord/js/jquery.nicescroll.js"></script>
        <script src="${pageContext.request.contextPath}/dashbord/js/scripts.js"></script>
        <!--//scrolling js-->
        <script src="${pageContext.request.contextPath}/dashbord/js/bootstrap.js"></script>
        <script src="${pageContext.request.contextPath}/js/cadastro.js" type="text/javascript"></script>
        <!-- mother grid end here-->
    </body>
</html>


