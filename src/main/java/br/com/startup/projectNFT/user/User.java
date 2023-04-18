package br.com.startup.projectNFT.user;
import br.com.startup.projectNFT.wallet.Wallet;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Wallet wallet;

    @Column(nullable = false, unique = true)
    private String email;

    public User(UserDto user) {
        this.wallet = new Wallet(user.wallet());
        this.email = user.email();
    }
}

