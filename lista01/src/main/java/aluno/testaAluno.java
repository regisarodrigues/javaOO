package main.java.aluno;

/*
 *• Criar uma classe TestaAluno com o método main() para instanciação da classe Aluno (atribuição das *variáveis de instância com quaisquer valores e chamada dos métodos notaFinal() e dadosAluno()).  
 *• Adicionar o método passou() à classe Aluno a fim de verificar se o aluno passou. Chame o método *passou() na classe TestaAluno a fim de testa-lo.
 */

public class testaAluno {
  public static void main(String[] args) {
    Aluno al1 = new Aluno(1, "Maria", 20, 9, 9);

    al1.dadosAluno();
    al1.notaFinal();
    al1.passou();
  }
}
