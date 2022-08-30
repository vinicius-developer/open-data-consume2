package open.data.consume.deputados;

import java.util.List;

import com.google.gson.Gson;

import open.data.consume.commom.paginacao.Link;

public class DeserilizarJsonListDeputados {

    ResultadoListaDeputados result;

    public DeserilizarJsonListDeputados(String from) {
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

        List<Link> links = this.result.listaLinks();

        String href = links.get(1).getHref();

        int numberCurrentPage = this.findNumberPage(href) - 1;

        if(numberCurrentPage == 0) {
            return 1;
        }

        return numberCurrentPage;

    }

    public Integer findNumberPage(String href) {

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
