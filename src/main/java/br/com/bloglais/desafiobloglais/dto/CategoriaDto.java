package br.com.bloglais.desafiobloglais.dto;

import br.com.bloglais.desafiobloglais.model.Categoria;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDto {
    @JsonProperty ("codigo_categoria")
    private Integer idCategoria;
    @JsonProperty ("codigo_categoria_pai")
    private Integer idCategoriaPai;
    @JsonProperty ("nome")
    private String nome;
    @JsonProperty ("sub_categorias")
    private List<Categoria> subCategorias;
}
