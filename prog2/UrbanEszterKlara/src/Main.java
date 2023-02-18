import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Main
{
    static void TelepitSzenzorHalozat(String input, SzenzorHalozat halozat)
    {
        try {
            File file = new File(input);
            Scanner myReader;
            myReader = new Scanner(file);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
            while (myReader.hasNextLine()) {
                String sor = myReader.nextLine();
                Scanner lineReader = new Scanner(sor);
                lineReader.useDelimiter(";");
                if(lineReader.next().equals("F")){
                    halozat.telepit(new FenySzenzor(lineReader.nextInt(),lineReader.nextInt(),
                            LocalTime.parse(lineReader.next(),formatter),LocalTime.parse(lineReader.next(),formatter)));
                }
                else{
                    halozat.telepit(new Mikrofon(lineReader.nextInt(),lineReader.nextInt(),Hangformatum.valueOf(lineReader.next())));
                }
            }
            myReader.close();
        } catch (FileNotFoundException e){
            System.out.println(e);
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        try {
            SzenzorHalozat halozat = new SzenzorHalozat();
            TelepitSzenzorHalozat("szenzorok.csv", halozat);
            for(var e : halozat.aktivSzenzorok()){
                System.out.println(e);
            }
        } catch (FelveteltKeszitException e){
            System.out.println(e);
        } catch (SzenzorInaktivException e){
            System.out.println(e);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}