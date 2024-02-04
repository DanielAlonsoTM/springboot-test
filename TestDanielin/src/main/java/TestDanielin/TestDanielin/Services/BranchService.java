package TestDanielin.TestDanielin.Services;

import TestDanielin.TestDanielin.models.Branch;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class BranchService {
    public List<Branch> getBranch()
    {
        return List.of(new Branch(1L,1,"pipo N123", LocalDate.of(2000, Month.JANUARY, 5)));
    }
}
