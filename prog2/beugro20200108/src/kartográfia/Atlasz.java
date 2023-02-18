package kartográfia;

import térképKiadó.TérképTár;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Atlasz implements TérképTár {
    private List<Térkép> térképek = new ArrayList<>();
    private String név;

    public Atlasz(List<Térkép> térképek, String név) {
        this.térképek.addAll(térképek);
        this.név = név;
    }

    @Override
    public void hozzáad(Térkép[] térképek) {

    }

    @Override
    public List<Térkép> térképek(boolean csakTematikus, int nevekSzáma) {
        return null;
    }

    @Override
    public Collection<String> teljesNévjegyzék(String cím) {
        return null;
    }
}
