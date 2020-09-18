package br.com.sicredi.simulacao.repository;

import br.com.sicredi.simulacao.entity.Simulacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface SimulacaoRepository extends JpaRepository<Simulacao, Long>, JpaSpecificationExecutor<Simulacao> {

    Optional<Simulacao> findByCpf(@Param("cpf") String cpf);

    Optional<Simulacao> findById(@Param("id") Long id);
}
