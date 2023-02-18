import java.time.LocalDate;
import java.time.LocalTime;

public class Mikrofon extends Szenzor implements IMikrofon{
    private Hangformatum formatum;
    private boolean aktiv;

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }

    @Override
    public String felveteltKeszit() throws FelveteltKeszitException {
        return null;
    }

    @Override
    public Hangformatum getFormatum() {
        return formatum;
    }

    public Mikrofon(int x, int y, Hangformatum formatum) {
        super(new Pozicio(x,y));
        this.formatum = formatum;
    }

    @Override
    public boolean isAktiv() {
        return false;
    }

    @Override
    public String felvetelKeszit() throws SzenzorInaktivException {
        if (!isAktiv()){
            throw new SzenzorInaktivException();
        } else {
            return "x" + super.getPozicio().getX() + "/y" + super.getPozicio().getY() + "(" + LocalDate.now() + "_" + LocalTime.now() + ")" + "." + formatum;
        }
    }

    @Override
    void adatkuldes() {
        System.out.println("Kép mentve: " + felveteltKeszit());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Mikrofon(super.getPozicio().getX(), super.getPozicio().getY(), formatum);
    }

    @Override
    public String toString() {
        return String.format("Mikrofon: %s, Formatum: %s",
                super.toString(), formatum);
    }
}
