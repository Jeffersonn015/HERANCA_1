package Heranca01;

// Superclasse que sera usada para herança
public class Pessoas {
    private String nome;
    private String endereco;
    private String email;
 
    // Construtor da superclasse que inicializa os atributos que vai se repetir nas subclasses
    public Pessoas(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    // Getters para acessar os atributos da superclasse
    public String getNome() {
        return nome; // metodo para chamr o nome da pessoa
    }

    public String getEndereco() {
        return endereco; // metoodo para chamar o endereço da pessoa
    }

    public String getEmail() {
        return email; // metodo para chamr o email da pessoa
    }
}
