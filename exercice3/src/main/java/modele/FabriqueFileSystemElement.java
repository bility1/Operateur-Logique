package modele;

public class FabriqueFileSystemElement {
    public Fichier creer(String nom, String contenu){
        return new Fichier(nom,contenu);
    }
    public LienSymbolique creerLienSymbolique(String nom,FileSystemElement e){
        return new LienSymbolique(nom,e);
    }
    public Repertoire creerUnRepertoire(String nom){
        return new Repertoire(nom);
    }


}
