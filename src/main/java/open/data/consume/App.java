package open.data.consume;

import java.io.IOException;

import open.data.consume.deputados.info.ds.WrapperResultadoInformacaoDeputado;
import open.data.consume.factory.DeputiesFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException
    {

        WrapperResultadoInformacaoDeputado wrapper = new DeputiesFactory()
            .info(204521);


        System.out.println(wrapper.getDeputado().getRedeSocial());

    }
}
