package open.data.consume.deputados.info.ds;

public class UltimoStatus {

    private Integer id;

    private String uri;

    private String nome;

    private String siglaPartido;

    private String uriPartido;

    private String siglaUf;

    private Integer idLegislatura;

    private String urlFoto;

    private String email;

    private String data;

    private String nomeEleitoral;

    private Gabinete gabinete;

    private String situacao;

    private String condicaoEleitoral;

    private String descricaoStatus;

    public Integer getId() {
        return this.id;
    }

    public String getUri() {
        return this.uri;
    }

    public String getNome() {
        return this.nome;
    }    

    public String getSiglaPartido() {
        return this.siglaPartido;
    }

    public String getUriPartido() {
        return this.uriPartido;
    }

    public String getSiglaUf() {
        return this.siglaUf;
    }

    public Integer getIdLegislatura() {
        return this.idLegislatura;
    }

    public String urlFoto() {
        return this.urlFoto;
    }

    public String getEmail() {
        return this.email;
    }

    public String getData() {
        return this.data;
    };

    public String getNomeEleitoral() {
        return this.nomeEleitoral;
    };

    public Gabinete getGabinete() {
        return this.gabinete;
    };

    public String getSituacao() {
        return this.situacao;
    };

    public String getCondicaoEleitoral() {
        return this.condicaoEleitoral;
    };

    public String getDescricaoStatus() {
        return this.descricaoStatus;
    };

    @Override
    public String toString() {
        return "{id: " + this.id + ", " +
            "uri: " + this.uri + ", " +
            "nome: " + this.nome + ", " +
            "siglaPartido: " + this.siglaPartido + ", " +
            "uriPartido: " + this.uriPartido + ", " + 
            "siglaUf: " + this.siglaUf + ", " +
            "idLegislatura: " + this.idLegislatura + ", " +
            "urlFoto: " + this.urlFoto + ", " +
            "email: " + this.email + ", " +
            "data: " + this.data + ", " +
            "nomeEleitoral: " + this.nomeEleitoral + ", " +
            "gabinete: " + this.gabinete + ", " +
            "situacao: " + this.situacao + ", " +
            "condicaoEleitoral: " + this.condicaoEleitoral + ", " +
            "descricaoStatus: " + this.descricaoStatus + "}";
    }
}