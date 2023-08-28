package cliente;

/*
 * a) Crie uma classe em Java chamada Cliente contendo as variáveis de instância private numeroConta (String),
 *  numeroAgencia (String), nome (String) e saldo (float), e os métodos getters e setters para todas as variáveis
 * privadas. Para a criação dos métodos setters, o número da conta deve obrigatoriamente ter tamanho 8,
 * contando o traço  do dígito verificador. O número da agência deve ter tamanho 6,
 * também contando o traço do dígito verificador.
 * Verificar em ambos os casos a presença do dígito verificador.
 * O nome do cliente não pode ultrapassar 30 caracteres.
 * O saldo da conta não pode ficar negativo;
 *
 * b) Crie os métodos public  realizarDeposito() e realizarSaque() que, realizam depósito e saque, respectivamente,
 * na conta do cliente. Crie um outro método public para imprimir o numero da conta, número da agencia, nome do
 * cliente e saldo atual. Crie um método construtor para inicialização das variáveis quando um objeto da classe
 * for criado. Forneça um construtor sem argumento com valores default caso nenhum inicializador seja fornecido;
 */

public class Cliente {
  private String numeroConta;
  private String numeroAgencia;
  private String nome;
  private float saldo;

  public Cliente() {
  }

  public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
    setNumeroConta(numeroConta);
    setNumeroAgencia(numeroAgencia);
    setNome(nome);
    setSaldo(saldo);
  }

  public String getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(String numeroConta) {
    if (numeroConta.length() == 8 && numeroConta.contains("-")) {
      this.numeroConta = numeroConta;
    } else {
      this.numeroConta = "0";
      System.out.println("Número da conta inválido, foi atribuido 0.");
    }
  }

  public String getNumeroAgencia() {
    return numeroAgencia;
  }

  public void setNumeroAgencia(String numeroAgencia) {
    if (numeroAgencia.length() == 6 && numeroAgencia.contains("-")) {
      this.numeroAgencia = numeroAgencia;
    } else {
      this.numeroAgencia = "0";
      System.out.println("Número da agência inválido, foi atribuido 0.");
    }
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    if (nome.length() >= 3 && nome.length() <= 30) {
      this.nome = nome;
    } else {
      System.out.println("Nome do cliente deve conter de 3 à 30 caracteres.");
    }
  }

  public float getSaldo() {
    return saldo;
  }

  public void setSaldo(float saldo) {
    if (saldo >= 0) {
      this.saldo = saldo;
    } else {
      this.saldo = 0;
      System.out.println("Valor do saldo inválido, foi atribuido 0.");
    }
  }

  public void realizarDeposito(float deposito) {
    this.saldo += deposito;
  }

  public void realizarSaque(float saque) {
    if (saque <= this.saldo) {
      this.saldo -= saque;
    } else {
      System.out.println("Saldo insuficiente!");
    }
  }

  public String dadosCliente() {
    return "Nome cliente: " + this.nome + "\nNúmero conta: " + this.numeroConta + "\nNúmero agência: "
        + this.numeroAgencia + "\nSaldo: R$ "
        + String.format("%.2f", this.saldo);
  }
}
