package open.data.consume.deputados.lista;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import open.data.consume.deputados.lista.ds.Deputado;
import open.data.consume.deputados.lista.ds.WrapperResultadoListaDeputados;

public class WrapperResultadoListaDeputadosTest {

    private WrapperResultadoListaDeputados result;

    @BeforeEach
    void setUp() {
        String json = "{\"dados\":[{\"id\":204521,\"uri\":\"https://dadosabertos.camara.leg.br/api/v2/deputados/204521\",\"nome\":\"AbouAnni\",\"siglaPartido\":\"UNIÃO\",\"uriPartido\":\"https://dadosabertos.camara.leg.br/api/v2/partidos/38009\",\"siglaUf\":\"SP\",\"idLegislatura\":56,\"urlFoto\":\"https://www.camara.leg.br/internet/deputado/bandep/204521.jpg\",\"email\":null}],\"links\":[{\"rel\":\"self\",\"href\":\"https://dadosabertos.camara.leg.br/api/v2/deputados?pagina=1&itens=1&ordem=ASC&ordenarPor=nome\"},{\"rel\":\"next\",\"href\":\"https://dadosabertos.camara.leg.br/api/v2/deputados?ordem=ASC&ordenarPor=nome&pagina=1&itens=1\"},{\"rel\":\"first\",\"href\":\"https://dadosabertos.camara.leg.br/api/v2/deputados?ordem=ASC&ordenarPor=nome&pagina=1&itens=1\"},{\"rel\":\"last\",\"href\":\"https://dadosabertos.camara.leg.br/api/v2/deputados?ordem=ASC&ordenarPor=nome&pagina=513&itens=1\"}]}";

        this.result = new WrapperResultadoListaDeputados(json);
    }

    @Test
    void verifyAmountDeputados() {
        List<Deputado> deputados = this.result.getListDeputies();

        assertEquals(1, deputados.size());
    }

    @Test
    void verifyLastPage() {
        Integer numberLastPage = this.result.getLastPage();

        assertEquals(513, numberLastPage);
    }

    @Test
    void verifyCurrentPage() {
        Integer currentPage = this.result.getCurrentPage();

        assertEquals(1, currentPage);
    }

    @Test 
    void verifyCurrentPageWhenJustExistOnePage() {
        String json = "{\"dados\":[{\"id\":204521,\"uri\":\"https://dadosabertos.camara.leg.br/api/v2/deputados/204521\",\"nome\":\"AbouAnni\",\"siglaPartido\":\"UNIÃO\",\"uriPartido\":\"https://dadosabertos.camara.leg.br/api/v2/partidos/38009\",\"siglaUf\":\"SP\",\"idLegislatura\":56,\"urlFoto\":\"https://www.camara.leg.br/internet/deputado/bandep/204521.jpg\",\"email\":null}],\"links\":[{\"rel\":\"self\",\"href\":\"https://dadosabertos.camara.leg.br/api/v2/deputados?pagina=1&itens=1&ordem=ASC&ordenarPor=nome\"},{\"rel\":\"next\",\"href\":\"https://dadosabertos.camara.leg.br/api/v2/deputados?ordem=ASC&ordenarPor=nome&pagina=1&itens=1\"},{\"rel\":\"first\",\"href\":\"https://dadosabertos.camara.leg.br/api/v2/deputados?ordem=ASC&ordenarPor=nome&pagina=1&itens=1\"},{\"rel\":\"last\",\"href\":\"https://dadosabertos.camara.leg.br/api/v2/deputados?ordem=ASC&ordenarPor=nome&pagina=1&itens=1\"}]}";

        WrapperResultadoListaDeputados listDeputados = new WrapperResultadoListaDeputados(json);

        Integer currentPage = this.result.getCurrentPage();

        assertEquals(1, currentPage);
    }


}
