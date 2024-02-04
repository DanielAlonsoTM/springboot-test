package models;

import java.time.LocalDate;

public class Branch {
    private Long id;
    private Integer commerce_id;
    private String branch_address;
    private LocalDate update_date;

    public Branch(){
    }

    public Branch(Long id,
                  Integer commerce_id,
                  String branch_address,
                  LocalDate update_date) {
        this.id = id;
        this.commerce_id = commerce_id;
        this.branch_address = branch_address;
        this.update_date = update_date;
    }

    public Branch(Integer commerce_id,
                  String branch_address,
                  LocalDate update_date) {
        this.commerce_id = commerce_id;
        this.branch_address = branch_address;
        this.update_date = update_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCommerce_id() {
        return commerce_id;
    }

    public void setCommerce_id(Integer commerce_id) {
        this.commerce_id = commerce_id;
    }

    public String getBranch_address() {
        return branch_address;
    }

    public void setBranch_address(String branch_address) {
        this.branch_address = branch_address;
    }

    public LocalDate getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(LocalDate update_date) {
        this.update_date = update_date;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "id=" + id +
                ", commerce_id=" + commerce_id +
                ", branch_address='" + branch_address + '\'' +
                ", update_date=" + update_date +
                '}';
    }
}
