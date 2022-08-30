package open.data.consume.deputados;

import java.net.http.HttpResponse;
import java.io.IOException;

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
    public DeserilizarJsonListDeputados pegar() throws IOException, InterruptedException {
        String path = this.rota + this.parametros;

        HttpResponse<String> response = this.httpClient.get(path);

        DeserilizarJsonListDeputados result = new DeserilizarJsonListDeputados(response.body());

        System.out.println(result.getCurrentPage());
        return result;

    }
    
}
