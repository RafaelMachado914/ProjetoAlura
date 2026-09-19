package br.com.alura.Screenmatch.service;

import br.com.alura.Screenmatch.model.dadosSerie;

public interface IConverteDados {

    public <T> T obterDados(String json, Class<T> classe);
}
