package br.com.alura.comex;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        do {
            System.out.print("Digite um número: ");

            if (reader.hasNextInt()) {
                int numeroDigitado = reader.nextInt();

                System.out.println("Número digitado: " + numeroDigitado);
                break;
            } else {
                System.out.println("Por favor, digite um número inteiro válido.");
                reader.next();
            }
        } while (true);

        reader.close();
    }
}

