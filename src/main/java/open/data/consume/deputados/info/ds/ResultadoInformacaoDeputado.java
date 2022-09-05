package open.data.consume.deputados.info.ds;

import open.data.consume.commom.paginacao.Link;

import java.util.List;

public class ResultadoInformacaoDeputado {

    private Deputado dados;

    private List<Link> links;

    @Override
    public String toString() {
        return "{dados: " + this.dados + ", " +
            "links: " + this.links + "}"; 
    }

    public Deputado getDeputado() {
        return this.dados;
    }

}
