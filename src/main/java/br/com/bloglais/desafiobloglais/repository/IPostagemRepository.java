package br.com.bloglais.desafiobloglais.repository;

import br.com.bloglais.desafiobloglais.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostagemRepository extends JpaRepository<Postagem, Integer> {
}
