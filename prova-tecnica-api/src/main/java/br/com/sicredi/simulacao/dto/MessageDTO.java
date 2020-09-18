package br.com.sicredi.simulacao.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Mensagem v1")
public class MessageDTO {

    @ApiModelProperty(required = true, example = "O CPF 999999999 possui restrição")
    private String mensagem;

    public MessageDTO(String mensagem) {
        this.mensagem = mensagem;
    }

    public MessageDTO(){}

    public String getMensagem() {
        return mensagem;
    }
}
