package visiteurs.impl;

import modele.Fichier;
import modele.FileSystemElement;
import modele.LienSymbolique;
import modele.Repertoire;
import visiteurs.VisiteurFileSystem;

public class VisiteurAffichageFileSystem implements VisiteurFileSystem {
    private String parent;
    private String resultat;
    public VisiteurAffichageFileSystem(String parent){
        this.parent = parent;
    }
        @Override
    public void visit(Fichier fichier) {
       this.resultat= this.parent+"/"+fichier.getNom()+"("+fichier.getContenu().length()+")";
    }
    public VisiteurAffichageFileSystem(){

    }

    @Override
    public void visit(LienSymbolique lienSymbolique) {
        VisiteurAffichageFileSystem visiteurAffichageFileSystem = new
                VisiteurAffichageFileSystem(this.parent+lienSymbolique.getNom());
                lienSymbolique.getCible().accept(visiteurAffichageFileSystem );
        this.resultat = this.parent+"/"+lienSymbolique.getNom()+visiteurAffichageFileSystem.getResultat();
    }

    @Override
    public void visit(Repertoire repertoire) {

        if (repertoire.getElement().size() == 0) {
            this.resultat = parent + repertoire.getNom() + "\n";
        } else {
            for (FileSystemElement e : repertoire.getElement()) {
                VisiteurAffichageFileSystem visiteurAffichageFileSystem ="".equals(parent)? new
                        VisiteurAffichageFileSystem(this.parent+repertoire.getNom()):
                        new VisiteurAffichageFileSystem(this.parent+repertoire.getNom()+"/");
                        e.accept(visiteurAffichageFileSystem );
                this.resultat += visiteurAffichageFileSystem.getResultat();
            }

        }
    }
    public String getResultat() {
        return resultat;
    }
}
