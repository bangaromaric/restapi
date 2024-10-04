package ga.banga.restapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateurController {
    @GetMapping("/utilisateurs/{id}")
    private ResponseEntity<Utilisateur> findById(@PathVariable Long id) {
        Utilisateur utilisateur = new Utilisateur(id,"KOUMBA", "KOUMBA");
        return ResponseEntity.ok(utilisateur);
    }
}
