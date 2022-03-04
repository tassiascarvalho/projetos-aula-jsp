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
        <title>HAMP - Confirmar Pedido</title>
        <!--/tags -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
        <meta name="keywords" content="Elite Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
            function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!--//tags -->
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/team.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/font-awesome.css" rel="stylesheet"> 
        <link rel="sortcut icon" href="${pageContext.request.contextPath}/images/logo.png" type="image/png" />
        <!-- //for bootstrap working -->
        <link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800" rel="stylesheet">
        <link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,900,900italic,700italic' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <!-- header -->
        <div class="header" id="home">
            <div class="container">
                <ul id="menu-topo">
                    <li> <a href="#" data-toggle="modal" data-target="#myModal"><i class="fa fa-unlock-alt" aria-hidden="true"></i> ENTRAR </a></li>
                    <li> <a href="#" data-toggle="modal" data-target="#myModal2"><i class="fa fa-pencil-square-o" aria-hidden="true"></i> CADASTRO</a></li>
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
                        <li class="share">Compartilhe: </li>
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
                                    <li class="dropdown" id="perfil">
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
        <br>
        <div class="container">
            <h2 class="text-center">
                <span style="color: #17c3a2;">Confirmar dados  </span><span style="color: #17c3a2;" class="glyphicon glyphicon-chevron-right"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <span>Contrato de Locação   </span><span class="glyphicon glyphicon-chevron-right"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <span>Finalizar Pedido   </span>
            </h2>

        </div>


        <!-- /banner_bottom_agile_info -->
        <div class="row">
            <div class="banner_bottom_agile_info">
                <form method="POST" action="${pageContext.request.contextPath}/SalvarPedido">

                    <div class="col-md-1"></div>
                    <div class="col-md-3 men-pro-item simpleCart_shelfItem">
                        <br>
                        <div class="panel-default">
                            <div class="panel-heading">

                                <h3 class="text-center"><span class="glyphicon glyphicon-user"></span> Dados Pessoais</h3>

                            </div>

                            <br>
                            <p> <input class="form-control" type="hidden" name="idpessoaf" size="60" readonly value=${pessoaf.idPessoa} ></p>    
                            <p><label>Nome Completo: </label><input  value="${pessoaf.nomePessoa}" class="form-control dados" type="text" name="nome" required></p> 
                            <p><label>CPF: </label><input value="${pessoaf.cpfPessoaFisica}" class="form-control dados" type="text" name="cpf" required></p>
                            <p><label>Telefone:  </label><input value="${pessoaf.telefonePessoa}" class="form-control dados" type="text" name="telefone" required></p>
                            <p><label>Email: </label><input  value="${pessoaf.emailPessoa}" class="form-control dados" type="email" name="email" required></p>

                            <p></p>
                            <br>
                        </div>

                        <script src="${pageContext.request.contextPath}/javascript/formulario.js" type="text/javascript"></script>
                        <p>${mensagem}</p>



                        <br>
                        <div class="panel-default">
                            <div class="panel-heading">
                                <h3 class="text-center"><span class="glyphicon glyphicon-shopping-cart"></span> Local de entrega</h3>
                            </div>
                            <br>

                            <p><label>Endereço:</label><input  value="" class="form-control" type="text" name="endereco" required></p>
                            <p><label>Número:</label><input  value="" class="form-control" type="text" name="numero" required></p>
                            <p><label>Bairro:</label><input value="" class="form-control" type="text" name="bairro" required></p>
                            <p><label>Estado:</label>
                                <select class="form-control"  readonly name="estado">
                                    <option value="São Paulo">São Paulo</option>
                                </select>
                            </p>
                            <p><label>Cidade:</label>
                                <select class="form-control" name="cidade">
                                    <option value="Fernadópolis">Fernadópolis</option>
                                    <option value="Jales">Jales</option>
                                    <option value="Estrela D'Oeste">Estrela D'Oeste</option>
                                    <option value="Meridiano">Meridiano</option>
                                    <option value="Velemtim-Gentil">Velemtim-Gentil</option>
                                    <option value="Vatuporanga">Votuporanga</option>

                                </select>
                            </p>

                            <p><label>CEP:</label><input  value="${local.cepLocal}" class="form-control" type="text" name="cep" required></p>
                            <br> 
                        </div>
                    </div>
                    <div class="col-md-1"></div>   
                    <div class="col-md-2 team-grids men-pro-item simpleCart_shelfItem">
                        <!--Dados empresa-->
                        <br>
                        <div class="panel-default">
                            <div class="panel-heading"
                                 <h3 class="text-center"><span class="glyphicon glyphicon-picture"></span> Seu pedido</h3>   
                            </div>
                            <br>

                            <c:forEach items="${produto}" var="produto">

                                <div class="thumbnail team-w3agile">
                                    <img class="img-rounded img-responsive" src="${pageContext.request.contextPath}/produtos/${produto.imagemProduto}" >
                                    <input type="hidden" value="${produto.imagemProduto}" name="imgproduto">
                                    <div class="social-icons team-icons right-w3l fotw33">
                                        <div class="caption">
                                            <h4 style="color: white;">${produto.nomeProduto}</h4><br>
                                            <input type="hidden" value="${produto.nomeProduto}" name="nomeproduto">
                                            <input type="hidden" value="${produto.idProduto}" name="idproduto">


                                        </div>
                                    </div>
                                </div>
                                <table class="table table-striped">
                                    <tbody>
                                        <tr><td><label>Categoria</label></td><td><input type="hidden" name="categoria" value="${produto.categoriaProduto}"><label id="cat"> </label> </td></tr>
                                        <tr><td><label>Tamanho</label></td><td><label> ${produto.tamanhoProduto} cm</label></td></tr>
                                    <input type="hidden" value="${produto.tamanhoProduto}" name="tamanho">
                                    <tr><td><label>Peso</label></td><td><label> ${produto.pesoProduto} gramas</label></td></tr>
                                    <input type="hidden" value="${produto.pesoProduto}" name="peso">
                                    <tr><td><label>Cor Prodominante</label></td><td> <div id="div-color" style="background-color: ${produto.corProduto}; width: 20px;
                                                                                          height: 20px;"></div></td></tr>
                                    <input type="hidden" value="${produto.corProduto}" name="cor">
                                    <tr><td><label>Data de Inicio</label></td><td><input type="hidden" name="dataInicio" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${pedido.dataInicio}" />"><label><fmt:formatDate pattern="dd/MM/yyyy" value="${pedido.dataInicio}" /></label></td></tr>                                                      
                                    <tr><td><label>Data de Término</label></td><td><input type="hidden" name="dataLimite" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${pedido.dataLimite}" />"><label><fmt:formatDate pattern="dd/MM/yyyy" value="${pedido.dataLimite}" /></label></td></tr>                                                      
                                    <tr><td><label>Total de dias</label></td><td><input type="hidden" name="totalDias" value="${totalDias}"><label>${totalDias}</label> </td></tr>                                                      
                                    </tbody>
                                </table>         
                            </c:forEach>
                        </div>
                    </div>
                    <div class="col-md-1"></div>   
                    <div class="col-md-3 men-pro-item simpleCart_shelfItem">
                        <br>
                        <div class="panel-default">
                            <div class="panel-heading">
                                <h3 class="text-center"><span class=" glyphicon glyphicon-briefcase"></span> Empresa Locadora</h3> 
                            </div>
                            <br>
                            <div class="row">
                                <div class="col-md-6">
                                    <input type="hidden" value="${pessoaj.idPessoa}" name="idpessoaj"/>
                                    
                                    <h4><label>${pessoaj.razaoSocialPessoaJuridica}</label></h4><br>
                                    <input type="hidden" value="${pessoaj.razaoSocialPessoaJuridica}" name="razaosocial"/>
                                    <strong>Responsável</strong><br>
                                    <h4>${pessoaj.nomePessoa}</h4><br>
                                    <input type="hidden" value="${pessoaj.nomePessoa}" name="nomeRespon"/>

                                    <input type="hidden" value="${pessoaj.cpnjPessoaJuridica}" name="cnpj"/>
                                    <strong>Telefone <span class=" glyphicon glyphicon-phone-alt"></span></strong><br>
                                    <h4>${pessoaj.telefonePessoa}</h4><br>
                                    <input type="hidden" value="${pessoaj.telefonePessoa}" name="telefoneEmpresa"/>
                                    <strong>Email <span class=" glyphicon glyphicon-envelope"></span></strong><br>
                                    <h4></span>${pessoaj.emailPessoa}</h4><br>
                                    <input type="hidden" value="${pessoaj.emailPessoa}" name="emailEmpresa"/>

                                </div>
                                <div class="col-md-6">
                                    <img class="img-responsive" src="${pageContext.request.contextPath}/fotos/${pessoaj.imagemPessoaJ}">
                                </div>
                            </div>
                        </div>
                        <br><br>
                        <div class="panel-default">
                            <div class="panel-heading">
                                <h3 class="text-center"><span class="glyphicon glyphicon-usd"></span> Total da Locação:<span style="color: #17c3a2; font-weight: 700;"> R$ ${totalLocacao}</span></h3> 
                                <input type="hidden" value="${totalLocacao}" name="total">
                            </div>
                        </div>
                        <br>
                        <div class="panel-default">
                            <div class="panel-heading">
                                <h3 class="text-center"><span class="glyphicon glyphicon-credit-card"></span> Forma de Pagamento</h3> 
                            </div>
                            <p><label>Número do Cartão</label><input type="text" class="form-control"></p>
                            <p><label>Código de Segurança</label><input type="text" class="form-control"></p>
                            <p><label>Data de validade</label><input type="month" class="form-control"></p>
                            <p><label>Nome do Titular</label><input type="text" class="form-control"></p>
                            <p><label>CPF do Titular</label><input type="text" class="form-control"></p>
                            <br><br>
                            <div class="row">

                                <div class="col-md-4 snipcart-details top_brand_home_details item_add single-item hvr-outline-out button2">
                                    <fieldset>
                                        <input type="submit" name="submit" value="Gerar Contrato de Locação" class="button">
                                    </fieldset>
                                </div>

                            </div>
                        </div>
                    </div>

                </form>
            </div>
        </div>
        <!-- /banner_bottom_agile_info -->


        <!-- team -->

        <!-- //team -->

        <!-- /we-offer -->
        <div class="sale-w3ls">
            <div class="container">
                <h6>AINDA COMPRANDO? <span>ALUGUE</span> AGORA!</h6>

                <a class="hvr-outline-out button2" href="single.jsp">CADASTRAR-SE AGORA</a>
            </div>
        </div>
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
                                            // Mini Cart
                                            paypal.minicart.render({
                                                action: '#'
                                            });

                                            if (~window.location.search.indexOf('reset=true')) {
                                                paypal.minicart.reset();
                                            }
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
    <script type="text/javascript" src="js/bootstrap.js"></script>
    <script src="js/cadastro.js" type="text/javascript"></script>
    <script src="javascript/formulario.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/javascript/categoria.js" type="text/javascript"></script>
</body>
</html>
