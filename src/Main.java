import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda Magenda = new Agenda();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu número: ");
        int numero = scanner.nextInt();

        System.out.println("Digite seu gmail: ");
        String gmail = scanner.next();

        Contatos contatos = new Contatos(nome, numero, gmail);
        Magenda.AddContatos(contatos);

        System.out.println("Seu contato foi adicionado com sucesso !!");
    }
}
