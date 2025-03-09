package Aula02;

import javax.swing.JOptionPane;

public class CalcTriangulo {
    public static void main(String[] args) {
        Triangulo2 t = new Triangulo2();

        t.ladoA = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o lado A: "));
        t.ladoB = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o lado B: "));
        t.ladoC = Integer.parseInt(JOptionPane.showInputDialog(null, "Digote o lado C: "));

        if (t.ladoA == t.ladoB && t.ladoA == t.ladoC){
            JOptionPane.showMessageDialog(null, "Equilatero");
        }

        else if (t.ladoA == t.ladoB || t.ladoA == t.ladoC || t.ladoB == t.ladoC){
            JOptionPane.showMessageDialog(null, "Isosceles");
        }

        else{
            JOptionPane.showMessageDialog(null, "Escaleno");
        }
    }
}
