<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <title>HAMP - Pedidos</title>
        <!--/tags -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
        <meta name="keywords" content="Elite Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
            function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!--//tags -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <link href="${pageContext.request.contextPath}/css/team.css" rel="stylesheet" type="text/css" media="all" />
        <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" media="all" />
        <link href="${pageContext.request.contextPath}/css/font-awesome.css" rel="stylesheet"> 
        <!-- //for bootstrap working -->
        <link rel="sortcut icon" href="${pageContext.request.contextPath}/images/logo.png" type="image/png" />
        <link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800" rel="stylesheet">
        <link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,900,900italic,700italic' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <!-- header -->
        <div class="header" id="home">
            <div class="container">
                <ul id="menu-topo">
                    <li></li>
                </ul>
            </div>
        </div>
        <!-- //header -->
        <!-- header-bot -->
        <div class="header-bot">
            <div class="header-bot_inner_wthreeinfo_header_mid">
                <div class="col-md-4 logo_agile">
                    <h1><a href="${pageContext.request.contextPath}/hamp/index.jsp"><img src="${pageContext.request.contextPath}/images/logo.png"  alt="" id="logo"/>
                            <span id="hamp">HAMP</span></a></h1>
                </div>
                <div class="col-md-4 header-middle">
                    <form action="#" method="post" id="form-top">
                        <input type="search" name="search" placeholder="digite o que procura" required="">
                        <input type="submit" value=" ">
                        <div class="clearfix"></div>
                    </form>
                </div>
                <!-- header-bot -->
                <div class="col-md-4 agileits-social top_content">
                    <ul class="social-nav model-3d-0 footer-social w3_agile_social">
                        <li class="share"></li>
                        COMPARTILHE
                        <li><a href="#" class="facebook">
                                <div class="front"><i class="fa fa-facebook" aria-hidden="true"></i></div>
                                <div class="back"><i class="fa fa-facebook" aria-hidden="true"></i></div></a></li>
                        <li><a href="#" class="twitter"> 
                                <div class="front"><i class="fa fa-twitter" aria-hidden="true"></i></div>
                                <div class="back"><i class="fa fa-twitter" aria-hidden="true"></i></div></a></li>
                        <li><a href="#" class="instagram">
                                <div class="front"><i class="fa fa-instagram" aria-hidden="true"></i></div>
                                <div class="back"><i class="fa fa-instagram" aria-hidden="true"></i></div></a></li>
                        <li><a href="#" class="pinterest">
                                <div class="front"><i class="fa fa-linkedin" aria-hidden="true"></i></div>
                                <div class="back"><i class="fa fa-linkedin" aria-hidden="true"></i></div></a></li>
                    </ul>



                </div>
                <div class="clearfix"></div>
            </div>
        </div>
        <!-- //header-bot -->
        <!-- banner -->
        <div class="ban-top">
            <div class="container">
                <div class="top_nav_left">
                    <nav class="navbar navbar-default">
                        <div class="container-fluid">
                            <!-- Brand and toggle get grouped for better mobile display -->
                            <div class="navbar-header">
                                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                                    <span class="sr-only">Toggle navigation</span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                </button>
                            </div>
                            <!-- Collect the nav links, forms, and other content for toggling -->
                            <div class="collapse navbar-collapse menu--shylock" id="bs-example-navbar-collapse-1">
                                <ul class="nav navbar-nav menu__list">
                                    <li class="active menu__item menu__item--current"><a class="menu__link" href="${pageContext.request.contextPath}/hamp/index.jsp">INÍCIO <span class="sr-only">(current)</span></a></li>
                                    <li class=" menu__item"><a class="menu__link" href="sobre.jsp">SOBRE</a></li>
                                    <li class="dropdown menu__item">
                                        <a href="#" class="dropdown-toggle menu__link" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">CATEGORIAS <span class="caret"></span></a>
                                        <ul class="dropdown-menu multi-column columns-3">
                                            <div class="agile_inner_drop_nav_info">
                                                <div class="col-sm-6 multi-gd-img1 multi-gd-text ">
                                                    <a href="mens.html"><img src="images/top2.jpg" alt=" "/></a>
                                                </div>
                                                <div class="col-sm-3 multi-gd-img">
                                                    <ul class="multi-column-dropdown">
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=1" >Almofadas<br> Ortopédicas</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=2">Andadores</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=3">Bengalas</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=4">Botas Imobilizadoras</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=5">Cadeiras de rodas e banho</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=6">Coletes de coluna</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=7">Faixas Abdominais</a></li>
                                                    </ul>
                                                </div>
                                                <div class="col-sm-3 multi-gd-img">
                                                    <ul class="multi-column-dropdown">
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=8">Imobilizadores de Joelhos</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=9">Joelheiras Articuladas</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=10">Muletas </a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=11">Ortese para Ombro</a></li>                  
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=12">Tornozeleira</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=13">Outros</a></li>
                                                    </ul>
                                                </div>
                                                <div class="clearfix"></div>
                                            </div>
                                        </ul>
                                    </li>

                                    <li class="menu__item dropdown">
                                        <a class="menu__link" href="#" class="dropdown-toggle" data-toggle="dropdown">CONTRATOS <b class="caret"></b></a>
                                        <ul class="dropdown-menu agile_short_dropdown">
                                            <li><a href="icons.jsp">LOCAÇÃO</a></li>
                                            <li><a href="typography.jsp">USO DO SISTEMA</a></li>
                                        </ul>
                                    </li>
                                    <li class="dropdown" id="perfil" style="left: 0;">
                                        <a class="menu__link" href="" id="pad-perfil" class="dropdown-toggle" data-toggle="dropdown"><img id="foto-perfil" class="img-circle" src="${pageContext.request.contextPath}/fotos/${pessoaf.imagemPessoaFisica}" > </a>
                                        <ul class="dropdown-menu agile_short_dropdown" id="list-perfil">
                                            <li>

                                                <a href="${pageContext.request.contextPath}/CarregarPessoaF?idpessoa=${pessoaf.idPessoa}">MEU PERFIL</a>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/LogarUsuario?acao=logout">Sair</a>  <li>

                                        </ul>
                                    </li>


                                    <a href="#"  data-toggle="dropdown"></a>
                                </ul>
                            </div>
                        </div>
                    </nav>	
                </div>
                <div class="top_nav_right">
                    <div class="wthreecartaits wthreecartaits2 cart cart box_1"> 
                        <form action="${pageContext.request.contextPath}/ListarPedido" method="post" class="last"> 
                            <input type="hidden" name="cmd" value="_cart">
                            <input type="hidden" name="display" value="1">
                            <button class="w3view-cart" type="submit" name="submit" value=""><i class="fa fa-cart-arrow-down" aria-hidden="true"></i></button>
                        </form>  

                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
        <!-- //banner-top -->

        <div class="page-head_agile_info_w3l">
            <div class="container">
                <h3 id="nome-cat">Pedidos</h3>
                <!--/w3_short-->
                <div class="services-breadcrumb">
                    <div class="agile_inner_breadcrumb">

                    </div>
                </div>
                <!--//w3_short-->
            </div>
        </div>
        <br>
        <!-- CONTRATO DE LOCAÇÃO -->
        <c:forEach var="pedido" items="${pedidos}"> 

            <div class="row men-pro-item simpleCart_shelfItem"><br><br>
                <div class="row">
                    <div class="col-md-1"></div>
                    <div class="col-md-2 ">

                        <div class="thumbnail team-w3agile">
                            <img class="img-rounded img-responsive" src="${pageContext.request.contextPath}/produtos/${pedido.imagemProduto}" >
                            <input type="hidden" value="${pedido.imagemProduto}" name="imgproduto">
                            <div class="social-icons team-icons right-w3l fotw33">

                            </div>
                        </div>
                        <br>
                        <h2 class="text-center" style="color: black;">${pedido.nomeProduto}</h2><br>
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

                    </div>
                    <div class="col-md-3">
                        <form action="${pageContext.request.contextPath}/ListarMensagemF">    
                            <input type="hidden" value="${pedido.idPessoFisica}" name="idReceptor">        
                            <input type="hidden" value="${pedido.idpessoaJuridica}" name="idEmissor">
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
                        <form method="POST" action="${pageContext.request.contextPath}/SalvarMensagem">
                            <input type="hidden" value="${pedido.idpessoaJuridica}" name="idReceptor">
                            <input type="hidden" value="${pedido.idPessoFisica}" name="idEmissor">
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
                                <h4 class="text-center"><span class=" glyphicon glyphicon-briefcase"></span>  Empresa Locadora</h4> 
                            </div>
                            <br>


                            <h4>${pedido.razaoSocial}</h4><br>

                            <h4>${pedido.nomePessoaJuridica}</h4><br>

                            <h4><span class=" glyphicon glyphicon-phone-alt"></span> ${pedido.telefonePessoaJuridica}</h4><br>

                            <h4><span class=" glyphicon glyphicon-envelope"></span>${pedido.emailPessoaJuridica}</h4><br>

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
                                <label style=" font-size: 25px;" class="text-center">Valor Total <span  style="color: #17c3a2; font-weight: 700;" > R$: ${pedido.valorLocacao}</span> </label> 

                            </div>

                        </div>

                    </div>
                    <div class="row contrato">
                        <div class="col-md-3"></div>
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
                        </div>
                        <div class="col-md-3"></div>
                    </div>
                </div><BR>

            </c:forEach>

            <div class="chart-layer-2">
                <div class="row">
                    <div class="col-md-12" style="height: 450px;"></div>
                </div>
            </div>

            <!-- /banner_bottom_agile_info -->


            <!-- team -->

            <!-- //team -->

            <!-- /we-offer -->

            <!-- //we-offer -->

            <!-- footer -->
            <div class="footer">
                <div class="footer_agile_inner_info_w3l">
                    <div class="col-md-3 footer-left">
                        <h2><a href="index.jsp"><span>H</span>AMP </a></h2>
                        <p>Sistema HAMP |
                            Sistema Web de produtos médicos e hospitalares.  
                            Projeto de Conclusão de Curso.</p>
                        <ul class="social-nav model-3d-0 footer-social w3_agile_social two">
                            <li><a href="#" class="facebook">
                                    <div class="front"><i class="fa fa-facebook" aria-hidden="true"></i></div>
                                    <div class="back"><i class="fa fa-facebook" aria-hidden="true"></i></div></a></li>
                            <li><a href="#" class="twitter"> 
                                    <div class="front"><i class="fa fa-twitter" aria-hidden="true"></i></div>
                                    <div class="back"><i class="fa fa-twitter" aria-hidden="true"></i></div></a></li>
                            <li><a href="#" class="instagram">
                                    <div class="front"><i class="fa fa-instagram" aria-hidden="true"></i></div>
                                    <div class="back"><i class="fa fa-instagram" aria-hidden="true"></i></div></a></li>
                            <li><a href="#" class="pinterest">
                                    <div class="front"><i class="fa fa-linkedin" aria-hidden="true"></i></div>
                                    <div class="back"><i class="fa fa-linkedin" aria-hidden="true"></i></div></a></li>
                        </ul>
                    </div>
                    <div class="col-md-9 footer-right">
                        <div class="sign-grds">
                            <div class="col-md-4 sign-gd">
                                <h4>COMO <span>PAGAR?</span> </h4>
                                <ul>
                                    <li><a href="index.jsp">Início</a></li>
                                    <li><a href="sobre.jsp">Sobre</a></li>
                                    <li><a href="womens.jsp">Women's wear</a></li>
                                    <li><a href="sobre.jsp">Sobre</a></li>
                                    <li><a href="typography.jsp">Short Codes</a></li>
                                    <li><a href="contact.jsp">Contato</a></li>
                                </ul>
                            </div>

                            <div class="col-md-5 sign-gd-two">
                                <h4>Informações <span>de contato</span></h4>
                                <div class="w3-address">
                                    <div class="w3-address-grid">
                                        <div class="w3-address-left">
                                            <i class="fa fa-phone" aria-hidden="true"></i>
                                        </div>
                                        <div class="w3-address-right">
                                            <h6>Número p/ contato</h6>
                                            <p>(17) 7070-7070</p>
                                        </div>
                                        <div class="clearfix"> </div>
                                    </div>
                                    <div class="w3-address-grid">
                                        <div class="w3-address-left">
                                            <i class="fa fa-envelope" aria-hidden="true"></i>
                                        </div>
                                        <div class="w3-address-right">
                                            <h6>Endereço de e-mail</h6>
                                            <p>E-mail :<a href="mailto:example@email.com"> mail@example.com</a></p>
                                        </div>
                                        <div class="clearfix"> </div>
                                    </div>
                                    <div class="w3-address-grid">
                                        <div class="w3-address-left">
                                            <i class="fa fa-map-marker" aria-hidden="true"></i>
                                        </div>
                                        <div class="w3-address-right">
                                            <h6>Endereço</h6>
                                            <p>Fernandópolis, São Paulo, CEP 156000-000. 

                                            </p>
                                        </div>
                                        <div class="clearfix"> </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 sign-gd flickr-post">
                                <h4>Nossa <span>Equipe</span></h4>
                                <ul>
                                    <li><a href="single.html"><img src="images/t1.jpg" alt=" " class="img-responsive" /></a></li>
                                    <li><a href="single.html"><img src="images/t2.jpg" alt=" " class="img-responsive" /></a></li>
                                    <li><a href="single.html"><img src="images/t3.jpg" alt=" " class="img-responsive" /></a></li>
                                    <li><a href="single.html"><img src="images/t4.jpg" alt=" " class="img-responsive" /></a></li>
                                    <li><a href="single.html"><img src="images/t1.jpg" alt=" " class="img-responsive" /></a></li>
                                    <li><a href="single.html"><img src="images/t2.jpg" alt=" " class="img-responsive" /></a></li>
                                    <li><a href="single.html"><img src="images/t3.jpg" alt=" " class="img-responsive" /></a></li>
                                    <li><a href="single.html"><img src="images/t2.jpg" alt=" " class="img-responsive" /></a></li>
                                    <li><a href="single.html"><img src="images/t4.jpg" alt=" " class="img-responsive" /></a></li>
                                </ul>
                            </div>
                            <div class="clearfix"></div>
                        </div>
                    </div>

                    <div class="clearfix"></div>
                </div>
                <p class="copy-right">&copy 2017 HAMP | Design by @fravineo</p>
            </div>
        </div>
        <!-- //footer -->

        <!-- login -->
        <div class="modal fade" id="myModal4" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content modal-info">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>						
                    </div>
                    <div class="modal-body modal-spa">
                        <div class="login-grids">
                            <div class="login">
                                <div class="login-bottom">
                                    <h3>Sign up for free</h3>
                                    <form>
                                        <div class="sign-up">
                                            <h4>Email :</h4>
                                            <input type="text" value="Type here" onfocus="this.value = '';" onblur="if (this.value == '') {
                                                        this.value = 'Type here';
                                                    }" required="">	
                                        </div>
                                        <div class="sign-up">
                                            <h4>Password :</h4>
                                            <input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {
                                                        this.value = 'Password';
                                                    }" required="">

                                        </div>
                                        <div class="sign-up">
                                            <h4>Re-type Password :</h4>
                                            <input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {
                                                        this.value = 'Password';
                                                    }" required="">

                                        </div>
                                        <div class="sign-up">
                                            <input type="submit" value="REGISTER NOW" >
                                        </div>

                                    </form>
                                </div>
                                <div class="login-right">
                                    <h3>Sign in with your account</h3>
                                    <form>
                                        <div class="sign-in">
                                            <h4>Email :</h4>
                                            <input type="text" value="Type here" onfocus="this.value = '';" onblur="if (this.value == '') {
                                                        this.value = 'Type here';
                                                    }" required="">	
                                        </div>
                                        <div class="sign-in">
                                            <h4>Password :</h4>
                                            <input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {
                                                        this.value = 'Password';
                                                    }" required="">
                                            <a href="#">Forgot password?</a>
                                        </div>
                                        <div class="single-bottom">
                                            <input type="checkbox"  id="brand" value="">
                                            <label for="brand"><span></span>Remember Me.</label>
                                        </div>
                                        <div class="sign-in">
                                            <input type="submit" value="SIGNIN" >
                                        </div>
                                    </form>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                            <p>By logging in you agree to our <a href="#">Terms and Conditions</a> and <a href="#">Privacy Policy</a></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- //login -->
        <a href="#home" class="scroll" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
        <!-- js -->
        <script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
        <!-- //js -->	
        <!-- cart-js -->
        <script src="js/minicart.min.js"></script>
        <script>

        </script>

        <!-- //cart-js --> 

        <!-- stats -->
        <script src="js/jquery.waypoints.min.js"></script>
        <script src="js/jquery.countup.js"></script>
        <script>
                                                $('.counter').countUp();
        </script>
        <!-- //stats -->
        <!-- start-smoth-scrolling -->
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/jquery.easing.min.js"></script>
        <script type="text/javascript">
                                                jQuery(document).ready(function ($) {
                                                    $(".scroll").click(function (event) {
                                                        event.preventDefault();
                                                        $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
                                                    });
                                                });
        </script>
        <!-- here stars scrolling icon -->
        <script type="text/javascript">
            $(document).ready(function () {
                /*
                 var defaults = {
                 containerID: 'toTop', // fading element id
                 containerHoverID: 'toTopHover', // fading element hover id
                 scrollSpeed: 1200,
                 easingType: 'linear' 
                 };
                 */

                $().UItoTop({easingType: 'easeOutQuart'});

            });
        </script>
        <!-- //here ends scrolling icon -->

        <!-- for bootstrap working -->
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
        <script src="${pageContext.request.contextPath}/js/cadastro.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/javascript/contrato.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/javascript/formulario.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/javascript/categoria.js" type="text/javascript"></script>
    </body>
</html>



