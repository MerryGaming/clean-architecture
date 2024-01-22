package org.aibles.clean_architecture.usecase.book;

import org.aibles.clean_architecture.entity.exception.BookNotFoundException;
import org.aibles.clean_architecture.entity.gateway.BookGateway;
import org.aibles.clean_architecture.entity.model.Book;

public class GetBookUseCase {
    private final BookGateway bookGateway;

    public GetBookUseCase(BookGateway bookGateway) {
        this.bookGateway = bookGateway;
    }

    public Book execute(Long id) throws BookNotFoundException {
        Book book = bookGateway.findById(id).orElseThrow(BookNotFoundException::new);
        return book;
    }
}
