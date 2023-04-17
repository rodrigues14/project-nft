package br.com.startup.projectNFT.controller;
import br.com.startup.projectNFT.cause.CauseRepository;
import br.com.startup.projectNFT.cause.Cause;
import br.com.startup.projectNFT.nft.NftDto;
import org.springframework.http.HttpStatus;
import br.com.startup.projectNFT.nft.Nft;
import br.com.startup.projectNFT.nft.NftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nft")
public class NftController {

    @Autowired
    private NftRepository nftRepository;

    @PostMapping
    public ResponseEntity<Nft> cadastrarNft(@RequestBody Nft nft) {
        Nft novaNft = nftRepository.save(nft);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaNft);
    }

}
