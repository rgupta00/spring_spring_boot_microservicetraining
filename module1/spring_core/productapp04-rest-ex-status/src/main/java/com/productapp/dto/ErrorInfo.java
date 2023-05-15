package com.productapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Component dont do that , new op for creating
public class ErrorInfo {
    private String errorMessage;
    private String toContect;
    private String statusCode;
    private LocalDateTime startTime;
}
