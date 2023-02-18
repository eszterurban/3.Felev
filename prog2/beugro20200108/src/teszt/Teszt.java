package teszt;

import kartográfia.TematikusTérkép;
import kartográfia.Térkép;

import java.util.ArrayList;
import java.util.List;

public class Teszt {


    public static void main(String[] args) {
        List<String> teszt = new ArrayList<>();
        teszt.add("aA");
        teszt.add("BB");
        teszt.add("cc");

        TematikusTérkép terkep = new TematikusTérkép("teszt",5,teszt,"aSd");
        System.out.println(terkep);
        terkep.nagybetűsít();
        System.out.println(terkep);
    }
}
