package org.aibles.clean_architecture.usecase.book;

import org.aibles.clean_architecture.entity.gateway.BookGateway;
import org.aibles.clean_architecture.entity.model.Book;
import org.aibles.clean_architecture.usecase.book.dto.BookCreateData;

public class CreateBookUseCase {

  private final BookGateway bookGateway;

  public CreateBookUseCase(BookGateway bookGateway) {
    this.bookGateway = bookGateway;
  }

  public Book execute(BookCreateData dao) {
    Book book = new Book(dao.name(), dao.author(), dao.year(), dao.category());
    return this.bookGateway.create(book);
  }
}
