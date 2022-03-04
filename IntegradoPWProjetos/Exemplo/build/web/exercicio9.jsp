<%-- 
    Document   : exercicio9
    Created on : 25/03/2021, 13:28:29
    Author     : Tassia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Exercício 9</h1>

        <p>Construir um programa que efetue o cálculo do salário líquido de um professor. Para fazer este programa, 
            você deverá possuir alguns dados, tais como: valor da hora aula, número de horas trabalhadas no mês e 
            percentual de desconto do INSS. Exibir, salário bruto, total descontado e salário liquido.
            <br />
            <br />salariobruto = valorhora * numerohoras;
            <br />desconto = salariobruto * (porcentageminsss/100);
            <br />salarioliquido = salariobruto - desconto;
        </p>
        <br />
        <form action="Exercicio9" method="get">
            <label>Valor Hora Aula</label>
            <input type="text" name="vlhora">
            <br /><br />
            <label>Quantidade de Horas Trabalhadas</label>
            <input type="text" name="hrtrabalhadas">
            <br /><br />
            <label>Percentual de desconto INSS</label>
            <input type="text" name="pinss">
            <br /><br />
                
            <input type="submit" value="Calcular">
        </form>
    </body>
</html>
