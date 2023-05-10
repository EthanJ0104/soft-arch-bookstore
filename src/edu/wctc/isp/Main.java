package edu.wctc.isp;

import java.time.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Product hardcover = new HardcoverBook("The Hunger Games", "9780439023528",
                8.79, 12,
                LocalDate.of(2010, Month.JULY, 3),
                "Suzanne Collins", 384);
        Product paperback = new PaperbackBook("A Wrinkle in Time", "9780312367541",
                6.19, 4,
                LocalDate.of(2007, Month.MAY, 1),
                "Madeleine L'Engle", 256);
        Product record = new VinylRecord("Kind of Blue",
                13.54, 18,
                LocalDate.of(2011, Month.APRIL, 12),
                "Miles Davis", Duration.ofMinutes(46));

        List<Product> products = new ArrayList<>();
        products.add(hardcover);
        products.add(paperback);
        products.add(record);

        for (Product product : products) {
            System.out.println(product.toString());
            System.out.println("\n");
        }
    }
}
