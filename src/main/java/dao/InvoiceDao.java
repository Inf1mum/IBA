package dao;


import entity.Invoice;
import entity.dto.InvoiceDTO;

import java.util.List;

/**
 * Created by Inf1mum on 07.08.2016.
 */
public interface InvoiceDao extends GenericDao<Invoice,Integer> {

    public List<InvoiceDTO> getListInvoiceDTO();
}
