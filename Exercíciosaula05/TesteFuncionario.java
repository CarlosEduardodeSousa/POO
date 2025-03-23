package Exercíciosaula05;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(9, 1500f, "recepcionista");

        f1.imprimirDados();
        f1.calcularAumento(10);
        System.out.println("");
        f1.imprimirDados();

        Funcionario f2 = new Funcionario();

        f2.setCracha(8);
        f2.setSalario(3000);
        f2.setCargo("Gerente");
        f2.calculaAumento(3);
        f2.imprimirDados();
    }
}
