public class Przedmiot {
    public String nazwaPrzedmiotu;

    public Przedmiot(String nazwaPrzedmiotu) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }

    @Override
    public String toString() {
        return nazwaPrzedmiotu;
    }
}
