package ehtp.mostafa.webservicerest.repositories;

import ehtp.mostafa.webservicerest.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte , Long> {
}
