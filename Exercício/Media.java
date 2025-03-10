package Exercício;

import javax.swing.JOptionPane;

public class Media{
    public static void main(String[] args) {
        
        Notas n = new Notas();

        n.n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota:"));
        n.n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota: "));
        n.n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a terceira nota: "));
        n.n4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quarta nota: "));

        double media = (n.n1 + n.n2 + n.n3 + n.n4) / 4;

        JOptionPane.showMessageDialog(null,"A sua Média foi: " + media);


       if (n.n1 > n.n2 && n.n1 > n.n3 && n.n1 > n.n4){
            JOptionPane.showMessageDialog(null, "A maior nota foi: " + n.n1);
       }

       else if (n.n2 > n.n1 && n.n2 > n.n3 && n.n2 > n.n4){
            JOptionPane.showMessageDialog(null, "A maior nota foi: " + n.n2);
       }

       else if (n.n3 > n.n1 && n.n3 > n.n2 && n.n3 > n.n4){
        JOptionPane.showMessageDialog(null, "A maior nota foi: " + n.n3);
       }

       else{
        JOptionPane.showMessageDialog(null, "A maior nota foi: " + n.n4);
       }
    }
}