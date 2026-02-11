package fabiocarlino.u5l8.payload;

public class BlogPayload {
    private String categoria;
    private String titolo;
    private String contenuto;
    private int minutiTempoLettura;

    public BlogPayload(String categoria, String titolo, String contenuto, int minutiTempoLettura) {
        this.categoria = categoria;
        this.titolo = titolo;
        this.contenuto = contenuto;
        this.minutiTempoLettura = minutiTempoLettura;
    }

    public BlogPayload() {
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getContenuto() {
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    public int getMinutiTempoLettura() {
        return minutiTempoLettura;
    }

    public void setMinutiTempoLettura(int minutiTempoLettura) {
        this.minutiTempoLettura = minutiTempoLettura;
    }

    @Override
    public String toString() {
        return "BlogPayload{" +
                "categoria='" + categoria + '\'' +
                ", titolo='" + titolo + '\'' +
                ", contenuto='" + contenuto + '\'' +
                ", minutiTempoLettura=" + minutiTempoLettura +
                '}';
    }
}
