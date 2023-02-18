package ital;

public interface ItalBolt {
    // új italt ad hozzá az italbolthoz
    public void hozzáad(Ital ital);
    // meghatározza az italok összértékét
    public int összÉrték();
    // visszaadja azoknak a szeszesitaloknak a rendezett listáját (a természetes
    // rendezettség sorrendjében), amelyek alkoholtartalma meghaladja a paraméterként
    // megkapott értéket
    public java.util.List<SzeszesItal> erősPiák(double limit);
}
