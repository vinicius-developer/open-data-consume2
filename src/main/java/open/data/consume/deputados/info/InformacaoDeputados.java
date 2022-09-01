package open.data.consume.deputados.info;

import open.data.consume.deputados.ApiPort;
import open.data.consume.deputados.info.ds.WrapperResultadoInformacaoDeputado;
import open.data.consume.deputados.lista.ds.WrapperResultadoListaDeputados;

import java.io.IOException;

public class InformacaoDeputados implements ApiPort<WrapperResultadoInformacaoDeputado> {
    @Override
    public WrapperResultadoListaDeputados pegar() throws IOException, InterruptedException {
        return null;
    }
}
