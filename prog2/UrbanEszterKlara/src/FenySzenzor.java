import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class FenySzenzor extends Szenzor implements IFenyszenzor{
    LocalTime napKelte;
    LocalTime napNyugta;

    public LocalTime getNapKelte() {
        return napKelte;
    }

    public LocalTime getNapNyugta() {
        return napNyugta;
    }

    public void setNapKelte(LocalTime napKelte) {
        this.napKelte = napKelte;
    }

    public void setNapNyugta(LocalTime napNyugta) {
        this.napNyugta = napNyugta;
    }

    public FenySzenzor(int x, int y, LocalTime napKelte, LocalTime napNyugta) {
        super(new Pozicio(x, y));
        napHosszBeallit(napKelte, napNyugta);
        boolean aktiv = true;
    }

    @Override
    public boolean isAktiv(){
    }

    @Override
    public String felvetelKeszit() throws SzenzorInaktivException {
        return null;
    }

    @Override
    void adatkuldes() {
            System.out.println("A fény intenzitás a(z) (" + super.getPozicio().getX() + ";" + super.getPozicio().getY() + ") pozíción "
                    + LocalDate.now() + " " + LocalTime.now() + " időpontban: " + fenyIntenzitasMer() + "százalék");
        }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new FenySzenzor(super.getPozicio().getX(), super.getPozicio().getY(), this.napKelte, this.napNyugta);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
        return String.format("Feny szenzor: %s, K:%s - Ny:%s",
                super.toString(), napKelte.format(formatter), napNyugta.format(formatter));
    }

    public Random fenyIntenzitasMer() {
        if (!aktiv){
            throw new SzenzorInaktivException();
        } else {
            Random rnd = new Random(0,100);
            return rnd;
        }
    }

    @Override
    public void napHosszBeallit(LocalTime napKelte, LocalTime napNyugta) {
        this.setNapKelte(napKelte);
        this.setNapNyugta(napNyugta);
    }
}
