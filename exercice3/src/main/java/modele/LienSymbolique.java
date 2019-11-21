package modele;

import visiteurs.VisiteurFileSystem;

public class LienSymbolique implements FileSystemElement {
    private String nom;

    public LienSymbolique(String nom, FileSystemElement e) {
    }

    public FileSystemElement getCible() {
        return cible;
    }

    private FileSystemElement cible;

    public String getNom(){
        return nom;
    }

    @Override
    public void accept(VisiteurFileSystem visiteur) {
        visiteur.visit(this);
    }

}
