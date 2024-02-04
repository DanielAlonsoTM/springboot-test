package TestDanielin.TestDanielin.models;

import java.time.LocalDate;

public class Terminal {
    private Long id;
    private Integer branch_id;
    private Integer terminal_serial_number;
    private LocalDate update_date;

    public Terminal(){
    }

    public Terminal(Long id,
                    Integer branch_id,
                    Integer terminal_serial_number,
                    LocalDate update_date) {
        this.id = id;
        this.branch_id = branch_id;
        this.terminal_serial_number = terminal_serial_number;
        this.update_date = update_date;
    }

    public Terminal(Integer branch_id,
                    Integer terminal_serial_number,
                    LocalDate update_date) {
        this.branch_id = branch_id;
        this.terminal_serial_number = terminal_serial_number;
        this.update_date = update_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(Integer branch_id) {
        this.branch_id = branch_id;
    }

    public Integer getTerminal_serial_number() {
        return terminal_serial_number;
    }

    public void setTerminal_serial_number(Integer terminal_serial_number) {
        this.terminal_serial_number = terminal_serial_number;
    }

    public LocalDate getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(LocalDate update_date) {
        this.update_date = update_date;
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "id=" + id +
                ", branch_id=" + branch_id +
                ", terminal_serial_number=" + terminal_serial_number +
                ", update_date=" + update_date +
                '}';
    }
}
