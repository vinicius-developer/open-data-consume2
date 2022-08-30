package open.data.consume;

import java.io.IOException;

import open.data.consume.deputados.ListaDeputados;
import open.data.consume.http.HttpClientApi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException
    {
        new ListaDeputados(new HttpClientApi(), "?ordem=ASC&ordenarPor=nome")
            .pegar();
    }
}
