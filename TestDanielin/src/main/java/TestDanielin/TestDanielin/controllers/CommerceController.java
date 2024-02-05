package TestDanielin.TestDanielin.controllers;


import TestDanielin.TestDanielin.services.CommerceService;
import TestDanielin.TestDanielin.models.commerce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "api/v1/ecommerce")
public class CommerceController {

    @Autowired
    private CommerceService commerceService;

//    public EcommerceController(EcommerceService ecommerceService){
//        this.ecommerceService = ecommerceService;
//    }
    @GetMapping
    public List<commerce> getEcommerce()
    {
        return commerceService.getEcommerce();
    }

}
