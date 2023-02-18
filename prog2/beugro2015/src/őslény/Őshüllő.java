package őslény;

import java.util.Objects;

public class Őshüllő implements Comparable<Őshüllő>{
    protected String faj;
    protected String éllettér;
    protected boolean növényevő;

    public Őshüllő (String faj, String éllettér, boolean növényevő){
        this.faj = faj;
        this.éllettér = éllettér;
        this.növényevő = növényevő;
    }

    public void betumeret(int maxTömeg){
        faj = faj.substring(0,1).toUpperCase()+faj.substring(1).toLowerCase();
    }

    /* A reggeli csoporttal egy másik megoldást mutattam ami a következő:
        public void betumeret(int maxTomeg){
            if(this.getClass() == Dínó.class){
                Dínó dínó = (Dínó) this;
                if(dínó.getTesttomeg() > maxTomeg) {
                    this.faj = this.faj.toUpperCase();
                    return;
                }
            }
            this.faj = this.faj.substring(0,1).toUpperCase()+this.faj.substring(1).toLowerCase();
        }
        Ez ugyan jobban illik a feladat szövegéhez, de az itt használt megoldás sokkal értelmesebb.
    */

    public String getFaj() {
        return faj;
    }

    public String getÉllettér() {
        return éllettér;
    }

    public boolean isNövényevő() {
        return növényevő;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Őshüllő őshüllő = (Őshüllő) o;
        return faj.equals(őshüllő.faj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faj, éllettér, növényevő);
    }

    @Override
    public String toString() {
        String növenyevőString = (növényevő) ? ", növényevő" : "";
        return faj+": "+éllettér+növenyevőString;
    }

    @Override
    public int compareTo(Őshüllő o) {
        return faj.compareTo(o.faj);
    }
}

