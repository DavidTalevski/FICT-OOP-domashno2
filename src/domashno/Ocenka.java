package domashno;

public class Ocenka {
    private String predmet;
    private String datum;
    private int ocenka;

    public Ocenka(String predmet, String datum, int ocenka) {
        this.predmet = predmet;
        this.datum = datum;
        this.ocenka = ocenka;
    }

    @Override
    public String toString() {
        return "Ocenka: {" +
                "predmet='" + predmet +
                "', datum='" + datum +
                "', ocenka=" + ocenka + '}';
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }


    public void setOcenka(int ocenka) {
        this.ocenka = ocenka;
    }

    public String getPredmet() {
        return this.predmet;
    }

    public String getDatum() {
        return this.datum;
    }

    public int getOcenka() {
        return this.ocenka;
    }
}
