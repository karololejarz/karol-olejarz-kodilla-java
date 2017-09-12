package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave(){
        Product product1 = new Product(1,"product1");
        Product product1b = new Product(1,"product1bargain");
        Item item1 = new Item(1, product1, BigDecimal.valueOf(2.5),4);
        Item item2 = new Item(2, product1b, BigDecimal.valueOf(2),5);
        Invoice invoice = new Invoice(1,"Invoice No.1");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        invoiceDao.save(invoice);

        Assert.assertEquals(2,invoice.getItems());
        Assert.assertEquals(4,invoice.getItems().get(0).getQuantity());
        Assert.assertEquals(5,invoice.getItems().get(1).getQuantity());

        try {
            productDao.delete(product1);
            productDao.delete(product1b);
            itemDao.delete(item1);
            itemDao.delete(item2);
            invoiceDao.delete(invoice);
        } catch (Exception e) {
        }

    }
}
