package programme;

import modele.*;
import visiteurs.impl.VisiteurAffichageFileSystem;
import visiteurs.impl.VisiteurSuppressionFileSystem;

public class Main {
    public static void main(String[] args) {
        FabriqueFileSystemElement fabriqueFileSystemElement = new FabriqueFileSystemElement();
        Repertoire racine = fabriqueFileSystemElement.creerUnRepertoire("/");
        Repertoire rep1 = fabriqueFileSystemElement.creerUnRepertoire("rep1");
        Repertoire rep2 = fabriqueFileSystemElement.creerUnRepertoire("rep2");
        Fichier liste = fabriqueFileSystemElement.creer("liste.txt","super... je like le cours");

        Fichier liste1 = fabriqueFileSystemElement.creer("listebis.txt","aieee..... top");

        Repertoire rep3 = fabriqueFileSystemElement.creerUnRepertoire("rep3");

        Fichier liste2 = fabriqueFileSystemElement.creer("listebis.txt","yes showtime");

        LienSymbolique lienSymbolique = fabriqueFileSystemElement.creerLienSymbolique("raccourci",rep2);

        rep1.addFileSystemElement(liste);
        rep2.addFileSystemElement(liste1);
        rep1.addFileSystemElement(rep2);
        rep3.addFileSystemElement(liste2);
        racine.addFileSystemElement(rep1);
        racine.addFileSystemElement(rep2);
        rep3.addFileSystemElement((FileSystemElement) lienSymbolique);


        System.out.println("-------------------------------------------avant---------------------------------");
        VisiteurAffichageFileSystem monVisiteurA = new VisiteurAffichageFileSystem();


        System.out.println("-------------------------------------------apres---------------------------------");

    }
}
