package main.java.aluno;

/* 
 *• Crie uma classe em Java chamada Aluno contendo as variáveis de instância numeroAluno (int), nome (String), idade (int), p1 (float) e p2 (float), 
 *• Crie os construtores 
 *• Crie os métodos notaFinal() 
 *- que calcula e retorna a média final do aluno 
 *  dadosAluno() 
 *- que retorna os valores de numeroAluno, nome e idade.  
*/
public class Aluno {
  public int numeroAluno;
  public String nome;
  public int idade;
  public float n1;
  public float n2;

  public Aluno(int numeroAluno, String nome, int idade, float n1,
      float n2) {
    this.numeroAluno = numeroAluno;
    this.nome = nome;
    this.idade = idade;
    this.n1 = n1;
    this.n2 = n2;
  }

  public Float calculaMedia() {
    float media;
    media = (this.n1 + this.n2) / 2;
    return media;
  }

  public void notaFinal() {
    float media = calculaMedia();
    System.out.println("Média final: " + String.format("%.2f", media));

  }

  public void passou() {
    if (calculaMedia() >= 6) {
      System.out.println("Aluno aprovado!");
    } else {
      System.out.println("Aluno reprovado!");
    }
  }

  public void dadosAluno() {
    System.out.println("Código aluno: " + this.numeroAluno + ", Nome: " + this.nome + ", Idade: " + this.idade);
  }
}
