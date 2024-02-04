package TestDanielin.TestDanielin.controller;

import TestDanielin.TestDanielin.models.Terminal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Controller
@RestController
@RequestMapping(path = "api/v1/terminal")
public class TerminarController {

    @GetMapping
    public List<Terminal> getTerminal()
    {
        return List.of(new Terminal(1L,1,1,LocalDate.of(2000, Month.JANUARY, 5)));
    }

}
