package br.com.startup.projectNFT.wallet;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record WalletDto(
        @NotBlank
        String publicKey,
        @NotNull
        BigDecimal balance
){}