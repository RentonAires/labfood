package br.com.lagoinha.labfoods.repository;

import br.com.lagoinha.labfoods.entity.Receita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitaRepository extends JpaRepository<Receita, Long> {
    boolean existsByNome(String nome);

}
