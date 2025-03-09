package Aula02;

import javax.swing.JOptionPane;

public class Area {
    public static void main(String[] args) {
        
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        x.a = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com os valores de X:"));
        x.b = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com os valores de X:"));
        x.c = Double.parseDouble(JOptionPane.showInputDialog(null, "Esntre com os valores de X:"));

        y.a = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com os valores de Y:"));
        y.b = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com os valores de Y:"));
        y.c = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com os valores de Y:"));

        double pX = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(pX * (pX - x.a) * (pX - x.b) * (pX - x.c));

        double pY = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(pY * (pY - y.a) * (pY - y.b) * (pY - y.c));

        JOptionPane.showMessageDialog(null, String.format("A área do triangulo X é: " + areaX));
        JOptionPane.showMessageDialog(null, String.format("A área do triangulo Y é: " + areaY));

        if (areaX > areaY){
            JOptionPane.showMessageDialog(null, "A maior área é X!");
        }

        else if(areaY > areaX){
            JOptionPane.showInternalMessageDialog(null, "A maior área é Y!");
        }

        else{
            JOptionPane.showInternalMessageDialog(null, "As áreas são iguais!");
        }

    }
}
