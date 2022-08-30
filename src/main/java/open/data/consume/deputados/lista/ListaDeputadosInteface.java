package open.data.consume.deputados.lista;

import java.io.IOException;

import open.data.consume.deputados.lista.ds.WrapperResultadoListaDeputados;

public interface ListaDeputadosInteface {

    WrapperResultadoListaDeputados pegar() throws IOException, InterruptedException;

    void setParametros(String parametros);

}
