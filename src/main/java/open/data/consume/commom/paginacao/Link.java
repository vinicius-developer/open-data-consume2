package open.data.consume.commom.paginacao;

public class Link {

    private final String rel;

    private final String href;

    public Link(String rel, String href) {
        this.rel = rel;
        this.href = href;
    }

    public String getRel() {
        return this.rel;
    }

    public String getHref() {
        return this.href;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\trel: " + this.rel + ", \n" +
                "\thref: " + this.href + " \n"
                + "\n}";
    }

}
