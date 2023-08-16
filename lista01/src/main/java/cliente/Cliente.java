package main.java.cliente;
/*
 *• Crie uma classe em Java chamada Cliente contendo as variáveis de instância numeroConta (int), *numeroAgencia (int), nome (String) e saldo (float), 
 *• Crie os construtores 
 *• Crie os métodos public  realizarDeposito() e realizarSaque() que, realizam depósito e saque, *respectivamente, na conta do cliente. 
 *• Crie um outro método public que retorna o numero da conta, nome do cliente e saldo atual. 
 */

public class Cliente {
  public int numeroConta;
  public int numeroAgencia;
  public String nome;
  public float saldo;

  public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
    this.numeroConta = numeroConta;
    this.numeroAgencia = numeroAgencia;
    this.nome = nome;
    this.saldo = saldo;
  }

  public void realizarDeposito(float x) {
    this.saldo += x;
  }

  public void realizarSaque(float x) {
    if (x > this.saldo) {
      System.out.println("Saldo insuficiente!");
    } else {
      this.saldo -= x;
    }
  }

  public void dadosCliente() {
    System.out
        .println("Número conta: " + this.numeroConta + ", Nome: " + this.nome + ", Saldo: R$ "
            + String.format("%.2f", this.saldo));
  }

}
