package open.data.consume.deputados.lista.ds;

import java.util.List;
import java.util.Optional;

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

        List<Link> links = this.result.listaLinks();

        String href = links.get(links.size() - 1).getHref();

        return this.findNumberPage(href);

    }

    public Integer getCurrentPage() {

        Optional<Link> list = this.result.listaLinks().stream().filter(
            item ->  item.getRel() == "self"
        ).collect(Optional<Link>);

        for (Link link : this.result.listaLinks()) {

            if(link.getRel() == "self") {
            
                int numberCurrentPage = this.findNumberPage(link.getHref()) - 1;
    
                if(numberCurrentPage == 0) {
                    return 1;
                }
    
                return numberCurrentPage;
    
            }
            
        }

    }

    private Integer findNumberPage(String href) {

        Integer startIndex = href.indexOf("&pagina=") + 8;

        this.findNumberPageException(8);

        Integer endIndex = href.substring(startIndex).indexOf("&") + startIndex;

        String param = href.substring(startIndex, endIndex);

        return this.convertPathParamInInteger(param);

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
