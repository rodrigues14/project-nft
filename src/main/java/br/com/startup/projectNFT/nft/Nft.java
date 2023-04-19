package br.com.startup.projectNFT.nft;

import br.com.startup.projectNFT.cause.Cause;
import br.com.startup.projectNFT.wallet.Wallet;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Nft {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tokenId;

    @Column(nullable = false)
    private String url;

    @ManyToOne
    private Cause cause;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String wallet;

    @Column(nullable = false)
    private boolean sale;

    public Nft(NftDto nftDto) {
        this.tokenId = nftDto.tokenId();
        this.url = nftDto.url();
        this.cause = new Cause(nftDto.cause());
        this.price = nftDto.price();
        this.description = nftDto.description();
        this.wallet = new Wallet(nftDto.wallet());
        this.sale = nftDto.sale();

    }

}