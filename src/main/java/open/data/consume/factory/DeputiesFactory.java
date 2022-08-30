package open.data.consume.factory;

import java.io.IOException;

import open.data.consume.deputados.lista.ListaDeputados;
import open.data.consume.deputados.lista.ds.WrapperResultadoListaDeputados;
import open.data.consume.http.HttpClientApi;

public class DeputiesFactory {

    public WrapperResultadoListaDeputados list(String parametros) 
            throws IOException, InterruptedException {

        return new ListaDeputados(new HttpClientApi(), parametros)
            .pegar();

    }
    
}
