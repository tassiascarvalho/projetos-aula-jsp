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
        <title>HAMP EMPRESA - Novo produto</title>
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

                            <label style="font-weight: 600;  font-size: 3em; color:white; position: relative; left: -15%;text-shadow: 2px 2px 7px black;">NOVO PRODUTO  <i class="fa fa-shopping-cart"></i></label>
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
                            <div class="col-md-3">  <img src="${pageContext.request.contextPath}/produtos/${produto.imagemProduto}" alt="" class="img-responsive"></div>
                            <div class="col-md-6">
                                <form method="POST" action="${pageContext.request.contextPath}/SalvarProduto" enctype="multipart/form-data" >

                                    <!-- Id da pessoa da Empresa -->
                                    <input type="hidden" value="${idpessoa}" name="idempresa">
                                    <input type="hidden" value="${produto.idProduto}" name="idproduto">

                                    <div class="form-row">
                                        <div class="form-group col-md-6">
                                            <label for="inputEmail4">Nome do produto</label>

                                            <input  class="form-control" type="text" name="nome" value="${produto.nomeProduto}" required />
                                        </div>
                                        <div class="form-group col-md-6">
                                            <label for="inputPassword4">Categoria do produto</label>
                                            <select  class="form-control" name="categoria" required>
                                                <option value="1">Almofadas Ortopédicas</option>
                                                <option value="2">Andadores</option>
                                                <option value="3">Bengalas</option>
                                                <option value="4">Botas Imobilizadoras</option>
                                                <option value="5">Cadeiras de rodas e banho</option>
                                                <option value="6">Coletes de coluna</option>
                                                <option value="7">Faixas Abdominais</option>
                                                <option value="8">Imobilizadores de Joelhos</option>
                                                <option value="9">Joelheiras Articuladas</option>
                                                <option value="10">Muletas </option>
                                                <option value="11">Ortese para Ombro</option>                  
                                                <option value="12">Tornozeleira</option>
                                                <option value="13">Outros</option>
                                            </select>
                                        </div>

                                        <div class="form-group col-md-12">
                                            <label>Valor da locação por semana: R$</label>
                                            <input  class="form-control" type="number" placeholder="R$" value="${produto.valorLocacaoDia}"  name="preco" required/>
                                        </div>
                                        <div class="form-group col-md-4">
                                            <label>Tamanho - Altura: CM</label>
                                            <input class="form-control" type="number" value="${produto.valorLocacaoDia}" name="tamanho" required/>
                                        </div>
                                        <div class="form-group col-md-4">
                                            <label>Peso do produto: Kg</label>
                                            <input class="form-control" type="number" value="${produto.pesoProduto}"  name="peso" required/>
                                        </div>
                                        <div class="form-group col-md-4">
                                            <label>Cor do produto</label>
                                            <input class="form-control"  type="color" value="${produto.corProduto}"  name="cor" required/>
                                        </div>
                                        <div class="form-group col-md-6">
                                            <label>Referencia do Produto</label>
                                            <input class="form-control" type="text" value="${produto.referenciaProduto}"  name="ref" required>
                                        </div>
                                        <div class="form-group col-md-6">
                                            <label>Quantidade: UN</label>
                                            <input type="number" name="quant" value="${produto.quantidadeProduto}" class="form-control" />
                                        </div>

                                        <div class="form-group col-md-9">
                                            <p><label>Descrição do produto</label></p>
                                            <textarea  class="form-control" rows="5" required name="desc">                   
                                            ${produto.descricaoProduto}
                                            </textarea>
                                        </div>
                                        <div class="form-group col-md-3">
                                            <label>Diponibilidade de Locação</label>
                                            <p> <label>Dísponivel</label> <input type="radio" class="radio" name="disp" value="Disponível" required/></p>
                                            <p> <label>Indisponivel</label><input type="radio" class="radio" name="disp" value="Indisponível" required/></p>
                                        </div>
                                        <div class="form-group col-md-12">
                                            <label>Adicionar fotos <input class="form-control" type="file"  name="file[]"  required></label>
                                            <input type="submit" value="Publicar Produto" class="btn btn-success"/>
                                        </div>

                                    </div>
                                </form>

                            </div>
                            <p>  ${mensagem}</p>
                            <div class="col-md-3"></div>

                            <div class="clearfix"> </div>
                        </div>
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


                        <li><a href="#"><i class="fa fa-envelope"></i><span>Mensagens</span><span class="fa fa-angle-right" style="float: right"></span></a>

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
        <!-- mother grid end here-->
    </body>
</html>


