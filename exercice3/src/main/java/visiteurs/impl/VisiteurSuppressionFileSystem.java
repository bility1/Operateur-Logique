package visiteurs.impl;

import modele.Fichier;
import modele.FileSystemElement;
import modele.LienSymbolique;
import modele.Repertoire;
import visiteurs.VisiteurFileSystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class VisiteurSuppressionFileSystem implements VisiteurFileSystem {
        private String nomCible;
        private Repertoire parent;
        private Collection<FileSystemElement> elementASupprimer;


    public VisiteurSuppressionFileSystem(String nomCible) {
        this.nomCible = nomCible;
        this.elementASupprimer = new ArrayList<>();
    }

    public String getNomCible() {
        return nomCible;
    }

    public Repertoire getParent() {
        return parent;
    }


    @Override
    public void visit(Fichier fichier) {
        if (fichier.getNom().equals((nomCible))){
            this.elementASupprimer.add(fichier);
        }
    }

    @Override
    public void visit(LienSymbolique lienSymbolique) {
            if(lienSymbolique.getNom().equals(nomCible)){
                this.elementASupprimer.add((FileSystemElement) lienSymbolique);
            }
    }

    @Override
    public void visit(Repertoire repertoire) {
            if ( repertoire.getNom().equals(nomCible)){
                this.elementASupprimer.add(repertoire);
            }else {
                if(!repertoire.getNom().equals(nomCible)){
                    for(FileSystemElement e :repertoire.getElement()){
                        VisiteurSuppressionFileSystem v = new VisiteurSuppressionFileSystem(nomCible);
                        e.accept(v);
                        this.elementASupprimer.addAll(v.elementASupprimer);
                    }
                    for (FileSystemElement e: elementASupprimer){
                        repertoire.getElement().remove(e);
                    }
                    this.elementASupprimer.clear();
                }
            }
    }
}
