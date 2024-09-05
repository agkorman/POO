package Guias.Guia4.EJ5_HTML;

public class FormatText implements HTMLText {

    private final HTMLText element;
    private final String format;

    public FormatText(HTMLText elem, String format) {
        this.element = elem;
        this.format = format;
    }

    @Override
    public String source() {
        return "<%s>%s<%s>".formatted(format, element.source(), format);
    }

    @Override
    public String toString() {
        return source();
    }
}
