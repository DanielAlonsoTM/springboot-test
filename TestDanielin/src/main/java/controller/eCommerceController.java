package controller;

import models.eCommerce;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(value = "api/v1/ecommerce")
public class eCommerceController {
    @GetMapping(value="")
    public List<eCommerce> getEcommerce()
    {
        return List.of(new eCommerce(1L,"194066163","pipos","andres bello N123", LocalDate.of(2000, Month.JANUARY, 5)));
    }

}
