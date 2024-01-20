package org.aibles.clean_architecture.infrastructure.book.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aibles.clean_architecture.entity.exception.BookNotFoundException;
import org.aibles.clean_architecture.infrastructure.book.dto.BookCreate;
import org.aibles.clean_architecture.infrastructure.book.dto.BookPublic;
import org.aibles.clean_architecture.usecase.book.CreateBookUseCase;
import org.aibles.clean_architecture.usecase.book.DeleteBookUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping("api/v1/books")
public class DeleteBookController {

  private final DeleteBookUseCase bookUseCase;

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public BookPublic delete(@PathVariable Long id) throws BookNotFoundException {
    log.info("(delete)id: {}", id);
    return new BookPublic(bookUseCase.execute(id));
  }
}
