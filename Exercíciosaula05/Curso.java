package Exercíciosaula05;

import java.util.Scanner;

public class Curso {
    String nome;
    int quantidade_de_alunos;
    String turma;
    float mensalidade;

    public Curso(){

    }

    public Curso(String n, int q, String t, float m){
        this.nome = n;
        this.quantidade_de_alunos = q;
        this.turma = t;
        this.mensalidade = m;
    }

    public void cadastraDados(){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do curso: ");
        this.nome = leia.nextLine();

        System.out.println("Digite a quantidade de alunos: ");
        this.quantidade_de_alunos = leia.nextInt();

        System.out.println("Digite a mensalidade: ");
        this.mensalidade = leia.nextFloat();

        System.out.println("Digite a turma: ");
        this.turma = leia.nextLine();

        leia.close();
    }

    public void imprimirDados(){
        System.out.println("Dados do Curso: ");
        System.out.println("");
        System.out.println("Nome: " + nome);
        System.out.println("Quantidae de alunos: " + quantidade_de_alunos);
        System.out.println("Turma: " + turma);
        System.out.println("Mensalidade: " + mensalidade);
    }

    public float calculaTotalMensalidade(float valor){
        float total = valor * 12;
        return total;
    }
}
