package com.library;


public class BookDetails {

    Book b1 = new Book();
    Book b2 = new Book();
    Book b3 = new Book();
    Book b4 = new Book();


    public void showBooks() {

        b1.bookName = "Java Basics";
        b1.authorName = "JJ";
        b1.ISBN = 1111;
        b1.price = 500;
        b1.scienceAndTech = true;
        

        b2.bookName = "OOP";
        b2.authorName = "RR";
        b2.ISBN = 2222;
        b2.price = 450;
        b2.scienceAndTech = false;

        b3.bookName = "Data Structures";
        b3.authorName = "Mark";
        b3.ISBN = 3333;
        b3.price = 600;
        b3.scienceAndTech = true;

        b4.bookName = "Algorithms";
        b4.authorName = "Alice";
        b4.ISBN = 4444;
        b4.price = 700;
        b4.scienceAndTech = true;

        System.out.println(b1.toString());
        System.out.println("\n-------------\n");
        System.out.println(b2.toString());
        System.out.println("\n-------------\n");
        System.out.println(b3.toString());
        System.out.println("\n-------------\n");
        System.out.println(b4.toString());
    }

    
    
}



