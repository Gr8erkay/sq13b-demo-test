package org.example.model;


public class Book {
    int bookId;
    String name;
    String author;
    String producer;
    String noOfPages;

    public Book() {
    }

    public Book(String name, String author, String producer, String noOfPages) {
        this.name = name;
        this.author = author;
        this.producer = producer;
        this.noOfPages = noOfPages;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getNoOfPages() {
        return noOfPages + 0;
    }

    public void setNoOfPages(String noOfPages) {
        this.noOfPages = noOfPages;
    }

    @Override
    public String toString() {
        return "Book{bookId=%d, name='%s', author='%s', producer='%s', noOfPages='%s'}".formatted(bookId, name, author, producer, noOfPages);
    }
}
