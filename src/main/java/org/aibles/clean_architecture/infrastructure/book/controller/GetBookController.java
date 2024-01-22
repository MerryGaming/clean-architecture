package org.aibles.clean_architecture.infrastructure.book.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aibles.clean_architecture.entity.exception.BookNotFoundException;
import org.aibles.clean_architecture.infrastructure.book.dto.BookPublic;
import org.aibles.clean_architecture.usecase.book.DeleteBookUseCase;
import org.aibles.clean_architecture.usecase.book.GetBookUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/books")
@Slf4j
public class GetBookController {
    private final GetBookUseCase bookUseCase;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public BookPublic getById(@PathVariable Long id) throws BookNotFoundException {
        log.info("(getById)id: {}", id);
        return new BookPublic(bookUseCase.execute(id));
    }
}
