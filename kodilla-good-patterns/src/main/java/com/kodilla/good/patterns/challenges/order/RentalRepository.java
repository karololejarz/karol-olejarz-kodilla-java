package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDateTime;

public interface RentalRepository {

    public boolean createRental(User user, LocalDateTime from, LocalDateTime to);

}
