package open.data.consume.deputados;

import java.io.IOException;

import open.data.consume.deputados.lista.ds.WrapperResultadoListaDeputados;

public interface ApiPort<T> {

    WrapperResultadoListaDeputados pegar() throws IOException, InterruptedException;

}
