package org.aibles.clean_architecture.usecase.book;

import org.aibles.clean_architecture.entity.gateway.BookGateway;
import org.aibles.clean_architecture.entity.model.Book;
import org.aibles.clean_architecture.usecase.book.dto.BookUpdateData;
import org.trainingjava.core_exception.NotFoundException;

import java.util.Optional;

public class UpdateBookUseCase {
    private final BookGateway bookGateway;

    public UpdateBookUseCase(BookGateway bookGateway) {
        this.bookGateway = bookGateway;
    }

    public Book execute(Long id, BookUpdateData dao){
        Optional<Book> book = bookGateway.findById(id);
        if(!book.isPresent()){
            throw new NotFoundException();
        }
        book.get().setName(dao.name());
        book.get().setAuthor(dao.author());
        book.get().setYear(dao.year());
        book.get().setCategory(dao.category());
        return bookGateway.update(book.get());
    }
}
