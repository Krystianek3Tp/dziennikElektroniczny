import java.util.ArrayList;

public class Klasa {
    String nazwa;
    ArrayList<Uczen> uczniowie = new ArrayList<>();

    public Klasa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void dodajUcznia(Uczen uczen) {
        uczniowie.add(uczen);
    }

    @Override
    public String toString() {
        return nazwa;
    }
}
