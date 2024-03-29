<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
<!DOCTYPE html>
<html>
    <head>
        <title>HAMP - Produto</title>
        <!--/tags -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; ISO-8859-1" />
        <meta name="keywords" content="Elite Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
            function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- //tags -->
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
        <link href="css/font-awesome.css" rel="stylesheet"> 
        <link href="css/easy-responsive-tabs.css" rel='stylesheet' type='text/css'/>
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <link rel="sortcut icon" href="${pageContext.request.contextPath}/images/logo.png" type="image/png" />
        <!-- //for bootstrap working -->
        <link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800" rel="stylesheet">
        <link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,900,900italic,700italic' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <!-- header -->
        <div class="header" id="home">
            <div class="container">
                <ul>
                    <Li></Li>
                </ul>
            </div>
        </div>
        <!-- //header -->
        <!-- header-bot -->
        <div class="header-bot">
            <div class="header-bot_inner_wthreeinfo_header_mid">
                <div class="col-md-4 logo_agile">
                    <h1><a href="index.jsp"><img src="${pageContext.request.contextPath}/images/logo.png"  alt="" id="logo"/>
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
                        <li class="share">Share On : </li>
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
                                    <li class="active menu__item menu__item--current"><a class="menu__link" href="${pageContext.request.contextPath}/hamp/index.jsp">IN�CIO <span class="sr-only">(current)</span></a></li>
                                    <li class=" menu__item"><a class="menu__link" href="sobre.jsp">SOBRE</a></li>
                                    <li class="dropdown menu__item">
                                        <a href="#" class="dropdown-toggle menu__link" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">CATEGORIAS <span class="caret"></span></a>
                                        <ul class="dropdown-menu multi-column columns-3">
                                            <div class="agile_inner_drop_nav_info">
                                                <div class="col-sm-6 multi-gd-img1 multi-gd-text " id="catego">
                                                    <a href="mens.html">
                                                        <img id="imgcat" src="${pageContext.request.contextPath}/images/c1.jpg" alt=""/>
                                                    </a>
                                                </div>
                                                <div class="col-sm-3 multi-gd-img">
                                                    <ul class="multi-column-dropdown">
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=1" id="c1">Almofadas<br> Ortop�dicas</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=2" id="c2">Andadores</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=3" id="c3">Bengalas</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=4" id="c4">Botas Imobilizadoras</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=5" id="c5">Cadeiras de rodas e banho</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=6" id="c6">Coletes de coluna</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=7" id="c7">Faixas Abdominais</a></li>
                                                    </ul>
                                                </div>
                                                <div class="col-sm-3 multi-gd-img">
                                                    <ul class="multi-column-dropdown">
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=8" id="c8">Imobilizadores de Joelhos</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=9" id="c9">Joelheiras Articuladas</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=10" id="c10">Muletas </a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=11" id="c11">Ortese para Ombro</a></li>                  
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=12" id="c12">Tornozeleira</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/ListarPorCategoria?categoria=13" id="c13">Outros</a></li>
                                                    </ul>
                                                </div>
                                                <div class="clearfix"></div>
                                            </div>
                                        </ul>
                                    </li>

                                    <li class="menu__item dropdown">
                                        <a class="menu__link" href="#" class="dropdown-toggle" data-toggle="dropdown">CONTRATOS <b class="caret"></b></a>
                                        <ul class="dropdown-menu agile_short_dropdown">
                                            <li><a href="icons.jsp">LOCA��O</a></li>
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
        <!-- Modal1 -->


        <!-- //Modal1 -->
        <!-- Modal2 -->


        <!-- //Modal2 -->
        <!--/single_page-->
        <!-- /banner_bottom_agile_info -->
        <div class="page-head_agile_info_w3l">
            <div class="container">
                <c:forEach items="${produto}" var="produto">
                    <h3 id="nome-cat">${produto.nomeProduto} </h3>
                    <!--/w3_short-->
                    <div class="services-breadcrumb">
                        <div class="agile_inner_breadcrumb">


                        </div>
                    </div>
                    <!--//w3_short-->
                </div>
            </div>

            <!-- banner-bootom-w3-agileits -->
            <div class="banner-bootom-w3-agileits">
                <div class="container">

                    <div class="col-md-4 single-right-left ">
                        <div class="grid images_3_of_2">
                            <div class="flexslider">

                                <ul class="slides">
                                    <li data-thumb="images/d2.jpg">
                                        <div class="thumb-image"> <img src="${pageContext.request.contextPath}/produtos/${produto.imagemProduto}" data-imagezoom="true" class="img-responsive"> </div>
                                    </li>

                                </ul>
                                <div class="clearfix"></div>
                            </div>	
                        </div>
                    </div>

                    <div class="col-md-8 single-right-left simpleCart_shelfItem">

                        <h3>${produto.nomeProduto}</h3>
                        <p><span class="item_price">R$: ${produto.valorLocacaoDia}</span> Por semana </p>
                        <input type="hidden" value="${produto.valorLocacaoDia}" id="valorSemana">
                        <div class="rating1">
                            <span class="starRating">
                                <input id="rating5" type="radio" name="rating" value="5">
                                <label for="rating5">5</label>
                                <input id="rating4" type="radio" name="rating" value="4">
                                <label for="rating4">4</label>
                                <input id="rating3" type="radio" name="rating" value="3" checked="">
                                <label for="rating3">3</label>
                                <input id="rating2" type="radio" name="rating" value="2">
                                <label for="rating2">2</label>
                                <input id="rating1" type="radio" name="rating" value="1">
                                <label for="rating1">1</label>
                            </span>
                        </div>
                        <form action="${pageContext.request.contextPath}/DadosPedido" method="post">
                            <div class="description">
                                <h5>Data de �nicio da Loca��o</h5>
                                <jsp:useBean id="now" class="java.util.Date" />
                                <input readonly name="comeco" value="<fmt:formatDate value="${now}" pattern="yyyy-MM-dd" />" type="date" required>

                                <br><br>
                                <h5>Selecione o dia de T�mino da Loca��o</h5>                          
                                <input type="date" name="fim" />

                                <br><br>
                                <span id="btn-calcular" class="btn btn-info">C�lcular Loca��o</span>
                            </div>
                            <div class="color-quality">
                                <div class="color-quality-right">

                                </div>
                            </div>

                            <div class="occasion-cart">
                                <h4>TOTAL DE DIAS: <input type="text"  readonly name="dias" id="dias" style="border: none;"></h4><BR>

                                <h4>VALOR TOTAL R$: <input type="text" readonly name="total" id="total"style="border: none;"> </h4><BR>


                                <input type="hidden" value="${produto.idProduto}" name="idproduto">
                                <input type="hidden" value="${produto.idPessoaJ}" name="idpessoaj">
                                <input type="hidden" value="${pessoaf.idPessoa}" name="idpessoaf">                               

                                <div class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out button2">
                                    <fieldset>
                                        <input type="submit" name="submit" value="Locar Agora" class="button">
                                    </fieldset>
                                </div>
                            </div>
                        </form>
                        <ul class="social-nav model-3d-0 footer-social w3_agile_social single_page_w3ls">
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



                    <div class="clearfix"> </div>
                    <!-- /new_arrivals --> 
                    <div class="responsive_tabs_agileits"> 
                        <div id="horizontalTab">
                            <ul class="resp-tabs-list">
                                <li>Descri��o</li>                       
                                <li>Informa��o</li>
                            </ul>
                            <div class="resp-tabs-container">
                                <!--/tab_one-->
                                <div class="tab1">

                                    <div class="single_page_agile_its_w3ls">
                                        <table class="table table-striped">
                                            <tbody>
                                                <tr><td><label>Categoria</label></td><td><input type="hidden" name="categoria" value="${produto.categoriaProduto}"><label id="cat"> </label> </td></tr>
                                                <tr><td><label>Tamanho</label></td><td><label> ${produto.tamanhoProduto} cm</label></td></tr>
                                                <tr><td><label>Peso</label></td><td><label> ${produto.pesoProduto} gramas</label></td></tr>
                                                <tr><td><label>Cor Prodominante</label></td><td> <div id="div-color" style="background-color: ${produto.corProduto}; width: 20px;
                                                                                                      height: 20px;"></div></td></tr>

                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                                <!--//tab_one-->

                                <div class="tab2">

                                    <div class="single_page_agile_its_w3ls">
                                        <h6>${produto.nomeProduto}</h6>
                                        <p>${produto.descricaoProduto}<</p>

                                    </div>
                                </div>
                            </div>
                        </div>	
                    </div>
                </c:forEach>

                <!-- //new_arrivals --> 
                <!--/slider_owl-->

                <div class="w3_agile_latest_arrivals">
                    <h3 class="wthree_text_info">SUGEST�ES</h3>	
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
                    <div class="clearfix"> </div>
                    <!--//slider_owl-->
                </div>
            </div>
        </div>
        <!--//single_page-->
        <!--/grids-->
        <div class="clearfix"> </div>
        <!--grids-->
        <!-- footer -->
        <div class="footer">
            <div class="footer_agile_inner_info_w3l">
                <div class="col-md-3 footer-left">
                    <h2><a href="index.html"><span>E</span>lite Shoppy </a></h2>
                    <p>Lorem ipsum quia dolor
                        sit amet, consectetur, adipisci velit, sed quia non 
                        numquam eius modi tempora.</p>
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
                            <h4>Our <span>Information</span> </h4>
                            <ul>
                                <li><a href="index.html">Home</a></li>
                                <li><a href="mens.html">Men's Wear</a></li>
                                <li><a href="womens.html">Women's wear</a></li>
                                <li><a href="about.html">About</a></li>
                                <li><a href="typography.html">Short Codes</a></li>
                                <li><a href="contact.html">Contact</a></li>
                            </ul>
                        </div>

                        <div class="col-md-5 sign-gd-two">
                            <h4>Store <span>Information</span></h4>
                            <div class="w3-address">
                                <div class="w3-address-grid">
                                    <div class="w3-address-left">
                                        <i class="fa fa-phone" aria-hidden="true"></i>
                                    </div>
                                    <div class="w3-address-right">
                                        <h6>Phone Number</h6>
                                        <p>+1 234 567 8901</p>
                                    </div>
                                    <div class="clearfix"> </div>
                                </div>
                                <div class="w3-address-grid">
                                    <div class="w3-address-left">
                                        <i class="fa fa-envelope" aria-hidden="true"></i>
                                    </div>
                                    <div class="w3-address-right">
                                        <h6>Email Address</h6>
                                        <p>Email :<a href="mailto:example@email.com"> mail@example.com</a></p>
                                    </div>
                                    <div class="clearfix"> </div>
                                </div>
                                <div class="w3-address-grid">
                                    <div class="w3-address-left">
                                        <i class="fa fa-map-marker" aria-hidden="true"></i>
                                    </div>
                                    <div class="w3-address-right">
                                        <h6>Location</h6>
                                        <p>Broome St, NY 10002,California, USA. 

                                        </p>
                                    </div>
                                    <div class="clearfix"> </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-3 sign-gd flickr-post">
                            <h4>Flickr <span>Posts</span></h4>
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
                <div class="agile_newsletter_footer">
                    <div class="col-sm-6 newsleft">
                        <h3>SIGN UP FOR NEWSLETTER !</h3>
                    </div>
                    <div class="col-sm-6 newsright">
                        <form action="#" method="post">
                            <input type="email" placeholder="Enter your email..." name="email" required="">
                            <input type="submit" value="Submit">
                        </form>
                    </div>

                    <div class="clearfix"></div>
                </div>
                <p class="copy-right">&copy 2017 Elite shoppy. All rights reserved | Design by <a href="http://w3layouts.com/">W3layouts</a></p>
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
        <script src="js/modernizr.custom.js"></script>
        <!-- Custom-JavaScript-File-Links --> 
        <!-- cart-js -->
        <script src="js/minicart.min.js"></script>
        <script>

        </script>

        <!-- //cart-js --> 
        <!-- single -->
        <script src="js/imagezoom.js"></script>
        <!-- single -->
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
        <!-- FlexSlider -->
        <script src="js/jquery.flexslider.js"></script>
        <script>
                                                // Can also be used with $(document).ready()
                                                $(window).load(function () {
                                                    $('.flexslider').flexslider({
                                                        animation: "slide",
                                                        controlNav: "thumbnails"
                                                    });
                                                });
        </script>
        <!-- //FlexSlider-->
        <!-- //script for responsive tabs -->		
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
        <script type="text/javascript">
            $(function () {

                var currentTime = new Date();
                var month = currentTime.getMonth() + 1;
                var day = currentTime.getDate();
                var year = currentTime.getFullYear();

                var date = day + "/" + month + "/" + year;


                $('[name=inicio]').val(date);

            });

        </script>

        <!-- //here ends scrolling icon -->

        <!-- for bootstrap working -->
        <script type="text/javascript" src="js/bootstrap.js"></script>
        <script src="${pageContext.request.contextPath}/javascript/categoria.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/javascript/periodo.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/js/cadastro.js" type="text/javascript"></script>
    </body>
</html>
