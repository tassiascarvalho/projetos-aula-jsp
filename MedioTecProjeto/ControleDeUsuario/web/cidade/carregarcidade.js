function carregarcidade(idCidade) {
        $.ajax({
            type: 'POST',
            url: 'CarregarCidadeModal',
            data: 'idcidadecarregar=' + idCidade,
            statusCode: {
                404: function () {
                    console.log('Pagina não encontrada');
                },
                500: function () {
                    console.log('Erro no servidor');
                }
            },
            success: function(dados) {
                console.log(dados);
                pegadados = dados.split(":");
                console.log(pegadados);
                if (dados === '') {
                } 
                else {
                    var idcidade = pegadados[0];
                    var nomecidade = pegadados[1];
                    
                    document.getElementById('idcidademodal').value = idcidade;
                    document.getElementById('nomecidademodal').value = nomecidade;
                }
            }
        })
};


