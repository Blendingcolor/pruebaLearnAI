package pe.edu.tecsup.learnai.rest.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {

    @Schema(example = "user@gmail.com")
    @NotBlank
    private String email;

    @Schema(example = "user")
    @NotBlank
    private String password;
}