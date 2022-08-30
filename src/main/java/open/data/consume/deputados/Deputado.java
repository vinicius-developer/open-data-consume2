package open.data.consume.deputados;

public class Deputado implements DeputadosInterface { 
    
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
        return "{\n" +
            "\temail: " + this.email + ", \n" +
            "\tid: " + this.id + ", \n" +
            "\tidLegislatura: " + this.idLegislatura + ", \n" +
            "\tnome: " + this.nome + ", \n" +
            "\tsiglaUf: " + this.siglaUf + ", \n" +
            "\turi: " + this.uri + ", \n" +
            "\turiPartido: " + this.uriPartido + ", \n" +
            "\turlFoto: " + this.urlFoto + " \n" 
        + "\n}";
    }

}
