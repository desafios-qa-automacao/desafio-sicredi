package br.com.sicredi.simulacao.service.impl;

import br.com.sicredi.simulacao.entity.Restricao;
import br.com.sicredi.simulacao.repository.RestricaoRepository;
import br.com.sicredi.simulacao.service.RestricaoService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("restricaoService")
public class RestricaoServiceImpl implements RestricaoService {

    private final RestricaoRepository repository;

    public RestricaoServiceImpl(RestricaoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Restricao save(Restricao restricao) {
        return null;
    }

    public Optional<Restricao> findByCpf(String cpf) {
        return repository.findByCpf(cpf);
    }
}
