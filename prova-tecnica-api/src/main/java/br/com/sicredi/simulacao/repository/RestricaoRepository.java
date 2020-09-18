package br.com.sicredi.simulacao.repository;

import br.com.sicredi.simulacao.entity.Restricao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RestricaoRepository extends JpaRepository<Restricao, Long> {

    Optional<Restricao> findByCpf(@Param("cpf") String cpf);

}
