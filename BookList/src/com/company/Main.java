package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    Book book1 = new Book("Harry Potter & the Philosophers Stone",223,"J K Rowling","26 June 1997");
        Book book2 = new Book("Harry Potter and the Chamber of Secrets",251,"J K Rowling","2 July 1998");
        Book book3 = new Book("Harry Potter and the Prisoner of Azkaban",317,"J K Rowling","8 July 1999");
        Book book4 = new Book("Harry Potter and the Goblet of Fire",636,"J K Rowling","8 July 2000");
        Book book5 = new Book("Harry Potter and the Order of the Phoenix",766,"J K Rowling","27 June 2003");
        Book book6 = new Book("Harry Potter and the Half-Blood Prince",607,"J K Rowling","16 July 2005");
        Book book7 = new Book("Harry Potter and the Deathly Hallows",607,"J K Rowling","14 July 2007");
        Book book8 = new Book("I, Robot",253,"Isaac Asimov","2 December 1950");
        Book book9 = new Book("Fahrenheit 451",256,"Ray Bradbury","19 October 1953");
        Book book10 = new Book("Brave New World",311,"Aldous Huxley","1932");

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        bookList.add(book8);
        bookList.add(book9);
        bookList.add(book10);

        Map<String,String> info = new HashMap<>();

        bookList.stream().forEach(b -> info.put(b.getBookName(),b.getAuthorName()));

        for(String s : info.keySet()){
            System.out.println("Book: " + s + " Author: " + info.get(s));
        }

        List<Book> newList=bookList.stream().filter(p->p.getNumOfPages()>100).toList();
        System.out.println("The books with more than 100 pages: ");
        for(Book s:newList){
            System.out.println("Book: "+s.getBookName()+" | " +
                    "Number of Pages: "+s.getNumOfPages()+" | "+
                    "Author: "+s.getAuthorName()+" | "+
                    "Release Date: "+s.getReleaseDate());
        }


    }
}
