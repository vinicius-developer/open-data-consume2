package open.data.consume.deputados.lista.ds;

import java.util.List;


import open.data.consume.commom.paginacao.Link;

class ResultadoListaDeputados {

    private List<Deputado> dados;

    private List<Link> links;

    public List<Deputado> listaDeputados() {
        return this.dados;
    }

    public List<Link> listaLinks() {
        return this.links;
    }

    @Override
    public String toString() {
        return "{dados:" + 
                this.dados +
                "links: " + 
                this.links + "}";
    }
    
}