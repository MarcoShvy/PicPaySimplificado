package com.Marco.PicPaySimplificado.infra;

import com.Marco.PicPaySimplificado.dtos.ExeceptionDTO;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity threatDuplicateEntry(DataIntegrityViolationException exception) {
        ExeceptionDTO execeptionDTO = new ExeceptionDTO("Usuario ja cadastrado", "400");
        return ResponseEntity.badRequest().body(execeptionDTO);
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity threatDuplicateEntry(EntityNotFoundException exception) {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity threatGeneralExceptions(EntityNotFoundException exception) {
        ExeceptionDTO execeptionDTO = new ExeceptionDTO(exception.getMessage(), "500");
        return ResponseEntity.internalServerError().body(execeptionDTO);
    }
}
