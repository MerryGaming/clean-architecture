package org.aibles.clean_architecture.infrastructure.book.dto;

import org.aibles.clean_architecture.entity.model.Book;
import org.aibles.clean_architecture.usecase.book.dto.BookPublicData;

public record BookPublic(long id, String name, String author, int year, String category) implements
    BookPublicData {
  public BookPublic(Book book) {
    this(
        book.getId(),
        book.getName(),
        book.getAuthor(),
        book.getYear(),
        book.getCategory()
    );
  }
}
