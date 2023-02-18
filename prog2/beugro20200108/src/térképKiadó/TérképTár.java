package térképKiadó;

import kartográfia.Térkép;

public interface TérképTár
{
    // hozzáadja a paraméterként megkapott tömbben szereplő térképeket a
// térképtárhoz
    public void hozzáad(Térkép[] térképek);
    // visszaadja a térképtárban található olyan térképek listáját a természetes
// rendezettségük sorrendjében, amelyek névjegyzékében legalább a második
// paraméterként megkapott darabszámú név szerepel; ha az első paraméter igaz,
// akkor csak a tematikus térképeket, ha hamis, akkor mindegyiket
    public java.util.List<Térkép> térképek(boolean csakTematikus, int nevekSzáma);
    // visszaadja a paraméterként megkapott címmel rendelkező térképek névjegyzékeinek
// az unióját lexikografikusan növekvő sorrendben; ügyeljen arra, hogy egy elem
// csak egyszer fordulhat elő a teljes névjegyzékben!
    public java.util.Collection<String> teljesNévjegyzék(String cím);
}