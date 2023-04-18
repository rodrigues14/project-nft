package br.com.startup.projectNFT.nft;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record NftDto(
        @NotNull
        Long causeId,
        @NotBlank
        String causeName,
        @NotBlank
        String description,
        @NotNull
        BigDecimal price,
        @NotNull
        boolean sale,
        @NotBlank
        String tokenId,
        @NotBlank
        String url,
        @NotBlank
        String wallet) {
}
