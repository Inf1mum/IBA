package controller;

import entity.Good;
import entity.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import service.InvoiceService;

import java.util.List;

@Controller
@RequestMapping("/details")
public class DetailsController extends BaseController {

    @Autowired
    @Qualifier("invoiceService")
    private InvoiceService invoiceService;

    @RequestMapping(value = "/{invoiceId}", method = RequestMethod.GET)
    public ModelAndView details(@PathVariable("invoiceId") Integer invoiceId){
        ModelAndView modelAndView = new ModelAndView();
        Invoice invoice = invoiceService.getInvoice(invoiceId);
        int total = 0;
        for(Good good : invoice.getGoods()){
            total += good.getCost();
        }
        modelAndView.addObject("invoice", invoice);
        modelAndView.addObject("total", total);
        modelAndView.setViewName("details");
        return modelAndView;
    }
}
