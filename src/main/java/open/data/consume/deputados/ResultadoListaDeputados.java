package open.data.consume.deputados;

import java.util.List;


import open.data.consume.commom.paginacao.Link;

public class ResultadoListaDeputados {

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
        return "{\n\t dados:" + 
                this.dados +
                "\nlinks: " + 
                this.links +
                "\n}";
    }
    
}