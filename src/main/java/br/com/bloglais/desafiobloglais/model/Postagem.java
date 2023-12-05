package br.com.bloglais.desafiobloglais.model;

import java.time.LocalDateTime;
import java.util.List;

public class Postagem {

    private Integer idPostagem;
    private String titulo;
    private String conteudo;
    private LocalDateTime data;
    private List<Categoria> categorias;
    private Autor autor;
    private Integer qtdeVisualizacao;

}
