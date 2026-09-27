package test;

import dominio.Funcionario;
import dominio.Impressora;

public class funcionariotest {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        Impressora impressora = new Impressora();

        funcionario.nome = "Pietro";
        funcionario.idade = 32;
        funcionario.salario = new double[]{1739,490.23,1100};

        impressora.imprimir(funcionario);
    }
}
