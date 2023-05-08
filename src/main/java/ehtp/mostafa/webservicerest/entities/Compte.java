package ehtp.mostafa.webservicerest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double sold ;
    @Temporal(TemporalType.DATE)
    private Date dateCreation ;
    @Enumerated(EnumType.ORDINAL)
    private TypeCompte type ;
}
