package br.com.startup.projectNFT.cause;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record CauseDto(
        @NotBlank
        String nome,
        @NotBlank
        String descricao,
        Boolean situacao,
        @NotNull
        Categoria categoria,
        @NotNull
        BigDecimal meta,
        @NotNull
        BigDecimal arrecadado
) {
}
