package Exercíciosaula05;

public class Vendedor {
    private float vendas;
    private float salario;
    private String nome;
    private int falta;

    // Construtor com parâmetros
    public Vendedor(float vendas, float salario, String nome, int falta) {
        this.vendas = vendas;
        this.salario = salario;
        this.nome = nome;
        this.falta = falta;
    }

    // Métodos Getters e Setters
    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

    public float getVendas() {
        return vendas;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public int getFalta() {
        return falta;
    }

   
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Vendas: " + vendas);
        System.out.println("Faltas: " + falta);
    }

   
    public float calcularComissao() {
        if (vendas >= 2000) {
            return vendas * 0.15f; 
        } else if (vendas >= 1000) {
            return vendas * 0.10f; 
        } else {
            return 0; 
        }
    }

    
    public float descontoFalta() {
        return (salario / 30) * falta;
    }

    
    public void calcularSalario() {
        float comissao = calcularComissao();
        float desconto = descontoFalta();
        salario = salario + comissao - desconto;
        System.out.println("Salário final após comissão e desconto: " + salario);
    }
}

