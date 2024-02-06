package br.com.alura.comex;

public class Eletronico extends Produto {
    private int voltagem;
    private int potencia;

    public Eletronico(String nome, String descricao, double precoUnitario, int quantidade, int voltagem, int potencia) {
        super(nome, descricao, precoUnitario, quantidade);
        this.voltagem = voltagem;
        this.potencia = potencia;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public void imprimirDadosDoProduto() {
        super.imprimirDadosDoProduto();
        System.out.println(":: Voltagem: " + voltagem);
        System.out.println(":: Potência: " + potencia);
    }
}
