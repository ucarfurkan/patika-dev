package com.company;

import java.util.Date;

public class Book {
    private String bookName;
    private int numOfPages;
    private String authorName;
    private String releaseDate;

    public Book(String bookName, int numOfPages, String authorName, String releaseDate) {
        this.bookName = bookName;
        this.numOfPages = numOfPages;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}
