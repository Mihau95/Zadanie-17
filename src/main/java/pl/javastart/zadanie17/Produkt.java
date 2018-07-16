package pl.javastart.zadanie17;


public class Produkt {
    private String nazwa;
    private double cena;
    private String kategoria;

    Produkt(String nazwa, double cena, String kategoria){
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
    }
    @Override
    public String toString(){
        return "Nazwa: " + nazwa + "<br>" + "Cena: " + cena + "<br>" + "Kategoria: " + kategoria + "<br>";
    }


}
