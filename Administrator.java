package com.company;

public interface Administrator {

    void overdueNotification(Reader reader);

    Book findBook(String name);

}
