package com.unicesumar.adsis4s2021.doZero.base;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class RegistroJaExistente extends RuntimeException {

}
