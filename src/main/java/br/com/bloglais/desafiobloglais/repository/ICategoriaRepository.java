package br.com.bloglais.desafiobloglais.repository;

import br.com.bloglais.desafiobloglais.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoriaRepository extends JpaRepository<Categoria, Integer> {
}
