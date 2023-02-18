

public abstract class Szenzor {
    private Pozicio pozicio;

    public Szenzor(Pozicio pozicio) {this.pozicio = pozicio;
    }

    public Pozicio getPozicio() {
        return pozicio;
    }

    protected void setPozicio(Pozicio pozicio) {
        if(this.pozicio.x < 0 && this.pozicio.x >150)
        {
            throw new IllegalPositionException();
        }
        else {
            this.pozicio.x = pozicio.x;
        }

        if(this.pozicio.y < 0 && this.pozicio.y >300)
        {
            throw new IllegalPositionException();
        }
        else {
            this.pozicio.y = pozicio.y;
        }
    }


    public abstract boolean isAktiv();

    public abstract String felvetelKeszit() throws SzenzorInaktivException;

    abstract void adatkuldes();

    @Override
    protected abstract Object clone() throws CloneNotSupportedException;

    @Override
    public String toString() {
        return String.format("%s (%d; %d)",
                isAktiv() ? "On" : "Off",
                pozicio.getX(), pozicio.getY());
    }
}