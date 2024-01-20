package org.aibles.clean_architecture.infrastructure.configuration.web;

import org.aibles.clean_architecture.entity.gateway.BookGateway;
import org.aibles.clean_architecture.infrastructure.book.gateway.BookDatabaseGateway;
import org.aibles.clean_architecture.infrastructure.configuration.db.repository.BookRepository;
import org.aibles.clean_architecture.usecase.book.CreateBookUseCase;
import org.aibles.clean_architecture.usecase.book.DeleteBookUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MvcConfiguration {

  @Bean
  public CreateBookUseCase createBookUseCase(BookRepository repository) {
    BookGateway gateway = new BookDatabaseGateway(repository);
    return new CreateBookUseCase(gateway);
  }

  @Bean
  public DeleteBookUseCase deleteBookUseCase(BookRepository repository) {
    BookGateway gateway = new BookDatabaseGateway(repository);
    return new DeleteBookUseCase(gateway);
  }
}
