package org.aibles.clean_architecture.infrastructure.book.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aibles.clean_architecture.infrastructure.book.dto.BookCreate;
import org.aibles.clean_architecture.infrastructure.book.dto.BookPublic;
import org.aibles.clean_architecture.infrastructure.book.dto.BookUpdate;
import org.aibles.clean_architecture.usecase.book.CreateBookUseCase;
import org.aibles.clean_architecture.usecase.book.UpdateBookUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping("api/v1/books")
public class UpdateBookController {

  private final UpdateBookUseCase bookUseCase;

  @PutMapping()
  @ResponseStatus(HttpStatus.CREATED)
  public BookPublic update(@PathVariable Long id,
                           @Valid @RequestBody BookUpdate dao) {
    log.info("(create)book: {}", dao);
    return new BookPublic(bookUseCase.execute(id, dao));
  }
}
