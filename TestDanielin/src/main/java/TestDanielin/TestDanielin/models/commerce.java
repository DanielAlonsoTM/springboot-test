package TestDanielin.TestDanielin.models;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table
public class commerce {
    @Id
    @SequenceGenerator(
            name = "ecommerce_sequence",
            sequenceName = "ecommerce_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ecommerce_sequence"
    )
    private Long id;
    private String commerce_rut;
    private String commerce_name;
    private String commerce_address;
    private LocalDate update_date;

    public commerce(){
    }

    public commerce(Long id,
                    String commerce_rut,
                    String commerce_name,
                    String commerce_address,
                    LocalDate update_date) {
        this.id = id;
        this.commerce_rut = commerce_rut;
        this.commerce_name = commerce_name;
        this.commerce_address = commerce_address;
        this.update_date = update_date;
    }

    public commerce(String commerce_rut,
                    String commerce_name,
                    String commerce_address,
                    LocalDate update_date) {
        this.commerce_rut = commerce_rut;
        this.commerce_name = commerce_name;
        this.commerce_address = commerce_address;
        this.update_date = update_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommerce_rut() {
        return commerce_rut;
    }

    public void setCommerce_rut(String commerce_rut) {
        this.commerce_rut = commerce_rut;
    }

    public String getCommerce_name() {
        return commerce_name;
    }

    public void setCommerce_name(String commerce_name) {
        this.commerce_name = commerce_name;
    }

    public String getCommerce_address() {
        return commerce_address;
    }

    public void setCommerce_address(String commerce_address) {
        this.commerce_address = commerce_address;
    }

    public LocalDate getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(LocalDate update_date) {
        this.update_date = update_date;
    }

    @Override
    public String toString() {
        return "eCommerce{" +
                "id=" + id +
                ", commerce_rut='" + commerce_rut + '\'' +
                ", commerce_name='" + commerce_name + '\'' +
                ", commerce_address='" + commerce_address + '\'' +
                ", update_date=" + update_date +
                '}';
    }
}
