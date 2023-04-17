package br.com.startup.projectNFT.controller;
import br.com.startup.projectNFT.cause.Cause;
import br.com.startup.projectNFT.cause.CauseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cause")
public class CauseController {

    @Autowired
    private CauseRepository causeRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Cause> getById(@PathVariable Long id) {
        Optional<Cause> cause = causeRepository.findById(id);
        return cause.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Cause> create(@RequestBody Cause cause) {
        Cause savedCause = causeRepository.save(cause);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCause);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cause> update(@PathVariable Long id, @RequestBody Cause cause) {
        Optional<Cause> existingCause = causeRepository.findById(id);
        if (existingCause.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        cause.setId(id);
        Cause updatedCause = causeRepository.save(cause);
        return ResponseEntity.ok(updatedCause);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Optional<Cause> cause = causeRepository.findById(id);
        if (cause.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        causeRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping
    public ResponseEntity<List<Cause>> getAll() {
        List<Cause> causes = causeRepository.findAll();
        return ResponseEntity.ok(causes);
    }
}
