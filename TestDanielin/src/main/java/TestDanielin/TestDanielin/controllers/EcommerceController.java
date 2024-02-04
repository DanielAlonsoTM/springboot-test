package TestDanielin.TestDanielin.controllers;


import TestDanielin.TestDanielin.Services.EcommerceService;
import TestDanielin.TestDanielin.models.Ecommerce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "api/v1/ecommerce")
public class EcommerceController {

    @Autowired
    private EcommerceService ecommerceService;

//    public EcommerceController(EcommerceService ecommerceService){
//        this.ecommerceService = ecommerceService;
//    }
    @GetMapping
    public List<Ecommerce> getEcommerce()
    {
        return ecommerceService.getEcommerce();
    }

}
