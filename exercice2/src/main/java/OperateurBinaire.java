public abstract class OperateurBinaire implements Logique {
    private Logique expr1;
    private Logique expr2;

    public OperateurBinaire(Logique expr1, Logique expr2) {
        this.expr1=expr1;
        this.expr2=expr2;
    }

    Logique getExpr1() {
        return expr1;
    }
 Logique getExpr2(){
        return expr2;
 }
}
