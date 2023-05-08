package ehtp.mostafa.webservicerest.web;

import ehtp.mostafa.webservicerest.entities.Compte;
import ehtp.mostafa.webservicerest.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/banque")
public class CompteRestControllerAPI {
    @Autowired
    private CompteRepository compteRepository;

    @GetMapping(path = "/comptes" , produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Compte> compteList(){
        return compteRepository.findAll();
    }

    @GetMapping(path = "/comptes/{id}" ,produces = {MediaType.APPLICATION_JSON_VALUE})
    public Compte getOne(@PathVariable Long id){
        return compteRepository.findById(id).get();
    }

    @PostMapping(path = "/comptes" , produces = {MediaType.APPLICATION_JSON_VALUE})
    public Compte save(@RequestBody Compte compte){
        return compteRepository.save(compte);
    }

    @PutMapping(path = "/comptes/{id}" , produces = {MediaType.APPLICATION_JSON_VALUE})
    public Compte update(@RequestBody Compte compte , @PathVariable Long id){
        compte.setId(id);
        return compteRepository.save(compte);
    }
    @DeleteMapping(path = "/comptes/{id}" , produces = {MediaType.APPLICATION_JSON_VALUE})
    public void delete(@PathVariable Long id){
         compteRepository.deleteById(id);
    }
}
