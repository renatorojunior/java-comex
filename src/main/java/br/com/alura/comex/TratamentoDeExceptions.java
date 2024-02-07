package br.com.alura.comex;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeExceptions {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        do {
            try {
                System.out.print("Digite um número: ");

                if (reader.hasNextInt()) {
                    int numeroDigitado = reader.nextInt();

                    System.out.println("Número digitado: " + numeroDigitado);
                    break;
                } else {
                    System.out.println("Por favor, digite um número inteiro válido.");
                    reader.next();  // Limpa o buffer do scanner
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                reader.next();  
            }
        } while (true);

        reader.close();
    }
}
