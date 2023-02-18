package teszt;

import ital.Ital;
import ital.SzeszesItal;
import vendeglatas.Kocsma;
import vendeglatas.NincsElégPiaException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Teszt {
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Nem adta meg a beolvasandó fájl nevét.");
            return;
        }
        List<Ital> italok = new ArrayList<>();
        File fajl = new File(args[0]);
        try{
            Scanner bemenet = new Scanner(fajl);
            while (bemenet.hasNextLine()){
                Scanner sorOlvaso = new Scanner(bemenet.nextLine());
                sorOlvaso.useDelimiter(";");
                String nev = sorOlvaso.next();
                String kiszereles = sorOlvaso.next();
                int ar = sorOlvaso.nextInt();
                if(sorOlvaso.hasNextDouble()){
                    italok.add(new SzeszesItal(nev,kiszereles,ar, sorOlvaso.nextDouble()));
                }
                else{
                    italok.add(new Ital(nev,kiszereles,ar));
                }

            }
        }
        catch (FileNotFoundException e){
            System.out.println("Nincs ilyen nevű fájl");
        }
        Collections.sort(italok);
        System.out.println(italok);

        String kocsmanev = "Egyetemi Büfike";
        if(args.length > 1){
            kocsmanev = args[1];
        }
        Kocsma kocsma = new Kocsma(kocsmanev,italok);
        Scanner konzol = new Scanner(System.in);
        for (SzeszesItal ital:
             kocsma.erősPiák(konzol.nextDouble())) {
            System.out.println(ital);
        }
        if(!kiszerelesek(italok,konzol.next(),konzol.next())){
            System.out.println("Nincs ilyen nevű ital!");
        }

        System.out.println(hosszunevuek(italok.toArray(Ital[]::new)));

        try{
            System.out.println(kocsma.atlagAr(true));
        }
        catch (NincsElégPiaException e){
            System.out.println("Nincs elég pia!");
        }

        kocsma.otliter();
        System.out.println(kocsma);


        System.out.println(kocsmakOssz(new Kocsma[]{kocsma}));
    }

    public static boolean kiszerelesek(List<Ital> italok, String italnev, String filenev){
        boolean voltBenne = false;
        try{
            FileWriter iro = new FileWriter(filenev);
            for (Ital ital:
                    italok) {
                if(ital.getMegnevezes().equals(italnev)){
                    voltBenne = true;
                    iro.write(ital.getKiszereles()+"\n");
                }
            }
            iro.close();
        }
        catch (IOException e){
            System.out.println("Rossz fajlnev");
        }
        return voltBenne;
    }

    public static HashSet<SzeszesItal> hosszunevuek(Ital[] italok){
        HashSet<SzeszesItal> visszateres = new HashSet<>();
        for (Ital ital:
                italok) {
            if (ital instanceof SzeszesItal) {
                SzeszesItal szeszesItal = (SzeszesItal) ital;
                if (szeszesItal.getMegnevezes().length() > 10) {
                    visszateres.add(szeszesItal);
                }
            }
        }
        return visszateres;
    }

    public static int kocsmakOssz(Kocsma[] kocsmak){
        int osszertek = 0;
        for (Kocsma kocsma:
             kocsmak) {
            osszertek+=kocsma.összÉrték();
        }
        return osszertek;
    }
}
