package Heranca01;

//Classe Funcionario herdando de Pessoas
class Funcionario extends Pessoas {
	private String cpf; // CPF é um atributo que se repete na PessoaFisica mas nao é possivel chamar pois não é herdado
	private double salario; // Salário é um atributo específico dessa subclasse

 // Construtor da subclasse que utiliza o construtor da superclasse
	public Funcionario(String nome, String cpf, String endereco, double salario) {
		super(nome, endereco, null); // Chama o construtor da superclasse, e o email não é necessário aqui, então coloca NULL
		this.cpf = cpf; // Inicializa o atributo CPF do funcionário
		this.salario = salario; // Inicializa o atributo salário do funcionário
	}

 // metodo para chamr o CPF do funcionário
	public String getCpf() {
		return cpf;
	}

 // Metodo para chamar o salário do funcionário
	public double getSalario() {
		return salario;
	}
}
