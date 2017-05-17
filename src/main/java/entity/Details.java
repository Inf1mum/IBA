package entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Inf1mum on 09.08.2016.
 */
@Entity
@Table(name = "details")
public class Details {

    private int id;
    private String name;
    private String email;
    private String address;
    private List<Invoice> invoices;

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @OneToMany(mappedBy = "details")
    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }
}
