package TestDanielin.TestDanielin;

import models.Branch;
import models.Terminal;
import models.eCommerce;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class TestDanielinApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestDanielinApplication.class, args);
	}

	@GetMapping
	public List<eCommerce> hello()
	{
		return List.of(new eCommerce(1L,"194066163","pipos","andres bello N123", LocalDate.of(2000, Month.JANUARY, 5)));
	}
}
