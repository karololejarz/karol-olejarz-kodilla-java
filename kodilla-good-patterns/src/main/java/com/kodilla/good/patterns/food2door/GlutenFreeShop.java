package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Vendor {
    private static final String NAME = "GlutenFreeShop";
    private List<Product> productList = new ArrayList<>();
    private List<OrderDto> orderList = new ArrayList<>();
    private List<OrderDto> rejectsList = new ArrayList<>();

    @Override
    public boolean process(OrderRequest orderRequest) {
        OrderDto dto = new OrderDto(orderRequest, false);
        if(getProductList().contains(dto.getOrder().getProduct())) {
            orderList.add(dto);
            System.out.println("Order " + orderRequest + " accepted by " + NAME);
            return true;
        }
        else {
            System.out.println(NAME + " doesn't offer that product, it's not gluten-free.");
            rejectsList.add(dto);
            return false;
        }
    }

    @Override
    public void deliver(OrderDto orderDto) throws ArrayIndexOutOfBoundsException {
        try {
            int id = orderList.indexOf(orderDto);
            OrderRequest order = orderList.get(id).getOrder();
            OrderDto dto = new OrderDto(order, true);
            orderList.set(id, dto);
            System.out.println("Delivered by " + NAME);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is no such order to deliver");
        }
    }

    @Override
    public void createProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public List<OrderDto> getOrderList() {
        return orderList;
    }

    public List<OrderDto> getRejectsList() {
        return rejectsList;
    }
}
