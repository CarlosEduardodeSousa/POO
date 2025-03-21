package Aula04;

public class ContaCorrente {
    
    public String nome;
    public float saldo;
    public float limite;
    public char tipo;

    public ContaCorrente(String nome, float saldo, float limite, char tipo){
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
        this.tipo = tipo;
    }

    public ContaCorrente(String nome, float saldo, char tipo){
        this.nome = nome;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public ContaCorrente(){

    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public float getSaldo(){
        return saldo;
    }

    public void setsaldo(float saldo){
        this.saldo = saldo;
    }

    public float getLimite(){
        return limite;
    }

    public void setLimite( float limite){
        this.limite = limite;
    }

    public char getTipo(){
        return tipo;
    }

    public void setTipo(char tipo){
        this.tipo = tipo;
    }

    public float depositar(float valor){
        float saldo = 0;
        saldo = saldo + valor;
        return  saldo;
    }

    public float atualizarSaldo(float saldo, float valor){
        float novo_saldo = saldo + valor;
        return novo_saldo;
    }
          
}
