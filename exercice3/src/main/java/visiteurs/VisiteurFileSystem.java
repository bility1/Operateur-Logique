package visiteurs;

import modele.Fichier;
import modele.LienSymbolique;
import modele.Repertoire;

public interface VisiteurFileSystem {
    void visit(Fichier fichier);
    void visit(LienSymbolique lienSymbolique);
    void visit(Repertoire repertoire);
}
