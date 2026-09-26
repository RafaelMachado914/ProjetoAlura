package br.com.alura.Screenmatch.model;


import java.time.LocalDate;

public class Episodio {
    private int  temporada;
    private String titulo;
    private int numeroEpsodio;
    private Double avaliacao;
    private LocalDate dataEmissao;

    public Episodio() {
    }

    public Episodio(int numeroTemporada ,dadosEpisodios dadosEpisodio) {
        this.temporada = numeroTemporada;
        this.titulo = dadosEpisodio.titulo();
        try {
            this.avaliacao = Double.valueOf(dadosEpisodio.avaliacao());
        } catch (NumberFormatException e) {
            this.avaliacao = 0.0;
        }

        this.numeroEpsodio = dadosEpisodio.numero();
        this.dataEmissao = LocalDate.parse(dadosEpisodio.dataLancamento());

    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroEpsodio() {
        return numeroEpsodio;
    }

    public void setNumeroEpsodio(int numeroEpsodio) {
        this.numeroEpsodio = numeroEpsodio;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    @Override
    public String toString() {
        return  " temporada = " + temporada +  "\n" +
                " titulo = '" + titulo + "\n" +
                " Numero = " + numeroEpsodio + "\n" +
                " avaliacao = " + avaliacao + "\n" +
                " dataEmissao = " + dataEmissao + "\n"
                ;
    }
}













