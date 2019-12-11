package com.exercises;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.Deque;

class BookStack {

    private String title;
    private String author;
    private LocalDate publishDate;

    public BookStack (String title, String author, Integer year, Integer month,Integer day) {
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

class BookOnStack {

    public static void main(String[] args) {

        BookStack book1 = new BookStack("Koziolek Matolek", "Jan Brzechwa",1985,10,24);
        BookStack book2 = new BookStack ("Plastus","Mark",2000,12,3);
        BookStack book3 = new BookStack("Dzieci", "Janek", 1976,1,2);
        BookStack book4 = new BookStack ("Antek","Boleslaw",1998,4,17);

        Deque<BookStack> bookStack = new ArrayDeque<>();

        bookStack.push(book1);
        bookStack.push(book2);
        bookStack.push(book3);
        bookStack.push(book4);

        System.out.println("Stack size: " + bookStack.size());

        BookStack book = null;
        while(bookStack.size() > 0) {
            book = bookStack.pop();
            System.out.println("Deleting book, size: " + bookStack.size());
        }
        System.out.println("Last deleted book: " + book);
    }
}
