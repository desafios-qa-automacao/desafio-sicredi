package br.com.sicredi.simulacao.exception;

public class RestricaoException extends RuntimeException {

    private final String mensagem;

    public RestricaoException(String mensagem) {
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
