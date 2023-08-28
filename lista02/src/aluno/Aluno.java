package aluno;

/*
 * a) Crie uma classe em Java chamada Aluno contendo as variáveis de instância
 * private numeroAluno (int), nome (String), idade (int), p1 (float) e p2 (float),
 * e os métodos getters e setters para todas as variáveis privadas.
 * Para a criação dos métodos setters, assuma que: o número do aluno deve
 * ter tamanho exatamente igual a 6. O nome do aluno não pode ultrapassar tamanho 30.
 * A idade, e as notas p1 e p2 não podem ser negativas.
 *
 * b) Crie os métodos public notaFinal() que calcula e imprime a média final do aluno,
 * e dadosAluno() - que imprime as variáveis de instância numeroAluno,
 * nome e idade. Crie um construtor para inicialização das variáveis
 * quando um objeto da classe for criado. Forneça um construtor sem argumento com valores
 * default caso nenhum inicializador seja fornecido
 */

public class Aluno {
  private int numeroAluno;
  private String nome;
  private int idade;
  private float n1;
  private float n2;

  public Aluno() {
  }

  public Aluno(int numeroAluno, String nome, int idade, float n1,
      float n2) {
    setNumeroAluno(numeroAluno);
    setNome(nome);
    setIdade(idade);
    setN1(n1);
    setN2(n2);
  }

  public int getNumeroAluno() {
    return numeroAluno;
  }

  public void setNumeroAluno(int numeroAluno) {
    String nunAluno = String.valueOf(numeroAluno);
    if (numeroAluno > 0 && nunAluno.length() == 6) {
      this.numeroAluno = numeroAluno;
    } else {
      this.numeroAluno = 0;
      System.out.println("Número aluno inválido, foi atribuído 0");
    }
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    if (nome.length() >= 3 && nome.length() <= 30) {
      this.nome = nome;
    } else {
      this.nome = null;
      System.out.println("Nome do cliente deve conter de 3 à 30 caracteres, nome foi atribuído nulo.");
    }
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    if (idade >= 0 && idade <= 150) {
      this.idade = idade;
    } else {
      this.idade = 0;
      System.out.println("Idade inválida, foi atribuida 0");
    }
    this.idade = idade;
  }

  public float getN1() {
    return n1;
  }

  public void setN1(float n1) {
    if (n1 >= 0 && n1 <= 10) {
      this.n1 = n1;
    } else {
      this.n1 = 0;
      System.out.println("Nota n1 inválida, foi atribuida 0");
    }
  }

  public float getN2() {
    return n2;
  }

  public void setN2(float n2) {
    if (n2 >= 0 && n2 <= 10) {
      this.n2 = n2;
    } else {
      this.n2 = 0;
      System.out.println("Nota n2 inválida, foi atribuida 0");
    }
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

  public String passou() {
    if (calculaMedia() >= 6) {
      return "Aluno aprovado!";
    } else {
      return "Aluno reprovado!";
    }
  }

  public void dadosAluno() {
    System.out.println("Código aluno: " + this.numeroAluno + "\nNome: " + this.nome + "\nIdade: " + this.idade);
  }
}
