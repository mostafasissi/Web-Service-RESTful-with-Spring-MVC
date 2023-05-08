package ehtp.mostafa.webservicerest;

import ehtp.mostafa.webservicerest.entities.Compte;
import ehtp.mostafa.webservicerest.entities.TypeCompte;
import ehtp.mostafa.webservicerest.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class WebServiceRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebServiceRestApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompteRepository compteRepository){
        return args -> {
            compteRepository.save(new Compte(null , Math.random()*1956 , new Date() , TypeCompte.EPARGNE ));
            compteRepository.save(new Compte(null , Math.random()*1956 , new Date() , TypeCompte.EPARGNE ));
            compteRepository.save(new Compte(null , Math.random()*1956 , new Date() , TypeCompte.EPARGNE ));
            compteRepository.save(new Compte(null , Math.random()*1956 , new Date() , TypeCompte.EPARGNE ));

            compteRepository.findAll().forEach(compte -> {
                System.out.println(compte.toString());
            });
        };
    }
}
