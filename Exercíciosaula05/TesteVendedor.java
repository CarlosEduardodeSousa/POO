package Exercíciosaula05;

public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor(2500, 3000, "Carlos Silva", 2);
        vendedor1.imprimirDados();
        vendedor1.calcularSalario();

        System.out.println(""); 

        
        Vendedor vendedor2 = new Vendedor(800, 1500, "Ana Costa", 1);
        vendedor2.imprimirDados();
        vendedor2.calcularSalario();
    }
}
