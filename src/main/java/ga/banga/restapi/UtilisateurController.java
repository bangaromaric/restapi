package ga.banga.restapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/utilisateurs")
public class UtilisateurController {

    private final UtilisateurRepository utilisateurRepository;

    public UtilisateurController(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @GetMapping("/{id}")
    private ResponseEntity<Utilisateur> findById(@PathVariable Long id) {
//        Utilisateur utilisateur = new Utilisateur(id,"KOUMBA", "KOUMBA");
//        return ResponseEntity.ok(utilisateur);

        Optional<Utilisateur> utilisateurOptional = utilisateurRepository.findById(id);
        if (utilisateurOptional.isPresent()) {
            return ResponseEntity.ok(utilisateurOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
