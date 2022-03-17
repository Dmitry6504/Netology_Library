package com.company;

public interface Reader {

    Book getBook (Administrator administrator, String name);

    void returnBook(Book book);
}
