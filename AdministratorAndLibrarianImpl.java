package com.company;

public class AdministratorAndLibrarianImpl extends User implements Administrator, Librarian {

    public AdministratorAndLibrarianImpl(String name) {
        super(name);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Администратор отправил уведомление читателю " + reader + " о необходимости возврата книги");
    }

    @Override
    public Book findBook(String name) {
        return new Book(name);
    }

    @Override
    public void orderBooks(Supplier supplier, String[] names) {
        System.out.println("Библиотекарь заказал книгу у " + supplier);

    }
}
