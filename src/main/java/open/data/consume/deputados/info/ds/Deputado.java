package open.data.consume.deputados.info.ds;

import java.util.List;

public class Deputado {

    private String id;

    private String uri;

    private String nomeCivil;

    private UltimoStatus ultimoStatus;

    private String cpf;

    private String sexo;

    private String urlWebsite;

    private List<String> redeSocial;

    private String dataNascimento;

    private String dataFalecimento;

    private String ufNascimento;

    private String municipioNascimento;

    private String escolaridade;

    public String getId() {
        return this.id;
    }

    public String getUri() {
        return this.uri;
    }

    public String getNomeCivil() {
        return this.nomeCivil;
    }

    public UltimoStatus getUltimoStatus() {
        return this.ultimoStatus;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getSexo() {
        return this.sexo;
    }

    public String urlWebsite() {
        return this.urlWebsite;
    }

    public List<String> getRedeSocial() {
        return this.redeSocial;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public String getDataFalecimento() {
        return this.dataFalecimento;
    }

    public String getUfNascimento() {
        return this.ufNascimento;
    }

    public String getMunicipioNascimento() {
        return this.municipioNascimento;
    }

    public String getEscolaridade() {
        return this.escolaridade;
    }

    @Override
    public String toString() {
        return "{id: " + this.id + ", "+
            "uri: " + this.uri + ", "+
            "nomeCivil: " + this.nomeCivil + ", "+
            "ultimoStatus: " + this.ultimoStatus + ", " +
            "cpf: " + this.cpf + ", " + 
            "sexo: " + this.sexo + ", " +
            "urlWebsite: " + this.urlWebsite + ", " +
            "redeSocial: " + this.redeSocial + ", " +
            "dataNascimento: " + this.dataNascimento + ", " +
            "dataFalecimento: " + this.dataFalecimento + ", " +
            "ufNascimento: " + this.ufNascimento + ", " +
            "municipioNascimento: " + this.municipioNascimento + ", " +
            "escolaridade: " + this.escolaridade + "}";
    }

}
