package open.data.consume.deputados.info;

import open.data.consume.deputados.ApiPort;
import open.data.consume.deputados.info.ds.WrapperResultadoInformacaoDeputado;
import open.data.consume.http.HttpClientApiInterface;

import java.io.IOException;
import java.net.http.HttpResponse;

public class InformacaoDeputados
        implements ApiPort<WrapperResultadoInformacaoDeputado> {

    private Integer id;

    private HttpClientApiInterface http;

    public InformacaoDeputados(HttpClientApiInterface http, Integer id) {
        this.id = id;

        this.http = http;
    }

    @Override
    public WrapperResultadoInformacaoDeputado pegar()
            throws IOException, InterruptedException {
        String path = "/deputados/" + this.id;

        HttpResponse<String> response = this.http.get(path);

        return new WrapperResultadoInformacaoDeputado(response.body());
    }
}
