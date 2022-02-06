package com.hutao.page.page89;

public class Book {
    boolean checkedOut = false;
    Book(boolean checkedOut){
        this.checkedOut = checkedOut;
    }
    void checkIn(){
        checkedOut = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if (checkedOut) {
            System.out.println("Error: The book is checkedOut.");
        } else {
            System.out.println("Correct: The book is checkIn");
        }
        super.finalize();
    }

    public static void main(String[] args) {
        Book book = new Book(true);
        book.checkIn();

        new Book(false);
        new Book(true);

        System.gc();
        System.runFinalization();
    }
}
