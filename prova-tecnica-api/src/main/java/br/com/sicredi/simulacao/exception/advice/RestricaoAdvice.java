package br.com.sicredi.simulacao.exception.advice;

import br.com.sicredi.simulacao.dto.MessageDTO;
import br.com.sicredi.simulacao.exception.RestricaoException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RestricaoAdvice {

    @ResponseBody
    @ExceptionHandler(RestricaoException.class)
    @ResponseStatus(HttpStatus.OK)
    MessageDTO restricaoHandlerV1(RestricaoException e) {
        return new MessageDTO(e.getMensagem());
    }
}
