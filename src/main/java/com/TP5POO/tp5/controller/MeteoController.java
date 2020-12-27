package com.TP5POO.tp5.controller;

import com.TP5POO.tp5.model.AdressePart2;
import com.TP5POO.tp5.model.reponseBody;
import com.TP5POO.tp5.model.reponseBodyMeteo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class MeteoController {

    @GetMapping("/adresse")
    public String adresse (Model model ) {
        model.addAttribute("adresse",new AdressePart2());
        return "adresse";
    }

    @PostMapping("/meteo")
    public String CoordGPS(AdressePart2 adressePart2, Model model) {
        model.addAttribute("getadresse",adressePart2.getAdressePart2());
        model.addAttribute("codepostal",adressePart2.getCodePostal());
        String UrlGPS = "https://api-adresse.data.gouv.fr/search/?q=" + adressePart2.getAdressePart2()+"&postcode="+adressePart2.getCodePostal();

        RestTemplate restTemplate = new RestTemplate();
        reponseBody reponse = restTemplate.getForObject( UrlGPS , reponseBody.class);
        double lat = reponse.getFeatures().get(0).getGeometry().getCoordinates().get(1);
        double lon =reponse.getFeatures().get(0).getGeometry().getCoordinates().get(0);
        model.addAttribute("lat", lat);
        model.addAttribute("lon", lon);
        String UrlMeteo="http://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&appid=e57eb90dfb232222ad03e6b3bdaa8bb7&lang=fr&units=metric";
       reponseBodyMeteo reponseMeteo=restTemplate.getForObject(UrlMeteo, reponseBodyMeteo.class);
        model.addAttribute("description", reponseMeteo.getWeather().get(0).getDescription());
        model.addAttribute("temperature",reponseMeteo.getMainResponse().getTemp());
        model.addAttribute("humidite",reponseMeteo.getMainResponse().getHumidity());

        String icone="icons/"+reponseMeteo.getWeather().get(0).getIcon().toString()+".png";
        model.addAttribute("icone",icone);
        return "meteo";
    }
}
