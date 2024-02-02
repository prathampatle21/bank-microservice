package com.pratham.accounts.dto;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
@Schema(
        name = "ErrorResponse",
        description = "Schema to hold error response information"
)
public class ErrorResponseDto {
	
	private  String apiPath;
	
	private HttpStatus errorCode;
	
	private  String errorMessage;
	
	private LocalDateTime errorTime;

}
