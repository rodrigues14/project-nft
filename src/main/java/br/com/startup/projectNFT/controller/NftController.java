package br.com.startup.projectNFT.controller;
import br.com.startup.projectNFT.nft.NftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nft")
public class NftController {
    /*@Autowired
    private NftRepository nftRepository;*/

    @GetMapping
    public String Hello(){
        return "hello world";
    }

    /*@PostMapping
    public ResponseEntity<Nft> cadastrarNft(@RequestBody Nft nft) {
        Nft novaNft = nftRepository.save(nft);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaNft);
    }*/
}
