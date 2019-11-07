public class Non extends OperateurUnair {

    @Override
    public Logique evaluer() {
        Logique vrai = Vrai.vrai();
        Logique faux = Faux.faux();
        Logique indetermine = Indetermine.inderminer();

        if(this.getExpr1().evaluer()==vrai )
            return vrai;

        if(this.getExpr1().evaluer()==indetermine )
            return indetermine;


        return  faux;
    }
}
