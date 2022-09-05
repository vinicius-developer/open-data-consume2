package open.data.consume.factory;

import java.io.IOException;

import open.data.consume.deputados.info.InformacaoDeputados;
import open.data.consume.deputados.info.ds.WrapperResultadoInformacaoDeputado;
import open.data.consume.deputados.lista.ListaDeputados;
import open.data.consume.deputados.lista.ds.WrapperResultadoListaDeputados;
import open.data.consume.http.HttpClientApi;

public class DeputiesFactory {

    public WrapperResultadoListaDeputados list(String parametros) 
            throws IOException, InterruptedException {

        return new ListaDeputados(new HttpClientApi(), parametros)
            .pegar();

    }

    public WrapperResultadoInformacaoDeputado info(Integer id) 
            throws IOException, InterruptedException {
        return new InformacaoDeputados(new HttpClientApi(), id)
            .pegar();
    }
    
}
