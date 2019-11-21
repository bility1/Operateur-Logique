package modele;

import visiteurs.VisiteurFileSystem;
import visiteurs.impl.VisiteurSuppressionFileSystem;

public class Fichier implements FileSystemElement {

    public String getNom() {
        return nom;
    }

    public String getContenu() {
        return contenu;
    }

    private String nom ;
    private String contenu ;

        Fichier(String nom , String contenu){
            this.nom = nom;
            this.contenu = contenu;
        }


    @Override
    public void accept(VisiteurFileSystem visiteur) {
        visiteur.visit(this);
    }
}
