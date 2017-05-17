package entity.dto;

import entity.Invoice;

import javax.persistence.Entity;
import java.sql.Date;



public class InvoiceDTO {

    private int id;
    private Date date;
    private String status;
    private int total;

    public InvoiceDTO(int id,Date date, String status, int total) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
