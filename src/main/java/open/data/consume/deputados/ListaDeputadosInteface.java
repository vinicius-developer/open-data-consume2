package open.data.consume.deputados;

import java.io.IOException;

public interface ListaDeputadosInteface {

    DeserilizarJsonListDeputados pegar() throws IOException, InterruptedException;

}
