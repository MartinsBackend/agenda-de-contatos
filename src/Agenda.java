import java.util.ArrayList;

public class Agenda {
    private  ArrayList<Contatos>ListContatos;

    public Agenda() {
        ListContatos = new ArrayList<>();
    }
    public void AddContatos (Contatos Contato) {
        ListContatos.add(Contato);
    }
    public void ListContatos(){
        for (Contatos Contato : ListContatos){
            System.out.println("Nome: " + Contato.getNome() + "Número: " + Contato.getNumero() + "Gmail: " + Contato.getGmail());
        }
    }
}
