package cpm.dkkcorp.petclinicspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html","index.php"})
    public String index(){
        return "index";
    }
}
