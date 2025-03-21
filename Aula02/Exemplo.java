package Aula02;

public class Exemplo {
    public static void main(String[] args) {
        
        Triangulo t = new Triangulo(2.5f, 3f);
        float area = (t.base * t.altura) / 2;
        System.out.println("Área: " + area);

        System.out.println("");

        Data d1 = new Data(2, 9, 2015);
        Data d2 = new Data(0, 0, 0);
        System.out.println(d1.dia + "/" + d1.mes + "/" + d1.ano);
        System.out.println(d2.dia + "/" + d2.mes + "/" + d2.ano);
    }
}
