package main.java.rio;

/*
 *Implemente em Java uma classe chamada Rio contendo as variáveis nome(String), nível (float) e  *poluído (boolean). Essa *classe deve possuir os dois métodos construtores, com e sem parâmetros, e *ainda os métodos:
 *  • chover(float): que aumenta o nível atual do rio;
 *  • ensolarar(float): que diminui o nível atual do rio;
 *  • limpar(): que limpa o rio;
 *  • sujar(): que polui o rio;
 *  • mostra(): que mostra todas as informações do rio.
 */
public class Rio {
  public String nome;
  public float nivel;
  public boolean poluido;

  public Rio() {
  }

  public Rio(String nome, float nivel, boolean poluido) {
    this.nome = nome;
    this.nivel = nivel;
    this.poluido = poluido;
  }

  public void chover(float x) {
    this.nivel += x;
  }

  public void ensolarar(float x) {
    if (x > this.nivel) {
      System.out.println("Nível não pode ser alterado!");
    } else {
      this.nivel -= nivel;
    }
  }

  public void limpar() {
    this.poluido = false;
  }

  public void sujar() {
    this.poluido = true;
  }

  public void mostraDados() {
    String statusRio;

    if (this.poluido) {
      statusRio = "Sim";
    } else {
      statusRio = "Não";
    }

    System.out.println(
        "Nome: " + this.nome + ", Nivel: " + String.format("%.2f", this.nivel) + ", Rio poluido: " + statusRio);
  }
}
