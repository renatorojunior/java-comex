package br.com.alura.comex;

public class TesteClienteEndereco {
    public static void main(String[] args) {
        // Criando um endereço
        Endereco enderecoCliente = new Endereco("Centro", "Olímpia", "Apto 23", "SP", "Rua Washington Luiz", 150);

        // Criando um cliente associado ao endereço
        Cliente cliente = new Cliente("Otávio Filipe", "530.542.677-41", "otavio.filipe.lopes@corp.inf.br", "Engenheiro", "(11) 98765-4321", enderecoCliente);

        // Imprimindo os dados do cliente e seu endereço
        System.out.println("Dados do Cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("E-mail: " + cliente.getEmail());
        System.out.println("Profissão: " + cliente.getProfissao());
        System.out.println("Telefone: " + cliente.getTelefone());

        System.out.println("\nEndereço do Cliente:");
        System.out.println("Bairro: " + cliente.getEndereco().getBairro());
        System.out.println("Cidade: " + cliente.getEndereco().getCidade());
        System.out.println("Complemento: " + cliente.getEndereco().getComplemento());
        System.out.println("Estado: " + cliente.getEndereco().getEstado());
        System.out.println("Rua: " + cliente.getEndereco().getRua());
        System.out.println("Número: " + cliente.getEndereco().getNumero());
    }
}
