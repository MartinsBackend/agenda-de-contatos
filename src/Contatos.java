public class Contatos {
    String nome;
    int numero;
    String gmail;

    public Contatos(String nome, int numero, String gmail) {
        this.nome = nome;
        this.numero = numero;
        this.gmail = gmail;
    }

        public String getNome(){
        return nome;
        }

        public int getNumero(){
        return numero;
        }

        public String getGmail() {
            return gmail;
        }
    }

