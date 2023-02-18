package kartográfia;

import java.util.List;
import java.util.Objects;

public class Térkép implements Comparable<Térkép>{
    protected String nev;
    protected int arány;
    protected List<String> névjegyzék;

    public Térkép(String nev, int arány, List<String> névjegyzék) {
        if(arány <= 0){
            throw new IllegalArgumentException("Hibás méretarány!");
        }
        this.nev = nev;
        this.arány = arány;
        this.névjegyzék = névjegyzék;
    }

    public boolean nagybetűsít() {
        boolean eredmény = false;
        for (int i = 0; i < névjegyzék.size(); i++) {
            if(névjegyzék.get(i).substring(0,1).toLowerCase().equals(névjegyzék.get(i).substring(0,1))){
                eredmény = true;
                névjegyzék.set(i,névjegyzék.get(i).substring(0,1).toUpperCase()+névjegyzék.get(i).substring(1));

            }
        }

        return eredmény;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Térkép térkép = (Térkép) o;
        return arány == térkép.arány && Objects.equals(nev, térkép.nev);
    }

    @Override
    public String toString() {
        return String.format("%s, 1:%d %s",nev,arány,String.join(", ",névjegyzék));
    }

    @Override
    public int compareTo(Térkép o) {
        if(!nev.equals(o.nev)){
            return nev.compareTo(o.nev);
        }
        else if(arány!=o.arány){
            return Integer.compare(arány,o.arány);
        }
        else{
            return Integer.compare(névjegyzék.size(),o.névjegyzék.size());
        }
    }
}
