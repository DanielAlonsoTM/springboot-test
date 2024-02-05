package TestDanielin.TestDanielin.services;

import TestDanielin.TestDanielin.models.commerce;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class CommerceService {
    public List<commerce> getEcommerce()
    {
        return List.of(new commerce(1L,"194066163","pipos","andres bello N123", LocalDate.of(2000, Month.JANUARY, 5)));
    }
}
