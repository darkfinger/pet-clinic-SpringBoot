package cpm.dkkcorp.petclinicspringboot.controller;

import cpm.dkkcorp.petclinicspringboot.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }
    @Autowired
    private final VetService vetService;

    @RequestMapping({"","/vets","/vets/index","/vets/index.html","vets/index.php","/vets.html"})
    public String listOfVet(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }
}
