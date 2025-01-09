public class Contato {
    private String nome;
    private String telefone;
    private String email;

    // Construtor
    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método toString para imprimir informações do contato
    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone + ", E-mail: " + email;
    }
}
