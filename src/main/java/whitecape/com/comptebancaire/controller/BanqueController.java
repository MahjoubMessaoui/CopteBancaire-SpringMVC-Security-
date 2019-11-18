package whitecape.com.comptebancaire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import whitecape.com.comptebancaire.metier.IBanqueMetier;

@Controller
public class BanqueController {

    private IBanqueMetier iBanqueMetier;

    @RequestMapping("/operations")
    public String index(){
        return "comptes";
    }


}
