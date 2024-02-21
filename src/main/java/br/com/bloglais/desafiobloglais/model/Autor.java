package br.com.bloglais.desafiobloglais.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_autor")
    private Integer idAutor;

    @Column(name = "nome_autor")
    private String nomeAutor;

    @Column(name = "descricao")
    private String descricao;

    @OneToMany(mappedBy = "autor")
    private List<Postagem> postagem;
}
