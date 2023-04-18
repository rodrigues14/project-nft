package br.com.startup.projectNFT.user;
import br.com.startup.projectNFT.wallet.WalletDto;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserDto(
        @NotNull
        WalletDto wallet,
        @NotBlank
        @Email
        String email
) {}

