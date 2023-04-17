package br.com.startup.projectNFT.nft;

import java.math.BigDecimal;

public record NftDto(Long causeId, String causeName, String description, BigDecimal price, boolean sale, String tokenId, String url, String wallet) {

}
