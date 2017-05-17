package service;

import entity.Good;
import entity.Invoice;
import entity.dto.InvoiceDTO;

import java.util.List;


public interface InvoiceService {

    public Integer saveInvoice(Invoice invoice);
    public void saveInvoiceWithAllContent(Invoice invoice);
    public Invoice loadInvoice(Integer id);
    public void deleteInvoice(Invoice invoice);
    public void deleteInvoiceById(Integer id);
    public Invoice getInvoice(Integer id);
    public List<Invoice> getInvoiceList();
    public List<Good> getGoodListByInvoiceId(Integer id);
    public List<InvoiceDTO> getListInvoiceDTO();


}
