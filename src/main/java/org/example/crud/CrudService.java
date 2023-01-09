package org.example.crud;

import org.example.model.Book;
import org.example.model.BookRequestDto;
import org.example.model.BookResponseDto;

import java.util.ArrayList;
import java.util.List;
import java.util.MissingResourceException;

public class CrudService {
    List<Book> bookStore = new ArrayList<>();

    public Book addBook(BookRequestDto bookRequestDto){
        Book book = new Book();
        book.setBookId(bookStore.size() + 1);
        book.setName(bookRequestDto.getName());
        book.setAuthor(bookRequestDto.getAuthor());
        book.setProducer(bookRequestDto.getProducer());
        book.setNoOfPages(bookRequestDto.getNoOfPages());
        bookStore.add(book);
        System.out.println(book);
        return book;
    }

    public void deleteBook(int bookId){
        for(Book book: bookStore){
            if (book.getBookId() == bookId){
                bookStore.remove(book);
                break;
            }
        }
    }

    public Book getBookById(int bookId){
        for(Book book: bookStore){
            if (book.getBookId() == bookId){
                return book;
            }

        }
        throw new MissingResourceException("Book not found", "Book", "bookId");
    }

}
