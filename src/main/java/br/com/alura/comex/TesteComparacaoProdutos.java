package br.com.alura.comex;

public class TesteComparacaoProdutos {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Fender Stratocaster", "Guitarra elétrica", 8500.00, 3);
        Produto produto2 = new Produto("Fender Stratocaster", "Guitarra elétrica", 8500.00, 3);

        if (produto1.equals(produto2)) {
            System.out.println("Os produtos são iguais.");
        } else {
            System.out.println("Os produtos são diferentes.");
        }

        if (produto1 == produto2) {
            System.out.println("As referências dos objetos são as mesmas.");
        } else {
            System.out.println("As referências dos objetos são diferentes.");
        }
    }
}

