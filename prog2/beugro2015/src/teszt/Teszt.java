package teszt;

import jura.JurassicPark;
import őslény.Dínó;
import őslény.Őshüllő;
import őslény.ŐslényPark;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Teszt {
    public static void main(String[] args) {
        if(args.length < 1){
            throw new IllegalArgumentException("Adja meg a fájl nevét!");
        }
        File file = new File(args[0]);
        List<Őshüllő> oshullok = new ArrayList<>();
        try{
            Scanner olvaso = new Scanner(file);
            Scanner sorOlvaso;
            while(olvaso.hasNextLine()){
                sorOlvaso = new Scanner(olvaso.nextLine());
                sorOlvaso.useDelimiter(";");
                if(sorOlvaso.next().equals("H")){
                    String faj = sorOlvaso.next();
                    String eletter = sorOlvaso.next();
                    boolean novenyevo = false;
                    if(sorOlvaso.hasNext()){
                        if(sorOlvaso.next() == "N"){
                            novenyevo = true;
                        }
                    }
                    oshullok.add(new Őshüllő(faj,eletter,novenyevo));
                }
                else{
                    String faj = sorOlvaso.next();
                    boolean novenyevo = false;
                    if(!sorOlvaso.hasNextDouble()){
                        System.out.println("noveny");
                        if(sorOlvaso.next().equals("N")){
                            novenyevo = true;
                        }
                    }
                    double testhossz = sorOlvaso.nextDouble();
                    int testtomeg = sorOlvaso.nextInt();

                    oshullok.add(new Dínó(faj,novenyevo,testhossz,testtomeg));
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Nincs ilyen fájl!");
            return;
        }
        for (Őshüllő oshullo: oshullok) {
            oshullo.betumeret(1000);
        }
        System.out.println(oshullok);
        String nev = (args.length < 2) ? "Jurassic Park" : args[1];
        JurassicPark dinopark = new JurassicPark(oshullok,nev);
        Scanner billentyu = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy valós számot, tizedesvesszőt haználva:");
        for (Őshüllő hullo:
             dinopark.nagyDínók(billentyu.nextDouble())) {
            System.out.println(hullo);
        }
        System.out.println("Kérem adjon meg egy stringet:");
        nevTartalmaz(oshullok.toArray(new Őshüllő[0]), billentyu.next());
        try{
            nagyDínóFelvesz(dinopark,oshullok);
        }
        catch (NincsDínóException e){
            System.out.println("Nincs dínó a megadott fájlban");
        }
        System.out.println(dinopark);
        System.out.println("Adjon meg 2 egész számot:");
        System.out.println(dinopark.dinokInRange(billentyu.nextInt(),billentyu.nextInt()));
        ŐslényPark[] tomb = {dinopark};
        parkokKiir(tomb);
    }

    public static void nevTartalmaz(Őshüllő[] tomb, String keresett){
        for (Őshüllő hullo:
             tomb) {
            if(hullo.getFaj().contains(keresett)){
                String osztaly = (hullo.getClass() == Dínó.class) ? "Dínó" : "Őshüllő";
                System.out.println(osztaly+" "+hullo);
            }
        }
    }

    public static void nagyDínóFelvesz (ŐslényPark park, List<Őshüllő> lista) throws NincsDínóException{
        int dinokSzama = 0;
        double dinokHossza = 0.0;
        for (Őshüllő hullo:
             lista) {
            if(hullo.getClass() == Dínó.class){
                dinokHossza += ((Dínó) hullo).getTesthossz();
                dinokSzama++;
            }
        }
        if(dinokSzama == 0){
            throw new NincsDínóException("Nincsenek dínok a kollekcióban");
        }
        Double atlagHossz = dinokHossza/dinokSzama;
        for (Őshüllő hullo:
                lista) {
            if(hullo.getClass() == Dínó.class){
                if(((Dínó) hullo).getTesthossz() > atlagHossz){
                    park.felvesz(hullo);
                }
            }
        }
    }

    public static void parkokKiir (ŐslényPark[] tomb){
        int sorszam = 1;
        for (ŐslényPark park:
             tomb) {
            if(park.állatokSzáma(true)*2 > park.állatokSzáma(false)){
                park.kiír("List"+sorszam+".txt");
                sorszam++;
            }
        }
    }
}
