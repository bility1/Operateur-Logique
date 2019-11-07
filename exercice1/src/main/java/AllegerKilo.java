import java.util.ArrayList;

public class AllegerKilo {
    private ArrayList<MetsSimple> list;

    public boolean allegerKilo (){
        boolean alK =true;
        for(MetsSimple metsSimple:list){
            if (metsSimple.getNbCalories()>300){
                alK=true;
            }
        }
        return alK;
    }
}


