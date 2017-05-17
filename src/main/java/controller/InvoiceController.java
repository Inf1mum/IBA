package controller;

import entity.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import service.InvoiceService;

import java.util.Calendar;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * Created by Inf1mum on 10.08.2016.
 */
@Controller
@RequestMapping("/invoice")
public class InvoiceController extends BaseController {

    @Autowired
    @Qualifier("invoiceService")
    private InvoiceService invoiceService;

    @RequestMapping(value = "/delete/{invoiceId}", method = RequestMethod.GET)
    public String deleteInvoice(@PathVariable("invoiceId") Integer invoiceId){
        invoiceService.deleteInvoiceById(invoiceId);
        return "redirect:/";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView goToAddInvoice(){
        ModelAndView modelAndView = new ModelAndView();
        Invoice invoice = new Invoice();
        modelAndView.addObject("invoice",invoice);
        modelAndView.setViewName("add");
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addInvoice(@ModelAttribute Invoice invoice){
        invoiceService.saveInvoiceWithAllContent(invoice);
        return "redirect:/";
    }



}
