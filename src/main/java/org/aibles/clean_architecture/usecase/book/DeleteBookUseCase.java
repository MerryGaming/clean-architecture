package org.aibles.clean_architecture.usecase.book;

import org.aibles.clean_architecture.entity.exception.BookNotFoundException;
import org.aibles.clean_architecture.entity.gateway.BookGateway;
import org.aibles.clean_architecture.entity.model.Book;

public class DeleteBookUseCase {

  private final BookGateway bookGateway;

  public DeleteBookUseCase(BookGateway bookGateway) {
    this.bookGateway = bookGateway;
  }

  public Book execute(Long id) throws BookNotFoundException {
    Book book = bookGateway.findById(id).orElseThrow(BookNotFoundException::new);
    bookGateway.delete(id);
    return book;
  }
}
