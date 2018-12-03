package advokatparser.demo.controller;

import advokatparser.demo.entity.Advokat;
import advokatparser.demo.service.AdvokatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvokatController {

    @Autowired
    AdvokatService advokatService;

    @PostMapping("/test")
    public void String(@RequestBody String forParse) {

        String newParse = forParse.replace("{", "");
        String parserNavodnik = newParse.replace("\"", "");
        String splitovanAdvokat[] = parserNavodnik.split("},");

        for (int i = 0; i < splitovanAdvokat.length; i++) {
            String test = splitovanAdvokat[i];

            String detaljiAdvokat[] = test.split("\n");
            Advokat advokat = new Advokat();

            for (int j = 0; j < detaljiAdvokat.length; j++) {
                advokat.setPrezime(detaljiAdvokat[2].trim().replace(",",""));
                advokat.setIme(detaljiAdvokat[3].trim().replace(",",""));
                advokat.setAdresa(detaljiAdvokat[4].trim().replace(",",""));
                advokat.setBrojTelefona(detaljiAdvokat[5].trim().replace(",",""));
                advokat.setMail(detaljiAdvokat[6].trim().replace(",",""));
            }
            System.out.println(advokat);
            advokatService.saveAdvokat(advokat);

        }
        System.out.println("********************************");

    }
}
