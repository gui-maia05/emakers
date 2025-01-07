package com.br.emakers.api_emakers.data.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record PessoaRequestDTO(

        @NotBlank(message = "O nome é obrigatório.")
        String nome,

        @Pattern(regexp = "00000-000", message = "O cep deve ser no formato 00000-000.")
        @NotBlank(message = "O cep é obrigatório.")
        String cep

) {
}
