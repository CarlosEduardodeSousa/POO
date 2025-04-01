package Exercíciosaula05;

public class Funcionario {
    private int cracha;
    private float salario;
    private String cargo;

    Funcionario (int cracha, float salario, String cargo){
        this.cracha = cracha;
        this.salario = salario;
        this.cargo = cargo;
    }

    Funcionario(){
        
    }

    public int getCracha(){
        return cracha;
    }

    public void setCracha(int cracha){
        this.cracha = cracha;
    }

    public float getSalario(){
        return salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public void calcularAumento(float porcentagem){
        this.salario += this.salario * (porcentagem / 100);
    }

    public void calculaAumento(int tempo){
        this.salario += this.salario * tempo;
    }

    void imprimirDados(){
        System.out.println("Cracha: " + cracha);
        System.out.println("Salario: " + salario);
        System.out.println("Cargo: " + cargo);
    }
}
