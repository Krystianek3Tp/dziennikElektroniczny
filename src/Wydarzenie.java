public class Wydarzenie {
    Klasa klasa;
    Przedmiot nazwaPrzedmiotu;
    TypWydarzenia typWydarzenia;
    String data;

    public Wydarzenie(Klasa klasa, TypWydarzenia typWydarzenia, Przedmiot nazwaPrzedmiotu, String data) {
        this.klasa = klasa;
        this.typWydarzenia = typWydarzenia;
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
        this.data = data;
    }

    public TypWydarzenia getWydarzenie() {
        return typWydarzenia;
    }

    public void setWydarzenie(TypWydarzenia typWydarzenia) {
        this.typWydarzenia = typWydarzenia;
    }

    public Przedmiot getNazwaPrzedmiotu() {
        return nazwaPrzedmiotu;
    }

    public void setNazwaPrzedmiotu(Przedmiot nazwaPrzedmiotu) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }

    @Override
    public String toString() {
        return typWydarzenia + " z przedmiotu " + nazwaPrzedmiotu + " dla klasy " + klasa + " w dniu "+ data;
    }
}
