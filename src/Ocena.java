public class Ocena {
    Uczen uczen;
    Przedmiot przedmiot;
    int ocena;

    public Ocena(Uczen uczen, Przedmiot przedmiot, int ocena) {
        this.uczen = uczen;
        this.przedmiot = przedmiot;
        this.ocena = ocena;
    }

    public String toString(){
        return "Uczen: " + uczen + ", Przedmiot: " + przedmiot + ", Ocena: " + ocena;
    }
}
