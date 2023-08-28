package cliente;

/*
 * c) Criar uma classe Teste para instanciação da classe Cliente como Fulano.
 *  Chamar os métodos realizarDeposito() e realizarSaque()
 * nessa classe para que o saldo seja modificado.
 * Nao se esqueça de importar a classe Cliente na classe Teste.
 *
 * d) Tente acessar as variáveis de instância da classe Cliente sem os métodos get e set.
 * O que acontece?
 */

public class TesteCliente {
  public static void main(String[] args) {
    // cliente 01
    Cliente cl1 = new Cliente("12345-78", "1234-6", "Fulano", 500);
    cl1.realizarDeposito(150);
    cl1.realizarSaque(230);
    System.out.println(cl1.dadosCliente());

    // cliente 02
    Cliente cl2 = new Cliente("1234578", "12346", "Beltrano", 150);
    cl2.realizarDeposito(150);
    cl2.realizarSaque(330);
    System.out.println(cl2.dadosCliente());
  }
}
