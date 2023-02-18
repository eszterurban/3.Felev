package őslény;

public interface ŐslényPark
{
    // új őshüllőt vesz fel a parkba
    public void felvesz(Őshüllő őshüllő);
    // visszaadja azoknak a dínóknak a rendezett listáját (a természetes rendezettség
    // sorrendjében), amelyek testhossza legalább a paraméterben megkapott érték
    public java.util.List<Dínó> nagyDínók(double minHossz);
    // visszaadja a parkban található őshüllők számát, ha a paraméter hamis, illetve
    // csak a dínók számát, ha igaz
    public int állatokSzáma(boolean csakDínók);
    // kiírja a megadott állományba az őshüllők listáját (mindegyiket külön sorba)
    public void kiír(String fájlnév);
}