package open.data.consume;

import java.io.IOException;

import open.data.consume.deputados.lista.ConstrutorDeputadoParametros;
import open.data.consume.deputados.lista.ds.WrapperResultadoListaDeputados;
import open.data.consume.factory.DeputiesFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException
    {

        WrapperResultadoListaDeputados wrapper;
        Integer page = 1;

        do {

            ConstrutorDeputadoParametros constructor = new ConstrutorDeputadoParametros()
                .setNome("Edmundo")
                .setItens(1)
                .setPagina(2);
        
        
            wrapper = new DeputiesFactory()
                .list(constructor.toString());

            System.out.println(wrapper.getListDeputies());

            System.out.println(wrapper.getCurrentPage() + " " +  wrapper.getLastPage() + " page: " + page);

        } while (wrapper.getCurrentPage() <= wrapper.getLastPage());

    }
}
