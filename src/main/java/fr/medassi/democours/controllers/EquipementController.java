package fr.medassi.democours.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import fr.medassi.democours.repositories.EquipementRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/equipements")
public class EquipementController {
    @Autowired
    private EquipementRepository equipementRepository;

    /*
     * @GetMapping
     * public String getEquipements(Model model) {
     * List<Equipement> equipements = equipementRepository.findAll();
     * model.addAttribute("equipements", equipements);
     * return "equipements/liste";
     * }
     */
    @GetMapping
    @ResponseBody
    public String getEquipements() {
        return equipementRepository.findAll().toString();
    }

    @GetMapping("test")
    public String getTest(Model model) {
        model.addAttribute("test", "coucou");
        return "equipements/test";
    }

}
