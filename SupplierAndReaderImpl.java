package com.company;

public class SupplierAndReaderImpl extends User implements Supplier, Reader{

    public SupplierAndReaderImpl(String name) {
        super(name);
    }

    @Override
    public Book getBook(Administrator administrator, String name) {
        return administrator.findBook(name);
    }

    @Override
    public void returnBook(Book book) {
        System.out.println(this + " вернул книгу " + book.getName() +  " в библиотеку ");

    }

    @Override
    public void bringBooks(Book[] book) {
        System.out.println(this + " доставил книги в библиотеку");

    }
}
