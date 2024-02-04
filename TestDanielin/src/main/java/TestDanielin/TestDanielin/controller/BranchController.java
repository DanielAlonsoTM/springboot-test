package TestDanielin.TestDanielin.controller;

import TestDanielin.TestDanielin.models.Branch;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Controller
@RestController
@RequestMapping(path = "api/v1/branch")
public class BranchController {
    @GetMapping
    public List<Branch> getBranch()
    {
        return List.of(new Branch(1L,1,"pipo N123",LocalDate.of(2000, Month.JANUARY, 5)));
    }
}
