package pl.javastart.zadanie17;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProduktList {
    private List<Produkt> produkts;

    public ProduktList() {

        produkts = new ArrayList<>();

        produkts.add(new Produkt("Mleko", 3.23, "Artykuly spozywcze"));
        produkts.add(new Produkt("Miotla", 12.50, "Artykuly gospodarstwa domowego"));
        produkts.add(new Produkt("Ksiazka", 35.99, "Inne"));
        produkts.add(new Produkt("Chleb", 2.45, "Artykuly spozywcze"));
        produkts.add(new Produkt("Jojo", 14.50, "Inne"));
    }

    public List<Produkt> getProdukts() {
        return produkts;
    }

    public void addProducts(Produkt produkt) {
        produkts.add(produkt);
    }
}

