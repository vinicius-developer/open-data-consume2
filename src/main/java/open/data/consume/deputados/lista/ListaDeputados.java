package open.data.consume.deputados.lista;

import java.net.http.HttpResponse;
import java.io.IOException;

import open.data.consume.deputados.lista.ds.WrapperResultadoListaDeputados;
import open.data.consume.http.HttpClientApiInterface;

public class ListaDeputados implements ListaDeputadosInteface {

    private String parametros;

    private final HttpClientApiInterface httpClient; 

    private final String rota = "/deputados";

    public ListaDeputados(HttpClientApiInterface httpClient, String parametros) {
        this.parametros = parametros;

        this.httpClient = httpClient;
    }

    @Override
    public WrapperResultadoListaDeputados pegar() throws IOException, InterruptedException {
        String path = this.rota + this.parametros;

        HttpResponse<String> response = this.httpClient.get(path);

        return new WrapperResultadoListaDeputados(response.body());
    }

    public void setParametros(String parametros) {
        this.parametros = parametros;
    }
    
}
