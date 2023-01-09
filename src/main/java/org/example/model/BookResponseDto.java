package org.example.model;

public class BookResponseDto {
    String name;
    String author;
    String producer;
    String noOfPages;

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setNoOfPages(String noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getProducer() {
        return producer;
    }

    public String getNoOfPages() {
        return noOfPages;
    }
}
