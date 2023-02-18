package őslény;

public class Dínó extends Őshüllő{
    private double testhossz;
    private int testtömeg;

    public Dínó(String faj, boolean növényevő, double testhossz, int testtömeg){
        super(faj,"szárazföld",növényevő);
        this.testhossz = testhossz;
        this.testtömeg = testtömeg;
    }

    @Override
    public void betumeret(int maxTömeg){
        if(testtömeg > maxTömeg){
            faj = faj.toUpperCase();
        }
        else{
            faj = faj.substring(0,1).toUpperCase()+faj.substring(1).toLowerCase();
        }
    }

    public double getTesthossz() {
        return testhossz;
    }

    public int getTesttömeg() {
        return testtömeg;
    }

    @Override
    public String toString(){
        String növenyevőString = (növényevő) ? ", növényevő" : "";
        return faj+": "+éllettér+növenyevőString+" ("+testhossz+" m, "+testtömeg+" kg)";
    }
}
