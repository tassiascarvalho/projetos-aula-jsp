<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<c:choose>
    <c:when test="${sessionScope.pessoaf != null}">
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
                <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
                <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" media="all" />
                <link href="${pageContext.request.contextPath}/css/font-awesome.css" rel="stylesheet"> 
                <link href="${pageContext.request.contextPath}/css/easy-responsive-tabs.css" rel='stylesheet' type='text/css'/>
                <link rel="sortcut icon" href="${pageContext.request.contextPath}/images/logo.png" type="image/png" />
                <!-- //for bootstrap working -->
                <link href="${pageContext.request.contextPath}///fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800" rel="stylesheet">
                <link href='${pageContext.request.contextPath}///fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,900,900italic,700italic' rel='stylesheet' type='text/css'>
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
                                <li class="share">  ${saudacao} </li>                   
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
                                            <li class="active menu__item menu__item--current"><a class="menu__link" href="#">IN�CIO <span class="sr-only">(current)</span></a></li>
                                            <li class=" menu__item"><a class="menu__link" href="${pageContext.request.contextPath}/sobre.jsp">SOBRE</a></li>
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



                <!-- //LOGIN -->



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
                        <span class="sr-only">Pr�ximo</span>
                    </a>
                    <!-- The Modal -->
                </div> 


                <!--/grids-->

                <div class="clearfix"></div>
                <h3 class="wthree_text_info">PRODUTOS PARA <span>ALUGUEL</span></h3>
            </div>							
            <!--/grids-->



            <!-- /new_arrivals --> 
            <div class="new_arrivals_agile_w3ls_info"> 
                <div class="container">

                    <br/>
                    <br/>
                    <div id="horizontalTab">
                        <ul class="resp-tabs-list">
                            <li> PRODUTOS EM DESTAQUE</li>
                            <li> IMOBILIZADORES</li>
                            <li> ORTOPEDIA</li>
                            <li> VESTIMENTAS</li>
                        </ul>
                        <div class="resp-tabs-container">
                            <!--/tab_one-->
                            <div class="tab1">
                                <div class="col-md-3 product-men">
                                    <div class="men-pro-item simpleCart_shelfItem">
                                        <div class="men-thumb-item">
                                            <img src="${pageContext.request.contextPath}/images/Bengala 1.png" alt="" class="pro-image-front">
                                            <img src="${pageContext.request.contextPath}/images/Bengala 1.png" alt="" class="pro-image-back">
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
                                            <img src="${pageContext.request.contextPath}/images/Ortese p Ombro 1.jpg" alt="" class="pro-image-front">
                                            <img src="${pageContext.request.contextPath}/images/Ortese p Ombro 1.jpg" alt="" class="pro-image-back">
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
                                            <img src="${pageContext.request.contextPath}/images/Andador 1.jpg" alt="" class="pro-image-front">
                                            <img src="${pageContext.request.contextPath}/images/Andador 1.jpg" alt="" class="pro-image-back">
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
                                            <img src="${pageContext.request.contextPath}/images/cadeira de rodas 1.jpg" alt="" class="pro-image-front">
                                            <img src="${pageContext.request.contextPath}/images/cadeira de rodas 1.jpg" alt="" class="pro-image-back">
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
                                            <img src="${pageContext.request.contextPath}/images/Faixa 3.jpg" alt="" class="pro-image-front">
                                            <img src="${pageContext.request.contextPath}/images/Faixa 3.jpg" alt="" class="pro-image-back">
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
                                            <img src="${pageContext.request.contextPath}/images/Imobilizadoror 1.jpg" alt="" class="pro-image-front">
                                            <img src="${pageContext.request.contextPath}/images/Imobilizadoror 1.jpg " alt="" class="pro-image-back">
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
                                            <img src="${pageContext.request.contextPath}/images/Joelheira Articulada 1.jpg" alt="" class="pro-image-front">
                                            <img src="${pageContext.request.contextPath}/images/Joelheira Articulada 1.jpg" alt="" class="pro-image-back">
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
                                            <img src="${pageContext.request.contextPath}/images/Almofada de acento 1.png" alt="" class="pro-image-front">
                                            <img src="${pageContext.request.contextPath}/images/Almofada de acento 1.png" alt="" class="pro-image-back">
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
                            <!--//tab_one-->                <!--/tab_two-->
                        </div>
                    </div>	
                </div>
            </div>
            <!-- //new_arrivals -->




            <!-- /we-offer -->
            <div class="sale-w3ls">
                <div class="container">
                    <h6>AINDA COMPRANDO? ALUGUE AGORA!</h6>


                </div>
            </div>
            <!-- //we-offer -->


            <!-- footer -->
            <div class="footer">
                <div class="footer_agile_inner_info_w3l">
                    <div class="col-md-3 footer-left">
                        <h2><a href="index.jsp"><span>H</span>AMP </a></h2>
                        <p>Sistema HAMP |
                            Sistema Web de produtos m�dicos e hospitalares.  
                            Projeto de Conclus�o de Curso.</p>
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
                                    <li><a href="index.jsp">In�cio</a></li>
                                    <li><a href="sobre.jsp">Sobre</a></li>
                                    <li><a href="womens.jsp">Women's wear</a></li>
                                    <li><a href="sobre.jsp">Sobre</a></li>
                                    <li><a href="typography.jsp">Short Codes</a></li>
                                    <li><a href="contact.jsp">Contato</a></li>
                                </ul>
                            </div>

                            <div class="col-md-5 sign-gd-two">
                                <h4>Informa��es <span>de contato</span></h4>
                                <div class="w3-address">
                                    <div class="w3-address-grid">
                                        <div class="w3-address-left">
                                            <i class="fa fa-phone" aria-hidden="true"></i>
                                        </div>
                                        <div class="w3-address-right">
                                            <h6>N�mero p/ contato</h6>
                                            <p>(17) 7070-7070</p>
                                        </div>
                                        <div class="clearfix"> </div>
                                    </div>
                                    <div class="w3-address-grid">
                                        <div class="w3-address-left">
                                            <i class="fa fa-envelope" aria-hidden="true"></i>
                                        </div>
                                        <div class="w3-address-right">
                                            <h6>Endere�o de e-mail</h6>
                                            <p>E-mail :<a href="mailto:example@email.com"> mail@example.com</a></p>
                                        </div>
                                        <div class="clearfix"> </div>
                                    </div>
                                    <div class="w3-address-grid">
                                        <div class="w3-address-left">
                                            <i class="fa fa-map-marker" aria-hidden="true"></i>
                                        </div>
                                        <div class="w3-address-right">
                                            <h6>Endere�o</h6>
                                            <p>Fernand�polis, S�o Paulo, CEP 156000-000. 

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
                                    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.4.min.js"></script>
                                    <!-- //js -->
                                    <script src="${pageContext.request.contextPath}/js/modernizr.custom.js"></script>
                                    <!-- Custom-JavaScript-File-Links --> 
                                    <!-- cart-js -->
                                    <script src="${pageContext.request.contextPath}/js/minicart.min.js"></script>


                                    <!-- //cart-js --> 
                                    <!-- script for responsive tabs -->						
                                    <script src="${pageContext.request.contextPath}/js/easy-responsive-tabs.js"></script>
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
                                    <script src="${pageContext.request.contextPath}/js/jquery.waypoints.min.js"></script>
                                    <script src="${pageContext.request.contextPath}/js/jquery.countup.js"></script>
                                    <script>
                                                                            $('.counter').countUp();
                                    </script>
                                    <!-- //stats -->
                                    <!-- start-smoth-scrolling -->
                                    <script type="text/javascript" src="${pageContext.request.contextPath}/js/move-top.js"></script>
                                    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easing.min.js"></script>
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
                                    </body>
                                    </html>
                                </c:when>
                                <c:otherwise> <!--ELSE do JSTL-->
                                    <c:redirect url="../../index.jsp"/> <!--IF do JSTL-->
                                </c:otherwise>
                            </c:choose>
