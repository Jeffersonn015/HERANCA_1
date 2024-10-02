package Heranca01;

public class Main {
    public static void main(String[] args) {
    	
        // PessoaFisica
        PessoaFisica pf = new PessoaFisica("Jefferson Oliveira", "123.456.789-10", "Rua Carlinhos, 015", "jefferson@email.com");
        
        //PessoaJuridica
        PessoaJuridica pj = new PessoaJuridica("Empresa InovaMind", "12.345.678/0001-87", "Avenida do Desenvolvedor de Java, 777", "contato@inovamind.com");
        
        //Funcionario
        Funcionario funcionario = new Funcionario("João Pedro", "999.999.999-99", "Rua Avenida Comendador, 1254", 6000.00);

        // Exibi os dados na tela
        System.out.println("Pessoa Física:");
        System.out.println("Nome: " + pf.getNome());
        System.out.println("CPF: " + pf.getCpf());
        System.out.println("Endereço: " + pf.getEndereco());
        System.out.println("Email: " + pf.getEmail());

        System.out.println("\nPessoa Jurídica:");
        System.out.println("Nome: " + pj.getNome());
        System.out.println("CNPJ: " + pj.getCnpj());
        System.out.println("Endereço: " + pj.getEndereco());
        System.out.println("Email: " + pj.getEmail());

        System.out.println("\nFuncionário:"); // \n serve para inserir uma linha vazia entre os espaços
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Endereço: " + funcionario.getEndereco());
        System.out.println("Salário: " + funcionario.getSalario());
    }
}