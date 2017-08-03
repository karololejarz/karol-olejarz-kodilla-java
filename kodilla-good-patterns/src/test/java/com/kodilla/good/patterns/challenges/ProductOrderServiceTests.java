package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.*;
import org.junit.Test;


public class ProductOrderServiceTests {

    InformationService infoService;
    RentalService rentalService;
    RentalRepository rentalRepo;
    RentRequest request;

    @Test
    public void testProductOrderService() {
        ProductOrderService service = new ProductOrderService(infoService, rentalService, rentalRepo);
        /*service.process(request);*/
    }

}
