package domashno;

public class Main {

    public static void main(String[] args) {
        Student s = new Student(20, "David", "Talevski");
        s.setOcenka(new Ocenka("OOP", "9.11.2020", 7));
        s.setOcenka(new Ocenka("ASP", "1.11.2020", 5));
        s.setOcenka(new Ocenka("AJ", "10.11.2020", 6));
        System.out.println(s.getProsek());
        System.out.println(s.getOcenki());
        System.out.println(s.toString());
    }
}
