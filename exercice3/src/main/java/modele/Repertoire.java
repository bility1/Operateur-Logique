package modele;

import visiteurs.VisiteurFileSystem;
import visiteurs.impl.VisiteurSuppressionFileSystem;

import java.util.ArrayList;
import java.util.List;

public class Repertoire implements FileSystemElement {
    private String nom;

    public Repertoire(String nom) {
        this.nom = nom;
    }

    public List<FileSystemElement> getElement() {
        return element;
    }
    public void Supprimer(FileSystemElement e){

        this.getElement().remove(e);
    }

    List<FileSystemElement> element;

    public Repertoire(String s, String nom){
        this.nom = nom;
        this.element = new ArrayList<>();
    }
    public void addFileSystemElement(FileSystemElement e){
        this.element.add(e);
    }
    public String getNom(){
        return nom;
    }


    public void supprimer(FileSystemElement e) {
        this.getElement().remove(e);
    }

    @Override
    public void accept(VisiteurFileSystem visiteur) {
        visiteur.visit(this);
    }

}
