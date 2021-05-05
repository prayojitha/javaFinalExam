/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

import java.util.ArrayList;

/**
 *
 * @author keerthi prayojitha bere
 */
public class BookDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 11 example 1: ");
        Book book1 = new Book(123, "Java");
        Book book2 = new Book(123, "Java");
        Book book3 = new Book(369, "Python");

        ArrayList<Book> book = new ArrayList<>();
        book.add(book1);
        book.add(book2);

        for (Book b : book) {
            System.out.println(b);
        }
        System.out.println("book1.equals(book2) : " + book1.equals(book2));
        //checking the equality of the objects book1 and book2,  it returns true
        //because they have same bookId and same name 

        System.out.println("book1==book2 : " + (book1 == book2));
        //comparing two objects book1 and book2,it returns false because they 
        //both are pointing to two different reference objects

        System.out.println("book1.hashCode() : " + (book1.hashCode()));
        //hashcode value of book1 and book2 are equal because both objects are
        //equal (book1.equals(book2))

        System.out.println("book2.hashCode() : " + book2.hashCode());
        //hashcode value of book1 and book2 are equal because both objects are 
        //equal (book1.equals(book2))

        System.out.println("hashCode value of arraylist book : " + book.hashCode());
        //hashcode value of an arraylist object

        book.add(book3);

        System.out.println("hashCode value of arraylist after adding book3 object : " + book.hashCode());
        //hashcode value of an arraylist after adding an element to the list

        book.remove(book3);

        System.out.println("hashCode value of arraylist after removing book3 object : " + book.hashCode());
        //hashcode value of an arraylist after removing the added element to the list

    }

}
