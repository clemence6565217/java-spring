package org.esaip.ira32526.demoboot.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service // Indiquer à Spring que c'est un Bean à gérer
public class BavardService {

    private String nom = "Jean-Eudes";

    // méthode @PostConstruct
    @PostConstruct
    private void postConstruct() {
        System.out.println("BavardService OK");
    }

    // return String au lieu du println
    public String parler() {
        return "Bonjour, je suis le service " + this.getClass().getSimpleName() + " et mon nom est " + nom;
    }

    // Getters et Setters
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
}