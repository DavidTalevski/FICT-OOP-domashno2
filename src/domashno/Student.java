package domashno;

import java.util.ArrayList;
import java.util.List;

public class Student extends Covek{
    private List<Ocenka> ocenki = new ArrayList<>();

    public Student(int godini, String ime, String prezime) {
        this.godini = godini;
        this.ime = ime;
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return "Student: {" +
                "godini=" + godini +
                ", ime='" + ime +
                "', prezime='" + prezime +
                "', ocenki:" + ocenki.toString() + '}';
    }

    public void setOcenka(Ocenka o) {
        this.ocenki.add(o);
    }

    public List<Ocenka> getOcenki(){
        return this.ocenki;
    }

    public float getProsek() {
        int length = this.ocenki.size();
        int sum = 0;
        for (Ocenka ocenka : ocenki){
            sum += ocenka.getOcenka();
        }
        return (float)sum / length;
    }
}
