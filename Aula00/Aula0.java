public class Aula0 {
    public static void main(String[] args) {
        
        Pessoa p;
        p = new Pessoa();
        Pessoa p1 = new Pessoa();

        p.nome = "Carlos";
        p.idade = 20;
        p.renda = 1500;

        p1.nome = "Fulano";
        p1.idade = 25;
        p1.renda = 5000;

        System.out.println("Nome: " + p.nome);
        System.out.println("Idade: " + p.idade);
        System.out.println("Renda: " + p.renda);

        System.out.println("");

        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);
        System.out.println("Renda: " + p1.renda);
    }
}
