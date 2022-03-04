$(document).ready(function(){
    $('#estado').on('change', function(){
        $.ajax({
            type: 'POST',
            url: 'CidadeAjax',
            data: 'id_estado='+$('#estado').val(),
            statusCode: {
                404: function() {
                    console.log('Pagina não encontrada');
                },
                500: function(){
                    console.log('Erro no servidor');
                }
            },
            success: function(dados){
                pegadados = dados.split(":");
                limparselect();
                if(dados == ''){
                   }
                else{
                    $('#cidade').append('<option selected disabled>Cidade</option>');
                    for(var i = 0; i < pegadados.length - 1; i++){
                        var codigo = pegadados[i].split("-")[0]; 
                        var nome = pegadados[i].split("-")[1];
                        $('#cidade').append('<option value ="'+codigo+'">'+nome+'</option>');

                    }
                }
            }
        }) 
        function limparselect(){
            $('#cidade option').remove();
        }
    }); 
    
    
       
    }); 
