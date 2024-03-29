package guru.springframework.sfpetclinic.controllers;

import guru.springframework.sfpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners") //Spring shortcut. Compare with VetController
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) { // constructor injection
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/","/index","/index.html"})
    public String listOwners(Model model) {

        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }

    @RequestMapping("/find")
    public String findOwners(){

        return "/notimplemented";
    }
}
