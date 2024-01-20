package org.aibles.clean_architecture.entity.gateway;

import java.util.Optional;
import org.aibles.clean_architecture.entity.model.Book;

public interface BookGateway {

  Book create(Book book);
  Book update(Book book);
  void delete(Long id);
  Optional<Book> findById(Long id);
}
