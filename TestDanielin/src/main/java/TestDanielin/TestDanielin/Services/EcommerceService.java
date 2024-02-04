package TestDanielin.TestDanielin.Services;

import TestDanielin.TestDanielin.models.Ecommerce;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class EcommerceService {
    public List<Ecommerce> getEcommerce()
    {
        return List.of(new Ecommerce(1L,"194066163","pipos","andres bello N123", LocalDate.of(2000, Month.JANUARY, 5)));
    }
}
