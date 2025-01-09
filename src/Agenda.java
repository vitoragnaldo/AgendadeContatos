import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    // Adicionar contato
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    // Remover contato
    public boolean removerContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatos.remove(contato);
                return true;
            }
        }
        return false;
    }

    // Listar todos os contatos
    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia!");
        } else {
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }

    // Buscar contato por nome
    public void buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.println(contato);
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }
}
