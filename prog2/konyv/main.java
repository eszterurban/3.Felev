import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class main {
    public boolean logic2 = false;
    protected int asd = 4;
    int num = 4;
    private int number = 5;
    public child gyerek = new child(2,3);

    public static int kerulet(int a, int b){
        return 2*a+2*b;
    }

    public static int terulet(int a, int b){
        return a*b;
    }

    public static void main(String[] args){
        /*boolean logic = true; // 1 byte
        short rovid = 5; // 2 byte
        int number = 1; // 4 byte
        int bigInt = 100_000_000;
        long longNum = 12345678910L; //8 byte
        float lebeg = 12.5f; //4 byte
        double nemegesz = 1.5; // 8 byte
        char karakter = '@'; // 2 byte
        String nev = "Sanyi";
        String szoveg = new String("cucc");
        int [] lista = {1,2,3};
        int [] lista2 = new int[2];
        ArrayList<Integer> list = new ArrayList<>();

        if(logic){
            System.out.println("It's true!");
        }
        else if (2 == 3){
            System.out.println("imposssible");
        }
        else{
            System.out.println(nev);
        }

        for (int i = 0; i < 10; i++){
            System.out.println("This will print 10 times");
            list.add(i);
        }

        System.out.println(list);

        for (int a: list){
            System.out.println(a);
        }

        //Stringek

        String normal = new String("normal");
        String shorthand  = "short";

        System.out.println(shorthand);

        System.out.println(shorthand.charAt(1));

        System.out.println(shorthand.substring(0,5));

        System.out.println(shorthand.toUpperCase());

        System.out.println("GASH".toLowerCase());

        System.out.println("monko".indexOf("boom"));

        System.out.println("monko".lastIndexOf('o'));

        System.out.println("monko".contains("on"));

        System.out.println("  whitespaces everywhere     ".trim());

        System.out.println(shorthand.replace("or","ell"));

        System.out.println(shorthand);

        shorthand = shorthand.replace("or","ell");

        System.out.println(shorthand);

        System.out.println("first "+", second".concat(", third"));

        System.out.println("_".repeat(20));

        System.out.print("line 1 \n line 2 \n" );

        System.out.printf("My age is: %d My name is: %s My height is: %f My favourite letter is: %c",21,"Bence",180.2f,'v');*/

        int aOldal = 4;
        int bOldal = 5;
        System.out.println(kerulet(aOldal,bOldal));
        System.out.println(terulet(aOldal,bOldal));

        Book konyv = new Book("Marchen Madchen",50);

        konyv.setAuthor("asd");
        System.out.println(konyv.getAuthor());

        Book konyv2 = new Book();

        Book konyv3 = new Book();

        System.out.println(Book.getCount());

        System.out.println(konyv);

        Book konyv4 = new Book("Circus",600);

        System.out.println(konyv4);

        System.out.println(konyv3.equals(konyv2));

        System.out.println(konyv.compareTo(konyv2));

        List<Book> konyvek = new ArrayList<>();

        konyvek.add(konyv);
        konyvek.add(konyv2);
        konyvek.add(konyv3);
        konyvek.add(konyv4);

        System.out.println(konyvek);

        Collections.sort(konyvek);

        System.out.println(konyvek);
    }


    
}
