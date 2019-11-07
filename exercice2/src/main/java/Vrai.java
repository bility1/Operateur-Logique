public class Vrai implements Logique{
    private final static Vrai instance = new Vrai();

    public static Logique vrai(){
        return instance;
    }


    @Override
    public Logique evaluer() {
        return (this);
    }
}
