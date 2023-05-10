package edu.wctc.isp;

public interface Book extends Product {
    int getPages();

    String getAuthor();

    String getISBN();
}
