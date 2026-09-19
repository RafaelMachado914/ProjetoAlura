package br.com.alura.Screenmatch.principal;

import br.com.alura.Screenmatch.model.dadosEpisodios;
import br.com.alura.Screenmatch.model.dadosSerie;
import br.com.alura.Screenmatch.model.dadosTemporada;
import br.com.alura.Screenmatch.service.ConsumoApi;
import br.com.alura.Screenmatch.service.converteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY= "&apikey=522c0f01";
    private ConsumoApi consumo = new ConsumoApi();
    private converteDados conversor = new converteDados();
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu(){
        System.out.println("Informe o nome da série:");
        String nome = scanner.next();
        var json = consumo.obterDados(ENDERECO + nome.replace(" ","+") + API_KEY);
        dadosSerie dados = conversor.obterDados(json, dadosSerie.class);

        System.out.println(dados.toString());

        		System.out.println("Numero de temporadas: " + dados.temporadas());

		List<dadosTemporada> temporadas =new ArrayList<>();

		for (int i = 1; i <= dados.temporadas(); i++) {
			json = consumo.obterDados( ENDERECO + nome.replace(" ","+") +"&season=" + i  + API_KEY);
            dadosTemporada dadosTemporada = conversor.obterDados(json, dadosTemporada.class);
			temporadas.add(dadosTemporada);

		}

		temporadas.forEach(System.out::println);


//        for (int i =0; i < dados.temporadas(); i++) {
//            List<dadosEpisodios> episodiosTemporadas = temporadas.get(i).episodios();
//            for (int j =0; j < episodiosTemporadas.size(); j++) {
//                System.out.println(episodiosTemporadas.get(j).titulo());
//            }
//        }

        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));
    }



}


