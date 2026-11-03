package exercitii;

public class Masina {
    private final String marca;
    private final int an;

    public Masina(String marca, int an) {
        this.marca = marca;
        this.an = an;
    }

    public String getMarca() {
        return marca;
    }

    public int getAn() {
        return an;
    }

    @Override
    public String toString() {
        return marca + "(" + an + ")";
    }
}
