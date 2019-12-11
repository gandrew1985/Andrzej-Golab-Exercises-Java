package com.exercises;
import java.time.*;
import java.util.*;


class Book {

    private String title;
    private String author;
    private LocalDate publishDate;

    public Book (String title, String author, Integer year, Integer month,Integer day) {
        this.title = title;
        this.author = author;
        this.publishDate = LocalDate.of(year,month,day);
    }

    @Override
    public int hashCode() {
        return publishDate.getYear() * 10 + publishDate.getMonthValue();
    }

    @Override
    public boolean equals(Object o) {
        Book e = (Book) o;
        return (title.equals(e.getTitle())) &&
                (author.equals(e.getAuthor())) &&
                (publishDate.getYear() == getPublishDate().getYear()) &&
                (publishDate.getMonthValue() == getPublishDate().getMonthValue()) &&
                (publishDate.getDayOfMonth() == getPublishDate().getDayOfMonth());
    }

    @Override
    public String toString() {
        return title + ", " + author + " --- " + publishDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }
}

class BookStorage {

    public static void main(String[] args) {

        Book book1 = new Book("Koziolek Matolek", "Jan Brzechwa",1985,10,24);
        Book book2 = new Book ("Plastus","Mark",2000,12,3);
        Book book3 = new Book("Dzieci", "Janek", 1976,1,2);
        Book book4 = new Book ("Antek","Boleslaw",1998,4,17);

        Set<Book> bookList = new HashSet<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        for(Book book : bookList) {
            if(book.getPublishDate().getYear() > 1990) {
                System.out.println(book);
            }
        }
    }
}
