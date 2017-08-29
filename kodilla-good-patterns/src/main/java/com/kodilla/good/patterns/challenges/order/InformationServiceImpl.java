package com.kodilla.good.patterns.challenges.order;

public class InformationServiceImpl implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("The user has been informed");
    }
}
