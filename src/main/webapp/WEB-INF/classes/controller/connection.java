package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/acceuil")
public class connection{
    @RequestMapping(method = RequestMethod.GET)
    public String afficherBonjour(final ModelMap pModel) {
System.out.println("coucou");
        pModel.addAttribute("personne", "Regis");
        return "acceuil";
    }
}//connection