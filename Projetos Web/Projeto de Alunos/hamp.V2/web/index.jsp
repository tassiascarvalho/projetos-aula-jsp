<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>HAMP - Home</title>
        <!--/tags -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
        <meta name="keywords" content="Elite Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
            function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!--//tags -->
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/font-awesome.css" rel="stylesheet"> 
        <link href="css/easy-responsive-tabs.css" rel='stylesheet' type='text/css'/>
        <!-- //for bootstrap working -->
        <link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800" rel="stylesheet">
        <link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,900,900italic,700italic' rel='stylesheet' type='text/css'>
        <link rel="sortcut icon" href="images/logo.png" type="image/png" />
        <script type='text/javascript' src='http://ajax.googleapis.com/ajax/libs/jquery/1.4.3/jquery.min.js'></script>
        <style>
            .error { border-color: #F70202 }
        </style>
    <body>
        <!-- header -->
        <div class="header" id="home">
            <div class="container">
                <ul id="menu-topo">
                    <li> </li>
                    <li></li>
                    <li></li>
                </ul>

            </div>
        </div>
        <!-- //header -->
        <!-- header-bot -->
        <div class="header-bot">
            <div class="header-bot_inner_wthreeinfo_header_mid">
                <div class="col-md-4 logo_agile">
                    <h1><a href="index.jsp"><img src="${pageContext.request.contextPath}/images/logo.png"  alt="" id="logo"/>
                            <span id="hamp">HAMP</span>
                            <p><span id="descricao">Aluguel de Produtos<br> Médicos e Hospitalares</span></p>
                        </a>

                    </h1>

                </div>
                <div class="col-md-4 header-middle">
                    <form action="#" method="post" id="form-top">
                        <input type="search" name="search" placeholder="digite o que procura" required="">
                        <input type="submit" value=" ">
                        <div class="clearfix"></div>
                    </form>
                </div>
                <!-- header-bot -->

                <!-- header-bot -->
                <div class="col-md-4 header-middle">
                    <div id="btn-cabecario">

                        <a class="btn-cl"  href="#" data-toggle="modal" data-target="#myModal"><i class="fa fa-unlock-alt" aria-hidden="true"></i> ENTRAR </a>

                        <a class="btn-cl" href="#" data-toggle="modal" data-target="#myModal2"><i class="fa fa-pencil-square-o" aria-hidden="true"></i> CADASTRO</a>

                    </div>

                    <div class="clearfix"></div>


                </div>
                <span id="mensagem"><label> ${mensagem}</label></span>
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
                                    <li class="active menu__item menu__item--current"><a class="menu__link" href="index.jsp">INÍCIO <span class="sr-only">(current)</span></a></li>
                                    <li class=" menu__item" ><a class="menu__link"  href="sobre.jsp">SOBRE</a></li>
                                    <li class=" menu__item" class="scroll"><a  class="scroll" href="#produtos">PRODUTOS</a></li>
                                    <li class=" menu__item" class="scroll"><a  class="scroll" href="#beneficios">BENEFÍCIOS </a></li>
                                    <li class=" menu__item" class="scroll"><a  class="scroll" href="#cadastro">CADASTRE-SE </a></li>
                                  
                                    <li class="dropdown menu__item">
                                        <a href="#" class="dropdown-toggle menu__link" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">CATEGORIAS <span class="caret"></span></a>
                                        <ul class="dropdown-menu multi-column columns-3">
                                            <div class="agile_inner_drop_nav_info">
                                                <div class="col-sm-5 multi-gd-img1 multi-gd-text ">
                                                    <img id="imgcat" src="${pageContext.request.contextPath}/images/c1.jpg" alt=""/>
                                                    </a>
                                                </div>
                                                <div class="col-sm-3 multi-gd-img">
                                                    <ul class="multi-column-dropdown">
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=1" id="c1">Almofadas</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=2" id="c2">Andadores</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=3" id="c3">Bengalas</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=4" id="c4">Botas </a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=5" id="c5">Cadeiras</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=6" id="c6">Coletes</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=7" id="c7">Faixas Abdominais</a></li>
                                                    </ul>
                                                </div>
                                                <div class="col-sm-3 multi-gd-img">
                                                    <ul class="multi-column-dropdown">
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=8" id="c8">Imobilizadores</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=9" id="c9">Joelheiras</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=10" id="c10">Muletas</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=11" id="c11">Órtese Ombro</a></li>                  
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=12" id="c12">Tornozeleira</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=13" id="c13">Outros</a></li>
                                                    </ul>
                                                </div>
                                                <div class="clearfix"></div>
                                            </div>
                                        </ul>
                                    </li>




                                </ul>
                            </div>
                        </div>
                    </nav>	
                </div>

                <div class="clearfix"></div>
            </div>
        </div>



        <!-- //banner-top -->

        <!-- LOGIN -->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog">
            <div class="modal-dialog" id="div-entrar">
                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <div class="modal-body modal-body-sub_agile">
                        <div class="col-md-12 modal_body_left modal_body_left1">
                            <h3 class="agileinfo_sign text-center">Entrar <span>com sua conta</span></h3>
                            <form  name="logar" method="POST" action="${pageContext.request.contextPath}/LogarUsuario" >
                                <div class="styled-input agile-styled-input-top">
                                    <input type="text" name="email" required="">
                                    <label>E-mail</label>
                                    <span></span>
                                </div>
                                <div class="styled-input">
                                    <input type="password" name="senha" required=""> 
                                    <label>Senha</label>
                                    <span></span>
                                </div>

                                <h5 class="agileinfo_sign text-center">ENTRAR COMO:  </h5><br/>
                                <h5 class="text-center">
                                    <div class="radio-inline">
                                        <label><input type="radio" name="usuario" value ="c" required>Cliente</label>
                                    </div>
                                    <div class="radio-inline">
                                        <label><input type="radio" name="usuario" value ="e" required>Empresa</label>
                                    </div>
                                    <div class="radio-inline">
                                        <label><input type="radio" name="usuario" value ="a" required>Administrador</label>
                                    </div>
                                </h5> 
                                <input type="hidden" name="acao" value="logar">

                                <h2 class="text-center" >
                                    <input id="btn-entrar" style="margin: 0px;" type="submit" value="Entrar"><br><br>
                                </h2>


                            </form>

                            <div class="clearfix"></div>
                            <p class="text-center"><a class="text-center" href="#" data-toggle="modal" data-target="#myModal2" > Clique aqui caso não possuir uma conta.</a></p>

                        </div>
                        <div class=" clearfix"></div>
                    </div>
                </div>
                <!-- //LOGIN CONTENT -->
            </div>
        </div>
        <!-- //LOGIN -->

        <!-- CADASTRO -->
        <div class="modal fade" id="myModal2" tabindex="-1" role="dialog">
            <div class="modal-dialog">
                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <div class="modal-body modal-body-sub_agile">
                        <div class="col-md-12 modal_body_left modal_body_left1">
                            <h3 class="agileinfo_sign text-center">CADASTRAR-SE <span>AGORA</span></h3>
                            <div class="row">
                                <div class="col-md-6">
                                    <button id="btnCliente" class="btn btn-success ">CLIENTE</button>
                                </div>
                                <div class="col-md-6">
                                    <button id="btnEmpresa" class="btn btn-info ">EMPRESA</button>
                                </div>
                            </div>
                            <br/>
                            <br/>
                            <%-- Formulário da EMPRESA --%>

                            <form id="cliente" method="POST" action="${pageContext.request.contextPath}/CadastrarPessoaJ" enctype="multipart/form-data">
                                <input class="form-control" type="hidden" name="idpessoa" size="60" readonly value=${pessoaj.idPessoa} >
                                <div class="styled-input agile-styled-input-top">

                                    <input type="text" name="nomepessoa" required="">
                                    <label>Nome do Responsável</label>
                                    <span></span>
                                </div>
                                <div class="styled-input">
                                    <input type="text" name="cpnj" class="validate" required=""> 
                                    <label>CNPJ</label>
                                    <span></span>
                                </div>
                                <div class="styled-input ">
                                    <input type="text" name="razaosocial" required="">
                                    <label>Nome Fantasia</label>
                                    <span></span>
                                </div>
                                <div class="styled-input">
                                    <input type="text" name="telefonepessoa" required=""> 
                                    <label>Telefone Empresarial</label>
                                    <span></span>
                                </div>
                                <div class="styled-input">
                                    <input type="email" name="emailpessoa" required=""> 
                                    <label>E-mail Empresarial</label>
                                    <span></span>
                                </div>
                                <div class="styled-input">
                                    <input type="email" name="Confirmar E-mail Empresa" required=""> 
                                    <label>Confirmar E-mail</label>
                                    <span></span>
                                </div>
                                <div class="styled-input">
                                    <input type="password" name="senhapessoa" required=""> 
                                    <label>Senha</label>
                                    <span></span>
                                </div> 
                                <div class="styled-input">
                                    <input type="password" name="Confirmar Senha" required=""> 
                                    <label>Confirmar Senha</label>
                                    <span></span>
                                </div>
                                <label for="selecao-foto" class=" btn btn-info" style="font-family: 'Open Sans', sans-serif; font-weight: normal;"><span class="glyphicon glyphicon-upload"></span> Enviar Logo</label>
                                <div class="styled-input">
                                    <input id='selecao-foto' type="file" name="file[]" required=""> 

                                    <span></span>
                                </div>
                                <div class="row">
                                    <div class="col-md-3"></div>
                                    <div class="col-md-4"><input style="margin: 0; position: relative;left: -40%;" type="submit" value="Cadastrar-se"></div>
                                    <div class="col-md-4"></div>
                                </div><br><br>

                            </form>

                            <%-- Formulário do CLIENTE --%>
                            <form method="POST" id="empresa" action="${pageContext.request.contextPath}/SalvarPessoaF" enctype="multipart/form-data">
                                <input class="form-control" type="hidden" name="idpessoa" size="60" readonly value=${pessoaj.idPessoa} >
                                <div class="styled-input agile-styled-input-top">
                                    <input type="text" name="nome" required="">
                                    <label>Nome Completo</label>
                                    <span></span>
                                </div>
                                <div class="styled-input">
                                    <input type="email" name="email" required=""> 
                                    <label>E-mail</label>
                                    <span></span>
                                </div>
                                <div class="styled-input">
                                    <input type="email" name="Email" required=""> 
                                    <label>Confirmar E-mail</label>
                                    <span></span>
                                </div>
                                <div class="styled-input">
                                    <input type="text" name="telefone" required=""> 
                                    <label>(DDD) + Telefone</label>
                                    <span></span>
                                </div>
                                <div class="styled-input">
                                    <input type="text" name="cpf" class="validate"  id="CPF"  required=""> 
                                    <label>CPF</label>
                                    <span></span>
                                </div>


                                <label class="form-dif">Gênero</label><br /><br />
                                <label class="form-dif">Outro</label>
                                <input type="radio" value="Outro" name="sexo" required="" class="radio">&nbsp&nbsp&nbsp                                
                                <label class="form-dif">Feminino</label>
                                <input type="radio" value="Feminino" name="sexo" required="" class="radio">&nbsp&nbsp&nbsp   
                                <label class="form-dif">Masculino</label>
                                <input type="radio" value="Masculino" name="sexo" required="" class="radio">&nbsp&nbsp&nbsp   



                                <div class="styled-input">
                                    <input type="date" name="data" required=""> 

                                    <label>Data de Nascimento</label>
                                    <span></span>
                                </div>
                                <div class="styled-input">
                                    <input type="password" name="senha" required=""> 
                                    <label>Senha</label>
                                    <span></span>
                                </div> 
                                <div class="styled-input">
                                    <input type="password" name="Confirm Password" required=""> 
                                    <label>Confirmar Senha</label>
                                    <span></span>
                                </div>

                                <label for="enviar" class=" btn btn-info" style="font-family: 'Open Sans', sans-serif; font-weight: normal;"><span class="glyphicon glyphicon-upload"></span> Enviar Foto</label>
                                <div class="styled-input foto">
                                    <input id="enviar" type="file" name="file[]" required=""> 

                                    <span></span>
                                </div>
                                <div class="row">
                                    <div class="col-md-3"></div>
                                    <div class="col-md-4"><input style="margin: 0; position: relative;left: -40%;" type="submit" value="Cadastrar-se"></div>
                                    <div class="col-md-4"></div>
                                </div><br><br>
                            </form>




                            <div class="clearfix"></div>
                            <p><a href="#">Ao clicar em "cadastrar-se", estará concordando com todos os termos do Sistema HAMP.</a></p>

                        </div>

                        <div class="clearfix"></div>
                    </div>
                </div>
                <!-- //CONTENT CADASTRO-->
            </div>
        </div>
        <!-- //CADASTRO -->

        <!-- banner -->
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1" class=""></li>
                <li data-target="#myCarousel" data-slide-to="2" class=""></li>
                <li data-target="#myCarousel" data-slide-to="3" class=""></li>
            </ol>
            <div class="carousel-inner" role="listbox">
                <div class="item active"> 
                    <div class="container">
                        <div class="carousel-caption">

                        </div>
                    </div>
                </div>
                <div class="item item2"> 
                    <div class="container">
                        <div class="carousel-caption">

                        </div>
                    </div>
                </div>
                <div class="item item3"> 
                    <div class="container">
                        <div class="carousel-caption">

                        </div>
                    </div>
                </div>
                <div class="item item4"> 
                    <div class="container">
                        <div class="carousel-caption">

                        </div>
                    </div>
                </div>
            </div>
            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Anterior</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Próximo</span>
            </a>
            <!-- The Modal -->
        </div>



        <!--/grids-->
        <h3 class="wthree_text_info" id="produtos">PRODUTOS PARA <span>ALUGUEL</span></h3>
        <div class="new_arrivals_agile_w3ls_info"> 
            <div class="container">

                <br/>
                <br/>
                <div id="horizontalTab">

                    <div>
                        <!--/tab_one-->
                        <div class="tab1">
                            <div class="col-md-3 product-men">
                                <div class="men-pro-item simpleCart_shelfItem">
                                    <div class="men-thumb-item">
                                        <img src="images/Bengala 1.png" alt="" class="pro-image-front">
                                        <img src="images/Bengala 1.png" alt="" class="pro-image-back">
                                        <div class="men-cart-pro">
                                            <div class="inner-men-cart-pro">
                                                <a href="single.html" class="link-product-add-cart">VISUALIZAR PRODUTO</a>
                                            </div>
                                        </div>
                                        <span class="product-new-top">NOVO!</span>

                                    </div>
                                    <div class="item-info-product ">
                                        <h4><a href="single.html">Bengala Power</a></h4>
                                        <div class="info-product-price">
                                            <span class="item_price">R$2.59 por semana</span>
                                            <br><br>
                                        </div>
                                        <div class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out button2">
                                            <form action="#" method="post">
                                                <fieldset>
                                                    <input type="hidden" name="cmd" value="_cart" />
                                                    <input type="hidden" name="add" value="1" />
                                                    <input type="hidden" name="business" value=" " />
                                                    <input type="hidden" name="item_name" value="Formal Blue Shirt" />
                                                    <input type="hidden" name="amount" value="30.99" />
                                                    <input type="hidden" name="discount_amount" value="1.00" />
                                                    <input type="hidden" name="currency_code" value="USD" />
                                                    <input type="hidden" name="return" value=" " />
                                                    <input type="hidden" name="cancel_return" value=" " />
                                                    <input type="submit" name="submit" value="adicionar ao carrinho" class="button btn-index" />
                                                </fieldset>
                                            </form>
                                        </div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 product-men">
                                <div class="men-pro-item simpleCart_shelfItem">
                                    <div class="men-thumb-item">
                                        <img src="images/Ortese p Ombro 1.jpg" alt="" class="pro-image-front">
                                        <img src="images/Ortese p Ombro 1.jpg" alt="" class="pro-image-back">
                                        <div class="men-cart-pro">
                                            <div class="inner-men-cart-pro">
                                                <a href="single.html" class="link-product-add-cart">VISUALIZAR PRODUTO</a>
                                            </div>
                                        </div>
                                        <span class="product-new-top">NOVO!</span>

                                    </div>
                                    <div class="item-info-product ">
                                        <h4><a href="single.html">Ortese para Ombro 1</a></h4>
                                        <div class="info-product-price">
                                            <span class="item_price">$2.38 por semana</span>     

                                        </div>
                                        <div class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out button2">
                                            <form action="#" method="post">
                                                <fieldset>
                                                    <input type="hidden" name="cmd" value="_cart" />
                                                    <input type="hidden" name="add" value="1" />
                                                    <input type="hidden" name="business" value=" " />
                                                    <input type="hidden" name="item_name" value="Formal Blue Shirt" />
                                                    <input type="hidden" name="amount" value="30.99" />
                                                    <input type="hidden" name="discount_amount" value="1.00" />
                                                    <input type="hidden" name="currency_code" value="USD" />
                                                    <input type="hidden" name="return" value=" " />
                                                    <input type="hidden" name="cancel_return" value=" " />
                                                    <input type="submit" name="submit" value="adicionar ao carrinho" class="button btn-index" />
                                                </fieldset>
                                            </form>
                                        </div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 product-men">
                                <div class="men-pro-item simpleCart_shelfItem">
                                    <div class="men-thumb-item">
                                        <img src="images/Andador 1.jpg" alt="" class="pro-image-front">
                                        <img src="images/Andador 1.jpg" alt="" class="pro-image-back">
                                        <div class="men-cart-pro">
                                            <div class="inner-men-cart-pro">
                                                <a href="single.html" class="link-product-add-cart">VISUALIZAR PRODUTO</a>
                                            </div>
                                        </div>
                                        <span class="product-new-top">NOVO!</span>

                                    </div>
                                    <div class="item-info-product ">
                                        <h4><a href="single.html">Andador pro 67</a></h4>
                                        <div class="info-product-price">
                                            <span class="item_price">R$3.00 por semana</span>

                                        </div>
                                        <div class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out button2">
                                            <form action="#" method="post">
                                                <fieldset>
                                                    <input type="hidden" name="cmd" value="_cart" />
                                                    <input type="hidden" name="add" value="1" />
                                                    <input type="hidden" name="business" value=" " />
                                                    <input type="hidden" name="item_name" value="Formal Blue Shirt" />
                                                    <input type="hidden" name="amount" value="30.99" />
                                                    <input type="hidden" name="discount_amount" value="1.00" />
                                                    <input type="hidden" name="currency_code" value="USD" />
                                                    <input type="hidden" name="return" value=" " />
                                                    <input type="hidden" name="cancel_return" value=" " />
                                                    <input type="submit" name="submit" value="adicionar ao carrinho" class="button btn-index" />
                                                </fieldset>
                                            </form>
                                        </div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 product-men">
                                <div class="men-pro-item simpleCart_shelfItem">
                                    <div class="men-thumb-item">
                                        <img src="images/cadeira de rodas 1.jpg" alt="" class="pro-image-front">
                                        <img src="images/cadeira de rodas 1.jpg" alt="" class="pro-image-back">
                                        <div class="men-cart-pro">
                                            <div class="inner-men-cart-pro">
                                                <a href="single.jsp" class="link-product-add-cart">Visualizar Produto</a>
                                            </div>
                                        </div>
                                        <span class="product-new-top">NOVO!</span>

                                    </div>
                                    <div class="item-info-product ">
                                        <h4><a href="single.jsp">
                                                Cadeira de Rodas Simples Modelo POP</a></h4>
                                        <div class="info-product-price">
                                            <span class="item_price">R$5.00 por semana</span>

                                        </div>
                                        <div class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out button2">
                                            <form action="#" method="post">
                                                <fieldset>
                                                    <input type="hidden" name="cmd" value="_cart" />
                                                    <input type="hidden" name="add" value="1" />
                                                    <input type="hidden" name="business" value=" " />
                                                    <input type="hidden" name="item_name" value="Formal Blue Shirt" />
                                                    <input type="hidden" name="amount" value="30.99" />
                                                    <input type="hidden" name="discount_amount" value="1.00" />
                                                    <input type="hidden" name="currency_code" value="USD" />
                                                    <input type="hidden" name="return" value=" " />
                                                    <input type="hidden" name="cancel_return" value=" " />
                                                    <input type="submit" name="submit" value="adicionar ao carrinho" class="button btn-index" />
                                                </fieldset>
                                            </form>
                                        </div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 product-men">
                                <div class="men-pro-item simpleCart_shelfItem">
                                    <div class="men-thumb-item">
                                        <img src="images/Faixa 3.jpg" alt="" class="pro-image-front">
                                        <img src="images/Faixa 3.jpg" alt="" class="pro-image-back">
                                        <div class="men-cart-pro">
                                            <div class="inner-men-cart-pro">
                                                <a href="single.html" class="link-product-add-cart">VISUALIZAR PRODUTO</a>
                                            </div>
                                        </div>
                                        <span class="product-new-top">NOVO!</span>

                                    </div>
                                    <div class="item-info-product ">
                                        <h4><a href="single.html">Faixa Abdominal 4FX</a></h4>
                                        <div class="info-product-price">
                                            <span class="item_price">R$ 3.30 por semana</span>

                                        </div>
                                        <div class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out button2">
                                            <form action="#" method="post">
                                                <fieldset>
                                                    <input type="hidden" name="cmd" value="_cart" />
                                                    <input type="hidden" name="add" value="1" />
                                                    <input type="hidden" name="business" value=" " />
                                                    <input type="hidden" name="item_name" value="Formal Blue Shirt" />
                                                    <input type="hidden" name="amount" value="30.99" />
                                                    <input type="hidden" name="discount_amount" value="1.00" />
                                                    <input type="hidden" name="currency_code" value="USD" />
                                                    <input type="hidden" name="return" value=" " />
                                                    <input type="hidden" name="cancel_return" value=" " />
                                                    <input type="submit" name="submit" value="adicionar ao carrinho" class="button btn-index" />
                                                </fieldset>
                                            </form>
                                        </div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 product-men">
                                <div class="men-pro-item simpleCart_shelfItem">
                                    <div class="men-thumb-item">
                                        <img src="images/Imobilizadoror 1.jpg" alt="" class="pro-image-front">
                                        <img src="images/Imobilizadoror 1.jpg " alt="" class="pro-image-back">
                                        <div class="men-cart-pro">
                                            <div class="inner-men-cart-pro">
                                                <a href="single.html" class="link-product-add-cart">VISUALIZAR PRODUTO</a>
                                            </div>
                                        </div>
                                        <span class="product-new-top">NOVO!</span>

                                    </div>
                                    <div class="item-info-product ">
                                        <h4><a href="single.html">Imobilizador Meia Guy</a></h4>
                                        <div class="info-product-price">
                                            <span class="item_price">$5.76</span>

                                        </div>
                                        <div class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out button2">
                                            <form action="#" method="post">
                                                <fieldset>
                                                    <input type="hidden" name="cmd" value="_cart" />
                                                    <input type="hidden" name="add" value="1" />
                                                    <input type="hidden" name="business" value=" " />
                                                    <input type="hidden" name="item_name" value="Formal Blue Shirt" />
                                                    <input type="hidden" name="amount" value="30.99" />
                                                    <input type="hidden" name="discount_amount" value="1.00" />
                                                    <input type="hidden" name="currency_code" value="USD" />
                                                    <input type="hidden" name="return" value=" " />
                                                    <input type="hidden" name="cancel_return" value=" " />
                                                    <input type="submit" name="submit" value="adicionar ao carrinho" class="button btn-index" />
                                                </fieldset>
                                            </form>
                                        </div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 product-men">
                                <div class="men-pro-item simpleCart_shelfItem">
                                    <div class="men-thumb-item">
                                        <img src="images/Joelheira Articulada 1.jpg" alt="" class="pro-image-front">
                                        <img src="images/Joelheira Articulada 1.jpg" alt="" class="pro-image-back">
                                        <div class="men-cart-pro">
                                            <div class="inner-men-cart-pro">
                                                <a href="single.html" class="link-product-add-cart">VISUALIZAR PRODUTO</a>
                                            </div>
                                        </div>
                                        <span class="product-new-top">NOVO!</span>

                                    </div>
                                    <div class="item-info-product ">
                                        <h4><a href="single.html">Joelheira Articulada J68</a></h4>
                                        <div class="info-product-price">
                                            <span class="item_price">$4.49</span>

                                        </div>
                                        <div class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out button2">
                                            <form action="#" method="post">
                                                <fieldset>
                                                    <input type="hidden" name="cmd" value="_cart" />
                                                    <input type="hidden" name="add" value="1" />
                                                    <input type="hidden" name="business" value=" " />
                                                    <input type="hidden" name="item_name" value="Formal Blue Shirt" />
                                                    <input type="hidden" name="amount" value="30.99" />
                                                    <input type="hidden" name="discount_amount" value="1.00" />
                                                    <input type="hidden" name="currency_code" value="USD" />
                                                    <input type="hidden" name="return" value=" " />
                                                    <input type="hidden" name="cancel_return" value=" " />
                                                    <input type="submit" name="submit" value="adicionar ao carrinho" class="button btn-index" />
                                                </fieldset>
                                            </form>
                                        </div>

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 product-men">
                                <div class="men-pro-item simpleCart_shelfItem">
                                    <div class="men-thumb-item">
                                        <img src="images/Almofada de acento 1.png" alt="" class="pro-image-front">
                                        <img src="images/Almofada de acento 1.png" alt="" class="pro-image-back">
                                        <div class="men-cart-pro">
                                            <div class="inner-men-cart-pro">
                                                <a href="single.jsp" class="link-product-add-cart">Visualizar Produto</a>
                                            </div>
                                        </div>
                                        <span class="product-new-top">NOVO!</span>

                                    </div>
                                    <div class="item-info-product ">
                                        <h4><a href="single.jsp">
                                                Almofada de acento 2ba</a></h4>
                                        <div class="info-product-price">
                                            <span class="item_price">R$2.00 por semana</span>

                                        </div>
                                        <div class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out button2">
                                            <form action="#" method="post">
                                                <fieldset>
                                                    <input type="hidden" name="cmd" value="_cart" />
                                                    <input type="hidden" name="add" value="1" />
                                                    <input type="hidden" name="business" value=" " />
                                                    <input type="hidden" name="item_name" value="Formal Blue Shirt" />
                                                    <input type="hidden" name="amount" value="30.99" />
                                                    <input type="hidden" name="discount_amount" value="1.00" />
                                                    <input type="hidden" name="currency_code" value="USD" />
                                                    <input type="hidden" name="return" value=" " />
                                                    <input type="hidden" name="cancel_return" value=" " />
                                                    <input type="submit" name="submit" value="adicionar ao carrinho" class="button btn-index" />
                                                </fieldset>
                                            </form>
                                        </div>

                                    </div>
                                </div>
                            </div>



                        </div>
                        <!--//tab_one-->                    
                    </div>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>	
        <br><br>
    </div>
    <h3 class="wthree_text_info" id="beneficios">CONHEÇA <span> NOSSOS BENEFÍCIOS</span></h3>
    <br/>
    <br/>
    <div class="coupons">
        <div class="row">     
            <div class="col-md-2"></div>
            <div class="col-md-4" >
                <div
                    class="box-scroll animateme scrollme"
                    data-when="enter"
                    data-from="1"
                    data-to="0"
                    data-opacity="0"
                    data-translatex="-500">  

                    <h1>SEGURANÇA</h1><br> 
                    <h2>Produtos com grande qualidade e segurança para qualquer que seja sua necessidade!</h2>


                </div>
            </div>
            <div class="col-md-1"></div>
            <div class="col-md-3 scrollme">
                <img src="images/a1.png" class="animateme img-responsive" data-when="enter"
                     data-from="1"
                     data-to="0"
                     data-opacity="0"
                     data-scalex="1.3"
                     data-scaley="1.3"
                     data-scalez="1.3"
                     style="width: 75%;"
                     alt=""/>
            </div>
            <div class="col-md-2"></div>
        </div>
        <br><br>
        <br><br>
        <div class="row">     
            <div class="col-md-2"></div>
            <div class="col-md-3 scrollme">
                <img src="images/a3.png" class="animateme img-responsive" data-when="enter"
                     data-from="1"
                     data-to="0"
                     data-opacity="0"
                     data-scalex="1.3"
                     data-scaley="1.3"
                     data-scalez="1.3"
                     alt=""/>
            </div>
            <div class="col-md-1"></div>
            <div class="col-md-4">
                <div
                    class="box-scroll animateme scrollme"
                    data-when="enter"
                    data-from="1"
                    data-to="0"
                    data-opacity="0"
                    data-translatex="500">  

                    <h1 >CONFIABILIDADE</h1><br> 
                    <h2 >Maior confiabilidade com a geração de um contrato de locação, garantindo toda a qualidade ao serviço.</h2>


                </div>
            </div>


            <div class="col-md-2"></div>
        </div>
        <br><br>
        <br><br>
        <div class="row">     
            <div class="col-md-2"></div>
            <div class="col-md-4">
                <br>
                <div                  
                    class="animateme scrollme box-scroll"
                    data-when="enter"
                    data-from="1"
                    data-to="0"
                    data-opacity="0"
                    data-translatex="-500">  

                    <h1>COMODIDADE</h1><br> 
                    <h2>Alugue de onde estiver ,o produto chega até você sem preocupações!</h2>
                </div>
            </div>
            <div class="col-md-1"></div>
            <div class="col-md-3 scrollme">
                <img src="images/a4.png" class="animateme img-responsive" data-when="enter"
                     data-from="1"
                     data-to="0"
                     data-opacity="0"
                     data-scalex="1.3"
                     data-scaley="1.3"
                     data-scalez="1.3"
                     alt=""/>
            </div>
            <div class="col-md-2"></div>
        </div>
        <br><br>
        <br><br>
        <div class="row">     
            <div class="col-md-3"></div>
            <div class="col-md-2 scrollme">
                <br>
                <img src="images/a2.png" class="animateme img-responsive" data-when="enter"
                     data-from="1"
                     data-to="0"
                     data-opacity="0"
                     data-scalex="1.3"
                     data-scaley="1.3"
                     data-scalez="1.3"
                     alt=""/>
            </div>
            <div class="col-md-1"></div>
            <div class="col-md-4">
                <div
                    class="animateme scrollme box-scroll"
                    data-when="enter"
                    data-from="1"
                    data-to="0"
                    data-opacity="0"
                    data-translatex="500">  

                    <h1 >FACILIDADE</h1><br> 
                    <h2 >Um sistema totalmente intuitivo e fácil de usar, sem estresse e dor de cabeça!</h2>
                </div>
            </div>
            <div class="col-md-2"></div>
        </div>
        <br/>
        <br/>
        <br/>
        <br/>
        <div class="row">

            <h3 class="wthree_text_info" id="cadastro">CADASTRE-SE AGORA</h3>      

        </div>
        <br><br><br> 
        <div class="row animateme scrollme">
            <div class="col-md-4">
                <div class="row">
                    <div class="col-md-3"></div>
                    <div class="col-md-6 scrollme">
                        <img src="images/a1.png" class="animateme img-responsive" data-when="enter"
                             data-from="1"
                             data-to="0"
                             data-opacity="0"
                             data-translatex="500"
                             alt=""/>
                    </div>
                </div>
                <br><br>
                <div class="row">
                    <div class="col-md-3"></div>
                    <div class="col-md-6 scrollme">
                        <img src="images/a3.png" class="animateme img-responsive" 
                             data-when="enter"
                             data-from="1"
                             data-to="0"
                             data-opacity="0"
                             data-translatex="500"
                             alt=""/>
                    </div>
                </div>
            </div>
            <div class="col-md-4">

                <img src="images/logo1.png" class="img-responsive animateme scrollme" 
                     data-when="span"
                     data-from="1"
                     data-to="0"
                     data-opacity="1"
                     data-scalex="1.3"
                     data-scaley="1.3"
                     data-scalez="1.3"
                     alt=""/>
            </div>        
            <div class="col-md-4">
                <div class="row">
                    <div class="col-md-3"></div>
                    <div class="col-md-6 scrollme">
                        <img src="images/a2.png" class="animateme img-responsive" data-when="enter"
                             data-from="1"
                             data-to="0"
                             data-opacity="0"
                             data-translatex="-500"
                             alt=""/>
                    </div>
                </div>
                <br><br>
                <div class="row">
                    <div class="col-md-3"></div>
                    <div class="col-md-6 scrollme">
                        <img src="images/a4.png" class="animateme img-responsive" data-when="enter"
                             data-from="1"
                             data-to="0"
                             data-opacity="0"
                             data-translatex="-500"
                             alt=""/>
                    </div>
                </div>
            </div>
            <br><br>

        </div>

    </div>
    <br/>
    <br/>
    <br/>
    <br/>

    <!--grids-->

    <!--/grids-->
    <h3 class="wthree_text_info">VOCÊ É</h3>

    <div class="agile_last_double_sectionw3ls">
        <div class="col-md-6 multi-gd-img multi-gd-text ">
            <a href="#" href="#" data-toggle="modal" data-target="#myModal2"><img src="images/bot_1.png" alt=" "><h4 class="sou" style=" top :39%;"><strong style="text-shadow: 2px 2px 5px black; font-size: 1.5em;">Pessoa <span>F</span>ísica </strong><P class="text-center" style="text-shadow: 2px 2px 5px black;"><strong>Quero locar um produto! </strong></p> </h4></a>

        </div>
        <div class="col-md-6 multi-gd-img multi-gd-text ">
            <a href="#" data-toggle="modal" data-target="#myModal2"><img src="images/bot_2.png" alt=" "><h4 class="sou" style=" top :39%;"><strong style="text-shadow: 2px 2px 5px black; font-size: 1.5em;">Pessoa <span>J</span>urídica </strong><p class="text-center" style="text-shadow: 2px 2px 5px black;"><strong> Quero ser empresa Locadora! </strong></p></h4></a>
        </div>



    </div>
    <div class="clearfix"></div>



    <!-- //we-offer -->


    <!-- footer -->
    <div class="footer">
        <div class="footer_agile_inner_info_w3l">
            <div class="col-md-3 footer-left">
                <h2><a href="index.jsp"> <img id="logo" src="${pageContext.request.contextPath}/images/logo.png" alt=""/> <span id="hamp" style="background: none;">HAMP</span></a></h2>

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
                            <li><a href="index.jsp">Visa</a></li>
                            <li><a href="sobre.jsp">MasterCard</a></li>
                            <li><a href="womens.jsp">PayPal</a></li>
                            <li><a href="sobre.jsp">Elo</a></li>

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
                                    <p>(17) 99663-8608</p>
                                </div>
                                <div class="clearfix"> </div>
                            </div>
                            <div class="w3-address-grid">
                                <div class="w3-address-left">
                                    <i class="fa fa-envelope" aria-hidden="true"></i>
                                </div>
                                <div class="w3-address-right">
                                    <h6>Endereço de e-mail</h6>
                                    <p>E-mail:<a href="mailto:example@email.com"> contato@hamp.com.br</a></p>
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
                            <li><a href="single.html"><img src="images/t4.jpg" alt=" " class="img-responsive" /></a></li>
                            <li><a href="single.html"><img src="images/t3.jpg" alt=" " class="img-responsive" /></a></li>
                            <li><a href="single.html"><img src="images/t2.jpg" alt=" " class="img-responsive" /></a></li>

                        </ul>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>

            <div class="clearfix"></div>
        </div>
        <p class="copy-right">&copy 2017 HAMP | Design by @fravineo and @douglas77costa</p>


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
                            <h3>Sign up for free</h3
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
                            <script src="js/modernizr.custom.js"></script>
                            <!-- Custom-JavaScript-File-Links --> 
                            <!-- cart-js -->
                            <script src="js/minicart.min.js"></script>


                            <!-- //cart-js --> 
                            <!-- script for responsive tabs -->						
                            <script src="js/easy-responsive-tabs.js"></script>
                            <script>
                                                                    $(document).ready(function () {
                                                                        $('#horizontalTab').easyResponsiveTabs({
                                                                            type: 'default', //Types: default, vertical, accordion           
                                                                            width: 'auto', //auto or any width like 600px
                                                                            fit: true, // 100% fit in a container
                                                                            closed: 'accordion', // Start closed if in accordion view
                                                                            activate: function (event) { // Callback function if tab is switched
                                                                                var $tab = $(this);
                                                                                var $info = $('#tabInfo');
                                                                                var $name = $('span', $info);
                                                                                $name.text($tab.text());
                                                                                $info.show();
                                                                            }
                                                                        });
                                                                        $('#verticalTab').easyResponsiveTabs({
                                                                            type: 'vertical',
                                                                            width: 'auto',
                                                                            fit: true
                                                                        });
                                                                    });
                            </script>
                            <!-- //script for responsive tabs -->		
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
                            <script src="jquery.scrollme.js" type="text/javascript"></script>
                            <script src="validacao/jquery.cpfcnpj.js" type="text/javascript"></script>
                            <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.0/jquery.mask.js"></script>
                            <script type="text/javascript">
                                                                    $(document).ready(function () {
                                                                        var $seuCampoCpf = $("#CPF");
                                                                        $seuCampoCpf.mask('000.000.000-00', {reverse: true});
                                                                    });
                            </script>
                            <script type="text/javascript">
                                $(document).ready(function () {
                                    $('.validate').cpfcnpj({
                                        mask: false,
                                        validate: 'cpfcnpj',
                                        event: 'focusout',
                                        handler: '.validate',
                                        ifValid: function (input) {
                                            $(".validate").css("border-bottom-color", "#333");
                                            $(".validate").css("border-bottom-width", "1px");
                                        },
                                        ifInvalid: function (input) {
                                            $(".validate").css("border-bottom-color", "#a51010");
                                            $(".validate").css("border-bottom-width", "3px");
                                        }
                                    });
                                });
                            </script>
                            <script>
                                

                        </script>
                        </body>
                        </html>
