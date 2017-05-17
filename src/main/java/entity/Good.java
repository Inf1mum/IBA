package entity;

import javax.persistence.*;

/**
 * Created by Inf1mum on 07.08.2016.
 */
@Entity
@Table(name = "good")
public class Good {

    private int id;
    private String goodName;
    private int cost;
    private Invoice invoice;

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "goodName")
    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    @Column(name = "cost")
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
