package com.UserService.payload;

import lombok.*;
import org.springframework.http.HttpStatus;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse {
    private  String massage;
    private  boolean succes;
    private HttpStatus status;

}
