package com.company;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoices invoice1 = new Invoices("1245","energy",24,456);
        Invoices invoice2 = new Invoices("547p","whater",45,22);
        System.out.println("Invoices amount is: "+invoice1.getInvoiceAmount());
        System.out.println("Invoices amount is: "+invoice2.getInvoiceAmount());
    }
}
