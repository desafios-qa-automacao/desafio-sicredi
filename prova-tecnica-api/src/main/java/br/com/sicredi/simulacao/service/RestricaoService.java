package br.com.sicredi.simulacao.service;

import br.com.sicredi.simulacao.entity.Restricao;

import java.util.Optional;

public interface RestricaoService {

    Restricao save(Restricao restricao);
    Optional<Restricao> findByCpf(String cpf);

}
