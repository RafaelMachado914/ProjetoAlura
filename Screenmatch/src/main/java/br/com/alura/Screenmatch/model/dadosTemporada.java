package br.com.alura.Screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record dadosTemporada(@JsonAlias("Season") int numero,
                             @JsonAlias("Episodes") List<dadosEpisodios> episodios
                             ) {
}
