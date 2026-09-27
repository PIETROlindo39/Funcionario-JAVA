package dominio;

public class Impressora {
    public void imprimir(Funcionario funcionario){
       System.out.println("Nome: "+funcionario.nome);
       System.out.println("Idade: "+funcionario.idade);
       System.out.println("Salario Primeiro Mês: R$"+funcionario.salario[0]);
       System.out.println("Salario Segundo Mês: R$"+funcionario.salario[1]);
       System.out.println("Salario Terceiro Mês: R$"+funcionario.salario[2]);
    }
}
