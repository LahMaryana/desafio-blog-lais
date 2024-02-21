package br.com.bloglais.desafiobloglais.controller;

import br.com.bloglais.desafiobloglais.dto.CategoriaDto;
import br.com.bloglais.desafiobloglais.service.CategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorias")
@RequiredArgsConstructor
public class CategoriaController {
    private final CategoriaService categoriaService;

    @GetMapping("/todos")
    public ResponseEntity <List<CategoriaDto>> consultatodos(){
        return categoriaService.consultaTodosCategorias();

    }
}
