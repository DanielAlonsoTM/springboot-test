package TestDanielin.TestDanielin.Services;

import TestDanielin.TestDanielin.models.Terminal;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class TerminalService {
    public List<Terminal> getTerminal()
    {
        return List.of(new Terminal(1L,1,1, LocalDate.of(2000, Month.JANUARY, 5)));
    }
}
