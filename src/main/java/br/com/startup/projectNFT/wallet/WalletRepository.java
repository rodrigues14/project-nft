package br.com.startup.projectNFT.wallet;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {
    //busca uma carteira pelo seu identificador público
    Optional<Wallet> findByPublicKey(String publicKey);

   //verifica se uma carteira com o identificador público informado já existe no banco de dados
    boolean existsByPublicKey(String publicKey);
}
