package main.java.lista1;

public class Lista1 {

    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto(1, "Sabonete", "Dove Creme", 10, 3.9f);
        Produto p2 = new Produto(2, "Sabão", "Neutro", 15, 2.5f);

        // exibe os dados
        p1.exibeDados();
        p2.exibeDados();

    }
}
