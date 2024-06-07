public class Uczen {
    private String imieUcznia;
    private String nazwiskoUcznia;

    public Uczen(String imieUcznia, String nazwiskoUcznia) {
        this.imieUcznia = imieUcznia;
        this.nazwiskoUcznia = nazwiskoUcznia;
    }

    public String getImieUcznia() {
        return imieUcznia;
    }

    public String getNazwiskoUcznia() {
        return nazwiskoUcznia;
    }



    public void setImieUcznia(String imieUcznia) {
        this.imieUcznia = imieUcznia;
    }

    public void setNazwiskoUcznia(String nazwiskoUcznia) {
        this.nazwiskoUcznia = nazwiskoUcznia;
    }


    @Override
    public String toString() {
        return imieUcznia + " " + nazwiskoUcznia;
    }
}
