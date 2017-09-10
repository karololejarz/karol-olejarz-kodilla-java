package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.kodilla.good.patterns.food2door.ProductClass.healthy;

public class HealthyShop implements Vendor {
    private static final String NAME = "HealthyShop";
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
            System.out.println(NAME + " doesn't offer that product, it's not on our healthy list.");
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

    protected List<Product> searchForSupply(Supplier supplier) {
        List<Product> productsAvailable = supplier.getSuppliedProducts();
        ProductClass interestingClass = healthy;
        List<Product> interestingProducts = productsAvailable.stream()
                .filter(product -> product.getProductClass()==interestingClass)
                .collect(Collectors.toList());
        System.out.println("Healthy products are: " + interestingProducts);
        return interestingProducts;
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
