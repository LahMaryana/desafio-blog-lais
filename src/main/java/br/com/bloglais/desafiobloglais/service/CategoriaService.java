package br.com.bloglais.desafiobloglais.service;

import br.com.bloglais.desafiobloglais.dto.CategoriaDto;
import br.com.bloglais.desafiobloglais.model.Categoria;
import br.com.bloglais.desafiobloglais.repository.ICategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoriaService {

    private final ICategoriaRepository repository;
    public ResponseEntity<List<CategoriaDto>> consultaTodosCategorias() {

    }

    private CategoriaDto converteModelParaDto (Categoria categoria){
        return CategoriaDto.builder()
                .idCategoria(categoria.getIdCategoria())
                .idCategoriaPai(categoria.getIdCategoriaPai())
                .subCategorias(categoria.getSubCategorias().stream().map(c ->
                   return converteModelParaDto(c))
                        .collect(Collectors.toList()))
                    .build();
    }
}
