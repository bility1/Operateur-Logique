public class Et extends OperateurBinaire {

    public  Et(Logique expr1,Logique expr2){
        super(expr1,expr2);
    }
    @Override
    public Logique evaluer() {
        Logique vrai = Vrai.vrai();
        Logique faux = Faux.faux();
        Logique indetermine = Indetermine.inderminer();

        if(this.getExpr1().evaluer()==faux || this.getExpr2().evaluer()==faux)
            return faux;

            if(this.getExpr1().evaluer()==indetermine || this.getExpr2().evaluer()==indetermine)
                return indetermine;


       return  vrai;
    }
}
