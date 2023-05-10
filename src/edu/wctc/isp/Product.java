package edu.wctc.isp;

import java.time.*;

public interface Product {
    String getFormattedReleaseDate();

    double getCost();

    LocalDate getReleaseDate();

    String getTitle();

    int getQuantityOnHand();

    void order(int quantity);
}
