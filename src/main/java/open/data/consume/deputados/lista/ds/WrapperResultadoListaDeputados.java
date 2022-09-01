package open.data.consume.deputados.lista.ds;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collector;

import com.google.gson.Gson;

import open.data.consume.commom.paginacao.Link;

public class WrapperResultadoListaDeputados {

    ResultadoListaDeputados result;

    public WrapperResultadoListaDeputados(String from) {
        this.result = new Gson().fromJson(from, ResultadoListaDeputados.class);
    }

    public List<Deputado> getListDeputies() {
        return this.result.listaDeputados();
    }

    public Integer getLastPage() {

        Link link = this.getEspecificLinkOfList("last");

        String href = link.getHref();

        return this.findNumberPage(href);

    }

    public Integer getCurrentPage() {

        Link link = this.getEspecificLinkOfList("self");

        int numberCurrentPage;

        try {
            numberCurrentPage = this.findNumberPage(link.getHref());
        } catch (Exception e) {
            numberCurrentPage = 1;
        }

        return numberCurrentPage;
    }

    private Link getEspecificLinkOfList(String name) {
        return this.result.listaLinks()
                .stream()
                .filter(item -> item.getRel().equals(name))
                .findFirst()
                .orElseThrow(() -> new RuntimeException(
                        "nao foi possivel capturar a informação de pagina"
                ));
    }

    private Integer findNumberPage(String href) {

        int startIndex = href.indexOf("&pagina=") + 8;

        this.findNumberPageException(8);

        int endIndex = this.getEndIndex(href, startIndex);

        String param = href.substring(startIndex, endIndex);

        return this.convertPathParamInInteger(param);

    }

    private Integer getEndIndex(String href, Integer startIndex) {

        int endIndex = href.indexOf("&",  startIndex);

        if(endIndex == -1) {
            endIndex = href.length();
        }

        return endIndex;
    }


    private void findNumberPageException(Integer index) {
        if (index == -1) {
            throw new RuntimeException(
                "Link retornado pela API nao possui parametro pagina");
        }
    }

    private Integer convertPathParamInInteger(String param) {

        Integer result = null;

        try {
            result = Integer.parseInt(param);
        } catch (NumberFormatException e) {
            this.convertPathParamException();
        }

        return result;

    }

    private void convertPathParamException() {
        throw new RuntimeException(
                "Nao é possivel formatar o parametro de rota");
    }

}
