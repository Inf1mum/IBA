package dao;


import entity.Invoice;
import entity.dto.InvoiceDTO;

import java.util.List;


public interface InvoiceDao extends GenericDao<Invoice,Integer> {

    public List<InvoiceDTO> getListInvoiceDTO();
}
