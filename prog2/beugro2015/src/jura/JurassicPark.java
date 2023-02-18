package jura;

import őslény.Dínó;
import őslény.Őshüllő;
import őslény.ŐslényPark;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JurassicPark implements ŐslényPark{

    private List<Őshüllő> oshullok = new ArrayList<>();
    private String nev;

    public JurassicPark(List<Őshüllő> oshullok, String nev){
        this.nev = nev;
        this.oshullok.addAll(oshullok);
    }

    @Override
    public void felvesz(Őshüllő őshüllő) {
        this.oshullok.add(őshüllő);
    }

    @Override
    public List<Dínó> nagyDínók(double minHossz) {
        List<Dínó> result = new ArrayList<>();
        for (Őshüllő oshullo: this.oshullok) {
            if(oshullo.getClass() == Dínó.class){
                Dínó dínó = (Dínó) oshullo;
                if(dínó.getTesthossz() >= minHossz) {
                    result.add(dínó);
                }
            }
        }
        Collections.sort(result);
        return result;
    }

    @Override
    public int állatokSzáma(boolean csakDínók) {
        if(csakDínók){
            List<Dínó> result = new ArrayList<>();
            for (Őshüllő oshullo: this.oshullok) {
                if(oshullo.getClass() == Dínó.class){
                    Dínó dínó = (Dínó) oshullo;
                    result.add(dínó);
                }
            }
            return result.size();
        }
        return this.oshullok.size();
    }

    @Override
    public void kiír(String fájlnév) {
        File file = new File(fájlnév);
        try {
            FileWriter writer = new FileWriter(file);
            for (Őshüllő oshullo: oshullok) {
                writer.write(oshullo.toString()+"\n");
            }
            writer.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public List<String> dinokInRange(int kisebb, int nagyobb){
        if(kisebb > nagyobb){
            int temp = kisebb;
            kisebb = nagyobb;
            nagyobb = temp;
        }
        List<String> visszateres = new ArrayList<>();
        for (Őshüllő oshullo: this.oshullok) {
            if(oshullo.getClass() == Dínó.class && ((Dínó) oshullo).getTesttömeg() > kisebb && ((Dínó) oshullo).getTesttömeg() < nagyobb){
                visszateres.add(oshullo.getFaj());
            }
        }
        return visszateres;
    }

    @Override
    public String toString() {
        String result = nev+"\n\n";
        for (Őshüllő oshullo: oshullok) {
            result += oshullo.toString()+"\n";
        }
        return result;
    }
}
