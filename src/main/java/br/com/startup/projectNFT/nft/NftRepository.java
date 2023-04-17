package br.com.startup.projectNFT.nft;

import br.com.startup.projectNFT.cause.Cause;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NftRepository extends JpaRepository<Nft, Long> {

    List<Nft> findAllBySaleTrueOrderByPriceAsc();

    List<Nft> findAllByCause(Cause cause);

    Optional<Nft> findByTokenId(String tokenId);

    boolean existsByTokenId(String tokenId);
}

