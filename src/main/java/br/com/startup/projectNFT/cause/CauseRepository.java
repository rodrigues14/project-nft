package br.com.startup.projectNFT.cause;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CauseRepository extends JpaRepository<Cause, Long> {

    List<Cause> findByCategoria(Categoria categoria);

}
