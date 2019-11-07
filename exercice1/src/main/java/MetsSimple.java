import java.util.ArrayList;

public abstract class MetsSimple  {

    public String description;
    private long quantite;
    private long nbCalories;
    private boolean sucre = true;
    private boolean sel = true;

    public String getDescription() {

        return description;
    }
    public boolean estSucre(){
        return sucre;
    }
    public boolean estSale(){
        return sel;
    }

    public long getQuantite() {
        return quantite;
    }
    public long getNbCalories(){
        return nbCalories;
    }

    public boolean estDietetique(){
        return true;
    }
}



