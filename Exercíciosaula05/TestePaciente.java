package Exercíciosaula05;

public class TestePaciente {
    public static void main(String[] args) {
        Paciente p1 = new Paciente();

        System.out.println("Cadastrro do Paciente 1: ");
        p1.cadastrarDados();
        System.out.println("");
        p1.imprimirDados();
        System.out.println("Idade do paciente 1: " + p1.calcularIdade(2025));

        System.out.println("");
        System.out.println("");
        
        Paciente p2 = new Paciente("Nicolas");
        p2.setRG("999777554");
        p2.setEndereco("Rua das Flores");
        p2.setTelefone("998754213");
        p2.setanoNascimento(1986);
        p2.setProfissao("Bancario");
        System.out.println("Dados do Paciente 2: ");
        p2.imprimirDados();
        System.out.println("Idade do Paciente 2: " + p2.calcularIdade(2025));

    }
}
