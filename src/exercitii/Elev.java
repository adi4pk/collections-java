package exercitii;

public class Elev {
    private final String nume;
    private final int nota;

    public Elev(String nume, int nota) {
        this.nume = nume;
        this.nota = nota;
    }

    public String getNume() {
        return nume;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return nume + "(" + nota + ")";
    }
}
