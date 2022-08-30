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
        ConstrutorDeputadoParametros constructor = new ConstrutorDeputadoParametros()
            .setNome("Bolsonaro");

        WrapperResultadoListaDeputados wrapper = new DeputiesFactory()
            .list(constructor.toString());

        System.out.println(wrapper.getListDeputies());
    }
}
