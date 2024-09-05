package Guias.Guia4.EJ5_HTML;

public class LinkText implements HTMLText{

    private HTMLText element;
    private String link;

    public LinkText(HTMLText element, String link) {
        this.element = element;
        this.link = link;
    }


    @Override
    public String source() {
        return "<a href:%s>%s</a>".formatted(link, element.source());
    }

    @Override
    public String toString() {
        return source();
    }
}
