package entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Entity
@Table(name = "invoice")
public class Invoice {

    private int id;
    private String status;
    private Details details;
    private List<Good> goods;
    private Date date;


    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @ManyToOne
    @JoinColumn(name = "details_id")
    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    @OneToMany(mappedBy = "invoice")
    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }

    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
