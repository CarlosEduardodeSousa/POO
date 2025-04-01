package Exercíciosaula05;

import javax.swing.JOptionPane;

public class ConsumoEnergia {
    private double consumo;
    private static final double tarifa = 0.28172;

    public ConsumoEnergia(double consumo){
        this.consumo = consumo;
    }

    public double calcularFornecimento(){
        return consumo * tarifa;
    }

    public double calcularICMS(){
        if(consumo <= 200){
            double fator = 0.136363;
            return fator * calcularFornecimento();
        }

        else{
            double fator = 0.333333;
            return fator * calcularFornecimento();
        }
    }

    public double calcularCOFINS(){
        if(consumo <= 200){
            double fator = 0.0614722;
            return fator * calcularFornecimento();
        }

        else{
            double fator = 0.0730751;
            return fator * calcularFornecimento();
        }
    }

    public double calcularPISPASESP(){
        if(consumo <= 200){
            double fator = 0.013346;
            return fator * calcularFornecimento();
        }

        else{
            double fator = 0.0158651;
            return fator * calcularFornecimento();
        }
    }

    public double calcularICMSCOFINS(){
        if(consumo <= 200){
            return calcularFornecimento() * (0.136363 * 0.0614722);
        }

        else{
            return calcularFornecimento() * (0.333333 * 0.0730751);
        }
    }

    public double calcularICMSPISPASESP(){
        if(consumo <= 200){
            return calcularFornecimento() * (0.136363 * 0.013346);
        }

        else{
            return calcularFornecimento() * (0.333333 * 0.0158651);
        }
    }

    public double calcularFatura(){
        return calcularFornecimento() + calcularICMS() + calcularCOFINS() + calcularICMSPISPASESP() + calcularICMSCOFINS() + calcularICMSPISPASESP();
    }

    public void exibirConta(){
        JOptionPane.showMessageDialog(null, "Fornecimento: " + calcularFornecimento()
         + "\n ICMS: " + calcularICMS() + "\n COFINS: " + calcularCOFINS() + "\n PIS/PASESP: " + calcularPISPASESP()
         + "\n ICMS sobre COFINS: " + calcularICMSCOFINS()
         + "\n ICMS sobre PIS/PASESP: " + calcularICMSPISPASESP()
         + "\n FATURA: " + calcularFatura());
    }

    public static void main(String[] args) {
        ConsumoEnergia conta;

        double consumo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu consumo em KWh: "));
        conta = new ConsumoEnergia(consumo);
        conta.exibirConta();
    }
}
