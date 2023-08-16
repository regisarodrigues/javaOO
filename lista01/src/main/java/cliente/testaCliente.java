package main.java.cliente;
/*
 *• Criar uma classe TestaCliente para instanciação da classe Cliente como Fulano. Chamar os métodos *realizarDeposito() e realizarSaque() nessa classe para que o saldo seja modificado  
 *• Criar, também na classe TestaCliente, um outro cliente (Beltrano) e realizar as mesmas atividades *do Fulano. 
 */

public class testaCliente {
  public static void main(String[] args) {
    // cliente 01
    Cliente cl1 = new Cliente(1, 001, "Fulano", 500);
    cl1.realizarDeposito(150);
    cl1.realizarSaque(230);
    cl1.dadosCliente();

    // cliente 02
    Cliente cl2 = new Cliente(1, 001, "Fulano", 50);
    cl2.realizarDeposito(150);
    cl2.realizarSaque(230);
    cl2.dadosCliente();
  }
}
