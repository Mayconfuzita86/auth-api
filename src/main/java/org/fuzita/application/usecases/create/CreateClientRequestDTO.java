package org.fuzita.application.usecases.create;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateClientRequestDTO {

    @NotBlank(message = "name é obrigatório")
    @Size(max = 100, message = "name deve ter no máximo 100 caracteres")
    private String name;

}
