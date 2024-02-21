package br.com.bloglais.desafiobloglais.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Postagem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_postagem")
    private Integer idPostagem;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "conteudo")
    private String conteudo;

    @Column(name = "data")
    private LocalDateTime data;

    @OneToMany
    private List<Categoria> categorias;

    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Autor autor;

    @Column(name = "qtde_visualizacao")
    private Integer qtdeVisualizacao;

}
