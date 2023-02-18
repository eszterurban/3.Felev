package ital;

public class SzeszesItal extends Ital{
    private double alkoholtartalom;

    public SzeszesItal(String megnevezes, String kiszereles, int ar, double alkoholtartalom) {
        super(megnevezes, kiszereles, ar);
        this.alkoholtartalom = alkoholtartalom;
    }

    public double getAlkoholtartalom() {
        return alkoholtartalom;
    }

    @Override
    public String toString() {
        return alkoholtartalom+"% alkoholtartalmú"+ megnevezes + ", " + kiszereles + ", " + ar + "Ft";
    }
}
