package pl.javastart.zadanie17;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ProduktController {

    private ProduktList produktList;
    private ProduktController produktController;

    public ProduktController(ProduktList produktList) {
        this.produktList = produktList;
    }

    @RequestMapping("/products")
    @ResponseBody
    public String products{
        List<Produkt> products = produktList.getProdukts();
        String result = " ";
        for (Produkt produkt : products){
            result += produkt.toString() + "<br>";
        }
        return result;
    }

    @RequestMapping("/add")
    public String addProdukt(HttpServletRequest request){
        String nazwa = request.getParameter("nazwa");
        String cena = request.getParameter("'cena");
        String kategoria = request.getParameter("kategoria");

        Produkt produkt = new Produkt(nazwa,Integer.parseInt(cena), kategoria);
        produktController.addProdukt(produkt);

        return "redirect:/dodano";
    }
    @RequestMapping("/dodano")
    public String success(){
        return "success.html";
    }

}