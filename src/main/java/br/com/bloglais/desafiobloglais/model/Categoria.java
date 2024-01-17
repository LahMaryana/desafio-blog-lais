package br.com.bloglais.desafiobloglais.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "id_categorapai")
    private Integer idCategoriaPai;

    @Column(name = "nome")
    private String nome;

    @OneToMany
    private List<Categoria> subCategorias;


}
