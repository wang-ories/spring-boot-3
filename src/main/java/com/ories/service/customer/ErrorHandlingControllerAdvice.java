package com.ories.service.customer;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandlingControllerAdvice {

    @ExceptionHandler
    public ProblemDetail handleIllegalStateException(IllegalStateException exception){
        var pd = ProblemDetail.forStatus(HttpStatusCode.valueOf(404));
        pd.setDetail("the name must start with capital letter");
        return pd;
    }

}
