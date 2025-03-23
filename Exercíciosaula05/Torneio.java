package Exercíciosaula05;

public class Torneio {
    private String nome;
    private int idade;

    Torneio(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    String getNome(){
        return nome;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    int getIdade(){
        return idade;
    }

    void setIdade(int idade){
        this.idade = idade;
    }

    void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Categoria: " + verificarCategoria());
    }

    String verificarCategoria(){
        
        if(idade >=5 && idade <=7){
            return "Infantil";
        }

        else if(idade >=8 && idade <=10){
            return "Juvenil";
        }

        else if(idade >= 11 && idade <=15){
            return "Adolescente";
        }

        else if(idade >= 16 && idade <= 30){
            return "Adulto";
        }

        else if(idade >=35){
            return "Sênior";
        }

        else{
            return "";
        }
    }
}
