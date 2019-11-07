import java.util.ArrayList;

public abstract class MetsCompose extends MetsSimple{
    private ArrayList<MetsSimple> list;
    private boolean sucre = true;
    private boolean sel = true;
    private long quantite;
    private long nbCalories;



    public void ajout(MetsSimple metsSimple){
        list.add(metsSimple);
    }
    public void retirer(MetsSimple metsSimple){
        list.remove(metsSimple);
    }

    @Override
    public boolean estSucre() {
        boolean res=true;
        for (MetsSimple metsSimple:list){
            if (metsSimple.estSucre()==false){
                res=false;
            }
        }
    return res;
    }

    public boolean estSale(){boolean res=true;
        for (MetsSimple metsSimple:list){
            if (metsSimple.estSale()==false){
                res=false;
            }
        }
        return res;
    }

    @Override
    public long getQuantite() {
        return quantite;
    }

    @Override
    public long getNbCalories() {
        long kcl=0;
        for(MetsSimple metsSimple:list){

                kcl = kcl+metsSimple.getNbCalories();
            }
    return kcl;
    }



}
