package open.data.consume.deputados.info;

import open.data.consume.deputados.ApiPort;
import open.data.consume.deputados.info.ds.WrapperResultadoInformacaoDeputado;
import open.data.consume.deputados.lista.ds.WrapperResultadoListaDeputados;
import open.data.consume.http.HttpClientApiInterface;

import java.io.IOException;
import java.net.http.HttpResponse;

public class InformacaoDeputados
        implements ApiPort<WrapperResultadoInformacaoDeputado> {

    private String parametros;

    private Integer id;

    private HttpClientApiInterface http;

    public InformacaoDeputados(String parametros, Integer id, HttpClientApiInterface http) {
        this.parametros = parametros;

        this.id = id;

        this.http = http;
    }

    @Override
    public WrapperResultadoInformacaoDeputado pegar()
            throws IOException, InterruptedException {
        String path = "/deputados/" + this.id + this.parametros;

        HttpResponse<String> response = this.http.get(path);

        return null;
    }
}
