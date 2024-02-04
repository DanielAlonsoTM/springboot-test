package TestDanielin.TestDanielin.controllers;

import TestDanielin.TestDanielin.Services.TerminalService;
import TestDanielin.TestDanielin.models.Terminal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "api/v1/terminal")
public class TerminalController {

    @Autowired
    private TerminalService terminalService;

    //    public EcommerceController(EcommerceService ecommerceService){
//        this.ecommerceService = ecommerceService;
//    }
    @GetMapping
    public List<Terminal> getTerminal() {
        return terminalService.getTerminal();
    }

}