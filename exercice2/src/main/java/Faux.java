public class Faux implements Logique {
    private final static Faux instance = new Faux();

    public static Logique faux(){
        return instance;
    }


    @Override
    public Logique evaluer() {
        return (this);
    }
}
