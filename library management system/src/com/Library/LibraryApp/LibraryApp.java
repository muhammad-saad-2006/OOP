package com.Library.LibraryApp;

import com.Library.Library.Library;
import com.Library.Book.Book;
import com.Library.Person.Person;
import com.Library.Address.Address;
import com.Library.Date.Date;
import com.Library.Incharge.Incharge;
import com.Library.Staff.Staff;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library(
                "The Modern Library",
                new Book("Revolutions with AI", "1234-567-890", 
                         new Date(10, 12, 2025),
                         new Person("Muhammad Saad", new Address("Badar Colony", "Pattoki"))
                ),
                new Incharge("Incharge", new Person("Ahmed", new Address("Ali Street", "Lahore"))), 
                new Staff("Janitor", new Person("Muhammad Ali", new Address("Quaid Road", "Lahore")))
        );

        System.out.println(library);
    }
}
