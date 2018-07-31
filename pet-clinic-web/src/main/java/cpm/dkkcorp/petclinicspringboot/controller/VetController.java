package cpm.dkkcorp.petclinicspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"","/vets","/vets/index","/vets/index.html","vets/index.php"})
    public String listOfVet(){
        return "vets/index";
    }
}
