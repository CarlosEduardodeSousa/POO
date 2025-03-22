package Exercíciosaula05;

public class Triangulo {
    double base;
    double altura;

    Triangulo(){

    }

    Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double calculaArea(){
        return base * (altura/2);

    }

    void imprimirDados(){
        System.out.println("Dados: ");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calculaArea());

    }
}
