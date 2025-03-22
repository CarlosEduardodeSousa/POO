package Exercíciosaula05;

public class TesteTriangulo {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(8, 10);

        t1.calculaArea();
        t1.imprimirDados();

        Triangulo t2 = new Triangulo();

        System.out.println("");
        t2.setBase(15);
        t2.setAltura(7);
        t2.calculaArea();
        t2.imprimirDados();
    }
}
