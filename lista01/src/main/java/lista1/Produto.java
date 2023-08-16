package main.java.lista1;

public class Produto {
  // Java é tipado, variáveis possuem tipo de dados
  // tipos de dados primitivos (int, float, double, boolean)
  // tipos de dados de classe (String, Float, Integer, Double)
  public int codigo;
  public String nome;
  public String descricao;
  public int qtde;
  public double preco;

  // método construtor, tem o mesmo nome da classe
  public Produto(int codigo, String nome, String descricao, int qtde, float preco) {
    // this.codigo representa o código do obj que chama construtor
    // codigo representa o valor informado pelo usuário
    this.codigo = codigo;
    this.nome = nome;
    this.descricao = descricao;
    this.qtde = qtde;
    this.preco = preco;

  }

  // comprar produtos
  public void comprar(int x) {
    this.qtde += x;
  }

  // vender produto
  public void vender(int x) {
    if (x > this.qtde) {
      System.out.println("Estoque insuficiente");
    } else {
      this.qtde -= x;
    }
  }

  // aumentar preço do produto
  public void aumentarPreco(float x) {
    this.preco += x;
  }

  // diminuir preço do produto
  public void diminuirPreco(float x) {
    if (x >= this.preco) {
      System.out.println("Não é possível abaixar preço");
    } else {
      this.preco -= x;
    }
  }

  // exibir os dados do objeto que chama o método
  public void exibeDados() {
    System.out.println("Código: " + this.codigo + ", Nome: " + this.nome + ", Descrição: " + this.descricao
        + ", Quantidade: " + this.qtde + ", Preço: R$ " + String.format("%.2f", preco));
  }
}
