package ital;

import java.util.Objects;

public class Ital implements Comparable<Ital>{
    protected String megnevezes;
    protected String kiszereles;
    protected int ar;

    public Ital(String megnevezes, String kiszereles, int ar) {
        this.megnevezes = megnevezes;
        this.kiszereles = kiszereles;
        this.ar = ar;
    }

    public void setKiszereles(String kiszereles) {
        this.kiszereles = kiszereles;
    }

    public String getMegnevezes() {
        return megnevezes;
    }

    public String getKiszereles() {
        return kiszereles;
    }

    public int getAr() {
        return ar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ital ital = (Ital) o;
        return Objects.equals(megnevezes, ital.megnevezes) && Objects.equals(kiszereles, ital.kiszereles);
    }

    @Override
    public String toString() {
        return megnevezes + ", " + kiszereles + ", " + ar + "Ft";
    }


    @Override
    public int compareTo(Ital o) {
        if(ar!=o.getAr()){
            return Integer.compare(ar,o.getAr())*-1;
        }
        else if(!megnevezes.equals(o.getMegnevezes())){
            return megnevezes.compareTo(o.getMegnevezes());
        }
        else{
            return kiszereles.compareTo(o.getKiszereles());
        }
    }
}
