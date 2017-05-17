package service.serviceImpl;

import dao.DetailsDao;
import dao.GoodDao;
import dao.InvoiceDao;
import entity.Details;
import entity.Good;
import entity.Invoice;
import entity.dto.InvoiceDTO;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.InvoiceService;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    @Qualifier("invoiceDao")
    private InvoiceDao invoiceDao;

    @Autowired
    @Qualifier("goodDao")
    private GoodDao goodDao;

    @Autowired
    @Qualifier("detailsDao")
    private DetailsDao detailsDao;

    public InvoiceDao getInvoiceDao() {
        return invoiceDao;
    }

    public GoodDao getGoodDao() {
        return goodDao;
    }

    public DetailsDao getDetailsDao() {
        return detailsDao;
    }

    @Transactional
    @Override
    public Integer saveInvoice(Invoice invoice) {
        return getInvoiceDao().save(invoice);
    }

    @Transactional
    @Override
    public Invoice loadInvoice(Integer id) {
        return getInvoiceDao().load(id);
    }

    @Override
    public void deleteInvoice(Invoice invoice) {
        getInvoiceDao().delete(invoice);
    }

    @Transactional
    @Override
    public Invoice getInvoice(Integer id) {
        Invoice invoice = getInvoiceDao().get(id);
        Hibernate.initialize(invoice.getGoods());
        return invoice;
    }

    @Transactional
    @Override
    public List<Good> getGoodListByInvoiceId(Integer id) {
        Invoice invoice = getInvoiceDao().get(id);
        Hibernate.initialize(invoice.getGoods());
        return invoice.getGoods();
    }

    @Transactional
    @Override
    public List<InvoiceDTO> getListInvoiceDTO(){
        return getInvoiceDao().getListInvoiceDTO();
    }

    @Transactional
    @Override
    public List<Invoice> getInvoiceList() {
        return getInvoiceDao().getAll();
    }

    @Transactional
    @Override
    public void deleteInvoiceById(Integer id) {
        Invoice invoice = getInvoiceDao().get(id);
        List<Good> list = invoice.getGoods();
        for(Good good : list ){
            getGoodDao().delete(good);
        }
        getInvoiceDao().delete(invoice);
        //надо ли удалять того, кто сделал заказ?
    }

    @Transactional
    @Override
    public void saveInvoiceWithAllContent(Invoice invoice) {
        Details details = invoice.getDetails();
        List<Invoice> invoices = new ArrayList<Invoice>();
        invoices.add(invoice);
        details.setInvoices(invoices);
        getDetailsDao().save(details);

        invoice.setDate(getCurrentDate());
        getInvoiceDao().save(invoice);

        for(Good good : invoice.getGoods()){
            if(good.getGoodName()!=null && good.getCost()!=0) {
                good.setInvoice(invoice);
                getGoodDao().save(good);
            }
        }
    }

    public Date getCurrentDate(){
        Calendar c = Calendar.getInstance();
        return Date.valueOf(Integer.toString(c.get(c.YEAR))+"-"+Integer.toString(c.get(c.MONTH)+1)+"-"+Integer.toString(c.get(c.DAY_OF_MONTH)));
    }
}
