package controller;

import dao.InvoiceDao;
import entity.dto.InvoiceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import service.GoodService;
import service.InvoiceService;

import java.util.List;

/**
 * Created by Inf1mum on 20.09.2015.
 */
@Controller
@RequestMapping("/")
public class StartController extends BaseController {

    @Autowired
    @Qualifier("invoiceService")
    private InvoiceService invoiceService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView listInvoices(){
        ModelAndView modelAndView = new ModelAndView();
        List<InvoiceDTO> listInvoice = invoiceService.getListInvoiceDTO();
        modelAndView.addObject("listInvoice", listInvoice);
        modelAndView.setViewName("list");
        return modelAndView;
    }








}
