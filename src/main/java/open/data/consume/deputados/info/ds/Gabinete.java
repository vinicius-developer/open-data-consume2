package open.data.consume.deputados.info.ds;

public class Gabinete {

    private String andar;

    private String email;

    private String nome;

    private String predio;

    private String sala;

    private String telefone;

    public String getAndar() {
        return this.andar;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNome() {
        return this.nome;
    }

    public String getPredio() {
        return this.predio;
    }

    public String getSala() {
        return this.sala;
    }

    public String getTelefone() {
        return this.telefone;
    }

    @Override
    public String toString() {
        return "{andar: " + this.andar + ", " + 
            "email: " + this.email + ", " +
            "nome: " + this.nome + ", " +
            "predio: " + this.predio + ", " +
            "sala: " + this.sala + ", " +
            "telefone: " + this.telefone + "}";
    }

}