package dao.daoImpl;

import dao.InvoiceDao;
import entity.Invoice;
import entity.dto.InvoiceDTO;
import org.hibernate.Query;
import org.hibernate.transform.ResultTransformer;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class InvoiceDaoImpl extends GenericDaoImpl<Invoice,Integer> implements InvoiceDao {

    public InvoiceDaoImpl() {
        super(Invoice.class);
    }

    public List<InvoiceDTO> getListInvoiceDTO(){

        Query query = getCurrentSession().createSQLQuery("select I.id,date, status, P.s from  invoice I inner join \n" +
                "(select invoice_id,sum(cost) as s from good group by invoice_id) as P on I.id = P.invoice_id");
        List<Object[]> rows = query.list();
        List<InvoiceDTO> invoiceDTOList = new ArrayList<InvoiceDTO>();
        for(Object[] row : rows){
            invoiceDTOList.add(new InvoiceDTO(Integer.parseInt(row[0].toString()), Date.valueOf(row[1].toString()), row[2].toString(), Integer.parseInt(row[3].toString())));
        }
        return invoiceDTOList;
    }
}
