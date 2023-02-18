package kartográfia;

import java.util.List;

public class TematikusTérkép extends Térkép{
    String téma;

    public TematikusTérkép(String nev, int arány, List<String> névjegyzék, String téma) {
        super(nev, arány, névjegyzék);
        this.téma = téma;
    }

    @Override
    public boolean nagybetűsít(){
        boolean eredmény = super.nagybetűsít();
        if(téma.substring(0,1).toLowerCase().equals(téma.substring(0,1))){
            téma = téma.substring(0,1).toUpperCase()+téma.substring(1);
            eredmény = true;
        }
        return eredmény;
    }

    @Override
    public String toString() {
        return super.toString()+", "+téma;
    }
}
