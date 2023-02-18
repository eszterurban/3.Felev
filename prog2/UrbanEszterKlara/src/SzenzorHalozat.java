import java.util.ArrayList;
import java.util.List;

public class SzenzorHalozat {
    private List<Szenzor> szenzorList = new ArrayList<>();
    void telepit(Szenzor szenzor){szenzorList.add(szenzor);
    }

    List<Szenzor> aktivSzenzorok() throws CloneNotSupportedException {
        List<Szenzor> aktivSzenzorList = new ArrayList<>();
        for (var e : szenzorList){
            if (e.isAktiv()){
                aktivSzenzorList.add((Szenzor) e.clone());
            }
        }
        return aktivSzenzorList;
    }
}
