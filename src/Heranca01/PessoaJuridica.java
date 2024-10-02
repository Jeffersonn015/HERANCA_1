package Heranca01;

//subclasse PessoaJuridica herdando de Pessoas
class PessoaJuridica extends Pessoas {
	private String cnpj; // CNPJ é um atributo específico da pessoa juridica
 
 // Construtor da subclasse que utiliza o construtor da superclasse
	public PessoaJuridica(String nome, String cnpj, String endereco, String email) {
		super(nome, endereco, email); // Chama o construtor da superclasse para inicializar os atributos comuns
		this.cnpj = cnpj; // Inicializa o atributo CNPJ da pessoa jurídica
	}

 // Método para obter o CNPJ da pessoa jurídica
	public String getCnpj() {
		return cnpj;
	 }
}
