// Cálculo de Periodo de locação
$("#btn-calcular").click(function () {
    var dataInicial = $("input[name=comeco]").val();
    var dataFinal = $("input[name=fim]").val();
    var valorSemana = $("#valorSemana").val();

    /*gera um objeto do tipo Date com valor do input*/
    var date1 = new Date(dataInicial);
    var date2 = new Date(dataFinal);


    /*Subtrai a segunda data em milisegundos pela primeira e usa função abs para retornar o valor absoluto*/
    var timeDiff = Math.abs(date2.getTime() - date1.getTime());

    /*agora ele divide o valor da diferença das datas em milisegundos pela quantidade de milisegundos em um dia e usa ceil para 
     retorna o menor número inteiro*/
    var diffDays = Math.ceil(timeDiff / (1000 * 3600 * 24));


    var semanas = diffDays / 7;

    var totalLocacao = semanas * valorSemana;
    var resultado = ((Math.round(totalLocacao * 100)) / 100);
    
    $("#dias").val(diffDays);
    $("#total").val(resultado);

});

