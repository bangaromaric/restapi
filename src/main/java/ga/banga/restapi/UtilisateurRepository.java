package ga.banga.restapi;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {
}
