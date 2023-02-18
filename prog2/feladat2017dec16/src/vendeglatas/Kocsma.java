package vendeglatas;

import ital.Ital;
import ital.ItalBolt;
import ital.SzeszesItal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kocsma implements ItalBolt {
    private String nev;
    private List<Ital> italok = new ArrayList<>();

    public Kocsma(String nev, List<Ital> italok) {
        this.nev = nev;
        this.italok.addAll(italok);
    }

    @Override
    public void hozzáad(Ital ital) {
        italok.add(ital);
    }

    @Override
    public int összÉrték() {
        int osszErtek = 0;
        for (Ital ital:
             italok) {
            osszErtek+=ital.getAr();
        }
        return osszErtek;
    }

    @Override
    public List<SzeszesItal> erősPiák(double limit) {
        List<SzeszesItal> visszateres = new ArrayList<>();
        for (Ital ital:
                italok) {
            if(ital instanceof SzeszesItal){
                SzeszesItal szeszesItal = (SzeszesItal) ital;
                if(szeszesItal.getAlkoholtartalom() > limit){
                    visszateres.add(szeszesItal);
                }
            }
        }
        Collections.sort(visszateres);
        return visszateres;
    }

    public double atlagAr(boolean csakSzeszesItalok) throws NincsElégPiaException{
        int darab = 0;
        Double osszAr = 0.0;
        for (Ital ital:
                italok) {
            if(ital instanceof SzeszesItal || !csakSzeszesItalok){
                darab++;
                osszAr+=ital.getAr();
            }
        }
        if (darab == 0){
            throw new NincsElégPiaException("Nincs a megadott típusú ital.");
        }
        return osszAr/darab;
    }

    public void otliter(){
        for (Ital ital:
                italok) {
            if(ital instanceof SzeszesItal && ital.getKiszereles() == "0,5 l"){
                ital.setKiszereles("5 dl");
            }
        }
    }

    @Override
    public String toString() {
        String visszateres = nev+"\n\n";
        for (Ital ital:
                italok) {
            visszateres += ital+"\n";
        }
        return visszateres;
    }
}
