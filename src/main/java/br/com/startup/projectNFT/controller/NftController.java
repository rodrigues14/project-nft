package br.com.startup.projectNFT.controller;
import br.com.startup.projectNFT.cause.CauseRepository;
import br.com.startup.projectNFT.cause.Cause;
import br.com.startup.projectNFT.nft.NftDto;
import br.com.startup.projectNFT.user.User;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import br.com.startup.projectNFT.nft.Nft;
import br.com.startup.projectNFT.nft.NftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/nft")
public class NftController {

    @Autowired
    private NftRepository nftRepository;

    @Autowired
    private CauseRepository causeRepository;

    @PostMapping
    @Transactional
    public void cadastrarNft(@RequestBody NftDto nftDto) {
        causeRepository.save(nftDto.cause());
        nftRepository.save(new Nft(nftDto));
    }

    @GetMapping("/listar")
    public List <Nft> getAll() {
        List<Nft> nfts = nftRepository.findAll();
        return nfts;
    }
}
