package br.com.sicredi.simulacao.exception;

public class SimulacaoException extends RuntimeException {

    private final String mensagem;

    public SimulacaoException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    @Override
    public String toString() {
        return mensagem;

    }
}
