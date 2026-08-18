package com.example.dakiplataformas.model;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RefreshRequest {

    private String refreshToken;

}
