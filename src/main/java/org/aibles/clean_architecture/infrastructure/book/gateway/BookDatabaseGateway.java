package org.aibles.clean_architecture.infrastructure.book.gateway;

import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.aibles.clean_architecture.entity.gateway.BookGateway;
import org.aibles.clean_architecture.entity.model.Book;
import org.aibles.clean_architecture.infrastructure.configuration.db.repository.BookRepository;
import org.aibles.clean_architecture.infrastructure.configuration.db.schema.BookSchema;

@RequiredArgsConstructor
public class BookDatabaseGateway implements BookGateway {

  private final BookRepository repository;

  @Override
  public Book create(Book book) {
    return this.repository.save(new BookSchema(book)).toBook();
  }

  @Override
  public Book update(Book book) {
    return repository.save(new BookSchema(book)).toBook();
  }

  @Override
  public void delete(Long id) {
    repository.deleteById(id);
  }

  @Override
  public Optional<Book> findById(Long id) {
    return repository.findById(id).map(BookSchema::toBook);
  }
}
