
$("#cliente").hide();
$("#empresa").hide();
$("#btnCliente").click(function () {
    $("#empresa").slideDown();
    $("#cliente").slideUp();
});

$("#btnEmpresa").click(function () {
    $("#cliente").slideDown();
    $("#empresa").slideUp();
});


var $doc = $('html, body');
$('.scroll').click(function () {
    $doc.animate({
        scrollTop: $($.attr(this, 'href')).offset().top
    }, 700);
    return false;
});

$("#c2").mouseover(function () {
    $("#imgcat").attr("src", "/Hamp/images/c2.jpg");
});
$("#c1").mouseover(function () {
    $("#imgcat").attr("src", "/Hamp/images/c1.jpg");
});
$("#c3").mouseover(function () {
    $("#imgcat").attr("src", "/Hamp/images/c3.jpg");
});
$("#c4").mouseover(function () {
    $("#imgcat").attr("src", "/Hamp/images/c4.jpg");
});
$("#c5").mouseover(function () {
    $("#imgcat").attr("src", "/Hamp/images/c5.jpg");
});
$("#c6").mouseover(function () {
    $("#imgcat").attr("src", "/Hamp/images/c6.jpg");
});
$("#c7").mouseover(function () {
    $("#imgcat").attr("src", "/Hamp/images/c7.jpg");
});
$("#c8").mouseover(function () {
    $("#imgcat").attr("src", "/Hamp/images/c8.jpg");
});
$("#c9").mouseover(function () {
    $("#imgcat").attr("src", "/Hamp/images/c9.jpg");
});
$("#c10").mouseover(function () {
    $("#imgcat").attr("src", "/Hamp/images/c10.jpg");
});
$("#c11").mouseover(function () {
    $("#imgcat").attr("src", "/Hamp/images/c11.jpg");
});
$("#c12").mouseover(function () {
    $("#imgcat").attr("src", "/Hamp/images/c12.jpg");
});
$("#c13").mouseover(function () {
    $("#imgcat").attr("src", "/Hamp/images/c13.jpg");
});

//Valor BRuto
var bruto = $("#bruto").val();


var comissao = bruto * 0.10;


var total = bruto - comissao;


var resultadoComi = ((Math.round(comissao * 100)) / 100);
var resultadoTotal = ((Math.round(total * 100)) / 100);
$("#comissao").val(resultadoComi);
$("#total").val(resultadoTotal);





$("#cpf").click(function () {
    try {
        $("#cpf").unmask();
    } catch (e) {
    }

    var tamanho = $("#cpf").val().length;

    if (tamanho < 11) {
        $("#cpf").mask("999.999.999-99");
    } else {
        $("#cpf").mask("99.999.999/9999-99");
    }
    alert("Olá");
});