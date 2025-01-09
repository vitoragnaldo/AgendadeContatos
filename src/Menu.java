import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao;

        do {
            System.out.println("\nMenu da Agenda de Contatos:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Listar contatos");
            System.out.println("3. Buscar contato");
            System.out.println("4. Remover contato");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o telefone do contato: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Digite o e-mail do contato: ");
                    String email = scanner.nextLine();

                    Contato novoContato = new Contato(nome, telefone, email);
                    agenda.adicionarContato(novoContato);
                    System.out.println("Contato adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\nLista de Contatos:");
                    agenda.listarContatos();
                    break;

                case 3:
                    System.out.print("Digite o nome do contato que deseja buscar: ");
                    String nomeBusca = scanner.nextLine();
                    agenda.buscarContato(nomeBusca);
                    break;

                case 4:
                    System.out.print("Digite o nome do contato que deseja remover: ");
                    String nomeRemover = scanner.nextLine();
                    if (agenda.removerContato(nomeRemover)) {
                        System.out.println("Contato removido com sucesso!");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo da agenda...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}
