package org.aibles.clean_architecture.infrastructure.book.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aibles.clean_architecture.infrastructure.book.dto.BookCreate;
import org.aibles.clean_architecture.infrastructure.book.dto.BookPublic;
import org.aibles.clean_architecture.usecase.book.CreateBookUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping("api/v1/books")
public class CreateBookController {

  private final CreateBookUseCase bookUseCase;

  @PostMapping()
  @ResponseStatus(HttpStatus.CREATED)
  public BookPublic create(@Valid @RequestBody BookCreate dao) {
    log.info("(create)book: {}", dao);
    return new BookPublic(bookUseCase.execute(dao));
  }
}
