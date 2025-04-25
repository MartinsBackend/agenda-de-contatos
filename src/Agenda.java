import java.util.ArrayList;

public class Agenda {
    private  ArrayList<Contatos>ListContatos;

    public Agenda() {
        ListContatos = new ArrayList<>();
    }
    public void AddContatos (Contatos Contato) {
        ListContatos.add(Contato);
    }
}
