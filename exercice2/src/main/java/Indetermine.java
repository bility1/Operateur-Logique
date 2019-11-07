public class Indetermine implements Logique {
    private final static Indetermine instance = new Indetermine();

   public static Logique inderminer(){
       return instance;
   }
    @Override
    public Logique evaluer() {
        return (this);
    }
}
