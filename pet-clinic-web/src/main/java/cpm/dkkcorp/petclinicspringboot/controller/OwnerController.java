package cpm.dkkcorp.petclinicspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"","/owners","/owners/index","/owners/index.html","owners/index.php"})
    public String listOfVet(){
        return "owners/index";
    }
}
