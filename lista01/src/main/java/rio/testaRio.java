package main.java.rio;

/*
 *Finalmente, cria uma classe TestaRio, que cria dois Rios (cada um deve utilizar um construtor diferente) e teste os  *métodos criados.
 */

public class testaRio {
  public static void main(String[] args) {
    Rio r1 = new Rio("Rio Pardo", 5, true);
    r1.mostraDados();

    Rio r2 = new Rio();
    r2.nome = "São Framcisco";
    r2.nivel = 10;
    r2.poluido = false;
    r2.mostraDados();
  }
}
