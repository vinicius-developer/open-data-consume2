package open.data.consume.deputados.info.ds;

import com.google.gson.Gson;

public class WrapperResultadoInformacaoDeputado {

    private ResultadoInformacaoDeputado result;

    public WrapperResultadoInformacaoDeputado(String from) {
        this.result =  new Gson().fromJson(from, ResultadoInformacaoDeputado.class);
    }

    public Deputado getDeputado() {
        return this.result.getDeputado();
    }

    @Override
    public String toString() {
        return "{" + this.result + "}";
    }

}
