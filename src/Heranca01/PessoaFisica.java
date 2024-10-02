package Heranca01;

// Classe PessoaFisica herdando de Pessoas atributos que sao comuns e atribuindo um novo
class PessoaFisica extends Pessoas {
    private String cpf; // CPF é um atributo especifico da pessoa física
 
    // Construtor da subclasse que utiliza o construtor da superclasse
    public PessoaFisica(String nome, String cpf, String endereco, String email) {
        super(nome, endereco, email); // Chama o construtor da superclasse para inicializar os atributos comuns
        this.cpf = cpf; // Inicializa o atributo CPF da pessoa física
    }

    // metodo para obter o CPF da pessoa física
    public String getCpf() {
        return cpf;
    }
}
