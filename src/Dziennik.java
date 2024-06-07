import java.util.ArrayList;

public class Dziennik {
    ArrayList<Uczen> uczniowie = new ArrayList<>();
    ArrayList<Klasa> klasy = new ArrayList<>();
    ArrayList<Przedmiot> przedmioty = new ArrayList<>();
    ArrayList<Ocena> oceny = new ArrayList<>();
    ArrayList<Wydarzenie> wydarzenia = new ArrayList<>();

    public void dodajUcznia(Uczen uczen) {
        uczniowie.add(uczen);
    }
    public void dodajKlase(Klasa klasa){
        klasy.add(klasa);
    }

    public void dodajPrzedmiot(Przedmiot przedmiot){
        przedmioty.add(przedmiot);
    }

    public void wpiszOcene(Uczen uczen, Przedmiot przedmiot,int ocena){
        oceny.add(new Ocena(uczen, przedmiot, ocena));
    }

    public void wyswietlOceny(){
        for (Ocena ocena: oceny){
            System.out.println(ocena);
        }
    }
    public void dodajWydarzenie(Klasa klasa, TypWydarzenia typWydarzenia, Przedmiot nazwaPrzedmiotu, String data){
        wydarzenia.add(new Wydarzenie(klasa, typWydarzenia, nazwaPrzedmiotu, data));
    }
    public void wyswietlWydarzenia(){
        for(Wydarzenie wydarzenie : wydarzenia){
            System.out.println(wydarzenie);
        }
    }


}
