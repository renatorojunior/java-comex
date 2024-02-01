package br.com.alura.comex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URISyntaxException;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        // Instanciando um objeto Produto
        Produto produto1 = new Produto("Guitarra Stratocaster - Fender", "Guitarra Elétrica.", 8500.00, 2);

        // Apresentando as propriedades no console
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Descrição: " + produto1.getDescricao());
        System.out.println("Preço Unitário: R$" + produto1.getPrecoUnitario());
        System.out.println("Quantidade: " + produto1.getQuantidade());
    }
}