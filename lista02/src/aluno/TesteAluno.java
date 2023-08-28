package aluno;

/*
 * c) Criar uma classe Teste para instanciação da classe Aluno e chamada dos métodos notaFinal() e dadosAluno()).
 * d) Tente acessar as variáveis de instância da classe Aluno sem os métodos get e set. O que acontece?
 */

public class TesteAluno {
  public static void main(String[] args) {
    Aluno al1 = new Aluno(123456, "Maria", 20, 9, 9);

    System.out.println(al1.dadosAluno());
    al1.notaFinal();
    System.out.println(al1.passou());
  }
}
