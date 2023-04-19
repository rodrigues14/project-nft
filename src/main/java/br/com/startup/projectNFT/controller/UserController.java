package br.com.startup.projectNFT.controller;


import br.com.startup.projectNFT.user.User;
import br.com.startup.projectNFT.user.UserDto;
import br.com.startup.projectNFT.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    //teste
    @Autowired
    private UserRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody UserDto userDto) {
        repository.save(new User(userDto));
    }
}
