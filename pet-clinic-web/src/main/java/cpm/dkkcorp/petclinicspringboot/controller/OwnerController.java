package cpm.dkkcorp.petclinicspringboot.controller;

import cpm.dkkcorp.petclinicspringboot.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/owners","/owners/index","/owners/index.html","owners/index.php"})
    public String listOfOwner(Model model){

        model.addAttribute("owners",ownerService.findAll());
        model.addAttribute("theOwner",ownerService.findById(1L));
        return "owners/index";
    }

    @RequestMapping({"","/owners/find","/owners/find","/owners/find.html","owners/find.php","/oups"})
    public String findOwners(Model model){

        return "notImplemented";
    }
}
