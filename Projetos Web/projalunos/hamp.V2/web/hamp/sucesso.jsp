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
        <title>HAMP - Sucesso</title>
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
                <span style="color: #17c3a2;">Contrato de Locação   </span><span style="color: #17c3a2;" class="glyphicon glyphicon-chevron-right"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <span style="color: #17c3a2;">Finalizar Pedido   </span><span class="glyphicon glyphicon-ok" style="color: #17c3a2;"></span> 
            </h2>

        </div>


        <!-- CONTRATO DE LOCAÇÃO -->
        <div class="row"><br><br>
            <div class="container">
                <div class="jumbotron bg-success" style="background-color: #dff0d8;">
                    <h1 class="text-center ">Pedido realizado com Sucesso!</h1><br>
                    <p>Seu pedido foi realizado, agora será processado para realização do despachamento do produto pela empresa locadora. Acesse a situação do seu pedido no carrinho de locação</p>
                </div>
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
    <script src="${pageContext.request.contextPath}/javascript/formulario.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/javascript/categoria.js" type="text/javascript"></script>
</body>
</html>


