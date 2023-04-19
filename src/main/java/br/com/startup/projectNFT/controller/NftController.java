package br.com.startup.projectNFT.controller;
import br.com.startup.projectNFT.nft.NftDto;
import br.com.startup.projectNFT.nft.Nft;
import br.com.startup.projectNFT.nft.NftRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/nft")
public class NftController {

    @Autowired
    private NftRepository nftRepository;

    @PostMapping
    @Transactional
    public void cadastrarNft(@RequestBody NftDto nftDto) {
        nftRepository.save(new Nft(nftDto));
    }

    @GetMapping("/listar")
    public List <Nft> getAll() {
        List<Nft> nfts = nftRepository.findAll();
        return nfts;
    }
}
