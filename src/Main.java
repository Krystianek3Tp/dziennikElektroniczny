import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dziennik dziennik = new Dziennik();

        Klasa klasa3Tp = new Klasa("3Tp");
        Klasa klasa2Tp = new Klasa("2Tp");
        dziennik.dodajKlase(klasa3Tp);
        dziennik.dodajKlase(klasa2Tp);

        dziennik.dodajUcznia(new Uczen("Monika", "Hordyńska"));
        dziennik.dodajUcznia(new Uczen("Krystian", "Hordyński"));
        dziennik.dodajPrzedmiot(new Przedmiot("Tworzenie Aplikacji Desktopowych"));
        dziennik.dodajPrzedmiot(new Przedmiot("Tworzenie Aplikacji Webowych"));

        System.out.println("Zalogowano jako Adam Karczewski \n");

        while(true) {
            System.out.println("Wybierz opcję:");
            System.out.println("1. Wpisz ocenę");
            System.out.println("2. Wyświetl oceny");
            System.out.println("3. Dodaj wydarzenie");
            System.out.println("4. Wyświetl terminarz");
            System.out.println("5. Wyjście");
            int opcja = scanner.nextInt();

            switch (opcja) {
                case 1:
                    System.out.println("Wybierz ucznia:");
                    for (int i = 0; i < dziennik.uczniowie.size(); i++) {
                        System.out.println((i + 1) + ". " + dziennik.uczniowie.get(i));
                    }
                    int ktoryUczen = scanner.nextInt() - 1;

                    System.out.println("Wybierz przedmiot:");
                    for (int i = 0; i < dziennik.przedmioty.size(); i++) {
                        System.out.println((i + 1) + ". " + dziennik.przedmioty.get(i));
                    }
                    int ktoryPrzedmiot = scanner.nextInt() - 1;

                    System.out.println("Wpisz ocenę:");
                    int ocena = scanner.nextInt();

                    dziennik.wpiszOcene(dziennik.uczniowie.get(ktoryUczen), dziennik.przedmioty.get(ktoryPrzedmiot), ocena);
                    break;

                case 2:
                    dziennik.wyswietlOceny();
                    break;
                case 3:
                    System.out.println("Wybierz klasę:");
                    for (int i = 0; i < dziennik.klasy.size(); i++) {
                        System.out.println((i + 1) + ". " + dziennik.klasy.get(i));
                    }
                    int ktoraKlasa = scanner.nextInt() - 1;

                    System.out.println("Wybierz przedmiot:");
                    for (int i = 0; i < dziennik.przedmioty.size(); i++) {
                        System.out.println((i + 1) + ". " + dziennik.przedmioty.get(i));
                    }
                    ktoryPrzedmiot = scanner.nextInt() - 1;

                    System.out.println("Wybierz typ wydarzenia:");
                    System.out.println("1. Sprawdzian");
                    System.out.println("2. Kartkówka");
                    int ktoryTyp = scanner.nextInt();
                    TypWydarzenia typWydarzenia;
                    switch(ktoryTyp){
                        case 1:
                            typWydarzenia = TypWydarzenia.SPRAWDZIAN;
                            break;
                        case 2:
                            typWydarzenia = TypWydarzenia.KARTKÓWKA;
                            break;
                        default:
                            System.out.println("Niepoprawny typ, spróbuj ponownie.");
                            continue;
                    }
                    System.out.println("Wpisz datę:");
                    String data = scanner.next();

                    dziennik.dodajWydarzenie(dziennik.klasy.get(ktoraKlasa), typWydarzenia, dziennik.przedmioty.get(ktoryPrzedmiot), data);
                    break;

                case 4:
                    dziennik.wyswietlWydarzenia();
                    break;
                case 5:
                    System.out.println("Wyjście.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Nieznana wartość. Wpisz ponownie.");
            }
        }
    }
}