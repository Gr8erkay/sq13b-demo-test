package org.example.crud;

import org.example.model.Book;
import org.example.model.BookRequestDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CrudServiceTest {

    CrudService crudService = new CrudService();



    @Test
    void testShouldAddBookSuccessfully(){
        //given
        BookRequestDto dto = new BookRequestDto();
        dto.setName("Harry Potter");
        dto.setAuthor("J.K. Rowling");
        dto.setProducer("Bloomsbury");
        dto.setNoOfPages("300");

        BookRequestDto dto2 = new BookRequestDto();
        dto2.setName("Think And Grow Rich");
        dto2.setAuthor("Napoleon Hill");
        dto2.setProducer("Simon and Schuster");
        dto2.setNoOfPages("300");

        //when
        Book book = crudService.addBook(dto);
        Book book2 = crudService.addBook(dto2);

        //then
        assertEquals(2, crudService.bookStore.size());

        assertEquals(dto.getName(), book.getName());
        assertEquals(dto.getAuthor(), book.getAuthor());
        assertEquals(dto.getProducer(), book.getProducer());
        assertEquals(dto.getNoOfPages(), book.getNoOfPages());

        assertEquals(dto2.getName(), book2.getName());
        assertEquals(dto2.getAuthor(), book2.getAuthor());
        assertEquals(dto2.getProducer(), book2.getProducer());

    }

    @Test
    void testShouldDeleteBookSuccessfully(){
        //given
        BookRequestDto dto = new BookRequestDto();
        dto.setName("Harry Potter");
        dto.setAuthor("J.K. Rowling");
        dto.setProducer("Bloomsbury");
        dto.setNoOfPages("300");

        BookRequestDto dto2 = new BookRequestDto();
        dto2.setName("Think And Grow Rich");
        dto2.setAuthor("Napoleon Hill");
        dto2.setProducer("Simon and Schuster");
        dto2.setNoOfPages("300");

        BookRequestDto dto3 = new BookRequestDto();
        dto3.setName("Lord Of The Rings");
        dto3.setAuthor("J.R.R. Tolkien");
        dto3.setProducer("Allen & Unwin");
        dto3.setNoOfPages("300");

        Book book1 = crudService.addBook(dto);
        Book book2 = crudService.addBook(dto2);
        Book book3 = crudService.addBook(dto3);

        //when
        assertEquals(3, crudService.bookStore.size());
        crudService.deleteBook(book2.getBookId());
        //then
        assertEquals(2, crudService.bookStore.size());

        crudService.deleteBook(book1.getBookId());
        assertEquals(1, crudService.bookStore.size());

    }

    @Test
    void shouldGetBookByBookIdSuccessfully(){
        //TODO: Complete the test
    }

    @Test
    void shouldThrowMissingResourceExceptionWhenGetBookByBookIdAndBookDoesNotExist(){
        //TODO: Complete the test
    }
}
