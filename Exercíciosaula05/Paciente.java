package Exercíciosaula05;

import java.util.Scanner;

public class Paciente {
    String nome;
    String rg;
    String endereco;
    String telefone;
    int anoNascimento;
    String profissao;

    Paciente(){

    }

    Paciente(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getRG(){
        return rg;
    }

    public void setRG(String rg){
        this.rg = rg;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public int getanoNascimento(){
        return anoNascimento;
    }

    public void setanoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }

    public String getProfissao(){
        return profissao;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    public void cadastrarDados(){
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        this.nome = leia.nextLine();

        System.out.print("Digite o RG: ");
        this.rg = leia.nextLine();

        System.out.print("Digite o endereço: ");
        this.endereco = leia.nextLine();

        System.out.print("Digite o telefone: ");
        this.telefone = leia.nextLine();

        System.out.print("Digite o ano de nascimento: ");
        this.anoNascimento = leia.nextInt();

        leia.nextLine(); 
        
        System.out.print("Digite a profissão: ");
        this.profissao = leia.nextLine();

        leia.close();
    }

    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Profissão: " + profissao);
    }

    public int calcularIdade(int anoAtual){
        return anoAtual - anoNascimento;
    }


}
