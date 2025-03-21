package Exercíciosaula05;

public class TesteCurso {
    public static void main(String[] args) {
        Curso curso = new Curso("ADS", 30, "2B Noturno", 350f);

        curso.imprimirDados();
        System.out.println("");
        curso.calculaTotalMensalidade(350f);

        Curso curso2 = new Curso();

        curso2.cadastraDados();
        curso2.imprimirDados();
        curso2.calculaTotalMensalidade(0);
        
    }
}
