package com.company.Books;

public class Books {

    private String bookTitle;
    private int bookISBN;
    private String bookAuthor;
    private String bookGenre;

    public Books(String bookTitle, String bookISBN, String bookAuthor, String bookGenre){
        this.bookTitle = bookTitle;
        this.bookISBN = Integer.parseInt(bookISBN);
        this.bookAuthor = bookAuthor;
        this.bookGenre = bookGenre;
    }

    @Override
    public String toString(){
        return bookTitle+","+bookISBN+","+bookAuthor+","+bookGenre;
    }
}
