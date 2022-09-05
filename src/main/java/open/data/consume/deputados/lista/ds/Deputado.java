package open.data.consume.deputados.lista.ds;

public class Deputado { 
    
    private String email;
    
    private Integer id;

    private String nome;

    private String siglaUf;

    private String uri;

    private String uriPartido;

    private String urlFoto;

    private Integer idLegislatura;

    public String getEmail() {
        return this.email;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getIdlegislatura() {
        return this.idLegislatura;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSiglaUf() {
        return this.siglaUf;
    }

    public String getUri() {
        return this.uri;
    }

    public String getUriPartido() {
        return this.uriPartido;
    }

    public String getUriFoto() {
        return this.urlFoto;
    }

    @Override
    public String toString() {
        return "{" +
            "email: " + this.email + ", " +
            "id: " + this.id + ", " +
            "idLegislatura: " + this.idLegislatura + ", " +
            "nome: " + this.nome + ", " +
            "siglaUf: " + this.siglaUf + ", " +
            "uri: " + this.uri + ", " +
            "uriPartido: " + this.uriPartido + ", " +
            "urlFoto: " + this.urlFoto + "}";
    }

}
