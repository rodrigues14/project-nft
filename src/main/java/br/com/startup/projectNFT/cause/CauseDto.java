package br.com.startup.projectNFT.cause;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class CauseDto {
    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotBlank(message = "A descrição é obrigatória")
    private String descricao;

    @NotNull(message = "A situação é obrigatória")
    private Boolean situacao;

    @NotNull(message = "A categoria é obrigatória")
    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    @NotNull(message = "A meta é obrigatória")
    private BigDecimal meta;

    @NotNull(message = "O valor arrecadado é obrigatório")
    private BigDecimal arrecadado;

}
