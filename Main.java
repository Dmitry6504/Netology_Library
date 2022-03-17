package com.company;

public class Main {

    public static void main(String[] args) {

        AdministratorAndLibrarianImpl Petr = new AdministratorAndLibrarianImpl("Пётр");
        SupplierAndReaderImpl Iosif = new SupplierAndReaderImpl("Иосиф");

        Petr.overdueNotification(Iosif);
        Petr.orderBooks(Iosif, new String[] {"Pinokio", "Chipolino", "Dr. Ayyy Bolit" });


    }
}
