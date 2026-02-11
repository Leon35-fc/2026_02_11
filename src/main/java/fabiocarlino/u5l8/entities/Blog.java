package fabiocarlino.u5l8.entities;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "blogs")
public class Blog {

    @Column
    String categoria;
    @Column
    String titolo;
    @Column
    String cover;
    @Column
    String contenuto;
    @Column
    int minutiTempoLettura;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "", nullable = false)
    private Author author;

    public Blog() {
    }

    public Blog(String categoria, String titolo, String contenuto, int minutiTempoLettura) {
        this.categoria = categoria;
        this.titolo = titolo;
        this.cover = "https://picsum.photos/200/300?random";
        this.contenuto = contenuto;
        this.minutiTempoLettura = minutiTempoLettura;
    }

    public UUID getId() {
        return id;
    }

    public int getMinutiTempoLettura() {
        return minutiTempoLettura;
    }

    public void setMinutiTempoLettura(int minutiTempoLettura) {
        this.minutiTempoLettura = minutiTempoLettura;
    }

    public String getContenuto() {
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "categoria='" + categoria + '\'' +
                ", titolo='" + titolo + '\'' +
                ", cover='" + cover + '\'' +
                ", contenuto='" + contenuto + '\'' +
                ", minutiTempoLettura=" + minutiTempoLettura +
                ", id=" + id +
                ", author=" + author +
                '}';
    }
}
