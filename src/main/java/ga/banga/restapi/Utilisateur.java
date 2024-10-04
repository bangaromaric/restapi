package ga.banga.restapi;


import org.springframework.data.annotation.Id;

public record Utilisateur(@Id Long id, String nom, String prenom) {
}
